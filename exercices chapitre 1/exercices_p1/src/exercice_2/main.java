package exercice_2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;

public class main {
    public static void main (String[] args){
        Instant start = Instant.now();
        System.out.println ("yo");
        try {
            BufferedReader reader = new BufferedReader(new FileReader("hacker.txt"));
            String line = reader.readLine();
            Integer number;
            Integer average = 0;
            String mail = "arnaud@gmail.com";
            int mail_ok = 0;
            int student_mark = 0;
            int i;
            ArrayList <Integer> list = new ArrayList<Integer>();
            while(line != null){
                if(line.indexOf(mail) != -1){
                    //si on trouve le mail, on recupere les deux notes de l'élève
                    mail_ok = 2;
                }
                try {
                    number = Integer.parseInt(line);
                    list.add(number);
                    if(mail_ok > 0){
                        student_mark += number;
                        mail_ok--;
                    }
                    System.out.println("number= "+ number);
                }catch(NumberFormatException e5){
                    //do nothing
                    //System.out.println("pas d'affectation ici");
                }
                System.out.println(line);
                line = reader.readLine();
            }
            if(student_mark != 0){
                System.out.println("student mark = " + student_mark);
            }
            //parcours arraylist + moyenne
            for(i = 0; i < list.size(); i++){
                average += list.get(i);
            }
            average = (average / i);
            System.out.println("average = " + average);


        }catch(FileNotFoundException e1){
            System.out.println("mauvais nom de fichier, fin du programme, " + e1);
            System.exit(0);
        }catch(IOException e2){
            System.out.println("plus de lignes à lire, "+ e2);
        }catch(NumberFormatException e3){
            System.out.println("laisse faire");
        }
        Duration duration = Duration.between(start, Instant.now());
        System.out.println("temps exec prog = " + duration);

    }
}
