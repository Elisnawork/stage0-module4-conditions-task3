package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {

        int days;

        if (month < 1 || month > 12) {
            System.out.println("wrong number!");

        } else if (month == 2) {
            days = 28;
            System.out.println(days);
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            days = 30;
            System.out.println(days);
        } else {
            days = 31;
            System.out.println(days);
        }



    }
}
