package oop;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

// Kamil Jozefowicz
// D00229452
// https://github.com/kamil2000pl/FirstProject

public class App
{
    public static void main(String[] args)
    {
        // Reads file
        readFile("JC_Results.txt");
    }

    public static void readFile(String file)
    {
        try {
            // Intialises Scanner to read file
            Scanner sc = new Scanner(new File(file));

            // Delimiter set
            sc.useDelimiter("[,\r\n]+");

            // While loop reads each line of file
            while (sc.hasNext()) {

                String Student_Number = sc.next();
                int[] codes = new int[8];
                int[] results = new int[8];

                // For loop reads each value and places them into their array
                for (int i = 0; i < 8; i++)
                {
                    int Subject_Code = sc.nextInt();
                    codes[i] = Subject_Code;
                    int Mark = sc.nextInt();
                    results[i] = Mark;
                }
                // Calls methods to select appropriate grade and to calculate their average
                System.out.printf(Student_Number + " %.2f\n", calculateAverage(selectFiveGrades(codes, results)));
            }
            // Closes scanner
            sc.close();

        } catch (IOException e) {
            System.out.println("IO Exception");
        }
    }

    public static int[] selectFiveGrades(int[] codes, int[] grades)
    {
        int[] results = new int[5];
        int[] temp = new int[5];
        int countCore = 0;
        int countOptional = 0;

        // For loop places results into appropriate array
        for (int i = 0; i < 8; i++)
        {
            if (codes[i] == 1)
            {
                results[countCore] = grades[i];
                countCore++;
            }
            else if (codes[i] == 2)
            {
                results[countCore] = grades[i];
                countCore++;
            }
            else if (codes[i] == 3)
            {
                results[countCore] = grades[i];
                countCore++;
            }
            else if (codes[i] != 218)
            {
                temp[countOptional] = grades[i];
                countOptional++;
            }
        }

        // Places 2 highest optional subject results into main results array
        Arrays.sort(temp);
        results[3] = temp[4];
        results[4] = temp[3];

        return results;
    }

    public static double calculateAverage(int[] selectedGrades)
    {
        int total = 0;

        // For loop calculates total of selected 5 grades
        for (int selectedGrade : selectedGrades) {
            total += selectedGrade;
        }

        // Calculation for average
        return ((double) total / selectedGrades.length);
    }
}