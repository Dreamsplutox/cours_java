package exercice1;
import java.util.Random;

public class De {
    public int faces;
    public int resultat;

    public De(int faces){
        if(faces > 0){
            this.faces = faces;
            this.resultat = 0;
        }else{
            System.out.println("Un dé doit avoir au moins 1 face");
            System.exit(1);
        }
    }

    public int roll(){
        Random rand = new Random();
        return resultat = rand.nextInt(faces) + 1;
    }

    public int getResultat() {
        if(this.resultat != 0){
            return resultat;
        }else{
            System.out.println("Pas de précédent résultat");
            return -1;
        }
    }

    public void multipleRolls(int numberRolls){
        if(numberRolls > 0){
            for(int i = 0; i < numberRolls; i++){
                System.out.println("lancé n°" + (i + 1) + " : " + this.roll());
            }
        }else{
            System.out.println("nombre de lancers invalides");
        }
    }

    public void gameWith2Dice(De de_1, De de_2, int numberRolls){
        int resultat_de_1 = 0;
        int resultat_de_2 = 0;
        if(numberRolls > 0){
            System.out.println("Debut de la partie :");
            for(int i = 0; i < numberRolls; i++){
                resultat_de_1 += de_1.roll();
                resultat_de_2 += de_2.roll();
                System.out.println("résultat tour n° " + (i+1) + " resultat de_1 = " + resultat_de_1 + " resultat de_2 = " + resultat_de_2);
            }

            if(resultat_de_1 == resultat_de_2){
                System.out.println("Vous avez obtenu le même score avec les deux dés ! Victoire !");
            }else{
                System.out.println("Résultat différent avec vos deux dés, vous avez perdu !");
            }
        }else{
            System.out.println("nombre de lancers invalide");
        }
    }
}
