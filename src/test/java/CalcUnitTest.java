import org.junit.Assert;
import org.junit.Test;
import firstproj.utility.*;

import java.util.InputMismatchException;

public class CalcUnitTest {
    Double val1 = -1000 + Math.random() * 1000;
    Double val2 = -1000 + Math.random() * 1000;
    String[] operations = {"+", "-", "*", "/"};
    int indexOperation = (int) (Math.random() * 3);
    String op = operations[indexOperation];
    Double result;

    public Double expectedResult(){
        switch (op) {
            case "+" -> result = val1 + val2;
            case "-" -> result = val1 - val2;
            case "*" -> result = val1 * val2;
            case "/" -> result = val1 / val2;
        }
        return result;
    }

    public Double expectedResult(String op){
        switch (op) {
            case "+" -> result = val1 + val2;
            case "-" -> result = val1 - val2;
            case "*" -> result = val1 * val2;
            case "/" -> result = val1 / val2;
        }
        return result;
    }

    @Test
    public void checkEmptyCalculator(){
        CalcOOP calculator = new CalcOOP();
        Assert.assertNull(calculator.getVal1());
        Assert.assertNull(calculator.getVal2());
        Assert.assertNull(calculator.getOp());
    }

    @Test
    public void checkConstructorWithParams(){
        CalcOOP calculatorOOP = new CalcOOP(val1, val2, op);
//        Assert.assertEquals(val1, calculatorOOP.getVal1());
//        Assert.assertEquals(val2, calculatorOOP.getVal2());
//        Assert.assertEquals(op, calculatorOOP.getOp());
        Assert.assertEquals(expectedResult(), calculatorOOP.getResult());
        //    System.out.println(val1 + " " + val2 + " " + op);
    }

    @Test
    public void checkSetters(){
        CalcOOP calculatorOOP = new CalcOOP();
        calculatorOOP.setVal1(val1);
        calculatorOOP.setVal2(val2);
        calculatorOOP.setOp(op);
        //    System.out.println(val1 + " " + val2 + " " + op);
        checkConstructorWithParams();
    }

    @Test
    public void checkGetters(){
        CalcOOP calculatorOOP = new CalcOOP(val1, val2, op);
        Assert.assertEquals(val1, calculatorOOP.getVal1());
        Assert.assertEquals(val2, calculatorOOP.getVal2());
        Assert.assertEquals(op, calculatorOOP.getOp());
        Assert.assertEquals(expectedResult(), calculatorOOP.getResult());
    }

    @Test(expected = ArithmeticException.class)
    public void checkDivisionByZero(){
        CalcOOP calculatorOOP = new CalcOOP();
        calculatorOOP.setVal1(val1);
        calculatorOOP.setVal2(0);
        calculatorOOP.setOp("/");
        calculatorOOP.getResult();
    }

    @Test(expected = InputMismatchException.class)
    public void checkIncorrectOperation(){
        CalcOOP calculatorOOP = new CalcOOP();
        calculatorOOP.setVal1(val1);
        calculatorOOP.setVal2(val2);
        calculatorOOP.setOp("asdf");
        calculatorOOP.getResult();
    }

    @Test(expected = NullPointerException.class)
    public void checkIncorrectValues(){
        CalcOOP calculatorOOP = new CalcOOP();
        calculatorOOP.setOp(op);
        calculatorOOP.getResult();
    }

    @Test
    public void checkSum(){
        CalcOOP calculatorOOP = new CalcOOP(val1, val2, "+");
        Assert.assertEquals(expectedResult("+"), calculatorOOP.getResult());
    }

    @Test
    public void checkSubtraction(){
        CalcOOP calculatorOOP = new CalcOOP(val1, val2, "-");
        Assert.assertEquals(expectedResult("-"), calculatorOOP.getResult());
    }

    @Test
    public void checkMultiply(){
        CalcOOP calculatorOOP = new CalcOOP(val1, val2, "*");
        Assert.assertEquals(expectedResult("*"), calculatorOOP.getResult());
    }

    @Test
    public void checkDivision(){
        CalcOOP calculatorOOP = new CalcOOP(val1, val2, "/");
        Assert.assertEquals(expectedResult("/"), calculatorOOP.getResult());
    }

    @Test
    public void emptyTest(){

    }

}