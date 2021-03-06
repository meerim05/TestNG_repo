package com.class2;

import org.testng.annotations.Test;

public class PriorityBatch9 {
    @Test(priority = 1, groups = "smoke")
    public void loginMethod(){
        System.out.println("This execution should come first");
    }

    @Test(priority = 2, groups = "smoke")
    public void enterCredentialsMethod(){
        System.out.println("This execution should come in the end");
    }

    @Test(priority = 4)
    public void enterInvalidCrdentials(){
        System.out.println("This execution should come at number 4");
    }

    @Test(priority = 5)
    public void anotherTestMethod(){
        System.out.println("This execution should come in the end");
    }

}
