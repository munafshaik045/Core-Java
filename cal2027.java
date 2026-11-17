public class cal2027 {
    public static void main(String[] args) {
        int month = 1;
        int days = 0;
        int startDay = 5;
        while (month <= 12) {
            switch(month) {
                case 1: 
                    days = 31; 
                    break;
                case 2:
                    days = 28; 
                    break;
                case 3: 
                    days = 31; 
                    break;
                case 4: 
                    days = 30; 
                    break;
                case 5: 
                    days = 31; 
                    break;
                case 6: 
                    days = 30; 
                    break;
                case 7: 
                    days = 31; 
                    break;
                case 8: 
                    days = 31; 
                    break;
                case 9: 
                    days = 30; 
                    break;
                case 10: 
                    days = 31; 
                    break;
                case 11: 
                    days = 30; 
                    break;
                case 12: 
                    days = 31; 
                    break;
            }

            switch (month) {
                case 1: 
                System.out.println("\n       JANUARY 2027"); 
                    break;
                case 2: 
                    System.out.println("\n      FEBRUARY 2027"); 
                    break;
                case 3: 
                    System.out.println("\n        MARCH 2027"); 
                    break;
                case 4: 
                    System.out.println("\n        APRIL 2027"); 
                    break;
                case 5: 
                    System.out.println("\n         MAY 2027"); 
                    break;
                case 6: 
                    System.out.println("\n         JUNE 2027"); 
                    break;
                case 7: 
                    System.out.println("\n         JULY 2027"); 
                    break;
                case 8: 
                    System.out.println("\n        AUGUST 2027"); 
                    break;
                case 9: 
                    System.out.println("\n      SEPTEMBER 2027"); 
                    break;
                case 10: 
                    System.out.println("\n       OCTOBER 2027"); 
                    break;
                case 11: 
                    System.out.println("\n      NOVEMBER 2027"); 
                    break;
                case 12: 
                    System.out.println("\n      DECEMBER 2027"); 
                    break;
            }

            System.out.println("Sun Mon Tue Wed Thu Fri Sat");

            switch (startDay) {
                case 0: 
                    break;
                case 1: 
                    System.out.print("    "); 
                    break;
                case 2: 
                    System.out.print("        "); 
                    break;
                case 3: 
                    System.out.print("            "); 
                    break;
                case 4: 
                    System.out.print("                "); 
                    break;
                case 5: 
                    System.out.print("                    "); 
                    break;
                case 6: 
					System.out.print("                        ");
					break;
            }

            int day = 1;

            while (day <= days) {

                System.out.printf("%3d ", day);

                if ((startDay + day) % 7 == 0) {
                    System.out.println();
                }

                day++;
            }

            System.out.println();

            startDay = (startDay + days) % 7;

            month++;
        }
    }
}

