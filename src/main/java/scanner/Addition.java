package scanner;
public class Addition {
    public int no;
    public int no1;
    public int no2;
    public int no3;

    public int getNo3() {
        return no3;
    }

    public void setNo3(int no3) {
        this.no3 = no3;
    }

    public int getNo2() {
        return no2;
    }

    public void setNo2(int no2) {
        this.no2 = no2;
    }

    public int getNo1() {
        return no1;
    }

    public void setNo1(int no1) {
        this.no1 = no1;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void sum(int a, int b, int c) {
        this.no=a;
        this.no1=b;
        this.no2=c;
        this.no3=a+b+c;
        System.out.println(no3);




    }

    public void sum(int w, int x, int y, int z) {
    }
}
