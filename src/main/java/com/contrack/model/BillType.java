package com.contrack.model;

import com.google.common.collect.Maps;

import java.util.Arrays;
import java.util.Map;

public enum BillType {
    INTRODUCED("introduced"),
    UPDATED("updated"),
    PASSED("passed"),
    ENACTED("enacted"),
    VETOED("vetoed");

    private final String value;
    BillType(String value) {
        this.value = value;
    }

    private static final Map<String, BillType> mapping = Maps.newHashMap();
    static {
        Arrays.stream(BillType.values())
                .forEach(billType -> mapping.put(billType.getValue(), billType));
    }

    public String getValue() {
        return value;
    }

    public static BillType toBillType(String input) {
        if (!mapping.containsKey(input)) {
            throw new IllegalArgumentException("Unknown bill type:" + input);
        }
        return mapping.get(input);
    }
}
