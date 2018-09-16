package com.company;

import java.util.Scanner;
class PN
{
    public static void main(String args[])
    {
        int temp;
        boolean isPrime=true;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter any number:");
        //capture the input in an integer
        int num=scan.nextInt();
        scan.close();
        int limit = num/2;
        System.out.println("limit is " + limit);
        for(int i=2;i<=limit;i++)
        {
            temp=num%i;
            System.out.println("i=" + i + "and remainder=" + temp);
            if(temp==0)
            {
                isPrime=false;
                break;
            }
        }
        //If isPrime is true then the number is prime else not
        if(isPrime)
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num + " is not a Prime Number");
    }
}