import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Person> parents = new ArrayList<Person>();
        Person perso1 = new Person("Michel");
        Person perso2 = new Person("Nathalie");
        parents.add(perso1);
        parents.add(perso2);
        Person perso3 = new Person("Kevin", parents);
        System.out.println(perso3.getParents());
        System.out.println(perso3.toString());
    }

}
