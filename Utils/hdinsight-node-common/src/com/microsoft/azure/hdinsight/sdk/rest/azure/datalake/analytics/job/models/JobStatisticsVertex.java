/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 */

package com.microsoft.azure.hdinsight.sdk.rest.azure.datalake.analytics.job.models;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The detailed information for a vertex.
 */
public class JobStatisticsVertex {
    /**
     * The name of the vertex.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * The id of the vertex.
     */
    @JsonProperty(value = "vertexId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID vertexId;

    /**
     * The amount of execution time of the vertex.
     */
    @JsonProperty(value = "executionTime", access = JsonProperty.Access.WRITE_ONLY)
    private String executionTime;

    /**
     * The amount of data read of the vertex, in bytes.
     */
    @JsonProperty(value = "dataRead", access = JsonProperty.Access.WRITE_ONLY)
    private Long dataRead;

    /**
     * The amount of peak memory usage of the vertex, in bytes.
     */
    @JsonProperty(value = "peakMemUsage", access = JsonProperty.Access.WRITE_ONLY)
    private Long peakMemUsage;

    /**
     * Get the name of the vertex.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the id of the vertex.
     *
     * @return the vertexId value
     */
    public UUID vertexId() {
        return this.vertexId;
    }

    /**
     * Get the amount of execution time of the vertex.
     *
     * @return the executionTime value
     */
    public String executionTime() {
        return this.executionTime;
    }

    /**
     * Get the amount of data read of the vertex, in bytes.
     *
     * @return the dataRead value
     */
    public Long dataRead() {
        return this.dataRead;
    }

    /**
     * Get the amount of peak memory usage of the vertex, in bytes.
     *
     * @return the peakMemUsage value
     */
    public Long peakMemUsage() {
        return this.peakMemUsage;
    }

}
