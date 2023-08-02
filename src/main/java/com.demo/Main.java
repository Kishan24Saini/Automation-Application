package com.demo;

import com.demo.api.APIResponse;
import com.demo.pojo.WeatherData;
import com.demo.util.WeatherDataUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            printMenu();
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    getWeatherData(scanner, "temperature");
                    break;
                case 2:
                    getWeatherData(scanner, "wind.speed");
                    break;
                case 3:
                    getWeatherData(scanner, "pressure");
                    break;
                case 0:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        } while (option != 0);

        scanner.close();
    }

    private static void getWeatherData(Scanner scanner, String dataType) {
        System.out.print("Enter the date (YYYY-MM-DD): ");
        String date = scanner.next();

        WeatherData weatherData = APIResponse.getAPIResponse();
        if (weatherData != null) {
            switch (dataType) {
                case "temperature":
                    System.out.println("Temperature on " + date + " is " + WeatherDataUtil.getTemperature(weatherData, date));
                    break;
                case "wind.speed":
                    System.out.println("Wind Speed on " + date + " is " + WeatherDataUtil.getWindSpeed(weatherData,date));
                    break;
                case "pressure":
                    System.out.println("Pressure on " + date + " is " + WeatherDataUtil.getPressure(weatherData,date));
                    break;
                default:
                    System.out.println("Invalid data type.");
            }
        } else {
            System.out.println("Data not available for the provided date.");
        }
    }
    private static void printMenu() {
        System.out.println("Select an option:");
        System.out.println("1. Get weather");
        System.out.println("2. Get Wind Speed");
        System.out.println("3. Get Pressure");
        System.out.println("0. Exit");
    }
}