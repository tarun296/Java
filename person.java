public class person {
        String name ="tharun";
        int age =21;
        String education ="Bacholer of Engineering";
        String language ="kannada";
        String natinality ="Indian"; 
    
        void personDetails(){
            System.out.println(name);
            System.out.println(age);
            System.out.println(education);
            System.out.println(language);
            System.out.println(natinality);
        }
    
        public static void main(String[] args){
            System.out.println("main method started");
            person T = new person();
            T.personDetails();
            System.out.println("main method  ended");
        }
 }
    

