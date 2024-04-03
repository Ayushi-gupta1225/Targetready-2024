package Assignments.day1.calender;

public class calendergenerator {

//        public static void generateCalendar(int year, int month) {
//            // Initialize variables for day of the week (dy), day of the month (d),
//            // month (m), and year (y)
//            int dayOfWeek = 1; // Represents the day of the week (Sunday = 0, Monday = 1, ..., Saturday = 6)
//            int dayOfMonth = 1; // Represents the day of the month
//            int currentMonth = 1; // Represents the current month
//            int currentYear = 1; // Represents the current year
//
//            // Define arrays for day names and month names
//            String[] dayNames = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
//            String[] monthNames = {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE",
//                    "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"};
//
//            // Define array for the number of days in each month
//            int[] daysInMonth = {31, dateutilities.getDaysInMonth(year, month), 31, 30, 31, 30,
//                    31, 31, 30, 31, 30, 31};
//
//            // Check if the current year is a leap year and update the number of days in February
//            if (dateutilities.isLeapYear(year)) {
//                daysInMonth[1] = 29; // February has 29 days in a leap year
//            }
//
//            // Loop until we reach the specified month and year
//            while (true) {
//                // Check if we have reached the specified month and year
//                if (dayOfMonth == 1 && currentMonth == month && currentYear == year) {
//                    break; // Exit the loop if we have reached the specified month and year
//                }
//
//                // Increment the day of the week and the day of the month
//                dayOfWeek++;
//                dayOfMonth++;
//
//                // If the day of the month exceeds the number of days in the current month,
//                // increment the month and reset the day of the month to 1
//                if (dayOfMonth > daysInMonth[currentMonth - 1]) {
//                    currentMonth++;
//                    dayOfMonth = 1;
//                }
//
//                // If the month exceeds 12 (December), increment the year and reset the month to 1 (January)
//                if (currentMonth > 12) {
//                    currentMonth = 1;
//                    currentYear++;
//                }
//
//                // If the day of the week reaches 7 (Saturday), reset it to 0 (Sunday)
//                if (dayOfWeek == 7) {
//                    dayOfWeek = 0;
//                }
//            }
//
//            // Calculate the number of leading spaces before the first day of the month
//            int leadingSpaces = dayOfWeek;
//            if (leadingSpaces < 0) {
//                leadingSpaces = 6; // Adjust for Sunday being represented as 0
//            }
//
//            // Print the month name
//            System.out.println("MONTH: " + monthNames[month - 1]);
//
//            // Print the day names (SUN, MON, ..., SAT)
//            for (int i = 0; i < 7; i++) {
//                System.out.print("  " + dayNames[i]);
//            }
//            System.out.println();
//
//            // Print leading spaces before the first day of the month
//            for (int i = 0; i < leadingSpaces; i++) {
//                System.out.print("     "); // Five spaces for each day name
//            }
//
//            // Print the days of the month with proper formatting
//            for (int day = 1; day <= daysInMonth[month - 1]; day++) {
//                // Print the day with 4 characters width and leading spaces if necessary
//                System.out.printf(" %4d ", day);
//
//                // Move to the next line if it's the last day of the week or the last day of the month
//                if (((day + leadingSpaces) % 7 == 0) || (day == daysInMonth[month - 1])) {
//                    System.out.println();
//                }
//            }
//        }


        public static void generateCalendar(int year, int month) {
            // Initialize variables for day of the week (dy), day of the month (d),
            // month (m), and year (y)
            int dayOfWeek = 1; // Represents the day of the week (Sunday = 0, Monday = 1, ..., Saturday = 6)
            int dayOfMonth = 1; // Represents the day of the month
            int currentMonth = 1; // Represents the current month
            int currentYear = 1; // Represents the current year

            // Define arrays for day names and month names
            String[] dayNames = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
            String[] monthNames = {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE",
                    "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"};

            // Define array for the number of days in each month
            int[] daysInMonth = {31, org.targetindia.day1.calender.dateutilities.getDaysInMonth(year, month), 31, 30, 31, 30,
                    31, 31, 30, 31, 30, 31};

            // Check if the current year is a leap year and update the number of days in February
            if (org.targetindia.day1.calender.dateutilities.isLeapYear(year)) {
                daysInMonth[1] = 29; // February has 29 days in a leap year
            }

            // Loop until we reach the specified month and year
            while (true) {
                // Check if we have reached the specified month and year
                if (dayOfMonth == 1 && currentMonth == month && currentYear == year) {
                    break; // Exit the loop if we have reached the specified month and year
                }

                // Increment the day of the week and the day of the month
                dayOfWeek++;
                dayOfMonth++;

                // If the day of the month exceeds the number of days in the current month,
                // increment the month and reset the day of the month to 1
                if (dayOfMonth > daysInMonth[currentMonth - 1]) {
                    currentMonth++;
                    dayOfMonth = 1;
                }

                // If the month exceeds 12 (December), increment the year and reset the month to 1 (January)
                if (currentMonth > 12) {
                    currentMonth = 1;
                    currentYear++;
                }

                // If the day of the week reaches 7 (Saturday), reset it to 0 (Sunday)
                if (dayOfWeek == 7) {
                    dayOfWeek = 0;
                }
            }

            // Calculate the number of leading spaces before the first day of the month
            int leadingSpaces = dayOfWeek;
            if (leadingSpaces < 0) {
                leadingSpaces = 6; // Adjust for Sunday being represented as 0
            }

            // Print the month name
            System.out.println("MONTH: " + monthNames[month - 1]);

            // Print the day names (SUN, MON, ..., SAT)
            for (int i = 0; i < 7; i++) {
                System.out.print("   " + dayNames[i]);
            }
            System.out.println();

            // Print leading spaces before the first day of the month
            for (int i = 0; i < leadingSpaces; i++) {
                System.out.print("      "); // Five spaces for each day name
            }

            // Print the days of the month with proper indentation for each day of the week
            int currentDayOfWeek = leadingSpaces; // Start with the first day of the week
            for (int day = 1; day <= daysInMonth[month - 1]; day++) {
                // Move to the next line if it's the first day of the week
                if (currentDayOfWeek == 0) {
                    System.out.println();
                }

                // Print the day with proper indentation
                System.out.printf(" %4d ", day);

                // Move to the next day of the week
                currentDayOfWeek = (currentDayOfWeek + 1) % 7;
            }
            System.out.println(); // Move to the next line after printing all days
        }
    }

