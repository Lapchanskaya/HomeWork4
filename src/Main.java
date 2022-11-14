public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println(" Задание 1");
        int age = 24;
        if (age >= 18) {
            System.out.println( " Поздравляем Вас с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println( " Возраст совешеннолетия еще не наступил, Вам нужно немного подождать!");}

        //Задание 2
        System.out.println(" Задание 2");
        if (age>= 7 && age < 18){
            System.out.println(" Ребенок ходит в школу");
        }
        if (age >= 18 && age < 24) {
            System.out.println(" Человек ходит в университет");
        }
        if (age >= 24) {
            System.out.println(" Человек ходит на работу");}

        //Задание 3
        System.out.println(" Задание 3");
        int capacity = 102;
        int seatsCount = 60;
        int standCount = capacity - 60;

        int seatsUse = 59;
        int standUse = 41;
        if (seatsUse < seatsCount) {
            System.out.println(" Есть еще " + (seatsCount - seatsUse) + " сидячих мест." );
        }
        if (seatsUse == seatsCount) {
            System.out.println(" Сидячих мест нет!");
        }
        if (standUse < standCount) {
            System.out.println(" Есть еще " + (standCount - standUse ) + " стоячих мест." );
        }
        if (standUse == standCount) {
            System.out.println(" Стоячих мест нет!");
        }



    }
}