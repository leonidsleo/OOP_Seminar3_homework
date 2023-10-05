package Homework3;

import java.util.Arrays;

public class AmainClass {

    
    public static void main(String[] args) {

        Employee[] employees = CreateWorkers.generateEmployees(5);

        System.out.println();

        System.out.println("Работники отсортированные по методу указанному в базовом классе работников:");
        Arrays.sort(employees);
        for (Employee employee: employees) {
            System.out.println(employee);
        }
        System.out.println();

        System.out.println("Работники отсортированные по ЗП, по возрастанию:");
        Arrays.sort(employees, new ComparatorSalary(SortType.Ascending));
        for (Employee employee: employees) {
            System.out.println(employee);
        }
        System.out.println();
                
        System.out.println("Работники отсортированные по ЗП, по убыванию:");
        Arrays.sort(employees, new ComparatorSalary(SortType.Descending));    
        for (Employee employee: employees) {
            System.out.println(employee);
        }
        System.out.println();

        System.out.println("Работники отсортированные по возрасту, по убыванию:");
        Arrays.sort(employees, new ComparatorAge(SortType.Descending));
        for (Employee employee: employees) {
            System.out.println(employee);
        }
        System.out.println();

        System.out.println("Работники отсортированные по возрасту, по возрастанию:");
        Arrays.sort(employees, new ComparatorAge(SortType.Ascending)); 
        for (Employee employee: employees) {
            System.out.println(employee);
        }
        System.out.println();

    }
}