/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 */

package com.microsoft.azure.hdinsight.sdk.rest.azure.datalake.analytics.job.models;

import java.util.UUID;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A Data Lake Analytics job data path item.
 */
public class JobDataPath {
    /**
     * The ID of the job this data is for.
     */
    @JsonProperty(value = "jobId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID jobId;

    /**
     * The command that this job data relates to.
     */
    @JsonProperty(value = "command", access = JsonProperty.Access.WRITE_ONLY)
    private String command;

    /**
     * The list of paths to all of the job data.
     */
    @JsonProperty(value = "paths", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> paths;

    /**
     * Get the ID of the job this data is for.
     *
     * @return the jobId value
     */
    public UUID jobId() {
        return this.jobId;
    }

    /**
     * Get the command that this job data relates to.
     *
     * @return the command value
     */
    public String command() {
        return this.command;
    }

    /**
     * Get the list of paths to all of the job data.
     *
     * @return the paths value
     */
    public List<String> paths() {
        return this.paths;
    }

}
