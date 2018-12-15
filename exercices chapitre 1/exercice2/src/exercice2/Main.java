package exercice2;

import java.io.FileReader;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.io.BufferedReader;

public class Main {
    public static void main (String[] args){
        Instant start = Instant.now();
        try {
            BufferedReader reader_1 = openFile("students_marks.txt");
            ArrayList <Integer> list = new ArrayList<Integer>();
            setMarks(list, reader_1);
            double average_1 = average(list);
            reader_1.close();
            reader_1 = openFile("students_marks.txt");
            setMarkOfStudent(reader_1,"arnaud@gmail.com");
            reader_1.close();
        }catch(Exception e6){
            System.out.println("exception handled in the main" + e6);
            System.exit(-1);
        }

        Duration duration = Duration.between(start, Instant.now());
        System.out.println("time to exec prog = " + duration);
    }

    public static BufferedReader openFile(String filename) throws Exception{
        BufferedReader reader = new BufferedReader(new FileReader("students_marks.txt"));
        return reader;
    }

    public static double average(ArrayList <Integer> list){
        double average_1 = 0;
        int i;
        for(i = 0; i < list.size(); i++) {
            average_1 += list.get(i);
        }
        average_1 = average_1 / i;
        System.out.println("average : " + average_1);
        return average_1;
    }

    public static void setMarks(ArrayList <Integer> list, BufferedReader reader){
        try{
            String line = reader.readLine();
            while(line != null){
                try{
                    list.add(Integer.parseInt(line.substring(line.indexOf(":") + 1)));
                }catch(NumberFormatException e5){
                    //do nothing
                    System.out.println("no assignment here because the format is invalid for the processed data");
                }
                System.out.println(line);
                line = reader.readLine();
            }
        }catch(Exception e3){
            System.out.println(e3);
            System.exit(-1);
        }
    }

    public static void setMarkOfStudent(BufferedReader reader, String mail){
        try{
            String line = reader.readLine();
            while(line != null){
                if(line.contains(mail)){
                    //get marks of the student
                    System.out.println("mail found, student mark : " + Integer.parseInt(line.substring(line.indexOf(":") + 1)));
                }else{
                    //System.out.println("name not found");
                }
                line = reader.readLine();
            }

        }catch(Exception e4){
            System.out.println(e4);
            System.exit(-1);
        }
    }
}
