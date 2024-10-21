

public class myclass2 {
    int h = 25;

    public static void main(String[] args){
        myclass2 c2 = new myclass2();
        c2.h = 15;
        myclass2 c3 = new myclass2();
        c3 = c2;
        System.out.println(c3);
        System.out.println(c2);
    }


}
