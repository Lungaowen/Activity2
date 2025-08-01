/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aop.programming.backend;

import aop.programming.myform.Student;
import java.util.ArrayList;

/**
 *
 * @author lunga
 */
public interface methods {
    
    public abstract void addStudent(Student student);

    public abstract void removeStudent(Student student,String ID_NUMBER);

    public abstract Student searchStudentbyName(String name);

    public abstract String listStudents();
    
}
