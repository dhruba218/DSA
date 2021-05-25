package com.employee;

import java.util.Arrays;

public class PartD {
	
	public ContractEmployee[] getHighestContractSalaries(ContractEmployee[] conSal) {
		// ************************************ TODO D1 ************************************
		/*
		 * This method should print the TOP FIVE Compensations of the Contract Employees.
		 * This method should return a sorted array of ContractEmployee based on compensation
		 * 
		 * Uncomment the line "TestYourCode.testHighestContractSalaries(topFive)" to test your code 
		 * Note : topFive is an integer array that consists of all the top 5 Compensations 
		 * 
		 * Uncomment the line "TestYourCode.testSortedContractSalaries(conSal)" to test your code
		 * Note : conSal is the Sorted Array of Contract Employees  
		 *
		 */
		// ************************************ SOLUTION D1 BEGIN ************************************
		ContractEmployee temp;
		int[] topFive = new int[5];
		int k =0;
		for(int i =0;i<conSal.length;i++){
			int min = i;
			for(int j=i+1; j<conSal.length;j++){
				if(conSal[j].getCompensation()<conSal[min].getCompensation()){
					min = j;
				}
			}
			temp = conSal[min];
			conSal[min] = conSal[i];
			conSal[i]= temp;

		}
		for(int i =conSal.length-1; i>=conSal.length-5;i--){
			topFive[k] = conSal[i].getCompensation();
			System.out.println(topFive[k]);
			k++;
		}
		// Uncomment the line below to test your code
		TestYourCode.testHighestContractSalaries(topFive);


		return conSal;
		//************************************ SOLUTION D1 END ************************************
	}
	

	public void unionOfSalaries(PermanentEmployee[] sortedPerm, ContractEmployee[] sortedCon) {
		// ************************************ TODO D2 ************************************
		/* This method should print the ratio of Highest to Median Compensation of all employees
		 *
		 *Uncomment the line "TestYourCode.testUniteSalaries(ratio)" to test your code
		 *Note : ratio is a float value
		 *
		 */
		
		//************************************ SOLUTION D2 BEGIN ***********************************
		Employee[] emp = new Employee[sortedPerm.length+sortedCon.length];
		int [] arr1 = new int [sortedPerm.length];
		for (int i = 0; i < sortedPerm.length; i++) {
			arr1[i] = sortedPerm[i].getCompensation();
			//System.out.print(arr1[i] + " ");
		}
		int [] arr2 = new int [sortedCon.length];
		for (int i = 0; i < sortedCon.length; i++) {
			arr2[i] = sortedCon[i].getCompensation();
			//System.out.print(arr1[i] + " ");
		}



		int[] arr3 = new int[arr1.length+arr2.length];
		int i = 0, j = 0, k = 0, x, temp;
		//double median = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j])
				arr3[k++] = arr1[i++];
			else
				arr3[k++] = arr2[j++];
		}
		while (i < arr1.length)
			arr3[k++] = arr1[i++];
		while (j < arr2.length)
			arr3[k++] = arr2[j++];
		System.out.print("\nArray after merging: ");
		for (x = 0; x < arr1.length+arr2.length; x++)
			//System.out.print(arr3[x] + " ");

		for ( i = 0; i < arr3.length; i++) {
			for ( j = i + 1; j < arr3.length; j++) {
				if (arr3[i] > arr3[j]) {
					temp = arr3[i];
					arr3[i] = arr3[j];
					arr3[j] = temp;
				}
			}
		}
		//System.out.println("\nArray after SORTING: ");
		double median, t = 2;

		if (arr3.length % 2 == 0) {
			median = (arr3[arr3.length / 2] + arr3[arr3.length / 2 - 1]) / t; //88000  78000 12000 34000 50000 10000
		} else
			median = arr3[arr3.length / 2];
		//System.out.println(median);
		double ratio = arr3[arr3.length - 1] / median;
		System.out.println((float) ratio);
		System.out.println(" ");
		for (i = 0; i < arr3.length; i++) {
			//System.out.println(arr3[i] + " ");

		}
		// Uncomment the line below to test your code
		 TestYourCode.testUniteSalaries((float)ratio);

		//************************************ SOLUTION D2 END ************************************
	}
}
