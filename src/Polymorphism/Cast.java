package Polymorphism;

public class Cast {
}

class XxX
{
    void calculate(int a, int b)
    {
        System.out.println("Class X");
    }
}

class Yy extends XxX
{
    @Override
    void calculate(int a, int b)
    {
        System.out.println("Class Y");
    }
}

class Z extends Yy
{
    @Override
    void calculate(int a, int b)
    {
        System.out.println("Class Z");
    }
}

class MainClass6
{
    public static void main(String[] args)
    {
        Yy x = new Yy();

        x.calculate(10, 20);

        Yy y = x;

        y.calculate(50, 100);

        Z z = (Z) y;

        z.calculate(100, 200);
    }
}

