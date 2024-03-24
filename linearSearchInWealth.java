// 1672 - Richest Customer Wealth
import java.util.*;
public class linearSearchInWealth {
	public static void main(String [] args){
		//int[][] arr = {{1,2,3},{3,2,1}};
		int[][] arr = {{1,5},{7,3},{3,5}};
		int ans = h_count(arr);
		System.out.println(ans);		
	} 
		
	static int h_count (int[][] arr){
		int total_h_wealth = Integer.MIN_VALUE;
		for(int row = 0; row < arr.length ; row++){
			int a = row_wealth(arr[row]);
			if (total_h_wealth < a){
				total_h_wealth = a;
			}
		}
		return total_h_wealth;
	}	
	static int row_wealth(int[] arr){
		int count = 0;
		for(int row = 0; row < arr.length ; row++){
			count = count + arr[row];
		}
		return count;
	}
}

