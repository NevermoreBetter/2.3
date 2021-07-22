package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(teacher(7,2));
        System.out.println(alph(10,10));
    }

    public static long teacher(int teach, int curat){
        long result = fact(teach)/(fact(curat)*fact(teach-curat));
        System.out.println("Number of combinations: "+result);
        return result;
    }

    public static double alph(int letters,int word){
        if(letters<0||word<0) throw new NumberFormatException();
        else {
            double result = Math.pow(letters,word);
            System.out.println("Number of combinations");
            return result;
        }
    }

    public static  long fact(long num){
        if(num==0){
            return num+1;
        }
        num=num*fact(num-1);
        return num;
    }
}
