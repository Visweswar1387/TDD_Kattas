package com.EncodeAndDecode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestEncodeString {

    private EncodeString encodeString;
    @Before
    public void initialise() {
        encodeString = new EncodeString();
    }

    @Test
    public void shouldTestInputStringLengthGreaterThanZero() {
        Assert.assertEquals("a2",encodeString.encode("aa"));
    }

    @Test
    public void shouldTestInputStringLengthLessThanZero() {
        Assert.assertEquals("Input string length must should be greater than 0",encodeString.encode(""));
    }

    @Test
    public void shouldTestConsecutiveCharacterFrequency() {
        ConsecutiveCharacterFrequency characterFrequency = new ConsecutiveCharacterFrequency();
        Assert.assertEquals(3,characterFrequency.findCharacterFrequency('a',"aaab"));
        Assert.assertEquals(1, characterFrequency.findCharacterFrequency('a',"a"));
    }

    @Test
    public void shouldTestEncodeString() {
        Assert.assertEquals("a2b1", encodeString.encode("aab"));
        Assert.assertEquals("a1b1c1",encodeString.encode("abc"));
        Assert.assertEquals("a1b2c3d4s1",encodeString.encode("abbcccdddds"));
        Assert.assertEquals("a1",encodeString.encode("a"));
        Assert.assertEquals("d3",encodeString.encode("ddd"));
    }
}
