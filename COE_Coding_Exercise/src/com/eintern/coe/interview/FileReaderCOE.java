//This program reads from a file called TestFile.txt which contains purchased items
//and returns the number of items purchased by each SSN

package com.eintern.coe.interview;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileReaderCOE {

	public static void readFileInformation(String filePath) {

		String uniqueLine = null;
		ArrayList<String> all_SSNs = new ArrayList<String>();

		try {
			/*File file = new File("TestFile.txt");
			FileReader fileReader = new FileReader(filePath);
			BufferedReader buffRead = new BufferedReader(fileReader);*/
			
			FileReader fileReader = new FileReader(filePath);
			BufferedReader buffRead = new BufferedReader(fileReader);
						
			// Read each line of the file into the Buffered Reader
			// and send the line to be processed by the LineParser class
			// Good SSNs are then added to the ArrayList "all_SSNs"
			while ((uniqueLine = buffRead.readLine()) != null) {
				if (LineParserCOE.retrieveSSN(uniqueLine) != "")
					all_SSNs.add(LineParserCOE.retrieveSSN(uniqueLine));
			}

			// Now the ArrayList is sent to the
			// NumberOfItemsPurchasedBySSNCOE class to determine
			// the number of purchases
			NumberOfItemsPurchasedBySSNCOE.processSSNEntries(all_SSNs);

			// Closes the FileReader stream
			fileReader.close();

		} catch (FileNotFoundException fnfe) {
			System.out.println("--The file cannot be found--");
			fnfe.printStackTrace();
			
		} catch (IOException ioe) {
			System.out.println("--Wrong type of character--");
			ioe.printStackTrace();
		}

	}
}
