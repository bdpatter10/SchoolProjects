/*Name: Blake Patterson    
 * Date: June 5 2018
 * Program Description:sphere class contains methods that determine information
 * of a Sphere based on its radius
 */
public class Sphere 
{
	private int diameter;
	
	public Sphere(int diameter)
	{
		this.diameter = diameter;
		
	}
	
	public int getDiameter()
	{
		return diameter;
	}
	
	public int setDiameter(int newDiameter)
	{
		diameter = newDiameter;
		return diameter;
	}
	
	public double getVolume()
	{
		double radius = diameter / 2;
		double volume = (4/3)* Math.PI *Math.pow(radius, 3.0);
		
		return volume;
	}
	
	public double getSurfaceArea()
	{
		double radius = diameter / 2;
		double surfaceArea = 4 * Math.PI * Math.pow(radius, 2.0);
		
		return surfaceArea;
	}
	
	public String toString()
	{
		String sphereStats = "This Sphere has a diameter of " + getDiameter() 
		+ "and a volume of " + getVolume() + "and a surface area of " 
		+ getSurfaceArea();
				
		return sphereStats;
	}
	
}
