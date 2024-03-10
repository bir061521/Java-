package _06oop;

public class Car {
    String color;
    String gearType;
    int door;

    Car(){}

    Car(String c, String g, int d){
        color = c;
        gearType = g;
        door =d;
    }
}

class carTest{
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "while";
        c1.gearType = "auto";
        c1.door = 4;

        Car c2 = new Car("while","auto",4);
        System.out.println("C1= " +c1.color + c1.gearType + c1.door);
        System.out.println("C2= " +c2.color + c2.gearType + c2.door);

    }
}