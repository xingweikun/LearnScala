package test;

public class Testnum {
    public static void main(String[] args) {
        System.out.println(num(5));
    }
    public static String num(int n){
        if(n>=5&&n<=10){// && || !
            return ("num in [5,10]");
        }else{
            return ("i don't know");
        }
    }
}
