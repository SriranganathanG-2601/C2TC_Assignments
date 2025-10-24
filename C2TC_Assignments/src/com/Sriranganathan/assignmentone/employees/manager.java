package com.Sriranganathan.assignmentone.employees;

public class manager extends employee {
    private String department;
    private double bonus;

    public manager(String name, int employeeId, double salary, String department, double bonus) {
        super(name, employeeId, salary);
        this.department = department;
        this.bonus = bonus;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department + ", Bonus: " + bonus);
    }
}

