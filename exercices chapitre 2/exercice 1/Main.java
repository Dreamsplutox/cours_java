package exercice1;

public class Main {
    public static void main(String[] args){
        De de_1 = new De(6);
        De de_2 = new De(8);
        de_1.roll();
        System.out.println("Le résultat du dé 1 est " + de_1.getResultat());

        System.out.println("Multiples lancers pour de_1 :");
        de_1.multipleRolls(10);

        de_1.gameWith2Dice(de_1, de_2, 2);

    }
}
