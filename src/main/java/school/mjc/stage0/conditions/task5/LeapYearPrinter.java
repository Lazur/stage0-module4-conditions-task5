package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        boolean isLeap = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("leap");
                    return;
                }
            } else {
                System.out.println("leap");
                return;
            }
        }
        
        System.out.println("not leap");
    }
    
}
