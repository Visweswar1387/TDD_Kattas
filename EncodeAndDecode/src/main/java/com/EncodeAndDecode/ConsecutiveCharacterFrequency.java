package com.EncodeAndDecode;

public class ConsecutiveCharacterFrequency {
    public int findCharacterFrequency(char character, String inputString) {
        int frequency=0;
        for(int i=0;i<inputString.length();i++) {
            if(character==inputString.charAt(i)) {
                frequency++;
            } else {
                break;
            }
        }
        return frequency;
    }
}
