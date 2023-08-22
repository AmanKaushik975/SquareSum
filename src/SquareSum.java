public class SquareSum {
    private double num1;
    private double num2;

    private double num3;

    public SquareSum(int num1, int num2,  int num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public double SqSum(){
        return  num1*num1 + num2* num2 + num3*num3;

    }


}
