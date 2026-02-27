package main.asm7;

public class Main {
    public static void main(String[] args){
        Employee[] employees = {
                new Developer("D01", "An", 10_000_000, 10),
                new Tester("T01", "Binh", 8_000_000, 15),
                new Manager("M01", "Chi", 15_000_000, 5),
                new Developer("D02", "Dung", 9_000_000, 5)
        };

        double totalSalary = 0;
        double totalBonus = 0;

        for (Employee emp : employees) {
            System.out.println("---------------");
            emp.showInfo();

            totalSalary += emp.calculateSalary();

            if (emp instanceof BonusEligible) {
                double bonus = ((BonusEligible) emp).calculateBonus();
                System.out.println("Bonus: " + bonus);
                totalBonus += bonus;
            }
        }

        System.out.println("===============");
        System.out.println("Total salary of company: " + totalSalary);
        System.out.println("Total bonus: " + totalBonus);
    }
}
