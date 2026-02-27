package main.asm7;

public abstract class Employee {
    public String id;
    public String name;
    public double baseSalary;

    public Employee(String id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Tính lương thực nhận
    public abstract double calculateSalary();

    // Trả về chức danh
    public abstract String getPosition();

    // Hiển thị thông tin
    public void showInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Position: " + getPosition());
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Total Salary: " + calculateSalary());
    }
}
