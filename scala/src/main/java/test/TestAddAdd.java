package test;

public class TestAddAdd {
    public static void main(String[] args) {
//        int i=0;
//        int j=i++;
//        System.out.println("i="+i);//i=1
//        System.out.println("j="+j);//j=0

//        int i=0;
//        i=i++;
//        System.out.println("i="+i);//i=0

        //阶乘5!=5*4*3*2*1
        int result=test(5);
        System.out.println(result);
    }
    public static int test(int num){
        if(num<=1){
            return 1;
        }
        else{
            return num*test(num-1);
        }
    }
}
