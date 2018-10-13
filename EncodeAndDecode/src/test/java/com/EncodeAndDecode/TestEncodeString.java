package com.EncodeAndDecode;

import org.junit.Assert;
import org.junit.Test;

public class TestEncodeString {


    @Test
    public void ShouldTestInputStringLengthGreaterThanZero() {
        EncodeString encodeString = new EncodeString();
        Assert.assertEquals("Length Greater than zero",encodeString.encode("aa"));

    }
}
