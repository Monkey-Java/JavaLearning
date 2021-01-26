package learn.type;

public class ByteTest {
    public static void main(String[] args) {
        test1();
    }

    // 溢出策略，注意由于Java采用补码表示和运算数据，在进行运算的时候需要把原码转化成补码，运算完后再把
    private static void test1() {
        byte b = (byte) 128;
        System.out.print(b);
        b = (byte) -129;
        System.out.print(b);


    }

    private static void test2(){
        byte a = 1;
        byte b = 1;
        byte c = (byte) (a*b);
    }
}
