package assignment7;
import java.util.ArrayList;

public class TestStaff
{
public static void main(String[] args){
		Staff lect = new Lecturer();
		Staff adm1 = new Admin();
		
		lect.setName("Zaki");
		lect.setJobTitle("Lecturer");
		lect.setStaffID();
		((Lecturer)lect).setCourse("CSC1103");
		((Lecturer)lect).setCourse("CSC1100");
		
		adm1.setName("Pauziah");
		adm1.setJobTitle("Admin Officer");
		adm1.setStaffID();
		
		((Admin)adm1).setSkill("Data Entry");
	
		displayInfo(lect);
		displayInfo(adm1);
	}
	
public static void displayInfo(Staff k){
	System.out.println("\nName: " + k.getName() + 
			"\nJob Title: " + k.getJobTitle() + 
			"\nStaff ID: " + k.getStaffID());
		
	if(k instanceof Lecturer){
		String[] tempCourse = ((Lecturer) k).getCourse();
			
		for(int i = 0; i < ((Lecturer) k).getCourseNo(); i++){
			System.out.println("Course " + (i+1) + ": " + tempCourse[i]);
		}
	}
		
	else if(k instanceof Admin){
		ArrayList<String> skill = ((Admin) k).getSkill();
			
		System.out.print("Skills");
			
		for(int i = 0; i < ((Admin) k).getSkillNo(); i++){
			System.out.println(": " + skill.get(i));
		}
	}
		
	else if(k instanceof Technical)
	{
		ArrayList<String> skill = ((Technical) k).getSkill();
			
		System.out.print("\nSkills");
			
		for(int i = 0; i < ((Technical) k).getSkillNo(); i++){
			System.out.println(": " + skill.get(i));
		}
	}
}}