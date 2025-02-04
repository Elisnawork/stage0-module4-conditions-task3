package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {

        if (salary <= 0 ) {
            System.out.println("wrong input!");
        }

        if (salary <= 10000 && salary > 0 ) {
            double salaryResult = (double) salary - ((salary * 15) / 100);
            System.out.println(salaryResult);
        }

        if (salary > 10000 && salary <= 20000) {
            double salaryResult = (double) salary - ((salary * 18) / 100);
            System.out.println(salaryResult);
        }

        if (salary > 20000) {
            double salaryResult = (double) salary - ((salary * 20) / 100);
            System.out.println(salaryResult);
        }
    }
}
