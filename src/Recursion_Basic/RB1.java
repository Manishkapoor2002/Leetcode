package Recursion_Basic;

import java.util.Scanner;

public class RB1 {

    public static void printiR(int i ,int n){
        if(i>n){
            return;
        }
        printiR(i+1,n);
        System.out.println(i);

    }
    public static void printi(int i ,int n){
        if(i<1){
            return;
        }

        printi(i-1,n);
        System.out.println(i);
    }
    public static void printName(int i, int n){
        if(i>n){
            return;
        }else {
            System.out.println("Manish kapoor");
        }
        printName(i+1,n);
    }



    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i  = 1;

//        printName(i,n);
//        printi(n,n);
        printiR(i,n);
    }
}