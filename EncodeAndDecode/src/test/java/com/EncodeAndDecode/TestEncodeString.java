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

    @Test
    public void ShouldTestInputStringLengthLessThanZero() {
        Assert.assertEquals("Input string length must should be greater than 0",encodeString.encode(""));
    }

    @Test
    public void ShouldTestConsecutiveCharacterFrequency() {
        ConsecutiveCharacterFrequency characterFrequency = new ConsecutiveCharacterFrequency();
        Assert.assertEquals(3,characterFrequency.findCharacterFrequency('a',"aaab"));
        Assert.assertEquals(1, characterFrequency.findCharacterFrequency('a',"a"));
    }

    @Test
    public void shouldTestEncodeString() {
        Assert.assertEquals("a1b", encodeString.encode("aab"));
    }
}
