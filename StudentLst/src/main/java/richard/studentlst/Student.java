package richard.studentlst;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CSXRP
 */
public class Student {
    private String name;

    //To Do 01: add a constructor to this class 
    public Student(String name){
        this.name = name;
    }
    // To Do 02: Add setters and getters
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    } 
}
