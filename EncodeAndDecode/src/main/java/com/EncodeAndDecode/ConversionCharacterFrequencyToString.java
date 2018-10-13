package com.EncodeAndDecode;

public class ConversionCharacterFrequencyToString {
    private final int ZERO_ASCII=48;
    private final int FREQUENCY_INDEX=1;
    private final int CHARACTER_INDEX=0;
    public String characterFrequencyToString(String encodeString) {
        int frequency= encodeString.charAt(FREQUENCY_INDEX)-ZERO_ASCII;
        char character =encodeString.charAt(CHARACTER_INDEX);
        String decodeString="";
        for(int i=0;i<frequency;i++) {
            decodeString=decodeString+character;
        }
        return decodeString;
    }
}
