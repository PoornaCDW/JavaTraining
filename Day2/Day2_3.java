import java.util.Date;

abstract class Employee {
    String name;
    Date dateOfJoining;
    double salary;

    public Employee(String name, Date dateOfJoining, double salary) {
        this.name = name;
        this.dateOfJoining = dateOfJoining;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    public abstract double calculateSalary();

}

class SalesPerson extends Employee {

    double commission;

    public SalesPerson(String name, Date dateOfJoining, double salary, double commission) {
        super(name, dateOfJoining, salary);
        this.commission = commission;
    }

    public double getCommission() {
        return commission;
    }

    @Override
    public double calculateSalary() {
        return getSalary() + commission;
    }
}

class Worker extends Employee {

    int hoursWorked;
    double ratePerHour;

    public Worker(String name, Date dateOfJoining, double salary, int hoursWorked, double ratePerHour) {
        super(name, dateOfJoining, salary);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    @Override
    public double calculateSalary() {
        return getSalary() + (hoursWorked * ratePerHour);
    }
}

class SalesManager extends SalesPerson {

    double bonus;

    public SalesManager(String name, Date dateOfJoining, double salary, double commission, double bonus) {
        super(name, dateOfJoining, salary, commission);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + bonus;
    }
}

class SalesTerritoryManager extends SalesManager {

    double travelAllowance;

    public SalesTerritoryManager(String name, Date dateOfJoining, double salary, double commission, double bonus, double travelAllowance) {
        super(name, dateOfJoining, salary, commission, bonus);
        this.travelAllowance = travelAllowance;
    }

    public double getTravelAllowance() {
        return travelAllowance;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + travelAllowance;
    }
}

public class Day2_3 {
    public static void main(String[] args) {
        Date dateOfJoining = new Date();

        SalesPerson salesPerson = new SalesPerson("John", dateOfJoining, 5000, 2000);
        System.out.println("Salesperson Salary: " + salesPerson.calculateSalary());

        Worker worker = new Worker("Mary", dateOfJoining, 4000, 80, 50);
        System.out.println("Worker Salary: " + worker.calculateSalary());

        SalesManager salesManager = new SalesManager("Tom", dateOfJoining, 6000, 3000, 1000);
        System.out.println("Sales Manager Salary: " + salesManager.calculateSalary());

        SalesTerritoryManager salesTerritoryManager = new SalesTerritoryManager("Jane", dateOfJoining, 8000, 4000, 2000, 500);
        System.out.println("Sales Territory Manager Salary: " + salesTerritoryManager.calculateSalary());
    }
}