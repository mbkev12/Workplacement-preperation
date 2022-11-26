package com.mycompany.javaprogramming;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
 
public class JavaProgramming {
  public static void main(String[] args) {
 
	   DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	   Calendar cal = Calendar.getInstance();
	   Scanner in = new Scanner(System.in);

	   System.out.println("Current Date Time : " + dateFormat.format(cal.getTime()));
	   System.out.println("Input the year of your date of birth: ");
	   int Year = in.nextInt();


	   System.out.println("Input the month of your date of birth: ");
	   int Month = in.nextInt();


	   System.out.println("Input the day of your date of birth:  ");
	   int Day = in.nextInt();
	   
	  
         

  
  }
  }
