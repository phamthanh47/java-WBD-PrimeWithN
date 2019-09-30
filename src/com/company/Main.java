package com.company;

import java.util.Scanner;

public class Main {
     public static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("nhap n: ");
        int number= scanner.nextInt();
        for(int i=0;i<=number;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean isPrime(int n){
        boolean check=true;
        if(n<2){
             check=false;
        }
       else {
           for(int i=2;i<= (int)Math.sqrt(n);i++){
               if(n % i ==0){
                   check=false;
                   break;
               }
           }
        }
       return check;
    }
}
