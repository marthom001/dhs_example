package com.eintern.coe.interview;

import java.util.ArrayList;
import java.util.HashSet;

public class NumberOfItemsPurchasedBySSNCOE {

	public static void processSSNEntries(ArrayList<String> SSN_ArrayList) {

		HashSet<String> countElementsSet = new HashSet<String>();
		int countArrayEntries = 0;

		// As items are added to the HashSet, the repeated items
		// are disregarded
		for (int i = 0; i < SSN_ArrayList.size(); i++) {
			countElementsSet.add(SSN_ArrayList.get(i));
		}

		// The elements of the HashSet are copied to a new array to
		// count each occurrence.
		String[] tempStringArray = countElementsSet.toArray(new String[0]);

		System.out.println("   SSN   " + " Number of Purchases\n");

		for (int j = 0; j < tempStringArray.length; j++) {
			for (int k = 0; k < SSN_ArrayList.size(); k++) {
				
				if (tempStringArray[j].equals(SSN_ArrayList.get(k))) {
					countArrayEntries++;
				}
				if (k == SSN_ArrayList.size() - 1) {
					System.out.printf("%s %4d %n", tempStringArray[j],
							countArrayEntries);
					countArrayEntries = 0;
				}

			}

		}
	}
}
