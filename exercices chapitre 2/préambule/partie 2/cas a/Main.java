package pack;

public class Main {
    public static void main(String[] args){
        Service compta = new Service("compta");
        Employee emp1 = new Employee("Simon", "lelouch", 1200, "compta");
        System.out.println(emp1.getLastname());
        compta.add_employee(emp1);
        Employee emp2 = new Employee("Nezo", "reno", 1400, "compta");
        compta.add_employee(emp2);
        System.out.println(compta.getList_of_employees());
    }
}
