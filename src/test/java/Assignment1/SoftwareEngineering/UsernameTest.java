package Assignment1.SoftwareEngineering;

import junit.framework.TestCase;

public class UsernameTest extends TestCase {

	protected String name;
	protected int age;
	public Student shauna;
	   
	   //creating a new student with their details
	   public void setUp(){
		   
	      shauna = new Student("Shauna","Doyle", 13417068, 20, "1995-11-20", "CS&IT");
	   }
	   
	   public void testAdd() {
		   
	      String result1 = "Shauna20";
	      assertTrue(result1.equals(shauna.getUsername()));
	   }
}
