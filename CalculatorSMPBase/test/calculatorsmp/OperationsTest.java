/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package calculatorsmp;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lurapozo
 */
public class OperationsTest {
    
    public OperationsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of MakeFormula method, of class Operations.
     */
    @Test
    public void testMakeFormula_3args(){
        System.out.println("MakeFormula 3 args");
        String a="2";
        String b="2";
        String op="+";
        String expResult="2+2";
        String result = Operations.MakeFormula(a, b, op);
        assertEquals(expResult, result);
    }
    @Test
    public void testMakeFormula_3argsNull(){
        System.out.println("MakeFormula 3 args with Null");
        String a="";
        String b="2";
        String op="+";
        String expResult="0+2";
        
        String result = Operations.MakeFormula(a, b, op);
        System.out.println(result);
        assertEquals(expResult, result);
    }
    /**
     * Test of MakeFormula method, of class Operations.
     */
    @Test
    public void testMakeFormulaMayorDe2() {
        System.out.println("MakeFormula Mayor de 2");
        String expResult = "";
        String result = Operations.MakeFormula();
        assertTrue(result.length()>2);
    }
    @Test
    public void testMakeFormulaAssert() {
        System.out.println("MakeFormula Assert op"); 
        String result = Operations.MakeFormula();
        if(result.contains("+")||result.contains("-")||result.contains("*")||result.contains("/")){
            System.out.println("Muy bien");
        }else{
            fail("NO");
        }
    }
    /**
     * Test of Solve method, of class Operations.
     */
    @Test
    public void testSolveEmpty() {
        System.out.println("Solve Empty");
        String formula = "";
        String expResult = "";
        String result;
        try {
            result=Operations.Solve(formula);
            fail("Dx");
        }catch (Exception ex){
            System.err.println("Error");
        }   
    }
    @Test
    public void testSolveDivisionZero() {
        System.out.println("Solve Empty");
        String formula = "5/0";
        String expResult = "";
        String result;
        try {
            result=Operations.Solve(formula);
            fail("Dx");
        }catch (Exception ex){

        System.err.println("Permite division por 0");

        }   
    }
}
