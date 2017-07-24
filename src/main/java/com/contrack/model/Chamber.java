package com.contrack.model;

import com.google.common.collect.Maps;

import java.util.Arrays;
import java.util.Map;

public enum Chamber {
    SENATE("senate"),
    HOUSE("house"),
    BOTH("both");

    private final String value;
    Chamber(String value) {
        this.value = value;
    }

    private static final Map<String, Chamber> mapping = Maps.newHashMap();
    static {
        Arrays.stream(Chamber.values())
                .forEach(chamber -> mapping.put(chamber.getValue(), chamber));
    }

    public String getValue() {
        return value;
    }

    public static Chamber toChamber(String input) {
        return mapping.containsKey(input) ?
                mapping.get(input) : BOTH;
    }
}
