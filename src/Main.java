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
        int i = 0;
        int total = 0;

        while (deposit < goal) {
            goal = goal - deposit;
            i = i + 1;
            total = i * deposit;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
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
        int birthRatePerPopulation = (Y / 1000) * fertilityThousandPeople;
        int mortalityThousandPeople = 8;
        int mortalityPerPopulation = (Y / 1000) * mortalityThousandPeople;
        int X = 0;
        int howYears = 10;
        int year = 0;
        int difference = birthRatePerPopulation - mortalityPerPopulation;


        for (year = 1; year <= 10; year++) {
            Y = Y + difference;
            System.out.println("Год " + year + " численность населения составляет " + Y);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        float deposit = 15000;
        int i = 0;
        float percent = 0.07F;
        float goal = 12_000_000F;

        while (deposit < goal) {
            deposit = deposit + deposit * percent;
            i = i + 1;
            System.out.println("В месяце " + i + " накоплено " + deposit);

        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        double deposit = 15000;
        int i = 1;
        for (; deposit < 12_000_000; i++) {
            deposit = deposit + deposit * 0.07;
            if (i % 6 == 0) {

                System.out.println("Сумма " + deposit + " количество месяцев  " + i);
            }
        }

    }

    public static void task6() {
        System.out.println("Задача 6");
        float deposit = 15000;
        int i = 0;
        float percent = 0.07F;
        for (i = 1; i <= 108; i++) {
            deposit = deposit + deposit * percent;
            if (i % 6 == 0) {

                System.out.println("В месяце " + i + " накоплено " + deposit);
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int friday = 6;
        int daysMonth = 31;

        if (friday >= 1 && friday <= 7) {

            for (friday = 1; friday <= daysMonth; friday += 7) {
                System.out.println("Сегодня пятница " + friday + "-е число." + " необходимо подготовить отчет");
            }
        } else {
            System.out.println("Ошибочно введена дата первой пятницы");
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int i = 0;
        for (; i < 2123; i += 79) {
            if (i > 1823) {
                System.out.println(i);
            }
        }

    }
}

