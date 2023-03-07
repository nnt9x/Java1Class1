package day4b;

import day4b.tinhkethua.Employee;

public class Sale extends Employee {

    private String commission;
    private String region;

    public Sale(int id, String name) {
        super(id, name);
    }

    public Sale(int id, String name, String address, String department) {
        super(id, name, address, department);
    }

    public Sale(int id, String name, String address, String department, String commission, String region) {
        super(id, name, address, department);
        this.commission = commission;
        this.region = region;
    }

    public String getCommission() {
        return commission;
    }

    public void setCommission(String commission) {
        this.commission = commission;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
