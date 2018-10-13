package com.EncodeAndDecode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestEncodeString {

    EncodeString encodeString;
    @Before
    public void initialise() {
        encodeString = new EncodeString();
    }
    @Test
    public void ShouldTestInputStringLengthGreaterThanZero() {
        Assert.assertEquals("Length Greater than zero",encodeString.encode("aa"));
    }
}
