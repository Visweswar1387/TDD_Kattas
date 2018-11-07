package com.ProducerConsumer;

public class CheckSelfishThread {
    private static String firstPrevious="";
    private static String secondPrevious="";
    public boolean checkSelfish(String currentThreadName) {
        if(secondPrevious=="") {
            secondPrevious=currentThreadName;
            return false;
        }
        if(firstPrevious=="") {
            firstPrevious=currentThreadName;
            return false;
        }
        if(secondPrevious.equals(currentThreadName) && firstPrevious.equals(currentThreadName)) {
            firstPrevious="";
            secondPrevious="";
            return true;
        }
        return false;
    }
}
