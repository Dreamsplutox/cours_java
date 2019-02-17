package pack;

import java.util.ArrayList;

public class Service {
    public String name;
    public ArrayList<Employee> list_of_employees = new ArrayList<Employee>();

    public Service(String name){
        this.name = name;
        this.list_of_employees = new ArrayList<Employee>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getList_of_employees() {
        return list_of_employees.toString();
    }

    public void setList_of_employees(ArrayList<Employee> list_of_employees) {
        this.list_of_employees = list_of_employees;
    }

    public void add_employee(Employee employee){
        this.list_of_employees.add(employee);
    }

    public void delete_employee(Employee employee){
        this.list_of_employees.remove(employee);
    }
}
