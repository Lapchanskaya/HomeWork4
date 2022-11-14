import java.sql.SQLOutput;

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

        // Задание 4
        System.out.println(" Задание 4");
        int yearsOld = 28;
        if (yearsOld >= 18) {
            System.out.println( " Поздравляем Вас с совершеннолетием!");
        } else {
            System.out.println( " Возраст совешеннолетия еще не наступил, Вам нужно немного подождать!");}

        //Задание 5
        System.out.println(" Задание 5");
        if (yearsOld >= 7 && yearsOld< 18){
            System.out.println(" Ребенок ходит в школу");
        }
        else if  (yearsOld >= 18 && yearsOld < 24) {
            System.out.println(" Человек ходит в университет");
        } else if ( yearsOld >= 24)  {
            System.out.println(" Человек ходит на работу");}

        //Задание 6
        System.out.println(" Задание 6");
        int allSeats = 102;
        int seats = 60;
        int stand = allSeats - 60;

        int seatsUse2 = 59;
        int standUse2 = 41;
        if (seatsUse2 < seats) {
            System.out.println(" Есть еще " + (seats - seatsUse2) + " сидячих мест." );
        } else  {
            System.out.println(" Сидячих мест нет!");
        }
        if (standUse2 < stand) {
            System.out.println(" Есть еще " + (stand - standUse2 ) + " стоячих мест." );
        }  else  {
            System.out.println(" Стоячих мест нет!"); }

        //Задание 7
        System.out.println(" Задание 7");

        int ageAPerson = 28;
        if (ageAPerson >= 2 && ageAPerson <= 6){
            System.out.println(" Если возраст человека равен " + ageAPerson + " то ему нужно ходить в детский сад. ");
        }  else if ( ageAPerson >= 7 && ageAPerson <= 18){
            System.out.println(" Если возраст человека равен " + ageAPerson + " то ему нужно ходить в школу. ");
        } else if ( ageAPerson >= 18 && ageAPerson <= 24){
            System.out.println(" Если возраст человека равен " + ageAPerson + " то ему нужно ходить в университет. ");
        } else if ( ageAPerson >= 24 ){
            System.out.println(" Если возраст человека равен " + ageAPerson + " то ему нужно ходить на работу. ");
        }

        //Задание 8
        System.out.println(" Задание 8");

        int ageChild = 14;
        if (ageChild <= 5){
            System.out.println(" Ребенку меньше " + ageChild + " лет,  он не может кататься на аттракционе.");
        } else if (  ageChild < 14 ) {
            System.out.println(" Ребенку  " + ageChild + " лет,  он  может кататься на аттракционе в сопровождении взрослого.");
        } else  {
            System.out.println(" Ребенку  " + ageChild + " лет,  он  может кататься на аттракционе без сопровождения взрослого.");
        }










    }
}