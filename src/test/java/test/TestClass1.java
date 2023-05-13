package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestClass1 {

    @BeforeClass (alwaysRun = true)
    public void beforeClassMethod (){
        System.out.println("Starting before class method!");
    }

    @Test(groups = {"group2"},priority = 1)
    public void test2 (){
        System.out.println("Starting test 2");

        SoftAssert softAssert = new SoftAssert();
        int i = 1+3;

        softAssert.assertEquals(i,4);
        softAssert.assertAll();

    }


    @Test (groups = {"group1"},priority = 2)
    public void test1(){
        System.out.println("Starting test 1");

        SoftAssert softAssert = new SoftAssert();
        int i = 1+3;

        softAssert.assertEquals(i,4,"golqm problem");
        softAssert.assertAll();
    }


    @Test (groups = {"group3"},priority = 3)
    public void test3(){
        System.out.println("Starting test 3");

        SoftAssert softAssert = new SoftAssert();
        int i = 1+3;

        softAssert.assertEquals(i,4);
        softAssert.assertAll();
    }

    @AfterClass (alwaysRun = true)
    public void afterClassMethod (){
        System.out.println("Starting the after class method!");
    }


}
