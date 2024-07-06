package com.task;
/*
* Implement a function fizzbuzz.
* Which forms an array according to the following rules:
* <р>
* - The function takes an integer argument
* - If the number is a multiple of three, then we put the word Fizz into the array
* - If the number is a multiple of five, then we put the word Buzz into the array
* - If the number is a multiple of both three and five, then we put the word FizzBuzz
* - If the number is not a multiple of any of these numbers, then you must throw IlLegalArgumentException
* <р>
* The solution must be covered with tests
*/

public class FizzBuzz {
    public static byte[] fizzbuzz(int val){
        String res = "";
        if (val % 3 == 0) res += "Fizz";
        if (val % 5 == 0) res += "Buzz";
        if (res.isEmpty()) throw new IllegalArgumentException("number is not a multiple of 3 || 5");
        return res.getBytes();
    }
}
