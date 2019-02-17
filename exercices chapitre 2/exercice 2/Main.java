package exercice2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        //create array of marks for students here
        ArrayList<ArrayList<Mark>> students_marks = new ArrayList();
        ArrayList<Mark> one_student_marks = new ArrayList<Mark>(Arrays.asList(new Mark(15, "Maths"),
                new Mark(15, "Java"), new Mark(15, "Javascript"), new Mark(11, "Algorithmique")));

        students_marks.add(one_student_marks);

        one_student_marks = new ArrayList<Mark>(Arrays.asList(new Mark(16, "Maths"),
                new Mark(10, "Java")));

        students_marks.add(one_student_marks);

        one_student_marks = new ArrayList<Mark>(Arrays.asList(new Mark(10, "Langage C"),
                new Mark(8, "Javascript")));

        students_marks.add(one_student_marks);

        Application myAppli = new Application(students_marks);
        myAppli.print_all_marks();

        System.out.println("moyenne etudiant 2 = " + myAppli.average(1));

        myAppli.add(0, "Langage C", 12);
        myAppli.print_all_marks();

        System.out.println("nombre max de matières : " + myAppli.compute());

        float[] all_avgs = myAppli.avgs();

        for(int i = 0; i < all_avgs.length; i++){
            System.out.println("moy n° " + (i+1) + " = " + all_avgs[i]);
        }


        /*
        for(ArrayList p:students_marks){
            for(int i = 0; i < p.size(); i++){
                System.out.println("[" + students_marks.indexOf(p)+"]"+"["+p.indexOf(p.get(i))+"] ="+p.get(i).toString());
            }
        }
        */
        //then pass it to create the Application and use her methods
    }
}
