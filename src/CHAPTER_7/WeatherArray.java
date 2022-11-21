package CHAPTER_7;

import java.security.SecureRandom;
import java.util.Scanner;

public class WeatherArray {
    public static void main(String[] args) {
        final int NUMBER_OF_DAYS = 10;
        final int NUMBER_OF_HOURS = 24;
        double[][][] data = new double[NUMBER_OF_DAYS][NUMBER_OF_HOURS][2]; // creation of a multidimensional array

        Scanner input = new Scanner(System.in);
            // Read input using input redirection from a file
        readData(NUMBER_OF_DAYS, NUMBER_OF_HOURS, data);

        // Find the average daily temperature and humidity
        System.out.printf("%-6s%-15s%-15s", "Day", "Avg Humid.", "Avg Temp.");
        avgTemAndHumid(NUMBER_OF_DAYS, NUMBER_OF_HOURS, data);
    }
    public static void readData(int days, int hours, double[][][] data) {
        SecureRandom rand = new SecureRandom();
        for (int k = 0; k < days * hours; k++) {
            int day = 1 + rand.nextInt(10);
            int hour = 1 + rand.nextInt(24);
            double temperature = rand.nextDouble(30);
            double humidity = 1 + rand.nextDouble(100);
            data[day - 1][hour - 1][0] = temperature;
            data[day - 1][hour - 1][1] = humidity;
        }
    }
    public static void avgTemAndHumid(int days, int hours, double[][][] data) {
        for (int i = 0; i < days; i++) {
            double dailyTemperatureTotal = 0, dailyHumidityTotal = 0;
            for (int j = 0; j < hours; j++) {
                dailyTemperatureTotal += data[i][j][0];
                dailyHumidityTotal += data[i][j][1];
            }

            // Display result
            System.out.printf("%n%-7d%-15.2f%-15.2f",
                    i + 1, dailyHumidityTotal / hours,
                    dailyTemperatureTotal / hours);
        }
    }
}
