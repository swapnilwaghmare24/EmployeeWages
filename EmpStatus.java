package Com.Bridgelabz.EmployeeWages;


public class EmpStatus {

    private static final int IS_PRESENT=1;
    private static final int IS_ABSENT=0;

    public static void main(String[] args) {
        int empStatus= (int)(Math.random()*10)%2;
        if(empStatus==IS_PRESENT)
            System.out.println("Employee is present "+empStatus);
        else System.out.println("Employee is Absent "+empStatus);

    }
}
