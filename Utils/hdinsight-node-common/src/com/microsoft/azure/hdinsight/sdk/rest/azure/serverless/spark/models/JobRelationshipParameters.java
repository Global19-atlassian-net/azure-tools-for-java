/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 */

package com.microsoft.azure.hdinsight.sdk.rest.azure.serverless.spark.models;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Job relationship information properties including pipeline information, correlation information, etc.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class JobRelationshipParameters {
    /**
     * The job relationship pipeline identifier (a GUID).
     */
    @JsonProperty(value = "pipelineId")
    private UUID pipelineId;

    /**
     * The friendly name of the job relationship pipeline, which does not need to be unique.
     */
    @JsonProperty(value = "pipelineName")
    private String pipelineName;

    /**
     * The pipeline uri, unique, links to the originating service for this pipeline.
     */
    @JsonProperty(value = "pipelineUri")
    private String pipelineUri;

    /**
     * The run identifier (a GUID), unique identifier of the iteration of this pipeline.
     */
    @JsonProperty(value = "runId")
    private UUID runId;

    /**
     * The recurrence identifier (a GUID), unique per activity/script, regardless of iterations. This is something to
     * link different occurrences of the same job together.
     */
    @JsonProperty(value = "recurrenceId", required = true)
    private UUID recurrenceId;

    /**
     * The recurrence name, user friendly name for the correlation between jobs.
     */
    @JsonProperty(value = "recurrenceName")
    private String recurrenceName;

    /**
     * Get the job relationship pipeline identifier (a GUID).
     *
     * @return the pipelineId value
     */
    public UUID pipelineId() {
        return this.pipelineId;
    }

    /**
     * Set the job relationship pipeline identifier (a GUID).
     *
     * @param pipelineId the pipelineId value to set
     * @return the JobRelationshipParameters object itself.
     */
    public JobRelationshipParameters withPipelineId(UUID pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }

    /**
     * Get the friendly name of the job relationship pipeline, which does not need to be unique.
     *
     * @return the pipelineName value
     */
    public String pipelineName() {
        return this.pipelineName;
    }

    /**
     * Set the friendly name of the job relationship pipeline, which does not need to be unique.
     *
     * @param pipelineName the pipelineName value to set
     * @return the JobRelationshipParameters object itself.
     */
    public JobRelationshipParameters withPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
        return this;
    }

    /**
     * Get the pipeline uri, unique, links to the originating service for this pipeline.
     *
     * @return the pipelineUri value
     */
    public String pipelineUri() {
        return this.pipelineUri;
    }

    /**
     * Set the pipeline uri, unique, links to the originating service for this pipeline.
     *
     * @param pipelineUri the pipelineUri value to set
     * @return the JobRelationshipParameters object itself.
     */
    public JobRelationshipParameters withPipelineUri(String pipelineUri) {
        this.pipelineUri = pipelineUri;
        return this;
    }

    /**
     * Get the run identifier (a GUID), unique identifier of the iteration of this pipeline.
     *
     * @return the runId value
     */
    public UUID runId() {
        return this.runId;
    }

    /**
     * Set the run identifier (a GUID), unique identifier of the iteration of this pipeline.
     *
     * @param runId the runId value to set
     * @return the JobRelationshipParameters object itself.
     */
    public JobRelationshipParameters withRunId(UUID runId) {
        this.runId = runId;
        return this;
    }

    /**
     * Get the recurrence identifier (a GUID), unique per activity/script, regardless of iterations. This is something to link different occurrences of the same job together.
     *
     * @return the recurrenceId value
     */
    public UUID recurrenceId() {
        return this.recurrenceId;
    }

    /**
     * Set the recurrence identifier (a GUID), unique per activity/script, regardless of iterations. This is something to link different occurrences of the same job together.
     *
     * @param recurrenceId the recurrenceId value to set
     * @return the JobRelationshipParameters object itself.
     */
    public JobRelationshipParameters withRecurrenceId(UUID recurrenceId) {
        this.recurrenceId = recurrenceId;
        return this;
    }

    /**
     * Get the recurrence name, user friendly name for the correlation between jobs.
     *
     * @return the recurrenceName value
     */
    public String recurrenceName() {
        return this.recurrenceName;
    }

    /**
     * Set the recurrence name, user friendly name for the correlation between jobs.
     *
     * @param recurrenceName the recurrenceName value to set
     * @return the JobRelationshipParameters object itself.
     */
    public JobRelationshipParameters withRecurrenceName(String recurrenceName) {
        this.recurrenceName = recurrenceName;
        return this;
    }

}
