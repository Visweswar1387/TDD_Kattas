package com.EncodeAndDecode;

public class ConsecutiveCharacterFrequency {
    private final int ZERO=0;
    public int findCharacterFrequency(char character, String inputString) {
        int frequency=ZERO;
        for(int i=ZERO;i<inputString.length();i++) {
            if(character==inputString.charAt(i)) {
                frequency++;
            } else {
                break;
            }
        }
        return frequency;
    }
}
