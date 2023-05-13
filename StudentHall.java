package com.mycompany.student_halls;
import java.util.ArrayList;

//STUDENT HALL CLASS USED TO HOLD THE ARRAYLIST OF STUDENTS
public class StudentHall  
{
    private ArrayList<Student> StudentList;
    public final int MAX;
    public String hallName;
       
    
    /**CONSTRUCTORS USED TO INITIALISE THE EMPTY STUDENTLIST AND SET THE MAX LIST SIZE
     * @param MainHall THE NAME OF HALL
     *  @param   maxIn MAX NUMBER OF STUDENTS IN STUDENTLIST
     */
    public StudentHall(String MainHall, int maxIn)
    {
        StudentList = new ArrayList<>();
        MAX = 5;
        hallName = MainHall;
    }
	
    
    /** ADDING A STUDENT TO THE LIST
     *  @param  resident IS THE STUDENT TO BE ADDED
     *  @return RETURNS TRUE IF STUDENT WAS ADDED AND FALSE IF NOT
     */
    public boolean addStudent(Student resident)
    {
        if(!isMax())
        {
            StudentList.add(resident);
            return true;
        }
        else
        {
            return false;
        }
    }

   /** CHECKS IF LIST IS EMPTY
     *  @return RETURNS TRUE IF LIST IS EMPTY AND FALSE IF NOT
     */
    public boolean isEmpty()
    {
        return StudentList.isEmpty();
    }
	
    /** CHECKS IF LIST IS FULL
     *  @return RETURNS TRUE ID LIST IS FULL AND FALSE IF NOT
     */	
    public boolean isMax()
    {
        return StudentList.size()== MAX;
    }
        
    /** GETS THE TOTAL AMOUNT OF STUDENTS
     *  @return RETURNS TOTAL AMOUNT OF STUDENT IN STUDENTLIST
     */
    public int getTotal()
    {       
        return StudentList.size();
    }

//METHOD USED TO DISPLAY MAIN HALL STUDENT RECORDS 
    public String displayStudents()
    {
      String output = "\n";  
      output += "Current Students in " + hallName + ":"+"\n";
      for (int counter = 0; counter < StudentList.size(); counter++) 
      { 
          output += "\nStudent ID: " + StudentList.get(counter).getId() + "\n";
          output += "Student Name: " + StudentList.get(counter).getName()+ "\t" + StudentList.get(counter).getSurname();
          output += "\nGender: " +StudentList.get(counter).getGender();
          output += "\nEmail: " +StudentList.get(counter).getEmail();
          output += "\nThere is "+StudentList.size()+" Students in Main Hall. Maximum is 5.";
      } 
        return output;
  
    }
}