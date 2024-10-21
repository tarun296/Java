public class Actor {
    String name ="Darshan";
    int age =38;
    String role ="Actor";
    int numberofmovies =55;
    String movie ="Devil";
    String color ="Browm";
    String natinality ="Indian"; 

    void ActorDetails(){
        System.out.println(name);
        System.out.println(age); 
        System.out.println(role);
        System.out.println(numberofmovies);
        System.out.println(movie);
        System.out.println(color);
        System.err.println(natinality);
    }

    public static void main(String[] args){
        System.out.println("main method started");
        Actor D = new Actor();
        D.ActorDetails();
        System.out.println("main method ended");

    }

}