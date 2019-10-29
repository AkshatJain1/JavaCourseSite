public class Student 
{
	//attributes(gpa,name,age,id)
		private double gpa;
		private String name;
		private int age;
		private String id;
		
	//constructors(intializes attributes with values given)
		public Student(double gpa,String name,int age, String id)
		{
			this.gpa = gpa;
			this.name = name;
			this.age = age;
			this.id = id;
		}
		public Student()
		{
			gpa = 0;
			name = "First Last";
			age = 0;
			id = "A00000000";
		}
		
	//methods(accessors, mutators for gpa,name,age,id)
		//accessors
		public double getGpa()
		{
			return gpa;
		}
		public String getName()
		{
			return name;
		}
		public int getAge()
		{
			return age;
		}
		public String getID()
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
			this.gpa = gpa;
		}
		public void setAge(int age)
		{
			this.age = age;
		}
		public void setID(String id)
		{
			this.id = id;
		}

		public String toString()
		{
			return name;
		}
		public String info()
		{
			return name+" "+id+" "+gpa+" "+age;
		}}