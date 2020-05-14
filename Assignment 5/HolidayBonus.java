


public class HolidayBonus {
	
	public HolidayBonus()
	{
		
	}

	/**
	 * @param data
	 * @param high
	 * @param low
	 * @param other
	 * @return bonuses array
	 */    
    public static double[] calculateHolidayBonus(double[][] data, double high, double low, double other)
    {
    	double[] bonus = new double[data.length];
    	
    		int a = 0;
    		do{
    			int b = 0;
    			do{
    				if (data[a][b] >= 0)
    					{
    					if (data[a][b] == TwoDimRaggedArrayUtility.getHighestInColumn(data, b))
    						bonus[a] += high;
    					else if (data[a][b] == TwoDimRaggedArrayUtility.getLowestInColumn(data, b))
    						bonus[a] += low;
    					else
    						bonus[a] += other;
    					b++;
    					}
    				}while(b < data[a].length);
    			a++;
    		}while (a < bonus.length);
    	return bonus;
    }
    

    /**
	 * @param data
	 * @param high
	 * @param low
	 * @param other
	 * @return bonusTotal
	 */
    public static double calculateTotalHolidayBonus(double[][] data, double high, double low, double other){
        double total = 0;
        double[] bonuse = calculateHolidayBonus(data, high, low, other);
        
        for (int i = 0; i < bonuse.length; i++) {
			total += bonuse[i];
		}
		return total;
    }

}