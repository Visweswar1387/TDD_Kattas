package com.EncodeAndDecode;

public class EncodeString {

    public String encode(String inputString) {

        int frequency;
        char character;
        String encodeString="";

        if(inputString.length()>0) {
            ConsecutiveCharacterFrequency characterFrequency = new ConsecutiveCharacterFrequency();
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
