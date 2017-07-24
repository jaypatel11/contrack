package com.contrack.model;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ChamberTest {

    @Test
    public void testAllMappings() {
        Arrays.stream(Chamber.values()).forEach(chamber ->
        assertThat(Chamber.toChamber(chamber.name().toLowerCase()), equalTo(chamber)));
    }

    @Test
    public void testNullAndBlankValueMapping() {
        assertThat(Chamber.toChamber(null), equalTo(Chamber.BOTH));
        assertThat(Chamber.toChamber(""), equalTo(Chamber.BOTH));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnknownValue() {
        Chamber.toChamber("covfefe");
    }
}
