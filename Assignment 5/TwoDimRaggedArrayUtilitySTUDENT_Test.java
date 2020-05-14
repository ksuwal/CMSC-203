

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TwoDimRaggedArrayUtilitySTUDENT_Test {
	//STUDENT fill in dataSetSTUDENT with values, it must be a ragged array
	private double[][] dataSetSTUDENT = {{4.3, 5.8, 3.8, 2.2},{8.5, 6.9},{3.6, 6.1, 8.3},{10, 4.5, 9.4, 7.3}};
	
	private File inputFile,outputFile;

	@Before
	public void setUp() throws Exception {
		outputFile = new File("TestOut.txt");
	}

	@After
	public void tearDown() throws Exception {
		dataSetSTUDENT = null;
		inputFile = outputFile = null;
	}

	/**
	 * Student Test getTotal method
	 * Return the total of all the elements in the two dimensional array
	 */
	@Test
	public void testGetTotal() {
		assertEquals(80.7,TwoDimRaggedArrayUtility.getTotal(dataSetSTUDENT),.001);	
	}

	/**
	 * Student Test getAverage method
	 * Return the average of all the elements in the two dimensional array
	 */
	@Test
	public void testGetAverage() {
		assertEquals(6.207,TwoDimRaggedArrayUtility.getAverage(dataSetSTUDENT),.001);
	}

	/**
	 * Student Test getRowTotal method
	 * Return the total of all the elements of the row.
	 * Row 0 refers to the first row in the two dimensional array
	 */
	@Test
	public void testGetRowTotal() {
		assertEquals(16.1,TwoDimRaggedArrayUtility.getRowTotal(dataSetSTUDENT,0),.001);
		assertEquals(15.4,TwoDimRaggedArrayUtility.getRowTotal(dataSetSTUDENT,1),.001);
		assertEquals(18,TwoDimRaggedArrayUtility.getRowTotal(dataSetSTUDENT,2),.001);	
		assertEquals(31.2,TwoDimRaggedArrayUtility.getRowTotal(dataSetSTUDENT,3),.001);	
	}


	/**
	 * Student Test getColumnTotal method
	 * Return the total of all the elements in the column. If a row in the two dimensional array
	 * doesn't have this column index, it is not an error, it doesn't participate in this method.
	 * Column 0 refers to the first column in the two dimensional array
	 */
	@Test
	public void testGetColumnTotal() {
		assertEquals(26.4,TwoDimRaggedArrayUtility.getColumnTotal(dataSetSTUDENT,0),.001);
		assertEquals(23.3,TwoDimRaggedArrayUtility.getColumnTotal(dataSetSTUDENT,1),.001);
		assertEquals(21.5,TwoDimRaggedArrayUtility.getColumnTotal(dataSetSTUDENT,2),.001);
		assertEquals(9.5,TwoDimRaggedArrayUtility.getColumnTotal(dataSetSTUDENT,3),.001);
	}


	/**
	 * Student Test getHighestInArray method
	 * Return the largest of all the elements in the two dimensional array.
	 */
	@Test
	public void testGetHighestInArray() {
		assertEquals(10,TwoDimRaggedArrayUtility.getHighestInArray(dataSetSTUDENT),.001);
	}
	

	/**
	 * Test the writeToFile method
	 * write the array to the outputFile File
	 * then read it back to make sure formatted correctly to read
	 * @throws FileNotFoundException 
	 * 
	 */
	@Test
	public void testWriteToFile() throws FileNotFoundException {
		TwoDimRaggedArrayUtility.writeToFile(dataSetSTUDENT, outputFile);	
		assertArrayEquals(dataSetSTUDENT,TwoDimRaggedArrayUtility.readFile(outputFile));
	}

}