//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        System.out.println("Домашнее задание 4");
        System.out.println("Задача 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age +
                    ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        System.out.println("Задача 2");
        int temp = 11;
        if (temp > 5) {
            System.out.println("На улице " + temp + " градусов, тепло, можно идти без шапки");
        } else {
            System.out.println("На улице " + temp + " градусов, холодно, нужно надеть шапку");
        }

        System.out.println("Задача 3");
        int carSpeed = 65;
        if (carSpeed <= 60) {
            System.out.println("Если скорость " + carSpeed + " км/ч, то можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + carSpeed + " км/ч, то придется заплатить штраф");
        }

        System.out.println("Задача 4");
        int agePeople = 35;
        if (agePeople >= 2 && agePeople <= 6) {
            System.out.println("Если возраст человека равен " + agePeople + ", то ему нужно ходить детский сад");
        }
        if (agePeople >= 7 && agePeople <= 17) {
            System.out.println("Если возраст человека равен " + agePeople + ", то ему нужно ходить в школу");
        }
        if (agePeople >= 18 && agePeople <= 24) {
            System.out.println("Если возраст человека равен " + agePeople + ", то ему нужно ходить в университет");
        }
        if (agePeople > 24) {
            System.out.println("Если возраст человека равен " + agePeople + ", то ему нужно ходить на работу");
        }

        System.out.println("Задача 5");
        int ageChild = 6;
        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + " лет, то ему нельзя кататься на атракционе");
        }
        if (ageChild >= 5 && ageChild <= 14) {
            System.out.println("Если возраст ребенка равен " + ageChild +
                    " лет, то ему можно кататься на атракционе в сопровождении взрослого");
        }
        if (ageChild > 14) {
            System.out.println("Если возраст ребенка равен " + ageChild +
                    " лет, то ему можно кататься на атракционе без сопровождения взрослого");
        }

        System.out.println("Задача 6");
        int peopleInTheCarriage = 35;
        if (peopleInTheCarriage < 60) {
            System.out.println("В вагоне есть сидячие места");
        }
        else if (peopleInTheCarriage >= 60 && peopleInTheCarriage <= 102) {
            System.out.println("В вагоне есть стоячие места");
        } else {
            System.out.println("В вагоне уже полностью забит");
        }

        System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println(one + " самое большое число");
        }
        else if (two > one && two > three) {
            System.out.println(two + " самое большое число");
        } else {
            System.out.println(three + " самое большое число");
        }
    }
}