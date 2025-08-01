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
public class studentService implements methods {
    
    private Student student;
    private ArrayList<Student> students;

    public studentService() {
        this.student = new Student();
        this.students = new ArrayList<>();
    }
    
    @Override
    public void addStudent(Student student) {
        this.students.add(student);
    }

    @Override
    public void removeStudent(Student student,String ID_Number) {
        for (int i = 0; i < students.size(); i++) {
            Student get = students.get(i);
            if(get.getIdNumber().equalsIgnoreCase(ID_Number)){
                        this.students.remove(student);
            }
            
        }

    }

    @Override
    public Student searchStudentbyName(String name) {
        for (Student student1 : students) {
            if(student1.getName().equalsIgnoreCase(name)){
                return student1;
            }
            
        }
        return null;
    }

    @Override
    public String listStudents() {
        String list="";
        for (Student student1 : students) {
            list += student1.toString()+"\n";
            
        }
        return list;
        
    }
    public static void main(String[] args) {
        String[] studentData = {
            "Lunga#Smith#20#ID1234#Male",
            "Nina#Khumalo#21#ID2345#Female",
            "John#Mokoena#22#ID3456#Male",
            "Dineo#Ngwenya#19#ID4567#Female",
            "Peter#Brown#23#ID5678#Male",
            "Zara#Lee#18#ID6789#Female",
            "Sam#Govender#24#ID7890#Male",
            "Maya#Dube#20#ID8901#Female",
            "Alex#Naidoo#21#ID9012#Male",
            "Lebo#Botha#22#ID0123#Female",
            "Thabo#Khumalo#23#ID1111#Male",
            "Ayanda#Ngcobo#19#ID2222#Female",
            "Sipho#Zwane#24#ID3333#Male",
            "Thuli#Nkosi#20#ID4444#Female",
            "Kabelo#Masilela#21#ID5555#Male",
            "Bongi#Mthembu#22#ID6666#Female",
            "Jabu#Ndlovu#23#ID7777#Male",
            "Nosipho#Mahlangu#18#ID8888#Female",
            "Mpho#Ramaphosa#24#ID9999#Male",
            "Precious#Mabena#20#ID0000#Female",
            "Andile#Zuma#21#ID1010#Male",
            "Boitumelo#Molefe#19#ID2020#Female",
            "Kgosi#Molekoa#22#ID3030#Male",
            "Naledi#Motsoeneng#23#ID4040#Female",
            "Sibusiso#Cele#20#ID5050#Male",
            "Zinhle#Mbatha#18#ID6060#Female",
            "Tshepo#Nkuna#21#ID7070#Male",
            "Mbali#Khoza#22#ID8080#Female",
            "Neo#Pule#19#ID9090#Male",
            "Lesedi#Mokoena#20#ID1122#Female"
        };
        studentService service = new studentService();
        Student s = new Student();
        ArrayList<Student> ses = new ArrayList<>();
        
        for (int i = 0; i < studentData.length; i++) {
            String stud[] = studentData[i].split("#");
            
            String name = stud[0];
            String surname = stud[1];
            int age = Integer.parseInt(stud[2]);
            String IDnumber = stud[3];
            String gendr = stud[4];
            
            s.setName(name);
            s.setSurname(surname);
            s.setIdNumber(IDnumber);
            s.setAge(age);
            s.setGender(gendr);
            
            ses.add(s);
        }
        System.out.print(ses.get(1));

        
    }
    
}
