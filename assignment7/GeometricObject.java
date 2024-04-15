package assignment7;

public class GeometricObject
{
	private String colour = "White";
	private boolean filled = true;
	private java.util.Date dateCreated;
	
	public GeometricObject()
	{
		dateCreated = new java.util.Date();
	}
	
	public GeometricObject(String color, boolean filled)
	{
		dateCreated = new java.util.Date();
		this.colour = colour;
		this.filled = filled;
	}
	
	public void setColour(String colour)
	{
		this.colour = colour;
	}
	
	public void setFilled(boolean filled)
	{
		this.filled = filled;
	}
	
	public boolean isFilled()
	{
		return filled;
	}
	
	public java.util.Date getDateCreated()
	{
		return dateCreated;
	}
	
	public String getColour()
	{
		return colour;
	}
	
	public String toString()
	{
		return "Created on: " + dateCreated + "\nColor: " + colour + " and filled: " + filled;
	}
}
