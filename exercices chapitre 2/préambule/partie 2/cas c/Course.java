package pack;

import java.util.ArrayList;

public class Course {
    public String name;
    public ArrayList<Student> list_of_student;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getList_of_student() {
        return list_of_student;
    }

    public void setList_of_student(ArrayList<Student> list_of_student) {
        this.list_of_student = list_of_student;
    }
}
