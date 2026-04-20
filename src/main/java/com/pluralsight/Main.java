package com.pluralsight;

import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        String[] bedtimeStories = {
                "src/main/resources/goldilocks.txt",
                "src/main/resources/mary_had_a_little_lamb.txt",
                "src/main/resources/hansel_and_gretel.txt"
        };
        for (String index : bedtimeStories) {
            System.out.println(index);
            try {
            FileReader fileReader = new FileReader(index);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

                String input;
                while((input = bufferedReader.readLine()) != null) {
                    System.out.println(input);
                }
            } catch (FileNotFoundException e) {
                System.out.println("Sorry, I can't read the file.");
            } catch (IOException e) {
                System.err.println("I couldn't find the file");
            }
        }
    }
}
