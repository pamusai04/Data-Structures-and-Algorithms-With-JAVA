/*  leet code - 1295 - #Find Numbers with Even Numbers of Digits

import java.util.*;
public class linearSearchInEvenDigit {
	public static void main(String [] args){
		int[] arr = {12,345,2,6,7896};
		
		int ans = firnNumbers(arr);
		System.out.println(ans);		
	} 
		
	static int firnNumbers (int[] arr){
		int count = 0;
		for(int num : arr){
			if(even(num)){
				count++;
			}
		}
		return  count;
	}
	static boolean even(int num ){
		int numberofDigits = digits(num);
		/*
		if(numberofDigits % 2 ==0){
			return true;
		}
		return false;
		*/
		return numberofDigits % 2 ==0;
				
	}
	static int digits(int num ){
		if(num < 0){
			num = num * -1;
		}
		if(num == 0){
			return 1;
		}
		int count = 0;
		while (num > 0){
			count++;
			num = num / 10;
		}
		return count;
	}


		
}


