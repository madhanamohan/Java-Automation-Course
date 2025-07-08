package corejaveproject;

interface ProgressTrackable 
{ 
void trackProgress();
}

abstract class User
{ 
	 private String name;
	 private String email;
	 private String userId; 
	 // Constructor to initialize all fields
	 public User(String name, String email, String userId)
	 {
	     this.name = name; 
	     this.email = email; 
	     this.userId = userId; 
	 }
	 public String getName()
	 {
	     return name;
	 }
	 public String getEmail()
	 {
	     return email;
	 }
	 public String getUserId() 
	 {
	     return userId;
	 }
	 public void setName(String name)
	 {
	     this.name = name;
	 }
	 public void setEmail(String email)
	 {
	     this.email = email;
	 }
	 public abstract void viewProfile();
	 public final void displayWelcome()
	 {
	     System.out.println("Wlcm, " + name + " (" + userId + ") to LMS");
	 }
}
class Student extends User implements ProgressTrackable
{
	 private String enrolledCourse1;
	 private String enrolledCourse2;
	 private final int MAX_ENROLLMENT = 2; 
	 private int enrolledCourseCount = 0;
	
	 public Student(String name, String email, String userId) 
	 {
	     super(name, email, userId);
	     this.enrolledCourse1 = null;
	     this.enrolledCourse2 = null; 
	 }	
	 public void enrollCourse(String courseName) 
	 {
	     if (enrolledCourseCount < MAX_ENROLLMENT) 
	     { 
	         if (this.enrolledCourse1 == null)
	         {
	             this.enrolledCourse1 = courseName; 
	             enrolledCourseCount++;
	             System.out.println(getName() + " enrolled in: " + courseName);
	         }
	         else if (this.enrolledCourse2 == null)
	         { 
	             this.enrolledCourse2 = courseName; 
	             enrolledCourseCount++;
	             System.out.println(getName() + " enrolled in: " + courseName);
	         }
	     } 
	     else 
	     {
	         System.out.println(getName() + " cannot enroll in " + courseName + "Maximum enrollment reached");
	     }
	 }	

		/*
		 * public void enrollCourse(String courseName, String courseId) {
		 * System.out.println(getName() + " is attempting to enroll in " + courseName +
		 * " with ID " + courseId + " (Overloaded method)."); enrollCourse(courseName);
		 * // Call the primary enrollCourse logic }
		 */ 
	 @Override 
	 public void viewProfile() 
	 { 
	     System.out.println("\n--- Student Profile ---");
	     System.out.println("Name: " + super.getName()); 
	     System.out.println("Email: " + super.getEmail()); 
	     System.out.println("User ID: " + super.getUserId()); 
	     System.out.println("Enrolled Courses: " + (enrolledCourse1 != null ? enrolledCourse1 : "None") +
	             (enrolledCourse2 != null ? ", " + enrolledCourse2 : ""));
	 }
	 @Override // 
	 public void trackProgress()
	 {
	     System.out.println(getName() + "tracking progress for courses.");
	     if (enrolledCourse1 != null) 
	     {
	         System.out.println("- Progress for " + enrolledCourse1 + ": 75%");
	     }
	     if (enrolledCourse2 != null) 
	     {
	         System.out.println("- Progress for " + enrolledCourse2 + ": 60%");
	     }
	     if (enrolledCourse1 == null && enrolledCourse2 == null)
	     {
	         System.out.println("- No courses enrolled yet.");
	     }
	 }	
	 // Getters and Setters for enrolled courses
	 public void setEnrolledCourse1(String enrolledCourse1) 
	 {
	     this.enrolledCourse1 = enrolledCourse1;
	 }
	 public String getEnrolledCourse1() 
	 {
	     return enrolledCourse1;
	 }	
	 public String getEnrolledCourse2()
	 {
	     return enrolledCourse2;
	 }	
	 public void setEnrolledCourse2(String enrolledCourse2) 
	 {
	     this.enrolledCourse2 = enrolledCourse2;
	 }
}
class Instructor extends User 
	{
	 private String createdCourse1;
	 private String createdCourse2;
	 private final int MAX_CREATED_COURSES = 2; 
	 private int createdCourseCount = 0;
	 public Instructor(String name, String email, String userId) 
	 {
	     super(name, email, userId); 
	     this.createdCourse1 = null; 
	     this.createdCourse2 = null; 
	 } 
	 public void createCourse(String courseName)
	 {
	     if (createdCourseCount < MAX_CREATED_COURSES) 
	     { 
	         if (this.createdCourse1 == null)
	         { 
	             this.createdCourse1 = courseName; 
	             createdCourseCount++;
	             System.out.println(getName() + " created course: " + courseName);
	         }
	         else if (this.createdCourse2 == null) 
	         { 
	             this.createdCourse2 = courseName; 
	             createdCourseCount++;
	             System.out.println(getName() + " created course: " + courseName);
	         }	        
	     } 
	     else
	     {
	         System.out.println(getName() + " cannot create " + courseName + ". Maximum courses (" + MAX_CREATED_COURSES + ") reached.");
	     }
	 } 
	 @Override 
	 public void viewProfile() 
	 { 
	     System.out.println("\n--- Instructor Profile ---");
	     System.out.println("Name: " + super.getName()); 
	     System.out.println("Email: " + super.getEmail()); 
	     System.out.println("User ID: " + super.getUserId()); 
	     System.out.println("Created Courses: " + (createdCourse1 != null ? createdCourse1 : "None") +
	             (createdCourse2 != null ? ", " + createdCourse2 : ""));
	 } 
	 public void setCreatedCourse1(String createdCourse1)
	 {
	   this.createdCourse1 = createdCourse1;
	 }
	 public void setCreatedCourse2(String createdCourse2)
	 {
	     this.createdCourse2 = createdCourse2;
	 }
	 public String getCreatedCourse1() 
	 {
	     return createdCourse1;
	 }
	 public String getCreatedCourse2() 
	 {
	     return createdCourse2;
	 }			
}
class Admin extends User
{
	 public Admin(String name, String email, String userId) 
	 {
	     super(name, email, userId); 
	 }
	 public void removeUser(User user)
	 {
	     System.out.println("Admin " + getName() + " removed user: " + user.getName() + " (ID: " + user.getUserId() + ")");
	 }
	 @Override
	 public void viewProfile()
	 {
	     System.out.println("\n--- Admin Profile ---");
	     System.out.println("Name: " + super.getName()); 
	     System.out.println("Email: " + super.getEmail()); 
	     System.out.println("User ID: " + super.getUserId()); 
	     System.out.println("Role: System Administrator");
	 }
}
class Course 
{
	private String title;
	private int durationInHours;
	private final int maxStudents; 
	public Course(String title, int durationInHours, int maxStudents) 
	{
	    this.title = title; 
	    this.durationInHours = durationInHours; 
	    this.maxStudents = maxStudents; 
	}	
	public Course(String title) 
	{
	    this(title, 0, 0); // Calls the first constructor using 'this' to initialize other fields
	  
	}	
	public void showCourseDetails() 
	{
	    System.out.println("Title: " + title);
	    System.out.println("Duration: " + (durationInHours > 0 ? durationInHours + " hours" : "Not specified"));
	    System.out.println("Max Students: " + (maxStudents > 0 ? maxStudents : "Not specified"));
	    System.out.println();
	}	
	public void setTitle(String title) 
	{
	    this.title = title;
	}
	public String getTitle() 
	{
	    return title;
	}
	public void setDurationInHours(int durationInHours)
	{
	    this.durationInHours = durationInHours;
	}
	public int getDurationInHours()
	{
	    return durationInHours;
	}
	public int getMaxStudents() 
	{
	    return maxStudents;
	}
}

