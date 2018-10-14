package com.EncodeAndDecode;

public class DecodeString {
    private final int ZERO=0;
    public String decode(String inputString) {
        ConversionCharacterFrequencyToString convert=new ConversionCharacterFrequencyToString();
        String decodeString="";
        if(inputString.length()>ZERO) {
            for(int i=ZERO;i<inputString.length();i=i+2) {
                decodeString=decodeString+convert.characterFrequencyToString(inputString.substring(i,i+2));

            }
            return decodeString;
        }
        return "Input string length must should be greater than 0";
    }
}
