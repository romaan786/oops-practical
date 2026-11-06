class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    double add(double a, double b) {
        return a + b;
    }
}
class Employee {
    double calculatePay() {
        return 0;
    }
}
class FullTimeEmployee extends Employee {
    double calculatePay() {
        double basic = 30000;
        double bonus = 5000;
        return basic + bonus;
    }
}
class PartTimeEmployee extends Employee {
    double calculatePay() {
        int hours = 100;
        double ratePerHour = 150;
        return hours * ratePerHour;
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println(" METHOD OVERLOADING");
        Calculator calc = new Calculator();
        System.out.println("add(10, 20)= " + calc.add(10, 20));
        System.out.println("add(10, 20, 30) = " + calc.add(10, 20, 30));
        System.out.println("add(2.5, 3.5)= " + calc.add(2.5, 3.5));

        // Overriding
        System.out.println("\nMETHOD OVERRIDING");
        Employee e1 = new FullTimeEmployee();
        Employee e2 = new PartTimeEmployee(); 
        System.out.println("Full Time Pay : " + e1.calculatePay());
        System.out.println("Part Time Pay : " + e2.calculatePay());
    }
}