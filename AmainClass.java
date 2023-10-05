package Homework3;

import java.util.Random;

public class AmainClass {

    
    public static void main(String[] args) {

        Employee[] employees = CreateWorkers.generateEmployees(9);
        for (Employee employee: employees) {
            System.out.println(employee);
        
    }
}
}