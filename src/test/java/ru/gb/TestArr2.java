package ru.gb;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestArr2 {
    private MainApp mainApp;

    int[] arr = {1, 2, 4, 4, 2, 3, 4, 1, 7};
    int[] test1 = {0,2,5,6,3,5,6,8};
    int[] test2 = {1,4,1,4,1,4};
    int[] test3 = {1,1,1};

    @BeforeEach
    public void init() {
        mainApp = new MainApp();
    }

    @Test
    public void testArray1(){
        Assertions.assertTrue(mainApp.checkArray2(arr));
    }

    @Test
    public void testArray2 (){
        mainApp.checkArray2(test1);
    }

    @Test
    public void testArray3(){
        Assertions.assertTrue(mainApp.checkArray2(test2));
    }

    @Test
    public void testArray4(){
        Assertions.assertTrue(mainApp.checkArray2(test3));
    }
}
