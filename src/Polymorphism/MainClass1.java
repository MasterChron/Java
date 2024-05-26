package Polymorphism;

public class MainClass1
{
    void method(int a)
    {
        System.out.println(1);
    }

    void method(int[] a)
    {
        System.out.println(2);
    }
}
class X
{
    int method(int i, int d)
    {
        return i+d;
    }

    static int method(int i, double d)
    {
        return (int)(i+d);
    }

    double method(double i, int d)
    {
        return i+d;
    }

    static double method(double i, double d)
    {
        return i+d;
    }
}
class Xx
{
    void method(int a)
    {
        System.out.println("ONE");
    }

    void method(double d)
    {
        System.out.println("TWO");
    }
}

class Y extends Xx
{
    @Override
    void method(double d)
    {
        System.out.println("THREE");
    }
}

class MainClass21
{
    public static void main(String[] args)
    {
        new Y().method(100);
    }
}
class MainClass3
{
//    double overloadedMethod1(double d)
//    {
//        return d *= d;
//    }
//
//    int overloadedMethod1(int i)
//    {
//        return overloadedMethod1(i *= i);
//    }
//
//    float overloadedMethod1(float f)
//    {
//        return overloadedMethod1(f *= f);
//    }

    public static void main(String[] args)
    {
        MainClass3 main = new MainClass3();

//        System.out.println(main.overloadedMethod1(100));
    }
}

//class X
//{
//    void calculate(int a, int b)
//    {
//        System.out.println("Class X");
//    }
//}
//
//class Y extends X
//{
//    @Override
//    void calculate(int a, int b)
//    {
//        System.out.println("Class Y");
//    }
//}
//
//class Z extends Y
//{
//    @Override
//    void calculate(int a, int b)
//    {
//        System.out.println("Class Z");
//    }
//}
//
////public class MainClass
////{
////    public static void main(String[] args)
////    {
////        X x = new Y();
////
////        x.calculate(10, 20);
////
////        Y y = (Y) x;
////
////        y.calculate(50, 100);
////
////        Z z = (Z) y;
////
////        z.calculate(100, 200);
////    }
////}
