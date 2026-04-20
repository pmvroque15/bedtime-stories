package com.pluralsight;

import java.io.*;
import java.util.Scanner;

public class Main {
    static void main() {
        String[] bedtimeStories = {
                "src/main/resources/goldilocks.txt",
                "src/main/resources/mary_had_a_little_lamb.txt",
                "src/main/resources/hansel_and_gretel.txt"
        };
        for (String fileName : bedtimeStories) {
            System.out.println(fileName);
            try {
                Scanner scanner = new Scanner(new File(fileName));
                String line = "";
                int numOfLines = 0;
                while (scanner.hasNext()){
                    for (int i = 0; i < line.length(); i++) {
                        numOfLines++;
                    }
                    line = scanner.nextLine();
                    System.out.printf("Here's the %s line: %s\n", numOfLines, line);
                }
            } catch (FileNotFoundException e) {
                System.out.println("Sorry, I can't read the file.");
            } catch (IOException e) {
                System.err.println("I couldn't find the file");
            }
        }
    }
}
