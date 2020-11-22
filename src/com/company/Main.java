package com.company;
import  java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int s = in.nextInt();
        if(s % 2 == 0)
        {
            System.out.print("Число - чётное!");
        }
        else if(s % 2 != 0)
        {
            System.out.print("Число - не чётное!");
        }
        else
        {
            System.out.print("Шо за дичь ты пишешь?! Хватит так делать!");
        }
    }
}