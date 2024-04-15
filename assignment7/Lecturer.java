package assignment7;

public class Lecturer extends Staff
{
	private String[] course = new String[4];
	private int courseNo;
	
	public Lecturer() {
	}
	
	public Lecturer(String[] course){
		this.course = course;
	}
	
	public int getCourseNo(){
		return courseNo;
	}
	
	public String[] getCourse(){
		return course;
	}
	
	public void setCourse(String courseName){
		if(courseNo <= 4){
			course[courseNo] = courseName;
			courseNo++;
		}
		
		else{
			System.out.println("Max no. of courses reached for the lecturer.");
		}
	}
}