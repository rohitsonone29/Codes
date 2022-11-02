package customexception;

public class ZeroBalanceException extends Exception {

    private double currBal;
    private double withAmt;
    private int acctno;


    public ZeroBalanceException(double currBal, double withAmt, int acctno) {
        super();
        this.currBal = currBal;
        this.withAmt = withAmt;
        this.acctno = acctno;
    }
 

    @Override
    public String toString() {

        return "ZeroBalanceException [currBal=" + currBal + ", withAmt=" + withAmt + ", acctno=" + acctno + "]";
    }

















/*
public class InsufficientBalanceException extends Exception {

    private double currBal;
    private double withAmt;
    private int acctno;


    public InsufficientBalanceException(double currBal, double withAmt, int acctno) {
        super();
        this.currBal = currBal;
        this.withAmt = withAmt;
        this.acctno = acctno;
    }
 

    @Override
    public String toString() {

        return "InsufficientBalanceException [currBal=" + currBal + ", withAmt=" + withAmt + ", acctno=" + acctno + "]";
    }

*/



 
}