package com.masai;

public class Main{
	
	public int[] findAndReturnPrimeNumbers(int[] inputArray){
		
		int[] ans = new int[inputArray.length];
		
		for(int i=0;i<inputArray.length;i++) {
			int count = 0;
			
			for(int j=2;j<inputArray[i];j++) {
				if(inputArray[i]%j==0) {
					count++;
				}
			}
			
			if(count==0) {
				ans[i] = inputArray[i];
			}
		}
		return ans;
		
	}
	
	public static void main(String[] args){
	//Create the object of Main class
	//on the object of Main class call the findAndReturnPrimeNumbers method
	//by supplying the following array as the parameter
		int[] arr = {10,12,5,50,11,1,15};
	//print each element from the returned array of findAndReturnPrimeNumbers method
	//if findAndReturnPrimeNumbers method returns an empty array then print the following
	
	// "Prime number not found in the supplied Array"
		Main d = new Main();
	
		int[] ans = d.findAndReturnPrimeNumbers(arr);	
		
		int count=0;
		for(int i=0;i<ans.length;i++)
		{
			if(ans[i]==0)
				count++;
			
		}
		
		
		if(ans.length == count) {
			System.out.println("Prime number not found in the supplied Array");
		}
		else {
			for(int item : ans) {
				if(item == 0) {
					continue;
				}
				else
				System.out.println(item);
			}
		}
		
		
	}
}
