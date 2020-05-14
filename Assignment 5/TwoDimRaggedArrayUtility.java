import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDimRaggedArrayUtility {
	
	public TwoDimRaggedArrayUtility()
	{
		
	}
	
	public static double getAverage(double[][] data)
	{
		double itemSum = 0;
		int noOfItem = 0;
		for (int a=0; a < data.length; a++)
		{
			for (int j=0; j < data[a].length; j++)
			{
				noOfItem++;
				itemSum += data[a][j];
			}
		}
		return itemSum / noOfItem;
	}
	
	
	
	public static double getColumnTotal(double[][] data, int col)
	{
		
		double colSum = 0;
		for (int a=0; a < data.length; a++)
		{
			if (data[a].length > col)
			{
				colSum += data[a][col];
			}
		}
		return colSum;
	}
	
	
	
	public static double getHighestInArray(double[][] data)
	{
		double max = 0;
		for (int a=0; a < data.length; a++)
		{
			for (int b=0; b < data[a].length; b++)
			{
				if (data[a][b] > max)
					max = data[a][b];
			}
		}
		return max;
	}
	
	

	public static double getHighestInColumn(double[][] data, int col)
	{
		double max = 0;
		for (int a=0; a < data.length; a++)
		{
			if (data[a].length > col && data[a][col]>max)
			{
				max = data[a][col];
			}
		}
		
		return max;
	}
	
	
	
	public static int getHighestInColumnIndex(double[][] data, int col) 
	{
		double max = 0;		
		int index = 0;
		for (int a=0; a < data.length; a++)
		{
			if (data[a].length > col && data[a][col]>max)
			{
				max = data[a][col];
				index = a;
			}
		}
		
		return index;
	}
	
	
	public static double getHighestInRow(double[][] data, int row)
	{
		double max = 0;
		for(int a=0; a<data[row].length; a++)
		{
			if (data[row][a] > max)
				max = data[row][a];
		}
		
		return max;
	}
	
	
	public static int getHighestInRowIndex(double[][] data, int row)
	{		
		double max = 0;		
		int index = 0;
		for(int a=0; a<data[row].length; a++)
		{
			if (data[row][a] > max)
			{
				max = data[row][a];
				index=a;
			}
		}
		
		return index;
	}
	


	public static double getLowestInArray(double[][] data)
	{
		double min = 9999999.0;
		for (int a=0; a < data.length; a++)
		{
			for (int b=0; b < data[a].length; b++)
			{
				if (data[a][b] < min)
					min = data[a][b];
			}
		}
		return min;
	}
	
	
	public static double getLowestInColumn(double[][] data, int col)
	{
		double min = 9999999.0;
		for (int a=0; a < data.length; a++)
		{
			if (data[a].length > col && data[a][col] < min)
			{
				min = data[a][col];
			}
		}
		return min;
	}
	
	
	public static int getLowestInColumnIndex(double[][] data, int col)
	{
		double min = 9999999.0;
		int index = 0;
		for (int a=0; a < data.length; a++)
		{
			if (data[a].length > col && data[a][col] < min)
			{
				min = data[a][col];
				index = a;
			}
		}
		return index;
	}
	
	
	public static double getLowestInRow(double[][] data, int row)
	{
		double min = 9999999.0;
		for(int a=0; a<data[row].length; a++)
		{
			if (data[row][a] < min)
				min = data[row][a];
		}
		return min;
	}
	
	
	public static int getLowestInRowIndex(double[][] data, int row)
	{
		double min = 9999999.0;
		int index = 0;
		for(int a=0; a<data[row].length; a++)
		{
			if (data[row][a] < min)
			{
				min = data[row][a];
				index = a;
			}
		}
		return index;
	}
	
	
	public static double getRowTotal(double[][] data, int row)
	{
		double row_sum = 0;
		for(int a=0; a<data[row].length; a++)
		{
			row_sum += data[row][a];
		}
		return row_sum;
	}
	
	
	public static double getTotal(double[][] data)
	{
		double total = 0;
		for (int a=0; a < data.length; a++)
		{
			for (int b=0; b < data[a].length; b++)
			{
				total += data[a][b];
			}
		}
		return total;
	}
	
	
	public static double[][] readFile(java.io.File file) throws FileNotFoundException
	{
		Scanner in = new Scanner(file);
	    int row_Index = 0;
	    String[][] temp_Array = new String[10][]; 
	    
	    while (in.hasNextLine())
	    {
	    	String[] row = in.nextLine().split(" ");
	    	temp_Array[row_Index] = new String[row.length];
	    	for (int i = 0;i < row.length;i++)
	    	{
	    		temp_Array[row_Index][i]=row[i]; 
	    	}
	    	row_Index++;
	    }
	    
	    double[][]salesArray = new double[row_Index][];
	    for (int a = 0; a < row_Index;a++)
	    {
	    	salesArray[a]= new double[temp_Array[a].length];
	    	for (int j = 0;j < temp_Array[a].length;j++)
	    	{
	    		System.out.print(temp_Array[a][j] + " ");
	    		salesArray[a][j] = Double.parseDouble(temp_Array[a][j]);
	    	}
	    	System.out.println();
	    }
	    
	    in.close();
	    return salesArray;
	  }

	
	
	public static void writeToFile(double[][] data, File outputFile) throws FileNotFoundException
	{
	    PrintWriter write = new PrintWriter(outputFile);
	    StringBuilder build = new StringBuilder();
	    
	    for (int a = 0;a < data.length;a++)
	    {
	    	for (int b = 0;b < data[a].length;b++)
	    	{
	    		build.append(data[a][b]+ " ");
	    	}
	    	build.append("\n");
	    }
	   
	    write.print(build.toString());
	    write.close();
	  }

	}