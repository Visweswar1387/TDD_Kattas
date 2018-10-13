package com.EncodeAndDecode;

public class DecodeString {
    public String decode(String inputString) {
        if(inputString.length()>0) {
            return ""+inputString.length();
        }
        return "Input string length must should be greater than 0";
    }
}
