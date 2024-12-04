package enumTask;

public class RunClass {
    public static void main(String[] args) {


        WeekDays day = WeekDays.TUESDAY;
        switch (day) {
            case MONDAY:
                System.out.println("BAZAR ERTƏSİ gunu");
                break;
            case TUESDAY:
                System.out.println("ÇƏRŞƏNBƏ AXŞAMI gunu");
                break;
            case WEDNESDAY:
                System.out.println("ÇƏRŞƏNBƏ gunu");
                break;
            case THURSDAY:
                System.out.println("CÜMƏ AXŞAMI gunu");
                break;
            case FRIDAY:
                System.out.println("CÜMƏ gunu");
                break;
            case SUNDAY:
                System.out.println("ŞƏNBƏ gunu");
                break;
            case SATURDAY:
                System.out.println("BAZAR gunu");
                break;
            default:
                System.out.println("bele  gun yoxdur");

        }


    }
}
