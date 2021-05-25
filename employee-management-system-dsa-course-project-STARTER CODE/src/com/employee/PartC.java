package com.employee;

public class PartC {

	public PermanentEmployee[] getHighestToMedianSalary(PermanentEmployee[] perm) {
		// ************************************ TODO C1 ************************************
		/*
		 * This method should print the ratio of Highest Salary to Median Salary of the permanent employees
		 *
		 * This method should return a sorted array of the PermanentEmployee, based on compensation.
		 *
		 *
		 * Uncomment the line "TestYourCode.testHighestToMedianSalary(ratio)" to test your code
		 * Note : Pass the desired ratio as a float value
		 */

		// ************************************ SOLUTION C1 BEGIN ************************************

		int[] arr1 = new int[perm.length];
		int[] arr = new int[perm.length];
		int temp;
		double median, t = 2;


		for (int i = 0; i < perm.length; i++) {
			arr1[i] = perm[i].getCompensation();
			//System.out.print(arr1[i] + " ");
		}
		for (int i = 0; i < arr1.length; i++) {
			for (int j = i + 1; j < arr1.length; j++) {
				if (arr1[i] > arr1[j]) {
					temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp;
				}
			}
		}
		//System.out.println("Array: ");
		System.out.println(" ");
		for (int i = 0; i < perm.length; i++) {

			arr[i] = arr1[i];
			//System.out.print(arr[i] + " ");

		}
		if (arr.length % 2 == 0) {
			median = (arr[arr.length / 2] + arr[arr.length / 2 - 1]) / t; //88000  78000 12000 34000 50000 10000
		} else
			median = arr[arr.length / 2];
		//System.out.println(median);
		double ratio = arr[arr.length - 1] / median;
		System.out.println((float) ratio);
		System.out.println(" ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");

		}

		// Uncomment the line below to test your code
		 TestYourCode.testHighestToMedianSalary((float)ratio);

		return perm;


		// ************************************ SOLUTION C1 END ************************************
	}
}
