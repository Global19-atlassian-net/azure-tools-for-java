/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 */

package com.microsoft.azure.hdinsight.sdk.rest.azure.datalake.analytics.accounts.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for TierType.
 */
public enum TierType {
    /** Enum value Consumption. */
    CONSUMPTION("Consumption"),

    /** Enum value Commitment_100AUHours. */
    COMMITMENT_100AUHOURS("Commitment_100AUHours"),

    /** Enum value Commitment_500AUHours. */
    COMMITMENT_500AUHOURS("Commitment_500AUHours"),

    /** Enum value Commitment_1000AUHours. */
    COMMITMENT_1000AUHOURS("Commitment_1000AUHours"),

    /** Enum value Commitment_5000AUHours. */
    COMMITMENT_5000AUHOURS("Commitment_5000AUHours"),

    /** Enum value Commitment_10000AUHours. */
    COMMITMENT_10000AUHOURS("Commitment_10000AUHours"),

    /** Enum value Commitment_50000AUHours. */
    COMMITMENT_50000AUHOURS("Commitment_50000AUHours"),

    /** Enum value Commitment_100000AUHours. */
    COMMITMENT_100000AUHOURS("Commitment_100000AUHours"),

    /** Enum value Commitment_500000AUHours. */
    COMMITMENT_500000AUHOURS("Commitment_500000AUHours");

    /** The actual serialized value for a TierType instance. */
    private String value;

    TierType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a TierType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed TierType object, or null if unable to parse.
     */
    @JsonCreator
    public static TierType fromString(String value) {
        TierType[] items = TierType.values();
        for (TierType item : items) {
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
