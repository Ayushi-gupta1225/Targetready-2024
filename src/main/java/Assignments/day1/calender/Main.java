package Assignments.day1.calender;

public class Main {
    public static void main(String[] args) {

        int[] input = inputreader.readInput();
        int year = input[0];
        int month = input[1];
        calendergenerator.generateCalendar(year, month);
    }
}