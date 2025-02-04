package school.mjc.stage0.conditions.task3;

public class Seasons {
    public static void tellTheSeasonByMonthNumber(int month) {

        if (month <= 0 || month >= 13) {

            System.out.println("wrong number!");
        }

        if (month >= 1 && month < 3 || month == 12) {
            System.out.println("Winter");
        }

        if (month >= 3 && month < 6) {
            System.out.println("Spring");
        }

        if (month >= 6 && month < 9) {
            System.out.println("Summer");
        }

        if (month >=9 && month <12) {
            System.out.println("Fall");
        }

    }
}
