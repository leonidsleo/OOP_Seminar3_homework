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

    protected int idEmployee;

    private static int idCounter;

    public int getIdEmployee() {
        return idEmployee;
    }

   {
        idEmployee = ++idCounter;
        // System.out.printf("Initializer %s\n", idEmployee);
    }

    static {
        idCounter = 1000;
        // System.out.printf("Static Initializer %s\n", idCounter);

    }



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

    // @Override
    // public String toString() {
    //     return String.format("[%d] %s %s. ЗП: %.2f руб. Возраст %s лет (года). %s.", idEmployee, surName, name, salary, age, profession);
    // }
}