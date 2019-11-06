package com.stackroute;

import java.util.Arrays;
import java.util.Scanner;


public class MaxDigitInString {

	public static int getMaxDigit(String alphanumeric) {
		Integer[] maxDigit = null;
		Integer maxNum;
		if(null== alphanumeric || alphanumeric.isEmpty()) {
			
			
			return -1;
		}
		
		alphanumeric = alphanumeric.trim().replaceAll("\\D","");
		alphanumeric = alphanumeric.trim().replaceAll(" ", "");
		
		
		
		if(alphanumeric.length()!=0) {
			
			maxDigit = new Integer[alphanumeric.length()];
			for(int i=0;i<alphanumeric.length();i++){
			maxDigit[i] = alphanumeric.charAt(i) - '0';
			}
			 maxNum = Arrays.stream(maxDigit).max(Integer :: compare).get();
			return maxNum;
		}
		return -1;
	}

   	//Do not print anything other than what's expected/asked in problem
    public static void main(String[] args) {
    	//Use Scanner to get input from console
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
       int i = getMaxDigit(input);
       if(i== -1) {
    	   System.out.println("No digits in string");
       }
       else {
    	   System.out.println("Maxdigit:" + i);
       }
    
    }
}
