package exercise2;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args){
        ArrayList<Geometry> my_list = new ArrayList<Geometry>();

        my_list.add(new Rectangle(10,20));
        my_list.add(new Square(11));
        my_list.add(new Ellipsis(15,25));
        my_list.add(new Circle(10,20));
        my_list.add(new Sphere(15));
        my_list.add(new Cylinder(10, 50));

        my_list.add(new Rectangle(5,10));
        my_list.add(new Square(6));
        my_list.add(new Ellipsis(7,12));
        my_list.add(new Circle(5,10));
        my_list.add(new Sphere(7));
        my_list.add(new Cylinder(5, 25));

        my_list.sort((GeoA, GeoB) -> GeoA.compareTo(GeoB));
        my_list.stream().forEach((i) -> System.out.println("figure : " + i.toString() +" and area : "+ i.area()) );

    }
}
