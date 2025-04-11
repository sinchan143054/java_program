package java_program;
public class static_local {
    int a=10;
    static  int b=20;
    public static void main(String[] args) {
        static_local obj1=new static_local();
        obj1.method1();
        System.out.println("Value of a is "+obj1.a);
        System.out.println("value of b is"+b);
}
public void method1(){
int d=50;
float f=1.1f;
System.out.println("value of d is "+d);
System.out.println("value of f is"+f);
System.out.println(a);
}}
