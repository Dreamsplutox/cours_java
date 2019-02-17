package exercice3;

public class Main {
    public static void main(String[] args){
        String[] array = new String[5];
        array[0] = "547";
        array[1] = "102.7";
        array[2] = "120";
        array[3] = "14520";
        array[4] = "42";

        try {
            System.out.println(average(array));
        }catch (Exception e1){
            System.out.println("exception handled in the main : " + e1);
        }

    }

    public static int average(String[] array) throws Exception{
        int i = 0;
        int average = 0;
        for(i = 0; i < array.length; i++){
            try {
                average += Integer.parseInt(array[i]);
            }catch(RuntimeException e1){ //catch a runtime exception to see what can trigger it
                System.out.println("runtime exception : " + e1);
                throw new Exception(e1);
                //System.out.println("runtime exception : " + e1);
            }catch(Exception e2){
                //do nothing
                throw new Exception(e2);
                //System.out.println("no affectation for the element " + i + " invalid data :" + e2);
            }
        }
        return average/array.length;
    }
}
