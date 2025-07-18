package Assignment5;

public class Employee {
    private int id;
    private String name;
    private String city;

    public Employee(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", City: " + city;
    }

    // Getters if needed
    public int getId() { return id; }
    public String getName() { return name; }
    public String getCity() { return city; }
    
}

