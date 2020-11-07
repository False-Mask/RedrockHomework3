package Redrock3.Level2;

public class Finish implements calculate{
    double x,y;
    char op;
    @Override
    public double Calculate(double x, char op, double y) {
        if (op=='+') return x+y;
        else if (op=='-')  return x-y;
        else if (op=='*')  return x*y;
        else if (op=='/')  return x / y;
        else return 0;
    }
}
