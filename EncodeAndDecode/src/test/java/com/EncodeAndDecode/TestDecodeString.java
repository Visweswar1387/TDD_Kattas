package com.EncodeAndDecode;

import org.junit.Assert;
import org.junit.Test;

public class TestDecodeString {

    @Test
    public void shouldTestDecodeStringLengthGreaterThanZero() {

        DecodeString decodeString = new DecodeString();
        Assert.assertEquals("2", decodeString.decode("a1"));
    }
}
