import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) {
//        String name1 = "A";
//        String name2 = "A";
//        String name3 = new String(name1);
//        String name4 = new String("A");
//
//        System.out.println(name1 == name2);
//        System.out.println(name1 == name3);
//        System.out.println(name1 == name4);
//        System.out.println(name1 == "A");

//        int[] scores = {1,2,3,4};
//        for (int a : scores) {
//            System.out.println(a);
//        }
//        Vector v1 = new Vector(2,3);
//        Vector v2 = new Vector(2,5);
//        Cal.add(v1, v2);
//        int b = 10;
//        Cal.add(b);
//        System.out.println(b);
//    }
//
//    public class Cal {
//        public static void add(int a) {
//            a += 10;
//        }
//        Car sedan = new Car(carType.CAR1, 50);
//        Passenger man1 = new Passenger("cornan", 70);
//        sedan.addFuel(50);
//        sedan.driveCar(man1, 30);
        Flower flower = new Flower();
        Boon boon = new Boon();
        boon.fillWater(50);

        for (int i=0;i<3;i++) boon.shootWater(flower);
        flower.spendDay();

        boon.shootWater(flower);
        flower.spendDay();

        for (int i=0;i<3;i++) boon.shootWater(flower);
        flower.spendDay();
    }
    enum carType {
        CAR1,
        CAR2,
        CAR3
    }
}

