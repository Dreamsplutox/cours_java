package pack;

public class Employee {
    public String lastname;
    public String firstname;
    public int salary;
    public Service service;

    public Employee(String lastname, String firstname, int salary, Service my_service){
        this.lastname = lastname;
        this.firstname = firstname;
        this.salary = salary;
        this.service = my_service;
        my_service.add_employee(this);
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

    public Service getService() {
        return service;
    }

    public String getServiceName() {
        return service.name;
    }

    public void setService(Service service) {
        if(service.list_of_employees.contains(this)){
            System.out.println("this : "+ this);
            service.list_of_employees.remove(this);

        }
        service.add_employee(this);
        this.service.list_of_employees.remove(this);
        this.service = service;
    }
}
