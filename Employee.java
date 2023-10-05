package Homework3;

/**
 * Работник (базовый класс)
 */
public abstract class Employee implements Comparable<Employee> {

    protected String name;

    protected String surName;

    protected double salary; // ЗП

    protected int age; //возраст

    protected ProfessionType profession;



    /**
     * Расчет среднемесячной заработной платы сотрудника
     * @return
     */
    public abstract double calculateSalary();

    public Employee(String surName, String name, double salary, int age, ProfessionType profession) {
        this.name = name;
        this.surName = surName;
        this.salary = salary;
        this.age = age;
        this.profession = profession;
    }

    @Override
    public int compareTo(Employee o) {

        int surNameRes = surName.compareTo(o.surName);
        if (surNameRes == 0){
            return name.compareTo(o.name);
        }
        return surNameRes;
    }

    // @Override
    // public String toString() {
    //     return String.format("%s %s; %s; Возраст %s; Заработная плата: %s.", surName, name, profession, calculateSalary());
    // }
}