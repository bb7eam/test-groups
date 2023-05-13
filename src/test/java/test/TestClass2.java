package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass2 {

    @BeforeClass(alwaysRun = true)
    public void beforeClassMethod (){
        System.out.println("Starting before class method!");
    }


    @Test(priority = 1, groups = {"group1"})
    public void test1 (){
        System.out.println("Starting test1 from class 2");
    }

    @Test(priority = 2, groups = {"group1"})
    public void test2 (){
        System.out.println("Starting test2 from class 2");
    }

    @Test(priority = 3, groups = {"group1"})
    public void test3 (){
        System.out.println("Starting test3 from class 2");
    }

    @Test(priority = 4, groups = {"group1"})
    public void a (){
        System.out.println("mnogo qko brat");
    }

    @AfterClass(alwaysRun = true)
    public void afterClassMethod (){
        System.out.println("Starting the after class method!");
    }


}
