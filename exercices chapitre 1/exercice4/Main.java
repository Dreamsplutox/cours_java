package exercice4;

public class Main {
    public static void main(String[] args) {
        //static variables for the intellij file
        String alphabet = "abcdef";
        String maybe_in_alpha = "addccc";
        String str1 = "abac";
        String str2 = "acab";

        int is_an_alphabet = correct_alphabet(alphabet); //check if the aplhabet is ok
        int is_an_anagram;

        if(is_an_alphabet == -1){
            System.out.println("The current alphabet is invalid, it shouldn't contain duplicates");
            System.exit(-1);
        }

        int presence_in_alphabet = is_in_alphabet(alphabet, maybe_in_alpha);

        if(presence_in_alphabet == -1){
            System.out.println("The tested string : ("+ maybe_in_alpha +") is not compatible with the current alphabet");
            System.exit(-1);
        }

        presence_in_alphabet = is_in_alphabet(alphabet, str1);
        if(presence_in_alphabet == -1){
            System.out.println("The tested string : ("+ str1 +") is not compatible with the current alphabet");
            System.exit(-1);
        }

        presence_in_alphabet = is_in_alphabet(alphabet, str2);
        if(presence_in_alphabet == -1){
            System.out.println("The tested string : (" + str2 +") is not compatible with the current alphabet");
            System.exit(-1);
        }else{
            //System.out.println("new str = " + to_delete_1);
        }

        System.out.println("Test if the strings str1 and str2 are anagrams");
        is_an_anagram = is_anagram(str1, str2);
        if(is_an_anagram == 1){
            System.out.println("It's an anagram");
        }else{
            System.out.println("It's not an anagram");
        }

        //remove the string str2 in str1
        System.out.println("Remove the string str2 in str1");
        str1 = delete(str1, str2);
        System.out.println("new str1 : " + str1);

        System.out.println("rotate, select 0 to rotate left, another number to rotate right");
        maybe_in_alpha = rotate(1, 4, maybe_in_alpha);




    }

    public static String rotate(int direction, int position, String chain){
        if(position <= chain.length() && position >= 0 && position <= chain.length()){
            if(direction == 0) {
                //String intermediate_string;
                //intermediate_string = chain.substring(position);
                chain = chain.substring(position) + chain.substring(0, position);
                System.out.println("chain after rotate = " + chain);
                return chain;
            }else{
                chain = chain.substring(chain.length()-position) + chain.substring(0, chain.length()-position);
                System.out.println("chain after rotate = " + chain);
                return chain;
            }

        }else{
            System.out.println("error, the position should be lower than the size of the string and upper or equal to 0");
            return "error, the position should be lower than the size of the string and upper or equal to 0";
        }
        //return "";

    }

    public static int correct_alphabet(String alphabet){

        for(int i = 0; i < alphabet.length(); i++){
            for(int j = i+1; j < alphabet.length(); j++){
                if(alphabet.charAt(i) == alphabet.charAt(j)){
                    //if dupplicates, the alphabet is not good -> return -1
                    return -1;
                }
            }
        }

        return 1;
    }

    public static int is_in_alphabet(String alphabet, String maybe_in_alpha){
        int verify = 0; //int who should be equal to the length of the "maybe_in_alpha" string
        //use toLowerCase to not take in consideration the uppercases
        String alphabet_lower = alphabet.toLowerCase();
        String maybe_in_alpha_lower = maybe_in_alpha.toLowerCase();

        for(int i = 0; i < maybe_in_alpha.length(); i++){
            for(int j = 0; j < alphabet.length(); j++){
                if(maybe_in_alpha_lower.charAt(i) == alphabet_lower.charAt(j)){
                    verify++;
                }

            }
        }
        if(verify == maybe_in_alpha.length()){
            return 1; //the string is in the alphabet
        }else{
            return -1; //the string isn't in the alphabet
        }
    }

    public static int is_anagram(String str1, String str2){
        int char_is_in_str = 0;
        if(str1.length() != str2.length()){
            System.out.println("not an anagram : if a string is an angram, it should have the same length as the other string");
            return -1;
        }
        for(int i = 0; i < str1.length(); i++){
            char_is_in_str = 0;
            for(int j = 0; j < str2.length(); j++){
                if(str1.charAt(i) == str2.charAt(j)){
                    char_is_in_str = 1;
                }
            }
            if(char_is_in_str != 1){
                return -1;
            }
        }
        return 1;
    }

    public static String delete(String str1, String str2){
        if(str1.contains(str2)){
            return str1.replace(str2, "");
        }else{
            System.out.println("can't delete cause str1 doesn't contains str2: ");
            return str1;
        }

    }

}
