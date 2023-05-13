package com.mycompany.student_halls;

public class Student {
    //CONSTRUCTORS
    private String id;
    private String name;
    private String surname;
    private String gender;
    private String email;
    
    public Student(String id, String name, String surname,String gender, String email) 
    {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.email = email;
    }

    //ID METHODS
    public void setId(String id) 
    {
        this.id = id;
    }
    
    public String getId() 
    {
        return id;
    }

    //NAME METHODS
    public void setName(String name) 
    {
        this.name = name;
    }
    
    public String getName() 
    {
        return name;
    }

    //SURNAME METHODS
    public void setSurname(String surname) 
    {
        this.surname = surname;
    }
    
    public String getSurname() 
    {
        return surname;
    }

    //GENDER METHODS
    public void setGender(String gender) 
    {
        this.gender = gender;
    }
    
    public String getGender() 
    {
        return gender;
    }

    //EMAIL METHODS
    public void setEmail(String email) 
    {
        this.email = email;
    }   
    
    public String getEmail() 
    {
        return email;
    }


}