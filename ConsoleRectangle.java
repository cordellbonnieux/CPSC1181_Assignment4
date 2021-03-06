/**
 * Console Rectangle
 * Child class of ConsoleRectangle, instantiates a Rectangle Object
 * @author Cordell Bonnieux
 *
 */
public class ConsoleRectangle extends ConsoleShape {
	private int height;
	private int width;
	
	/**
	 * Class Constructor
	 * @param h int - height positive integer
	 * @param w int - width positive integer
	 * @param filled boolean - is filled in?
	 */
	public ConsoleRectangle(int h, int w, boolean filled) {
		super(filled);
		if (h < 1 || w < 1) {
			throw new IllegalArgumentException("Both parameters must be natural numbers.");
		}
		this.height = h;
		this.width = w;
	}
	
	/**
	 * Class Constructor
	 * @param h int - height
	 * @param w int - width
	 */
	public ConsoleRectangle(int h, int w) {
		this(h, w, true);
	}
	
	/**
	 * Get Height
	 * @return int - the height of the ConsoleRectangle
	 */
	public int getHeight() {
		return this.height;
	}
	
	/**
	 * Get Width
	 * @return int - the width of the ConsoleRectangle
	 */
	public int getWidth() {
		return this.width;
	}
	
	/**
	 * Set Height
	 * @param h int - positive integer for height
	 */
	public void setHeight(int h) {
		if (h < 1) {
			throw new IllegalArgumentException("Parameter must be a natural number.");
		}
		this.height = h;
	}
	
	/**
	 * Set Width
	 * @param w int - positive integer for width
	 */
	public void setWidth(int w) {
		if (w < 1) {
			throw new IllegalArgumentException("Parameter must be a natural number.");
		}
		this.width = w;
	}
	
	/**
	 * Get Area
	 * @return int - a positive integer representing the area
	 */
	@Override
	public int getArea() {
		return this.height * this.width;
	}
	
	/**
	 * Get Perimeter
	 * @return int - a positive integer representing the perimeter
	 */
	@Override
	public int getPerimeter() {
		return 2 * (this.height + this.width);
	}
	
	/**
	 * Draw For Console
	 * Draws a hash-tag(pound sign) rectangle shaped based on instance's data members.
	 * @return String image - An ASCII character image of a Rectangle
	 */
	@Override
	public String drawForConsole() {
		String[][] output = new String[this.getWidth()][this.getHeight()];
		String image = "";
		for (int x = 0; x < this.getWidth(); x++) {
			for (int y = 0; y < this.getHeight(); y++) {
				if (x == 0 || x == this.getWidth() - 1) {
					output[x][y] = "#";
				} else if (y == 0 || y == this.getHeight() -1) {
					output[x][y] = "#";
				} else if (this.isFilledIn()) {
					output[x][y] = "#";
				} else {
					output[x][y] = " ";
				}
			}
		}
		for (int y = 0; y < this.getHeight(); y++) {
			for (int x = 0; x < this.getWidth(); x++) {
				image += output[x][y];
				if (x == this.getWidth() - 1) {
					image += "\n";
				}
			}
		}
		return image;
	}
	
	@Override
	public String toString() {
		String info = "*** Console Rectangle Instance ***\n";
		info += "-Child class of \"Console Shape\"\n";
		info += "-Width: " + this.getWidth() + "\n";
		info += "-Height: " + this.getHeight() + "\n";
		info += "-Area: " + this.getArea() + "\n";
		info += "-Perimeter: " + this.getPerimeter() + "\n";
		info += "-Is Filled-in?: " + ((this.isFilledIn() == true) ? "Yes" : "No") + "\n";
		return info;
	}
}
