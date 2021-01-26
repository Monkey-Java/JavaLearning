package learn.type;

public class IntLearning {
    public static void main(String[] args) {
        test();
    }

    private static void test() {
        Integer integer1 = 1;
        Integer integer2 = 1;
        System.out.print(integer1 == integer2);
        integer1 = 128;
        integer2 = 128;
        System.out.print(integer1 == integer2);
    }
}
