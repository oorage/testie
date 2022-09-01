package firstproj.utility;

import java.util.InputMismatchException;

public class CalcOOP {
    private Double result;
    private Double val1;
    private Double val2;
    private String op;

    public CalcOOP() {
    }

    public CalcOOP(double val1, double val2, String op) {
        this.val1 = val1;
        this.val2 = val2;
        this.op = op;
        setResult(val1, val2, op);
    }

    public Double getVal1() {
        return val1;
    }

    public Double getVal2() {
        return val2;
    }

    public String getOp() {
        return op;
    }

    private void setResult(Double val1, Double val2, String op) {
        if (val1 == null || val2 == null) {
            throw new NullPointerException();
        }
        if (op == null || !op.equals("/") && !op.equals("+") && !op.equals("*") && !op.equals("-")) {
            throw new InputMismatchException();
        }
        if (op.equals("/") && val2 == 0) {
            throw new ArithmeticException();
        }
        switch (op) {
            case "+" -> this.result = val1 + val2;
            case "-" -> this.result = val1 - val2;
            case "*" -> this.result = val1 * val2;
            case "/" -> this.result = val1 / val2;
        }
    }

    public Double getResult() {
        setResult(this.val1, this.val2, this.op);
        return result;
    }

    public void setVal1(double val1) {
        this.val1 = val1;
        //    setResult(this.val1, this.val2, this.op);
    }

    public void setVal2(double val2) {
        this.val2 = val2;
        //    setResult(this.val1, this.val2, this.op);
    }

    public void setOp(String op) {
        this.op = op;
        //    setResult(this.val1, this.val2, this.op);
    }


    @Override
    public String toString() {
        setResult(this.val1, this.val2, this.op);
        return val1 + " " + op + " " + val2 + " = " + result;

    }
}
