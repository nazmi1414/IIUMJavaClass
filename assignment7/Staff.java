package assignment7;

public class Staff
{
	private String name;
	private String jobTitle;
	private int staffID;
	
	public Staff() {
	}
	
	public Staff(String name, String jobTitle, int staffID){
		this.name = name;
		this.jobTitle = jobTitle;
		this.staffID = staffID;
	}
	
	public String getName(){
		return name;
	}
	public String getJobTitle(){
		return jobTitle;
	}
	public int getStaffID(){
		return staffID;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public void setJobTitle(String jobTitle){
		this.jobTitle = jobTitle;
	}
	public void setStaffID(){
		this.staffID = (int)(Math.random() * 1000 + 1);
	}
	
	public String toString(){
		return "Name: " + name + "\nJob Title: " + jobTitle + "\nStaff ID: " + staffID;
	}
}