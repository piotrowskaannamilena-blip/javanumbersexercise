
package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("hello, I am a test");
        
        int x=3;
        int y=5;
        int result = add(x, y);
        System.out.println("Sum of x and y: " +  result);

        //Call FizzBuzz
        FizzBuzz(50);
    }

    public static int add(int x, int y) {
        return x+y;
    }
//“Print numbers 1–50, 
//but multiples of 3 say Fizz, 
//multiples of 5 say Buzz, 
//3 & 5 say FizzBuzz.”

    public static void FizzBuzz(int x) { 

        for (int i = 1; i <= x; i++) {
            if (i%5 ==0 && i%3 == 0) {     
            System.out.println("FizzBuzz");    
                } else if (i % 5 ==0){
                System.out.println("Buzz");
                }
                else if (i % 3 == 0) {
                System.out.println("Fizz");
                } else {
                    System.out.println(i);
                }
            }
    } 
}




