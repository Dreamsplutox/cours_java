package exercise2;

public abstract class Geometry implements Comparable<Geometry>{
    abstract double area();

    @Override
    public int compareTo(Geometry g) {
        if(this.area() > g.area()){
            return 1;
        }else if(this.area() < g.area()){
            return -1;
       }else{
            return 0;
        }
    }
}
