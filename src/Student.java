/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author johnr
 */
public class Student {
    
    private String name = "not set yet";
    private int grade = -999;
    private double gpa = -999.0;
    
    //constructors
    public Student(){
        
    }
    
    public Student(String name, int grade){
        this.name = name;
        this.grade = grade;
    }
    
    public Student(String name, int grade, double gpa){
        this.name = name;
        this.grade = grade;
        this.gpa = gpa;
    }
    
    //accessor methods
    public String getName(){
        return name;
    }
    
    public int getGrade(){
        return grade;
    }
    
    public double getGpa(){
        return gpa;
    }
    
    //sets
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setGrade(int grade){
        this.grade = grade;
    }
    
    public void setGpa(double gpa){
        this.gpa = gpa;
    }
    
}
