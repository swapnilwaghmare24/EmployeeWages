package Com.Bridgelabz.EmployeeWages;

public class DailyWages {
    private static final int IS_PRESENT=1;
    private static final int IS_ABSENT=0;
    private static final int WAGE_PER_HOUR=20;
    private static final int DAY_HOURS=10;

    public static void main(String[] args) {
        int dailyWages=0;
        int empStatus= (int)(Math.random()*10)%2;
        if(empStatus==IS_PRESENT) {
            System.out.println("Employee is present " + empStatus);
            dailyWages = WAGE_PER_HOUR * DAY_HOURS;
            System.out.println("Daily wages are " + dailyWages);
        }
        else System.out.println("Employee is Absent "+empStatus);

    }
}
