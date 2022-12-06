package com.mycompany.javaprogramming;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class JavaProgramming {

 public static void main(String[] args) throws IOException {

               BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
        System.out.println("Enter Employee fullname : ");
        String str = reader.readLine();
        System.out.println("The employee fullname that you have entered is : ");
        System.out.println(str);        
    }
}