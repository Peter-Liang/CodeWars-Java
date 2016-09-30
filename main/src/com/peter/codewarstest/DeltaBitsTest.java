package com.peter.codewarstest;

import com.peter.codewars.DeltaBits;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DeltaBitsTest {

    @Test
    public void test() throws Exception {
        assertThat(DeltaBits.convertBits(31, 14), is(2));
    }
}
