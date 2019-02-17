package pack;

public class Employee {
    public String lastname;
    public String firstname;
    public int salary;
    public String service;

    public Employee(String lastname, String firstname, int salary, String service){
        this.lastname = lastname;
        this.firstname = firstname;
        this.salary = salary;
        this.service = service;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }
}
