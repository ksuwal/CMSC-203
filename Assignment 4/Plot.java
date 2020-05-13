public class Plot {
  private int x, y, width, depth;

  public Plot() {
    this.width = 1;
    this.depth = 1;
  }

  public Plot(Plot p) {
    this.x = p.x;
    this.y = p.y;
    this.width = p.width;
    this.depth = p.depth;
  }

  public Plot(int x, int y, int width, int depth) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.depth = depth;
  }

  public boolean encompasses(Plot p) {
	  int x3 = x;
	  int y3 = y;
	  int width3 = x + width;
	  int depth3 = y + depth;
	  
	  int x4 = p.x;
	  int y4 = p.y;
	  int width4 = p.x + p.width;
	  int depth4 = p.y + p.depth;
	  
	  boolean comp3 = (width4 <= width3 && x4 >= x3);
	  boolean comp4 = (depth4 <= depth3 && y4 >= y3);

	  if (comp3 && comp4)
		  return true;
	  else
		  return false;
  }
  
  public boolean overlaps(Plot p) {
	  int x1 = x;
	  int y1 = y;
	  int width1 = x + width;
	  int depth1 = y + depth;
	  
	  int x2 = p.x;
	  int y2 = p.y;
	  int width2 = p.x + p.width;
	  int depth2 = p.y + p.depth;
	  
	  boolean comp1 = (x2 >= width1 || width2 <= x1);
	  boolean comp2 = (y2 >= depth1 || depth2 <= y1);
	  
	  if (comp1 || comp2)
		  return false;

	  else
		  return true;
  }

 

  /**
   * @return the x
   */
  public int getX() {
    return x;
  }

  /**
   * @param x the x to set
   */
  public void setX(int x) {
    this.x = x;
  }

  /**
   * @return the y
   */
  public int getY() {
    return y;
  }

  /**
   * @param y the y to set
   */
  public void setY(int y) {
    this.y = y;
  }

  /**
   * @return the width
   */
  public int getWidth() {
    return width;
  }

  /**
   * @param width the width to set
   */
  public void setWidth(int width) {
    this.width = width;
  }

  /**
   * @return the depth
   */
  public int getDepth() {
    return depth;
  }

  /**
   * @param depth the depth to set
   */
  public void setDepth(int depth) {
    this.depth = depth;
  }

  @Override
  public String toString() {
    return "Upper left: (" + x + "," + y + "); Width: " + width + " Depth:" + depth;
  }


}