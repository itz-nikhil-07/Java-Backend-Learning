package com.loops3;

public class Temperature {

    public static void main(String[] args) {

        int temp[] = {32, 35, 31, 38, 40, 36, 34};
        
        int highest = temp[0];
        
        for(int i =0;i<temp.length;i++) {
        	if(temp[i] > highest) {
        		//update
        		highest= temp[i];
        		System.out.println("Highest temperature is: " + highest);
        	}
        	
        	System.out.println("-----CHECKING DIFFGERNT CASES---------");
        	System.out.println("Highest temperature is: " + highest);
        }
        
//        System.out.println("-----CHECKING DIFFGERNT CASES---------");
//        System.out.println("Highest temperature is: " + highest);

        
    }
}