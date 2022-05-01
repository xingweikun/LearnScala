package test;

public class TestDataType {
    public static void main(String[] args) {
//        char b='A'+1;
//        System.out.println(b);
//        int i=100;
//        byte b=(byte)i;//截取精度
        byte b=127;
//        b++;//一元运算符 不会提升数据类型
        byte b1=(byte)(b+1);
        System.out.println(b1);//b1=-128

        // java中的基本类型没有类型的概念，有精度的概念
//        byte b=20;
//        char c='c';
//        test(b);
    }
//    public static void test(byte b){
//        System.out.println("bbbb");
//    }
//    public static void test(short s){
//        System.out.println("ssss");
//    }
//    public static void test(char c){
//        System.out.println("cccc");
//    }
//    public static void test(int i){
//        System.out.println("iiii");
//    }
}
