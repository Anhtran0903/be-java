public class arayy2 {

    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static final double PI = 3.14159;
    public static final double E = 2.71828;

    public static void main(String[] args) {
                Day today = Day.FRIDAY;
        double r = 3;
        System.out.println("s=" + r * r * PI );
        switch (today) {
            case MONDAY:
                System.out.println("Today is Monday.");
                break;
            case FRIDAY:
                System.out.println("Today is Friday.");
                break;
            case SUNDAY:
                System.out.println("Today is Sunday.");
                break;
            default:
                System.out.println("Today is a regular day.");
                break;
        }
    }
}