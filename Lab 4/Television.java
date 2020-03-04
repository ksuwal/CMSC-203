/** 
*The purpose of this class is to model a television
*Kabindra Raj Suwal and today’s date
*/

public class Television {

	final String MANUFACTURER;   // This is for brand name of the television
	final int SCREEN_SIZE;       // This is for the screen size of the television
	boolean powerOn;             // This is for turning the power on or off
	int channel;                 // this is for the channel currently on the television
	int volume;                  // this is the volume of the television
	
	
	
	/**This is a constructor that sets the Manufacturer name and the Screen Size
	 * and initializes powerOn and volume to false and 20 respectively.
	 */
	public Television(String manufacturer, int size)
	{
		this.MANUFACTURER = manufacturer;
		this.SCREEN_SIZE = size;
		powerOn = false;
		volume = 20;
		channel = 2;
	}



	/** 
	 * @return the MANUFACTURER
	 */
	public String getManufacturer() {
		return MANUFACTURER;
	}



	/**
	 * @return the SCREEN_SIZE
	 */
	public int getScreenSize() {
		return SCREEN_SIZE;
	}



	/**
	 * @return the channel
	 */
	public int getChannel() {
		return channel;
	}



	/**
	 * @return the volume
	 */
	public int getVolume() {
		return volume;
	}



	/** Mutator Method that accepts a value to be stored in the channel field.

	 * @param channel the channel to set
	 */
	public void setChannel(int channel) {
		this.channel = channel;
	}


	
	/** Mutator Method that changes the state from true to false and vice versa
	 * 
	 */
	public void power()
	{
		powerOn = !powerOn;
	}
	
	
	
	/** Method that increases the volume by 1
	 * 
	 */
	public void increaseVolume()
	{
		volume+=1;
	}
	
	
	
	/** Method that decreases the volume by 1
	 * 
	 */
	public void decreaseVolume()
	{
		volume-=1;
	}
	
	
	

}