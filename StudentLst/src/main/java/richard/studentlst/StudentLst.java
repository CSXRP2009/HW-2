package richard.studentlst;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */



import richard.studentlst.Student;
import java.util.Scanner;

/**
 *
 * @author CSXRP
 */
public class StudentLst {

     public static void main(String[] args) {
        Student[] studentsArray= new Student[2];
        Scanner inScanner = new Scanner(System.in);
        
        for(int i=0; i< studentsArray.length;i++){
            System.out.print("Enter student's name: ");
            String name = inScanner.nextLine();
            Student student = new Student(name);
            
            studentsArray[i]= student;
            
        }
        System.out.println(printOutput(studentsArray));
    }
    
    public static String printOutput(Student[] studentsArray){
        String str="";
        
        //To Do 03: complete the implementation of this method  
         for(int i=0; i< studentsArray.length;i++){
             str += studentsArray[i].getName()+ " ";
         }
        return str;
    }
}
