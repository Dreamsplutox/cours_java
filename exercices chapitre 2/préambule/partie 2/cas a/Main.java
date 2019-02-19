package pack;

public class Main {
    public static void main(String[] args){
        Service compta = new Service("compta");
        Service rh = new Service("rh");
        Employee emp1 = new Employee("Simon", "lelouch", 1200, compta);
        //System.out.println(emp1.getLastname());
        Employee emp2 = new Employee("Nezo", "Renaud", 1400, compta);
        Employee emp3 = new Employee("Balas", "Jeanne", 1400, rh);

        System.out.println("[Service Compta avant changement]");
        compta.getList_of_employees();
        System.out.println("[Service RH avant changement]");
        rh.getList_of_employees();

        emp1.setService(rh);
        System.out.println("[Service Compta après changement]");
        compta.getList_of_employees();
        System.out.println("[Service RH après changement]");
        rh.getList_of_employees();

    }
}
