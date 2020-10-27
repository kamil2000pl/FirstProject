package oop;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        readFile("JC_Results.txt");

    }

    public static void readFile(String file) {
        try {
            Scanner sc = new Scanner(new File(file));

            sc.useDelimiter("[,\r\n]+");

            while (sc.hasNext()) {

                String Student_Number = sc.next();
                int[] codes = new int[8];
                int[] results = new int[8];
//                System.out.println("Student number " + Student_Number);
//                while (sc.hasNext())
                for (int i = 0; i < 8; i++)
                {
//                    System.out.println("iteration " + i);
                    int Subject_Code = sc.nextInt();
                    codes[i] = Subject_Code;
                    int Mark = sc.nextInt();
                    results[i] = Mark;
                    System.out.println("subject - " + Subject_Code);
                    System.out.println(Mark);
                }
//                System.out.println(Arrays.toString(results));
                selectFiveGrades(codes, results);


            }
            sc.close();

        } catch (IOException e) {

        }
    }

    public static int[] selectFiveGrades(int[] codes, int[] grades)
    {
        int[] results = new int[5];
        int[] temp = new int[5];
        int countCore = 0;
        int countOptional = 0;
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
        Arrays.sort(temp);
        results[3] = temp[4];
        results[4] = temp[3];

        return results;
    }

//    TODO: calculateAverage Method
//    private double calculateAverage( int[] selectedGrades)
//    {
//
//    }
}