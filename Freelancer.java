package Homework3;

/**
 * TODO: Реализовать тип фрилансера в рамках домашней работы
 * Фрилансер (работник с почасовой оплатой)
 */
public class Freelancer extends Employee{

    protected double hoursWorked; //отработано часов

    protected double hourlyRate; // ставка за час

    

    public Freelancer(String surName, String name, double salary, int age, ProfessionType profession, double hoursWorked, double hourlyRate) {
        super(surName, name, salary, age, profession);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        // double salary = hoursWorked * hourlyRate;
        return salary;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s %s. ЗП: %.2f руб.. Возраст %s лет (года). %s. Отработал %.2f часов. Ставка %.2f.", idEmployee, surName, name, salary, age, profession, hoursWorked, hourlyRate);
    }
}