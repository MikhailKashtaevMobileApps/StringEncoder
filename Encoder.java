package com.example.mike.encodingproblem;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Encoder {

    String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) {

        Encoder Enc = new Encoder();

        // Testing encoding of string
        String s = "acp Errors in strategy cannot be correct through tactical maneuvers";

        System.out.println(Enc.encodeString(s));

        s = "Hello there! Apple!";

        Enc.printCharFrequency(Enc.charFrequency(s));
    }

    public String encodeString(String s){
        String res = "";
        int i;

        for( String letter: s.toLowerCase().split("") ){
            if ( alphabet.contains(letter) ){
                i = alphabet.length() - 1 - alphabet.indexOf(letter);
                res += alphabet.charAt(i);
            }else{
                res += letter;
            }

        }

        return res;
    }

    public HashMap<String, Integer> charFrequency(String s){
        HashMap<String, Integer> res = new HashMap<>();

        for( String letter: alphabet.split("") ){
            res.put(letter, 0);
        }

        for( String letter: s.toLowerCase().split("") ){
            if( alphabet.contains(letter) ){
                res.put(letter, res.get(letter) + 1);
            }
        }

        return res;
    }

    public void printCharFrequency(HashMap hm){
        for( String letter: alphabet.split("") ){
            System.out.println(letter+" "+hm.get(letter));
        }
    }

}
