package Assignment1.SoftwareEngineering;
import org.joda.time.*;
public class Student {

	private String firstName;
	private String surname;
	private int age;
	private int id;
	public String username;
	private LocalDate dob;
	
	public Student(String firstName, String surname, int id, int age, String dob) {
		
		this.firstName=firstName;
		this.surname=surname;
		this.id=id;
		this.age=age;
		this.dob= new LocalDate(dob);
		this.setUsername();
		
	}
	
	public String getFirstName() {
        return firstName;
    }
	
	public String getSurname() {
		
		return surname;
	}
	
	public int getId() {
		
		return id;
	}
	
	public int getAge() {
		
		return age;
	}
	
	public LocalDate getDob() {
		
		return dob;
	}
	public void setUsername() {
		
		username=firstName+age;
	}
	
	public String getUsername() {
		
		return username;
	}
	
	
}
