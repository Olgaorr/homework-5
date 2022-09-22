public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Задание 1
        System.out.println("Задание 1");
        int age = 17;
        if (age < 18) {
            System.out.println("К сожалению Вам нет 18 лет.");
        }
        // Задание 2
        System.out.println("Задание 2");
        {
            int kid = 8;
            if (kid >= 7) {
                System.out.println("ребенок ходит в школу");
            }
            if (kid < 7) {
                System.out.println("ребенок не ходит в школу");
            }
        }
        // Задание 3
        System.out.println("Задание 3");
        {
            int human = 18;
            if (human >= 18) {
                System.out.println("Пора идти в университет");
            }
            if (human < 18) {
                System.out.println("Надо подождать");
            }
        }
        {
            int human = 24;
            if (human >= 24) {
                System.out.println("Пора идти на работу");
            }
        }
        //Задание 4
        System.out.println("Завдание 4");
        {
            int totalSeats = 102;
            int seat = 60;
            int people = 120;
            if (people >= totalSeats) {
                System.out.println("Вагон занят");
            }
            if (people > seat && people < totalSeats) {
                System.out.println("В вагоне есть только сидячие места");
            }
            if (people < seat) {
                System.out.println("В вагоне есть сидячие места");
            }
        }
        //Задание 5
        System.out.println("Задание 5");
        {
            int people = 17;
            if (people > 18) {
                System.out.println("Поздравляем Вам 18 лет");
            } else {
                System.out.println("Вам не исполнилось 18 лет");
            }
        }
        //Задание 6
        System.out.println("Задание 6");
        {
            int kid = 7;
            if (kid >= 7) {
                System.out.println("ребенок ходит в школу");
            } else {
                System.out.println("ребенок не ходит в школу");
            }
        }
        {
            int aeg = 18;
            if (aeg >= 18) {
                System.out.println("Пора поступать в универ");
            } else {
                System.out.println("еще рано поступать в универ");
            }
        }
        {
            int aeg = 24;
            if (aeg >= 24) {
                System.out.println("Пора искать работу");
            } else {
                System.out.println("Еще рано искать работу");
            }
        }
        //Задание 7
        System.out.println("Задание 7");
        {
            int totalSeats = 102;
            int seat = 60;
            int people = 30;
            if (people < seat) {
                System.out.println("В вагоне есть сидячие места");
            } else if (people > seat && people < totalSeats) {
                System.out.println("В вагоне только сидячие места");
            } else {
                System.out.println("Вагон полностью забит");
            }
        }
        //Задание 8
        System.out.println("Задание 8");
        int kid = 14;
        if (kid < 5) {
            System.out.println("Ребенок не может кататься на аттракционе");
        } else if (kid >= 5 && kid <= 14) {
            System.out.println("Ребенок может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else {
            System.out.println("Ребенок может кататься без сопровождения взрослого.");
        }
        //Задание 9
        System.out.println("Задание 9");
        int one = 1;
        int two = 2;
        int free = 3;
        if (one > two && one > free) {
            System.out.println("Из них"+one+ +two+ +free+"самое большое число =" + one);
        } else if (two > one && two > free) {
            System.out.println("Из них"+one+ +two+ +free+"самое большое число =" + two);
        } else {
            System.out.println("Из чисел" +one+ +two+ +free+ "самое большое число =" + free);
        }
    }




    }
