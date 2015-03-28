/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Huige1
 */
public class CscCourse extends Course{
public CscCourse(String name, String instName, String id, String desc){
super(name, instName, id, desc);
}
public void displayMessage(){
System.out.println("This course is offered by the Computer Science Department.");
System.out.println("Course name is " + courseName);
System.out.println("Course ID is " + courseId );
System.out.println("Course Instructor is " + instructor );
System.out.println("Course Description : " + description );
System.out.println("--------------------------------------");
}
}