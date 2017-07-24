package com.contrack.model;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ChamberTest {

    @Test
    public void testMappingSenate() {
        assertThat(Chamber.toChamber("senate"), equalTo(Chamber.SENATE));
    }

    @Test
    public void testMappingHouse() {
        assertThat(Chamber.toChamber("house"), equalTo(Chamber.HOUSE));
    }

    @Test
    public void testMappingBoth() {
        assertThat(Chamber.toChamber("both"), equalTo(Chamber.BOTH));
    }

    @Test
    public void testNullAndBlankValueMapping() {
        assertThat(Chamber.toChamber(null), equalTo(Chamber.BOTH));
        assertThat(Chamber.toChamber(""), equalTo(Chamber.BOTH));
    }

    @Test
    public void testMathUnknownValue() {
        assertThat(Chamber.toChamber("covfefe"), equalTo(Chamber.BOTH));
    }
}
