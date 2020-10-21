package oop;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File(JC_Results.txt));
            double sum = 0;
            int count = 0;
            // assuming file format: name age mark (e.g. Tom 18 65.50)
            // delimiter is whitespace (the default setting)
            while (sc.hasNext()) {

                String name = sc.next();
                int age = sc.nextInt();
                double mark = sc.nextDouble();

                System.out.println("Name: " + name + " Age: " + age + " Mark: " + mark);
                sum = sum + mark;
                count++;

            }
            System.out.println("Average mark: " + sum / count);
            sc.close();

        } catch (IOException e) {
    }

}
