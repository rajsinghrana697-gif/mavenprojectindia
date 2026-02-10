package ranaa.raja;

public class Floatlab {
    public float num1;
    public float num2;;
    public float sum;

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public float getSum() {
        return sum;
    }

    public void setSum(float sum) {
        this.sum = sum;
    }

    public float sum (float a, float b){
        this.num1= a;
        this.num2 = b;
        this.sum = num1 + num2;
        return sum;


    }
}

