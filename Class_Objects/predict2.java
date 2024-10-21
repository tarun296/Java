package Class_Objects;

public class predict2 {
    String name ;

    public static void main(String[] args){
        predict p1 = new predict();
        p1. name = "Ethnus";
        predict p2 = new predict();
        p2.name = "Bengaluru";
        predict p3 = p2;
        p2.name = null;
        System.out.println(p3.name);
        System.out.println(p1.name);
    }
}
