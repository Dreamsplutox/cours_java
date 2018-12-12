package exercice_3;

public class main {
    public static void main(String[] args){
        String[] array = new String[5];
        array[0] = "547";
        array[1] = "102.7";
        array[2] = "120";
        array[3] = "14520";
        array[4] = "42";
        //array[0] = "";

        try {
            int alla = average(array);
            System.out.println(alla);
        }catch (Exception e1){
            System.out.println("exception gérée dans le main : " + e1);
        }

    }

    public static int average(String[] array) throws Exception{
        int i = 0;
        int average = 0;
        for(i = 0; i < array.length; i++){
            try {
                average += Integer.parseInt(array[i]);
            }catch(RuntimeException e1){
                throw new Exception(e1);
                //System.out.println("runtime exception : " + e1);
            }catch(Exception e2){
                //do nothing
                throw new Exception(e2);
                //System.out.println("pas d'affectation pour l'élément " + i + " donnee invalide :" + e2);
            }
        }
        return average/array.length;
    }

}
