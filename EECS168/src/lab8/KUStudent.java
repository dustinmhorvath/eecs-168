package lab8;

public class KUStudent {
	private String stud_fname;
	private String stud_lname;
	public String stud_kuid;
	public String stud_dpt;
	private double stud_gpa;
	
	public void set_name(String first, String last){
		stud_fname = first;
		stud_lname = last;
	}
	
	public String getFirst(){
		return stud_fname;
	}
	
	public String getLast(){
		return stud_lname;
	}
	
	public void setGPA(double gpa){
		stud_gpa = gpa;
	}
	
	public double getGPA(){
		return stud_gpa;
	}
}
