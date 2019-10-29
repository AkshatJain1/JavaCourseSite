public class Student
{   
	//attributes(gpa,name,grade,id)
		private double gpa;
		private String name;
		private int grade;
		private String id;
	
	//constructor(takes in values for attributes and initializes them)
	public Student(double gpa,String name, int grade, String id)
	{
		this.gpa = gpa;
		this.name = name;
		this.grade = grade;
		this.id = id;
	}
	//methods(accessors and mutators)
	
	//accessors
	public double getGpa()
	{
		return gpa;
	}

	public String getName()
	{
		return name;
	}

	public int getGrade()
	{
		return grade;
	}

	public String getId()
	{
		return id;
	}
	//mutators
	public void setGpa(double gpa)
	{
		this.gpa = gpa;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setGrade(int grade)
	{
		this.grade=grade;
	}
	
	public void setId(String id)
	{
		this.id = id;
	}
	
	public String toString()
	{
		return "\nName: "+name + "\nID: "+id+"\nGrade: "+grade+"\nGPA: "+gpa;
	}
	
}   

    