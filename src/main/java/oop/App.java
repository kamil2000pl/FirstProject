package oop;

import java.io.File;
import java.io.IOException;
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
//                    System.out.println("subject - " + Subject_Code);
//                    System.out.println(Mark);
                }
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
        int count = 0;
        for (int i = 0; i < 8; i++)
        {
            if (codes[i] != 218 && codes[i] == 1)
            {
                results[count] = grades[i];
                count++;
            }
            else if (codes[i] != 218 && codes[i] == 2)
            {
                results[count] = grades[i];
                count++;
            }
            else if (codes[i] != 218 && codes[i] == 3)
            {
                results[count] = grades[i];
                count++;
            }
            else if (!(codes[i] == 218))
            {
                temp[count] = grades[i];
                count++;
            }
        }
        Arrays.sort(temp);
        results[3] = temp[1];
        results[4] = temp[2];

        return results;
    }

//    TODO: calculateAverage Method
//    private double calculateAverage( int[] selectedGrades)
//    {
//
//    }
}