package com.EncodeAndDecode;

public class DecodeString {
    private final int ZERO=0;
    public String decode(String inputString) {
        if(inputString.length()>ZERO) {
            return ""+inputString.length();
        }
        return "Input string length must should be greater than 0";
    }
}
