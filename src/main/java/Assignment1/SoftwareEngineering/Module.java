package Assignment1.SoftwareEngineering;

import java.util.ArrayList;

import org.joda.time.LocalDate;

public class Module {

	private String moduleName;	
	private String id;
	private ArrayList<Student> studentList;

	
	public Module(String moduleName, String id, ArrayList<Student> studentList) {
		
		this.moduleName=moduleName;
		this.id=id;
		this.studentList=studentList;

	}
	
	public String getModuleName() {
		
		return moduleName;
	}
	
	public String getId() {
		
		return id;
	}
	
	public ArrayList<Student> getStudentList() {
		
		return studentList;
	}
	
	
}
