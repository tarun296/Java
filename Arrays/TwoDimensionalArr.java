public class TwoDimensionalArr {
    public static void main(String[] args){
        String[][] names = {{"Tarun naik"}, {"manoj kumar"}, {"Manoj kori"}};

        for(int i=0; i<names.length; i++){
            for(int j=0; j<names[i].length; j++){
                System.out.print(names[i][j] + " ");
            }
            System.out.println();
        }
    }
}