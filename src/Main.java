public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Задание №1");
        int a = 1651461;
        byte b = 99;
        short c = 25000;
        long d = 1_000_000_000L;
        float f = 7.56f;
        double m = 5.133251;
        System.out.printf("«Значение переменной a с типом int равно %s»\n", a);
        System.out.printf("«Значение переменной b с типом byte  равно %s»\n", b);
        System.out.printf("«Значение переменной c с типом short  равно %s»\n", c);
        System.out.printf("«Значение переменной d с типом long  равно %s»\n", d);
        System.out.printf("«Значение переменной f с типом float  равно %s»\n", f);
        System.out.printf("«Значение переменной m с типом double равно %s»\n", m);

        System.out.println("\n Задание № 2");

        double a1 = 27.12;
        long b1 = 987_678_965_549L;
        float c1 = 2.786f;
        short d1 = 569;
        short f1 = -159;
        int m1 = 27897;
        byte n1 = 67;
        System.out.println("=");

        System.out.println("\n Задание №3");
        byte ludmilaStudentsAmount = 23;
        byte annaStudentsAmount = 27;
        byte ekaterinaStudentsAmount = 30;
        short allStudentsAmount = (short) (ludmilaStudentsAmount + ekaterinaStudentsAmount + annaStudentsAmount);
        short paperAmount = 480;
        System.out.println(allStudentsAmount);
        double listPerStudent = (double) paperAmount / allStudentsAmount;
        System.out.println("«На каждого ученика рассчитано " + listPerStudent + " листов бумаги»");

        System.out.println("\n Задача №4");
        int machinePerfomancePerMinute = 16 / 2;
        int machinePerfomancePerTwentyMinutes = machinePerfomancePerMinute * 20;
        int minutesPerDay = 24 * 60;
        int machinePerfomancePerDays = machinePerfomancePerMinute * minutesPerDay;
        int machinePerfomanceThreePerDays = minutesPerDay * 3;
        int machinePerfomanceOneMonth = minutesPerDay * 31;
        System.out.printf("«За 20 минут машина произвела %s штук бутылок»\n", machinePerfomancePerTwentyMinutes);
        System.out.printf("«За сутки машина произвела %s штук бутылок»\n", machinePerfomancePerDays);
        System.out.printf("«За 3 дня машина произвела %s штук бутылок»\n", machinePerfomanceThreePerDays);
        System.out.printf("«За месяц машина произвела %s штук бутылок»\n", machinePerfomanceOneMonth);

        System.out.println("\n Задача №5");
        int allCanAmount = 120;
        int whiteCan = 2;
        int brownCan = 4;
        int allClassAmount = allCanAmount / (whiteCan + brownCan);
        int allWhiteCanAmount = allClassAmount * whiteCan;
        int allBrownCanAmount = allClassAmount * brownCan;
        System.out.println("«В школе, где" + allClassAmount + "классов, нужно " + allWhiteCanAmount + " банок белой краски и " + allBrownCanAmount + " банок коричневой краски»");

        System.out.println("\n задача №6");
        int allBananas = 5;
        int allMilk = 200 / 2;
        int allIceCream = 2;
        int allRawEggs = 4;
        int allGramBananas = allBananas * 80;
        int allGramMilk = allMilk * 105;
        int allGramIceCream = allIceCream * 100;
        int allGramRawEggs = allRawEggs * 70;
        int allGram = allGramBananas + allGramMilk + allGramRawEggs + allGramIceCream;
        System.out.println("Всего" + allGram + "грам");
        int allKilogram = allGram / 1000;
        System.out.println(" Всего " + allKilogram + " килограмм");

        System.out.println("\n Задача №7");
        int weightReductionKilo = 7;
        int weightReductionGrams = weightReductionKilo * 1000;
        float maxDays = (float) weightReductionGrams / 250;
        float minDays = (float) weightReductionGrams / 500;
        System.out.println("Максимум" + maxDays + "дней");
        System.out.println("Минимум" + minDays + "дней");
        float averageNumberDays = (minDays + maxDays) / 2;
        System.out.println("В среднем потребуется" + averageNumberDays + " дней дл похудения");

        System.out.println("\n Задача №8");
        double percent = 1.1;
        int monthlySalaryMasha = 67_760;
        int monthlySalaryDenis = 83_690;
        int monthlySalaryKristina = 76_230;

        int mashaSalaryYear = monthlySalaryMasha * 12;
        int denisSalaryYear = monthlySalaryDenis * 12;
        int kristinaSalaryYear = monthlySalaryKristina * 12;

        int mashaNewSalary = (int) (monthlySalaryMasha * percent);
        int denisNewSalary = (int) (monthlySalaryDenis * percent);
        int kristinaNewSalary = (int) (monthlySalaryKristina * percent);

        int mashaNewSalaryYear = mashaNewSalary * 12;
        int denisNewSalaryYear = denisNewSalary * 12;
        int kristinaNewSalaryYear = kristinaNewSalary * 12;

        int mashaSalaryDifference = mashaNewSalaryYear - mashaSalaryYear;
        int denisSalaryDifference = denisNewSalaryYear - denisSalaryYear;
        int kristinaSalaryDifference = kristinaNewSalaryYear - kristinaSalaryYear;
        System.out.printf("«Маша теперь получает " + mashaNewSalary + "рублей.Годовой доход вырос на %s рублей»\n", mashaSalaryDifference);
        System.out.printf("«Денис теперь  " + denisNewSalary + "рублей.Годовой доход вырос на %s рублей»\n", denisSalaryDifference);
        System.out.printf("«Кристина теперь получает " + kristinaNewSalary + "рублей.Годовой доход вырос на %s рублей»\n", kristinaSalaryDifference);


    }
}