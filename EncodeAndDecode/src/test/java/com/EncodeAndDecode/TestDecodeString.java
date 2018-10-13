package com.EncodeAndDecode;

import org.junit.Assert;
import org.junit.Test;

public class TestDecodeString {

    @Test
    public void shouldTestDecodeStringLengthGreaterThanZero() {
        Assert.assertEquals("Decode String length must greater than zero", decodeString.decode());
    }
}
