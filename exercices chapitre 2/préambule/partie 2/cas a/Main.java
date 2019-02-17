package pack;

public class Main {
    public static void main(String[] args){
        Service compta = new Service("compta");
        Employee emp1 = new Employee("Simon", "lelouch", 1200, compta);
        System.out.println(emp1.getLastname());
        Employee emp2 = new Employee("Nezo", "reno", 1400, compta);
        compta.getList_of_employees();
    }
}
