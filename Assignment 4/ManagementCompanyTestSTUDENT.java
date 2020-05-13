

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ManagementCompanyTestSTUDENT {
	ManagementCompany c;
	
	@Before
	public void setUp() throws Exception {
		c = new ManagementCompany("Suwal Estate", "1234", 4, 0, 0, 100, 100);
		//student add three properties, with plots, to mgmt co
		c.addProperty("House", "Rockville", 1700, "Ram", 4, 4, 4, 4);
		c.addProperty("Home", "Silver Spring", 1400,"Shyam", 6, 10, 5, 5);
		c.addProperty("Apartment", "Germantown", 1650, "Gita", 11, 17, 4, 6);
	}

	@After
	public void tearDown() {
		c = null;
	}

	@Test
	public void testAddPropertyDefaultPlot() {
		//student should add property with 4 args & default plot (0,0,1,1)
		c.addProperty("Condominium", "Bathesda", 1800, "Hari");
		//student should add property with 8 args
		c.addProperty("Town-House", "Hyatsville", 2000, "Ramesh", 15, 21, 5, 7);
		//student should add property that exceeds the size of the mgmt co array and can not be added, add property should return -1
		assertEquals(c.addProperty("Suite", "College Park", 2200, "Lalu", 50, 50, 1, 1), -1, 0);
	}
 

	@Test
	public void testTotalRent() {
		assertEquals(c.totalRent(), 4750, 0);
	}
	
	@Test
	public void testMaxRentProp() {
		//student should test if maxRentProp contains the maximum rent of properties
		String maxRentString = c.maxRentProp().split("\n")[3];
		assertTrue(maxRentString.contains("1700"));
	}

 }