public class EduSmartLMS
{
	public static void main(String[] args) 
	{
        System.out.println("Welcome to EduSmart-Learning Management System\n"); 
        Student student1 = new Student("Ram", "Ram@gmail.com", "T2152");
        Student student2 = new Student("Shiva", "Shiva@gmail.com", "T2153");
        
        Instructor instructor1 = new Instructor("Mr.Madhan", "Madhan@gmail.com", "SI0022");
        Instructor instructor2 = new Instructor("Mr.Mohan", "Mohan@gmail.com", "SI0025");
        
        Admin admin1 = new Admin("Admin", "admin@gmail.com", "A1235");
        
        student1.displayWelcome();
        student2.displayWelcome();
        
        instructor1.displayWelcome();
        instructor2.displayWelcome();
        
        admin1.displayWelcome(); 
        
        System.out.println("\n Instructors---");
        
        instructor1.createCourse("Java");  
        instructor1.createCourse("Python");
        instructor1.createCourse("C&C++");
        instructor1.createCourse("Linux");
        
        instructor2.createCourse("SQl"); 
        instructor2.createCourse("Selenium");
        instructor2.createCourse("AI & ML");  
        
        System.out.println("\n--- Students Enrolling in Courses \n---");
        
        student1.enrollCourse("Java"); 
        student1.enrollCourse("Python"); 
        student1.enrollCourse("C & C++"); 
        
        student2.enrollCourse("SQl"); 
        student2.enrollCourse("Selenium"); 

        student1.viewProfile(); 
        student2.viewProfile(); 
        
        instructor1.viewProfile(); 
        instructor2.viewProfile(); 
        admin1.viewProfile(); 
        
        System.out.println("\n--- Student Progress Tracking ---");
        student1.trackProgress(); 
        student2.trackProgress(); 
        
        System.out.println("\n--- Admin Actions ---");
        admin1.removeUser(student1); 
        admin1.removeUser(instructor2); 

        System.out.println("\n--- Course Details ---");
        Course javaCourse1 = new Course("Introduction to Java", 20, 10);
        javaCourse1.showCourseDetails();

        Course webCourse2 = new Course("Web Development Basics"); // Overloaded constructor
        webCourse2.showCourseDetails();

        Course algorithmsCourse = new Course("Advanced Algorithms", 30, 20);
        algorithmsCourse.showCourseDetails();

        Course dbCourse = new Course("Database Management");
        dbCourse.showCourseDetails();
    }
}
