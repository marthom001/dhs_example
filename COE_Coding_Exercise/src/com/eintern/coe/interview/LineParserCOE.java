package com.eintern.coe.interview;

public class LineParserCOE {

	// This method pulls the SSNs from each line
	// If the SSN is invalid return an empty string

	public static String retrieveSSN(String uniqueLine) {

		String checkedSSN = uniqueLine.split("\\|")[0];

		return checkedSSN.startsWith("000") ? checkedSSN : "";

	}
}
