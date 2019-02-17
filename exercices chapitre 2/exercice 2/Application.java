package exercice2;

import java.util.ArrayList;
import java.util.Objects;

public class Application implements Cloneable{
    ArrayList<ArrayList<Mark>> students_marks;

    public Application(){

    }

    public Application( ArrayList<ArrayList<Mark>> students_marks){
        this.students_marks = students_marks;
    }


    public ArrayList<ArrayList<Mark>> getStudents_marks() {
        return students_marks;
    }

    public void setStudents_marks(ArrayList<ArrayList<Mark>> students_marks) {
        this.students_marks = students_marks;
    }

    public void print_all_marks(){
        if(students_marks != null){
            for(ArrayList p:students_marks){
                for(int i = 0; i < p.size(); i++){
                    System.out.println("Eleve n° " + (students_marks.indexOf(p)+1)+" note n° "+(p.indexOf(p.get(i))+1)+" ="+p.get(i).toString());
                }
            }
        }else{
            System.out.println("L'application n'a pas été remplie avec des notes !");
        }
    }

    public float average(int position){
        if(students_marks != null){
            float average = 0;
            int i = 0;
            for(i = 0; i < students_marks.get(position).size(); i++){
                average += students_marks.get(position).get(i).getValue();
            }
            return average/i;

        }else{
            System.out.println("L ' application n'as pas été remplie avec des notes");
            return -1;
        }
    }

    public void add(int position, String subject, float value){
        Mark myMark = new Mark(value, subject);
        students_marks.get(position).add(myMark);
    }

    public int compute(){
        int max = 0;
        for(ArrayList p:students_marks){
            for(int i = 0; i < p.size(); i++){
                if(i > max){
                    max = i;
                }
            }
        }
        return max+1; //because we count the 0
    }

    public float[] avgs(){
        float[] avgs = new float[students_marks.size()];
        float current_avg = 0;
        int count = 0;
        for(ArrayList p:students_marks){
            int i = 0;
            current_avg = 0;
            for(i = 0; i < p.size(); i++){
                current_avg += students_marks.get(students_marks.indexOf(p)).get(i).getValue();
            }
            avgs[count] = current_avg/i;
            count++;
        }
        return avgs;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        ArrayList<ArrayList<Mark>> students_marks = ( ArrayList<ArrayList<Mark>>)super.clone(); //super clone car clone de cette classe
        return students_marks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Application that = (Application) o;
        return Objects.equals(students_marks, that.students_marks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(students_marks);
    }
}
