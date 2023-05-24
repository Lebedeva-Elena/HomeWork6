public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int deposit = 15000;

        int goal = 2459000;
        int month = 0;
        int total = 0;

        while (deposit < goal) {
            goal = goal - deposit;
            month = month + 1;
            total = month * deposit;
            System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int finish = 1;
        while (finish <= 10) {
            System.out.print(" " + finish);
            finish = finish + 1;
        }
        System.out.println();


        for (int i = 10; i > 0; i--) {
            System.out.print(" " + i);
        }
        System.out.println();
    }


    public static void task3() {
        System.out.println("Задача 3");
        int Y = 12_000_000;
        int fertilityThousandPeople = 17;
        int mortalityThousandPeople = 8;
        int X = 0;
        int howYears = 10;


        for (int year = 1; year <= howYears; year++) {
            Y = Y + Y * fertilityThousandPeople / 1000 - Y * mortalityThousandPeople / 1000;
            System.out.println("Год " + year + " численность населения составляет " + Y);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        float deposit = 15000;
        int month = 0;
        float percent = 0.07F;
        float goal = 12_000_000F;

        while (deposit < goal) {
            deposit = deposit + deposit * percent;
            month = month + 1;
            System.out.println("В месяце " + month + " накоплено " + deposit);

        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        double deposit = 15000;
        int goal = 12_000_000;
        int month = 1;
        double percent = 7;
        for (; deposit < goal; month++) {
            deposit = deposit + deposit * 7/100;
            if (month % 6 == 0) {

                System.out.println("Сумма " + deposit + " количество месяцев  " + month);
            }
        }

    }

    public static void task6() {
        System.out.println("Задача 6");
        float deposit = 15000;
        float percent = 0.07F;
        int year = 9;

        for (int month = 1; month <= year * 12; month++) {
            deposit = deposit + deposit * percent;
            if (month % 6 == 0) {

                System.out.println("В месяце " + month + " накоплено " + deposit);
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int friday = 6;
        int daysMonth = 31;

        if (friday >= 1 && friday <= 7) {

            for (; friday <= daysMonth; friday += 7) {
                System.out.println("Сегодня пятница " + friday + "-е число." + " необходимо подготовить отчет");
            }
        } else {
            System.out.println("Ошибочно введена дата первой пятницы");
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int year = 0;
        int currentYear = 2023;

        for (; year < currentYear + 100; year += 79) {
            if (year > currentYear - 200) {
                System.out.println(year);
            }
        }

    }
}

