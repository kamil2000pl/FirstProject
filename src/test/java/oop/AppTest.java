package oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void selectFiveGrades1() {
        System.out.println("selectFiveGrades1");
        int[] codes = {1,2,3,4,5,12,42,46};
        int[] grades = {65,58,45,60,50,48,42,60};
        int[] expResult = {65,58,45,60,60};
        int[] result = App.selectFiveGrades(codes, grades);
        assertArrayEquals(expResult, result);
    }
    @Test
    void selectFiveGrades2() {
        System.out.println("selectFiveGrades2");
        int[] codes = {3,1,2,125,137,126,57,4};
        int[] grades = {65,58,45,60,68,100,77,60};
        int[] expResult = {65,58,45,100,77};
        int[] result = App.selectFiveGrades(codes, grades);
        assertArrayEquals(expResult, result);
    }
    @Test
    void selectFiveGrades3() {
        System.out.println("selectFiveGrades3");
        int[] codes = {3,2,217,1,52,46,27,224};
        int[] grades = {40,35,21,28,88,63,24,55};
        int[] expResult = {40,35,28,88,63};
        int[] result = App.selectFiveGrades(codes, grades);
        assertArrayEquals(expResult, result);
    }
    @Test
    void selectFiveGrades4() {
        System.out.println("selectFiveGrades4");
        int[] codes = {1,2,3,218,13,126,565,81};
        int[] grades = {63,68,26,100,75,89,77,75};
        int[] expResult = {63,68,26,89,77};
        int[] result = App.selectFiveGrades(codes, grades);
        assertArrayEquals(expResult, result);
    }
    @Test
    void selectFiveGrades5() {
        System.out.println("selectFiveGrades5");
        int[] codes = {569,221,218,52,1,2,3,12};
        int[] grades = {23,52,35,34,53,24,64,42};
        int[] expResult = {53,24,64,52,42};
        int[] result = App.selectFiveGrades(codes, grades);
        assertArrayEquals(expResult, result);
    }
    @Test
    void selectFiveGrades6() {
        System.out.println("selectFiveGrades6");
        int[] codes = {4,10,8,1,42,125,2,3};
        int[] grades = {88,56,45,44,97,35,56,64};
        int[] expResult = {44,56,64,97,88};
        int[] result = App.selectFiveGrades(codes, grades);
        assertArrayEquals(expResult, result);
    }
    @Test
    void selectFiveGrades7() {
        System.out.println("selectFiveGrades7");
        int[] codes = {3,2,126,4,1,217,125,569};
        int[] grades = {76,67,66,45,76,78,76,61};
        int[] expResult = {76,67,76,78,76};
        int[] result = App.selectFiveGrades(codes, grades);
        assertArrayEquals(expResult, result);
    }
    @Test
    void selectFiveGrades8() {
        System.out.println("selectFiveGrades8");
        int[] codes = {218,11,1,2,3,52,137,4};
        int[] grades = {100,52,63,53,64,21,32,63};
        int[] expResult = {63,53,64,63,52};
        int[] result = App.selectFiveGrades(codes, grades);
        assertArrayEquals(expResult, result);
    }
    @Test
    void selectFiveGrades9() {
        System.out.println("selectFiveGrades9");
        int[] codes = {2,1,3,13,52,27,46,8};
        int[] grades = {53,0,0,22,27,54,29,52};
        int[] expResult = {53,0,0,54,52};
        int[] result = App.selectFiveGrades(codes, grades);
        assertArrayEquals(expResult, result);
    }
    @Test
    void selectFiveGrades10() {
        System.out.println("selectFiveGrades10");
        int[] codes = {218,1,2,3,8,46,27,106};
        int[] grades = {0,52,63,68,44,63,57,87};
        int[] expResult = {52,63,68,87,63};
        int[] result = App.selectFiveGrades(codes, grades);
        assertArrayEquals(expResult, result);
    }

    @Test
    void calculateAverage1() {
        System.out.println("calculateAverage1");
        int[] selectedGrades = {65,58,45,60,60};
        double expResult = 57.6;
        double average = App.calculateAverage(selectedGrades);
        assertEquals(expResult, average, 0.0);
    }
    @Test
    void calculateAverage2() {
        System.out.println("calculateAverage2");
        int[] selectedGrades = {65,58,45,100,77};
        double expResult = 69;
        double average = App.calculateAverage(selectedGrades);
        assertEquals(expResult, average, 0.0);
    }
    @Test
    void calculateAverage3() {
        System.out.println("calculateAverage3");
        int[] selectedGrades = {40,35,28,88,63};
        double expResult = 50.8;
        double average = App.calculateAverage(selectedGrades);
        assertEquals(expResult, average, 0.0);
    }
    @Test
    void calculateAverage4() {
        System.out.println("calculateAverage4");
        int[] selectedGrades = {63,68,26,89,77};
        double expResult = 64.6;
        double average = App.calculateAverage(selectedGrades);
        assertEquals(expResult, average, 0.0);
    }
    @Test
    void calculateAverage5() {
        System.out.println("calculateAverage5");
        int[] selectedGrades = {53,24,64,52,42};
        double expResult = 47;
        double average = App.calculateAverage(selectedGrades);
        assertEquals(expResult, average, 0.0);
    }
    @Test
    void calculateAverage6() {
        System.out.println("calculateAverage6");
        int[] selectedGrades = {44,56,64,97,88};
        double expResult = 69.8;
        double average = App.calculateAverage(selectedGrades);
        assertEquals(expResult, average, 0.0);
    }
    @Test
    void calculateAverage7() {
        System.out.println("calculateAverage7");
        int[] selectedGrades = {76,67,76,78,76};
        double expResult = 74.6;
        double average = App.calculateAverage(selectedGrades);
        assertEquals(expResult, average, 0.0);
    }
    @Test
    void calculateAverage8() {
        System.out.println("calculateAverage8");
        int[] selectedGrades = {63,53,64,63,52};
        double expResult = 59;
        double average = App.calculateAverage(selectedGrades);
        assertEquals(expResult, average, 0.0);
    }
    @Test
    void calculateAverage9() {
        System.out.println("calculateAverage9");
        int[] selectedGrades = {53,0,0,54,52};
        double expResult = 31.8;
        double average = App.calculateAverage(selectedGrades);
        assertEquals(expResult, average, 0.0);
    }
    @Test
    void calculateAverage10() {
        System.out.println("calculateAverage10");
        int[] selectedGrades = {52,63,68,87,63};
        double expResult = 66.6;
        double average = App.calculateAverage(selectedGrades);
        assertEquals(expResult, average, 0.0);
    }
}