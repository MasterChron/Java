package level1.constructors;

public class Box {

    Box(int w, int h, int d){
        width = w;
        height = h;
        depth = d;
    }

    Box(int w, int h) {
        width = w;
        height = h;
        depth = w+h;
    }
    double width;
    double height;
    double depth;

    double volume() {
        return width * height * depth;
    }

    void setDimesnsions(double w,double h, double d){
        width = w;
        depth = d;
        height = h;
    }
}

    class boxDriver {
        public static void main(String[] args) {
            Box mybox1 = new Box(10,10,10);
            Box mybox2 = new Box(1,10,10);
            Box mybox3 = new Box(1,1,10);

//            mybox1.width = 10;
//            mybox1.height = 10;
//            mybox1.depth = 10;
//
//            mybox2.width = 1;
//            mybox2.height = 10;
//            mybox2.depth = 10;
//
//            mybox3.setDimesnsions(1,2,3);

            double vol1 = mybox1.volume();
            double vol2 = mybox2.volume();
            double vol3 = mybox3.volume();
            System.out.println(vol1);
            System.out.println(vol2);
            System.out.println(vol3);
        }
    }
