package Homework3;

/**
 * Рабочий (фулл-тайм)
 */
public class Worker extends Employee {
    public Worker(String surName, String name, double salary, int age, ProfessionType profession) {
        super(surName, name, salary, age, profession);
    }

    // private static Random random = new Random();

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("[%d] %s %s. ЗП: %.2f руб.. Возраст %s лет (года). %s.", idEmployee, surName, name, salary, age, profession);
    }
}
