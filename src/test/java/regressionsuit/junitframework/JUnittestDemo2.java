package regressionsuit.junitframework;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class JUnittestDemo2 {

    /*
    @BeforeClass
    public static void setUp1(){
        System.out.println("Before class test  01");
    }

    @AfterClass
    public static void tearDown1(){
        System.out.println("After all runs once all tests  01 ");
    }
     */

    @BeforeAll   // this is not working
    public static void setUp(){
        System.out.println("Before All run once before all testes  !! ");
    }

    @AfterAll   // this is not working
    public static void tearDown(){
        System.out.println("After all runs once after all testes  !! ");
    }

    @BeforeEach           // the test each time run
    public void before(){
        System.out.println("Before test 1 ");
    }

    @AfterEach           // the test each time run
    public void after(){
        System.out.println("After test 1");
    }

    @Test
    @Order(1)
    public void addProduct(){
        System.out.println("CubeCart Add Product Test... ");
        Assertions.assertTrue(Math.sqrt(9)==3);
    } 
    @Test
    @Order(3)
    @Tag("Regression Test")
    public void deleteProduct(){
        System.out.println("Delete Product Test.. ");
        Assertions.assertEquals(10,10);
    }

    @Test
    @Order(2)
    public void updateProductInfo(){
        System.out.println("Testing CubeCart Update Product Function...");
        Assertions.assertTrue(Math.pow(10,2)==100);

    }


}
