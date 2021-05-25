package com.employee;

import java.util.Scanner;

public class PartB {

	public void searchForAnEmployee(PermanentEmployee[] perm, int id) {
		// ************************************ TODO B1 ************************************
		/*
		 * This method should print the contact number of corresponding employee if
		 * present else the method should print : "Employee not in the records"
		 * 
		 * Uncomment the line containing "TestYourCode.testSearchForAnEmployee(str)" to test your code 
		 * Note : str is the contact number of the corresponding employee;
		 */
		
		// ************************************ SOLUTION B1 BEGIN ************************************


		int[] arr1 = new int[perm.length];
		String[] arr2 = new String[perm.length];
				for(int i =0; i<perm.length; i++){
					arr1[i] =perm[i].getId();
					//System.out.print(arr1[i]+" ");
				}
				System.out.println("");
				for(int i =0; i<perm.length; i++){
					arr2[i] = perm[i].getContact();

					//System.out.print(arr2[i]+" ");

				}
				//System.out.println("Key:");
				System.out.println("");
				int flag = 0;
				int key = 0;
				int i;
				for ( i = 0; i < perm.length; i++)
				{
					if (arr1[i] == id)
					{
						//System.out.print("Found");
						key = i;
						flag = 1;
						break;
					}
				}
				if (i == perm.length)
					System.out.println( "Employee not in the records");
				if(flag == 1){
					System.out.println(arr2[key]);
				}










		// Uncomment below line to test your code
		String str = arr2[key];
		TestYourCode.testSearchForAnEmployee(str);

		// ************************************ SOLUTION B1 END ************************************
	}
}
