package com.EncodeAndDecode;

public class EncodeString {
    private int frequency;
    private char character;
    public String encode(String inputString) {
        String encodeString="";
        ConsecutiveCharacterFrequency characterFrequency = new ConsecutiveCharacterFrequency();
        if(inputString.length()>0) {
            for(int i=0; i<inputString.length();) {
                character=inputString.charAt(i);
                frequency= characterFrequency.findCharacterFrequency(character,inputString.substring(i+1));
                encodeString=encodeString+character+frequency;
                i=i+frequency;
            }
            return encodeString;
        }
        return "Input string length must should be greater than 0";
    }
}
