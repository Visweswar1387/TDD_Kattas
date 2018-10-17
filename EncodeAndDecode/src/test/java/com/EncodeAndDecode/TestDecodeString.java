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
        Assert.assertEquals("aa", decodeString.decode("a2"));
    }

    @Test
    public void shouldTestDecodeStringLengthLessThanZero() {
        Assert.assertEquals("Input string length must should be greater than 0", decodeString.decode(""));
    }

    @Test
    public void shouldTestConversionFromCharacterFrequencyToString() {
        ConversionCharacterFrequencyToString conversionCharacterFrequencyToString = new ConversionCharacterFrequencyToString();
        Assert.assertEquals("aa", conversionCharacterFrequencyToString.characterFrequencyToString("a2"));
        Assert.assertEquals("bbbbb", conversionCharacterFrequencyToString.characterFrequencyToString("b5"));

    }

    @Test
    public void shouldTestDecodeString() {
        Assert.assertEquals("aab",decodeString.decode("a2b1"));
        Assert.assertEquals("a",decodeString.decode("a1"));
        Assert.assertEquals("aaaabbbbbcccde",decodeString.decode("a4b5c3d1e1"));
    }
}
