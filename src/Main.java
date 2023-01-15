public class Main {
    public static void main(String[] args)
    {
        System.out.println("Test Data");
        MinutesToYearsAndDays.printYearsAndDays(525600);
        MinutesToYearsAndDays.printYearsAndDays(1051200);
        MinutesToYearsAndDays.printYearsAndDays(561600);
    }

    public static class MinutesToYearsAndDays
    {
        static long lYears;
        static long lDays;
        static long lHours;
        static long lMinutes;
        public static void printYearsAndDays(long minutes)
        {
            if(minutes < 0) System.out.println("Invalid Value!");
            else
            {
                    lHours = minutes / 60;
                    lMinutes = minutes % 60;
                    lDays = lHours / 24;
                    lHours = lHours % 24;
                    lYears = lDays / 365;
                    lDays = lDays % 365;

                System.out.println(lYears + "y " + lDays + "d ");
            }
        }
    }
}