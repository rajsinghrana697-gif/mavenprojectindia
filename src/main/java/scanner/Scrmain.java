package scanner;

public class Scrmain {
    public int no;
    public int no1;
    public int no3;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getNo3() {
        return no3;
    }

    public void setNo3(int no3) {
        this.no3 = no3;
    }

    public int getNo1() {
        return no1;
    }

    public void setNo1(int no1) {
        this.no1 = no1;
    }
    public void swap(int a, int b){
        this.no = a+b;
        this.no1 = no-a;
        this.no3 = no-b;
        System.out.println(no1);
        System.out.println(no3);
    }
}
