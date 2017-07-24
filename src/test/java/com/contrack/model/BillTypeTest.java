package com.contrack.model;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class BillTypeTest {

    @Test
    public void testAllMappings() {
        Arrays.stream(BillType.values()).forEach(billType ->
                assertThat(BillType.toBillType(billType.name().toLowerCase()), equalTo(billType)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullInput() {
        BillType.toBillType(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnknownInput() {
        BillType.toBillType("covfefe");
    }
}
