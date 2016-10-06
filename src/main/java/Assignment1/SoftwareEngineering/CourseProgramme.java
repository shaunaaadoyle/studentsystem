package Assignment1.SoftwareEngineering;

import java.util.ArrayList;

import org.joda.time.LocalDate;

public class CourseProgramme {

	public String courseName;
	private LocalDate endDate;
	private LocalDate startDate;
	private ArrayList<Module> moduleList;
	
	public CourseProgramme(String courseName, LocalDate startDate, LocalDate endDate, ArrayList<Module> moduleList) {
		
		this.courseName=courseName;
		this.startDate=startDate;
		this.endDate=endDate;			
		this.moduleList=moduleList;
	}
	
	public String getCourseName() {
		
		return courseName;
	}
	
	public LocalDate getStartDate() {
		
		return startDate;
	}
	
	public LocalDate getEndDate() {
		
		return endDate;
	}
	
	public ArrayList<Module> moduleList() {
		
		return moduleList;
	}
}
