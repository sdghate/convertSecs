import java.util.Scanner;

public class SecondsToTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the total number of seconds
        System.out.print("Enter the total number of seconds: ");
        int totalSeconds = scanner.nextInt();

        // Calculate hours, minutes, and remaining seconds
        int hours = totalSeconds / 3600; // 1 hour = 3600 seconds
        int remainingSeconds = totalSeconds % 3600;
        int minutes = remainingSeconds / 60; // 1 minute = 60 seconds
        int seconds = remainingSeconds % 60;

        // Display the result
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);

        scanner.close();
    }
}
