public class Main {
    public static void main(String[] args) {

        System.out.println("Урок 11. Строки. Задача 1");
        String firstName = "Ivan ";
        String middleName = "Ivanovich";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println("Урок 11. Строки. Задача 2");
        String s = fullName;
        String s1 = s.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + s1);
        System.out.println("Урок 11. Строки. Задача 3");
        String fullName2 = "Иванов Семён Семёнович";
        String oldString = fullName2;
        String newString =  oldString.replace('ё', 'е');

        System.out.println(oldString);
        System.out.println(newString);

    }
}