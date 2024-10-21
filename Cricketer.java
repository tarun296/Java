class Cricketer{
    String name ="Dhoni";
    int age =42;
    String role ="Wicket Keeper";
    String color ="Browm";
    String natinality ="Indian"; 

    void CricketerDetails(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(role);
        System.out.println(color);
        System.out.println(natinality);
    }//end of cricketrdetails method

    public static void main(String[] args){
        System.out.println("main method started");
        Cricketer C = new Cricketer();
        C.CricketerDetails();
        System.out.println("main method  ended");
    }
 }
