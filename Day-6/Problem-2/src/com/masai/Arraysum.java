package com.masai;

public class Arraysum {
	public static void main(String[] args) {
		
		int[][] arr = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
		};
		
		
		for(int i=0;i<arr.length;i++) {
			int ans = 0;
			for(int j=0;j<arr[i].length;j++) {
				if(arr[j][i]%2 == 0) {
					ans = ans + arr[j][i];
				}
			}
			System.out.println(ans);
		}
		
	}
	
}

