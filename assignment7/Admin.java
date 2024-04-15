package assignment7;

import java.util.ArrayList;

public class Admin extends Staff
{
	private ArrayList<String> skill = new ArrayList<String>();
	private int skillNo;
	
	public Admin() {
	}
	
	public Admin(ArrayList<String> skill){
		this.skill = skill;
	}
	
	public int getSkillNo(){
		return skillNo;
	}
	
	public ArrayList<String> getSkill(){
		return skill;
	}
	
	public void setSkill(String skillName){
		skill.add(skillNo, skillName);
		skillNo++;
	}
}