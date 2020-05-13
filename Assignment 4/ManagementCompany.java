

public class ManagementCompany {

	  private final int MAX_PROPERTY = 5, MGMT_WIDTH = 10, MGMT_DEPTH = 10;
	  private double mgmFeePer;
	  private String name, taxID;
	  private Plot plot;
	  private Property[] properties;

	  public ManagementCompany() {
	    this.name = "";
	    this.taxID = "";
	    this.mgmFeePer = 0;
	    this.plot = new Plot();
	    this.properties = new Property[MAX_PROPERTY];
	  }

	  
	  
	  public ManagementCompany(String name, String taxID, double mgmFeePer, 
		      int x, int y, int width, int depth) {
		    this.name = name;
		    this.taxID = taxID;
		    this.mgmFeePer = mgmFeePer;
		    this.plot = new Plot(x,y,width,depth);
		    this.properties = new Property[MAX_PROPERTY];
		  }
	  
	  
	  public ManagementCompany(String name, String taxID, double mgmFeePer) {
	    this.name = name;
	    this.taxID = taxID;
	    this.mgmFeePer = mgmFeePer;
	    this.plot = new Plot(0,0,MGMT_WIDTH, MGMT_DEPTH);
	    this.properties = new Property[MAX_PROPERTY];
	  }


	  
	  public int addProperty(Property prpt) {
	    if (prpt == null) {
	      return -2;
	    }
	    
	    if (!plot.encompasses(prpt.getPlot())) {
	      return -3;
	    }
	    
	    for (int i = 0;i < properties.length;i++) {
	      if (properties[i] != null) {
	        if (properties[i].getPlot().overlaps(prpt.getPlot())) {
	          return -4;
	        }
	      } else {
	        properties[i]=prpt;
	        return i;
	      } 
	    }
	      return -1;
	  }
	  
	  public int addProperty(String propertyName, String city, double rent, String ownerName) {
	    return addProperty(new Property(propertyName, city, rent, ownerName));
	  }
	  
	  public int addProperty(String propertyName, String city, double rent, String ownerName,
	      int x, int y, int width, int depth) {
	    return addProperty(new Property(propertyName, city, rent, ownerName, x, y, width, depth));
	  }
	  
	  public double totalRent() {
	    double total = 0;
	    for (int i=0;i<properties.length;i++) {
	      if (properties[i]==null) {
	        break;
	      }
	      total += properties[i].getRentAmount();
	    }
	    return total;
	  }
	  
	  private int maxRentPropertyIndex() {
	    int index = -1;
	    double max = 0;
	    for (int i = 0;i<properties.length;i++) {
	      if (properties[i]==null) {
	        break;
	      }
	      if (properties[i].getRentAmount() > max) {
	        max = properties[i].getRentAmount();
	        index = i;
	      }
	    }
	    return index;
	  }
	  
	  public String maxRentProp() {
	    return properties[maxRentPropertyIndex()].toString();
	  }
	  
	  /**
	   * @return the MAX_PROPERTY
	   */
	  public int getMAX_PROPERTY() {
	    return MAX_PROPERTY;
	  }

	  public Plot getPlot() {
	    return plot;
	  }

	  private String displayPropertyAtIndex(int index) {
		    return properties[index].toString();
		  }
		  
		  public String getName() {
			    return name;
			  }
		  
		  
	  /* (non-Javadoc)
	   * @see java.lang.Object#toString()
	   */
	  @Override
	  public String toString() {

	    String prptList = "";
	    for (int i = 0; i < MAX_PROPERTY; i++) {
	      if (properties[i]==null) {
	        break;
	      } 
	      prptList += properties[i] + "\n"; 
	    }
	    return "List of the properties for " + name + ", taxID: " + taxID
	        + "\n__________________________________________________\n"
	        + prptList +  "__________________________________________________\n"
	        + "total management Fee: " + (totalRent() * mgmFeePer / 100);
	  }
	  
	}