package test;

public class TestOper {
    public static void main(String[] args) {
        String s1=new String("abc");
        String s2=new String("abc");
        System.out.println(s1==s2);//false
        System.out.println(s1.equals(s2));//true

        //100=>int=>自动装箱(Integer.valueOf)=>Integer
        Integer i1=100;
        Integer i2=100;
        System.out.println(i1==i2);//true

    }
}
