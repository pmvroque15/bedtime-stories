package com.pluralsight;

import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        String[] bedtimeStories = {
                "godilocks.txt",
                "mary_had_a_little_lamb.txt",
                "hansel_and_gretel.txt"
        };

        try {
//            FileReader godilocks = new FileReader("src/main/resources/goldilocks.txt");
//            BufferedReader bufferedReader = new BufferedReader(godilocks);

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
