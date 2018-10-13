package com.EncodeAndDecode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestDecodeString {

    private DecodeString decodeString;

    @Before
    public void initialise() {
        decodeString= new DecodeString();
    }

    @Test
    public void shouldTestDecodeStringLengthGreaterThanZero() {
        Assert.assertEquals("2", decodeString.decode("a1"));
    }

    @Test
    public void shouldTestDecodeStringLengthLessThanZero() {
        Assert.assertEquals("Input string length must should be greater than 0", decodeString.decode(""));
    }
}
