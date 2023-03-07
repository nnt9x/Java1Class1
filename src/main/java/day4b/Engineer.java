package day4b;

import day4b.tinhkethua.Employee;

public class Engineer extends Employee {

    private String products;
    private String team;

    public Engineer(int id, String name) {
        super(id, name);
    }

    public Engineer(int id, String name, String address, String department) {
        super(id, name, address, department);
    }

    public Engineer(int id, String name, String address, String department, String products, String team) {
        super(id, name, address, department);
        this.products = products;
        this.team = team;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }


}
