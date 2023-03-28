package collection.list;

import model.Students;

import java.util.ArrayList;

public class StudentsArrayList {

    public ArrayList<Students> createStudentArrayList()

    {

        ArrayList<Students> studentsArrayList = new ArrayList<>();
        Students student1 = new Students("Rohit", 23, "IT");
        Students student2 = new Students("Neha", 18, "CS");
        Students student3 = new Students("Bhawna", 16, "Pilot");

        studentsArrayList.add(student1);
        studentsArrayList.add(student2);
        studentsArrayList.add(student3);
        return studentsArrayList;
    }

    public static void main(String[] args) {
        StudentsArrayList obj = new StudentsArrayList();
        ArrayList<Students> students = obj.createStudentArrayList();
        for (Students var : students) {
            System.out.println("name: " + var.getName() + " ,Age: " + var.getAge() + " ,Sectiion: " + var.getSection());
        }


    }




}

