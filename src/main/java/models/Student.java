package models;

public class Student {

	private int id;
    private String name;
    private String rollNo;
    private String subject;
    private int marks;
    private String grade;
    
    public Student() {};
    
    public Student(int id,String name,String rollNo,String subject,int marks,String grade)
    {
    	this.setId(id);
    	this.setName(name);
    	this.setRollNo(rollNo);
        this.setSubject(subject);
        this.setMarks(marks);
        this.setGrade(grade);
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
    
    
}
