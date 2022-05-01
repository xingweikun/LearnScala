package test;

public class TestException {
    public static void main(String[] args) {
        //如果调用了一个为空null对象的成员属性或成员方法，会产生空指针异常
        Userx user = null;
        test(user.age);
    }

    public static void test(int age) {
        System.out.println(age);
    }
}

class Userx {
    public Integer age;
}
