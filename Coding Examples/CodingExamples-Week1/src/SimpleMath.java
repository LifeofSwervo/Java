/*
Name: Lucas Hartman
Class: INFO 1521
Assignment:  Coding Example 1
Date: 9/2/22

Resource: Used Murach's Java programming book

This does some simple math to a couple of variables
 */
public class SimpleMath
{
    public static void main(String[] args)
    {
        // set up number variables
        int num1 = 9;
        int num2 = 4;

        // doing add, subtract, multiply and divide
        int sum = num1 + num2;
        int dif = num1 - num2;
        int prod = num1 * num2;
        int quot = num1 / num2;

        // print out results
        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " - " + num2 + " = " + dif);
        System.out.println(num1 + " * " + num2 + " = " + prod);
        System.out.println(num1 + " / " + num2 + " = " + quot);
    }
}

