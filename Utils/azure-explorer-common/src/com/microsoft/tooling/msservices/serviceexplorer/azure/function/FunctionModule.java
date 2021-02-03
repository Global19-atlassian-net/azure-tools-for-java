/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 */

package com.microsoft.tooling.msservices.serviceexplorer.azure.function;

import com.microsoft.azure.management.appservice.FunctionApp;
import com.microsoft.azure.toolkit.lib.common.operation.AzureOperation;
import com.microsoft.azuretools.azurecommons.helpers.NotNull;
import com.microsoft.azuretools.azurecommons.helpers.Nullable;
import com.microsoft.azuretools.core.mvp.model.ResourceEx;
import com.microsoft.azuretools.utils.AzureUIRefreshCore;
import com.microsoft.azuretools.utils.AzureUIRefreshListener;
import com.microsoft.tooling.msservices.serviceexplorer.AzureIconSymbol;
import com.microsoft.tooling.msservices.serviceexplorer.AzureRefreshableNode;
import com.microsoft.tooling.msservices.serviceexplorer.Node;

import java.util.List;

public class FunctionModule extends AzureRefreshableNode implements FunctionModuleView {
    private static final String FUNCTION_SERVICE_MODULE_ID = FunctionModule.class.getName();
    private static final String ICON_PATH = "azure-functions-small.png";
    private static final String BASE_MODULE_NAME = "Function App(Preview)";
    private static final String FUNCTION_MODULE = "FunctionModule";
    private static final String FAILED_TO_DELETE_FUNCTION_APP = "Failed to delete Function App %s";
    private static final String ERROR_DELETING_FUNCTION_APP = "Azure Services Explorer - Error Deleting Function App";
    private final FunctionModulePresenter<FunctionModule> functionModulePresenter;

    public static final String MODULE_NAME = "Function App";

    public FunctionModule(Node parent) {
        super(FUNCTION_SERVICE_MODULE_ID, BASE_MODULE_NAME, parent, ICON_PATH);
        functionModulePresenter = new FunctionModulePresenter<>();
        functionModulePresenter.onAttachView(FunctionModule.this);
        createListener();
    }

    @Override
    public @Nullable AzureIconSymbol getIconSymbol() {
        return AzureIconSymbol.FunctionApp.MODULE;
    }

    @Override
    @AzureOperation(value = "remove function app", type = AzureOperation.Type.ACTION)
    public void removeNode(String sid, String id, Node node) {
        functionModulePresenter.onDeleteFunctionApp(sid, id);
        removeDirectChildNode(node);
    }

    @Override
    public void renderChildren(@NotNull final List<ResourceEx<FunctionApp>> resourceExes) {
        for (final ResourceEx<FunctionApp> resourceEx : resourceExes) {
            final FunctionAppNode node = new FunctionAppNode(this, resourceEx.getSubscriptionId(), resourceEx.getResource());
            addChildNode(node);
        }
    }

    @Override
    @AzureOperation(value = "reload function apps", type = AzureOperation.Type.ACTION)
    protected void refreshItems() {
        functionModulePresenter.onModuleRefresh();
    }

    private void createListener() {
        AzureUIRefreshListener listener = new AzureUIRefreshListener() {
            @Override
            public void run() {
                if (event.opsType == null) {
                    return;
                }
                switch (event.opsType) {
                    case SIGNIN:
                    case SIGNOUT:
                        removeAllChildNodes();
                        break;
                    case REFRESH:
                        if (isFunctionModuleEvent(event.object)) {
                            load(true);
                        }
                        break;
                    default:
                        if (isFunctionModuleEvent(event.object) && hasChildNodes()) {
                            load(true);
                        }
                        break;
                }
            }
        };
        AzureUIRefreshCore.addListener(FUNCTION_MODULE, listener);
    }

    private static boolean isFunctionModuleEvent(Object eventObject) {
        return eventObject != null && eventObject instanceof FunctionApp;
    }
}
