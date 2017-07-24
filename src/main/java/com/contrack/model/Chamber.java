package com.contrack.model;

import com.google.common.collect.Maps;
import org.springframework.util.StringUtils;

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

        if (StringUtils.isEmpty(input)) {
            return BOTH;
        }

        if (!mapping.containsKey(input)) {
            throw new IllegalArgumentException("Unknown value for chamber:" + input);
        }
        return mapping.get(input);
    }
}
