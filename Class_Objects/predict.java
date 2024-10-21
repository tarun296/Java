package Class_Objects;

public class predict {
    int x;
    int y;

    public static void main(String[] args){
        predict p1 = new predict();
        p1.x = 5;
        p1.y = 10;
        predict p2 = new predict();
        p2.x = 15;
        p2.y = 20;
        predict p3 = new predict();
        p3.x = p2.y;
        p3.y = p1.x;
        p1.x = p3.x;
        p1.y = p3.y;
        p2.x = p1.y;
        System.out.println(p1.x + p2.x + p3.x);
    }
}
