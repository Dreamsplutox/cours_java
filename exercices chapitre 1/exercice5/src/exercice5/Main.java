package exercice5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        //init variables
        String[] words =  { "aas", "ace", "alu", "are", "api", "ays", "bec",
                "bel", "bey", "ben", "boy", "deb", "des", "dom",
                "dot", "daw", "fax", "fan", "faq", "fob", "hem",
                "hop", "man", "mao", "mug","mus", "mie", "sur",
                "dey", "mur"
        };
        String current_word = "dey"; //chosen word to launchthe neighbours treatment
        ArrayList<String> neighbours = new ArrayList<String>();
        //launch main treatment with a size of 0 (Arraylist will be filled only if the current word is in String[] words
        find_all_neighbours(current_word, neighbours, 0, words);

        System.out.println("Strings of neighbours array : ");
        for(int j = 0; j < neighbours.size(); j++){
            System.out.println(neighbours.get(j));
        }
    }

    //global function which trigger our treatment
    public static void find_all_neighbours(String current_word, ArrayList<String> neighbours, int size_neighbours, String[] words){
        int current_position = 0;
        //init arraylist only if current_word is present in String[]words
        if(is_present_in_words(current_word, words) == 1){
            neighbours.add(current_word);
            size_neighbours++;
        }else{
            System.out.println("incorrect word, closing the programm ...");
            return;
        }

        //continue the treatment until all neighbours in the arraylist are treated
        while(current_position < size_neighbours){

            for(int i = 0; i < words.length; i++){ //browse words of the String[]
                if(is_neighbour(neighbours.get(current_position), words[i]) == 1){ //if neighbour found
                    if(is_present_in_neighbour(words[i], neighbours) == 0){ //if the neighbour isn't already in the array list
                        //add the word in the array list and increase her size
                        neighbours.add(words[i]);
                        size_neighbours++;
                    }
                }
            }
            //all the neighbours of one word are found, now we want to search the neighbours of the next neighbour in the arraylist
            current_position++;
        }
    }

    //function to check if two words are neighbours
    public static int is_neighbour(String word1, String word2){ //we suppose that word1 length = word2 length
        int count = 0;
        for(int i = 0; i < word1.length(); i++){
            for(int j = 0; j <word1.length(); j++){
                if(word1.charAt(i) == word2.charAt(j)){
                    count++;
                    break;
                }
            }
            if(count == word1.length() - 1){
                break;
            }
        }
        if(count == word1.length() - 1){
            return 1;
        }else{
            return 0;
        }
    }

    //function to check if the word exist in our String array
    public static int is_present_in_words(String current_word, String[] words){

        for(int i = 0; i < words.length; i++){
            if(current_word.equals(words[i])){
                return 1;
            }
        }
        return 0;
    }

    //function to check if the word exist in our ArrayList to prevent duplicates
    public static int is_present_in_neighbour(String words_i, ArrayList<String> neighbours){
        for(int i = 0; i < neighbours.size(); i++){
            if(neighbours.get(i).equals(words_i)){
                return 1;
            }
        }
        return 0;
    }
}
