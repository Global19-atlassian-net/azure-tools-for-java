/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 */

package com.microsoft.azure.hdinsight.sdk.rest.azure.datalake.analytics.job.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for JobType.
 */
public enum JobType {
    /** Enum value USql. */
    USQL("USql"),

    /** Enum value Hive. */
    HIVE("Hive"),

    /** Enum value Scope. */
    SCOPE("Scope");

    /** The actual serialized value for a JobType instance. */
    private String value;

    JobType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a JobType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed JobType object, or null if unable to parse.
     */
    @JsonCreator
    public static JobType fromString(String value) {
        JobType[] items = JobType.values();
        for (JobType item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
