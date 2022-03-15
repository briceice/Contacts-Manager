package util;

import java.util.Scanner;

public class Input {
    private final Scanner scanner;

    // Constructor
    public Input() {
        this.scanner = new Scanner(System.in);
    }

    // Methods
    public void close(){
        this.scanner.close();
    }

    public String getString(String prompt){
        System.out.println(prompt);
        return this.scanner.nextLine();
    }

    public boolean yesNo(String prompt){
        System.out.println(prompt);
        String input = this.scanner.nextLine();
        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
    }

    public int getInt(String prompt, int min, int max){
        do {
            String s = getString(prompt);
            int userInt;
            try {
                userInt = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("Error: enter an int");
                continue;
            }
            if (userInt >= min && userInt <= max){
                return userInt;
            }
        } while (true);
    }

    public int getInt(String prompt){
        do {
            String s = getString(prompt);
            int userInt;
            try {
                userInt = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("Error: enter an int");
                continue;
            }
            return userInt;
        } while (true);
    }

    public double getDouble(String prompt, double min, double max){
        do {
            String s = getString(prompt);
            double userDbl;
            try {
                userDbl = Double.parseDouble(s);
            } catch (NumberFormatException e) {
                System.out.println("Error: enter a double");
                continue;
            }
            if (userDbl >= min && userDbl <= max){
                return userDbl;
            }
        } while (true);
    }

    public double getDouble(String prompt) {
        do {
            String s = getString(prompt);
            double userDbl;
            try {
                userDbl = Double.parseDouble(s);
            } catch (NumberFormatException e) {
                System.out.println("Error: enter a double");
                continue;
            }
            return userDbl;
        } while (true);
    }
}
