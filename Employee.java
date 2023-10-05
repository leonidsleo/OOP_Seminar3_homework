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

    @Override
    public int compareTo(Employee o) {

        int surNameRes = surName.compareTo(o.surName);
        if (surNameRes == 0){
            return name.compareTo(o.name);
        }
        return surNameRes;
    }

    // //Сортировка по профессии + фамилия.
    // @Override
    // public int compareTo(Employee o) {
    //     int prof = profession.compareTo(o.profession);
    //     if (prof == 0) {
    //         return surName.compareTo(o.surName);
    //     } else {
    //         return profession.compareTo(o.profession);
    //     }
    // }

    // @Override
    // public String toString() {
    //     return String.format("[%d] %s %s. ЗП: %.2f руб. Возраст %s лет (года). %s.", idEmployee, surName, name, salary, age, profession);
    // }
}