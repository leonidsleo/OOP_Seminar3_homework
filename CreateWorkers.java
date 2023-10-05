package Homework3;

import java.util.Random;

public class CreateWorkers {

    private static Random random = new Random();

    //Создаем работников основных специальностей
    static Worker generateWorker(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surNames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколовкий" };
        int age = random.nextInt(20, 65);
        ProfessionType[] profession = new ProfessionType[] {ProfessionType.Сварщик, ProfessionType.Слесарь, ProfessionType.Стропальщик, ProfessionType.Фрезеровщик, ProfessionType.Токарь};
        Double salary = random.nextDouble(50000, 120000);
        Worker worker = new Worker(surNames[random.nextInt(surNames.length)], names[random.nextInt(names.length)], salary, age, profession[random.nextInt(profession.length)]);
        return worker;
    }
    //Создаем работников фрилансеров
    static Freelancer generateFreelancer(){
        String[] names = new String[] { "Анатолий", "Глеб", "Богдан", "Аркадий", "Вадим", "Дамир", "Горимир", "Капитон", "Кирилл", "Герман" };
        String[] surNames = new String[] { "Агеев", "Алешин", "Блинов", "Хохлов", "Богданов", "Блохин", "Копытов", "Виноградов", "Белкин", "Соколов" };
        int age = random.nextInt(18, 80);
        ProfessionType[] profession = new ProfessionType[] {ProfessionType.Фрилансер_Backend_разработчик, ProfessionType.Фрилансер_C_разработчик, ProfessionType.Фрилансер_Frontend_разработчик, ProfessionType.Фрилансер_Fullstack_разработчик, ProfessionType.Фрилансер_Pyhton_разработчик, ProfessionType.Фрилансер_Java_разработчик};
        Double hoursWorked = random.nextDouble(1, 300);
        Double hourlyRate = random.nextDouble(2500, 3500);
        Double salary = hoursWorked * hourlyRate;
        Freelancer freelancer = new Freelancer(surNames[random.nextInt(surNames.length)], names[random.nextInt(names.length)], salary, age, profession[random.nextInt(profession.length)], hoursWorked, hourlyRate);
        return freelancer;
    } 
    
    
    //метод создания работников предприятия рандомно
    //без указания сколько каких специальностей создать.
    static Employee[] generateEmployees(int count){
        Employee[] arrayEmployee = new Employee[count];
        // СОЗДАНИЕ РАБОТНИКОВ С УКАЗАНИЕМ КОЛИЧЕСТВА СПЕЦИАЛИСТОВ
        int k = 0; // счетчик специалистов
        for (int j = 0; j < arrayEmployee.length; j++) {
            //условие для создания специалистов по количеству            
            if (k < 2) {
                arrayEmployee[j] = generateFreelancer();
                k++;
            } else {
                arrayEmployee[j] = generateWorker();
            }
        }
        // СОЗДАНИЕ РАБОТНИКОВ ПРИМЕРНО ровными количествами, проверка if для нечетных количеств
        // for (int j = 0; j < arrayEmployee.length; j++) {
        //     arrayEmployee[j] = generateWorker();
        //     j++;
        //     if (j < arrayEmployee.length) {
        //         arrayEmployee[j] = generateFreelancer();
        //     }
        // }
        return arrayEmployee;
        }
}
