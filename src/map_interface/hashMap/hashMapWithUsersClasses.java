package map_interface.hashMap;


import java.util.HashMap;
import java.util.Map;



class Employee {
    private Integer id;
    private String name;
    private String city;
    public Employee(Integer id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
public class hashMapWithUsersClasses {
    public static void main(String[] args) {
        Map<Integer, Employee> employeeMap = new HashMap<>();
        employeeMap.put(1001, new Employee(1001, "Rajeev", "Bengaluru"));
        employeeMap.put(1002, new Employee(1002, "David", "New York"));
        employeeMap.put(1003, new Employee(1003, "Jack", "Paris"));
        System.out.println(employeeMap);
    }
}
