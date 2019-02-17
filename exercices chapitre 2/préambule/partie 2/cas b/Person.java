import java.lang.reflect.Array;
import java.util.ArrayList;

public class Person {
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Person> getParents() {
        return parents;
    }

    public void setParents(ArrayList<Person> parents) {
        this.parents = parents;
    }

    public ArrayList<Person> parents;

    public Person(String name, ArrayList<Person>parents){
        this.name = name;
        if(parents.size() <= 2) {
            this.parents = parents; //supprimer enregistrements pour limiter à 2 entrées parents max
        }
    }
    public Person(String name){
        this.name = name;
        this.parents = new ArrayList<Person>();
    }

    public void add_parent(Person parent){
        if(this.parents.size() <= 1){
            this.parents.add(parent);
        }else{
            System.out.println("Vous avez déja deux parents ! Vous ne pouvez pas en avoir 3 !");
        }
    }

    public void remove_parent(Person parent){
        if(this.parents.size() > 0 && this.parents.contains(parent)){
            this.parents.remove(parent);
        }else{
            System.out.println("Pas de parent correspondant");
        }
    }
}
