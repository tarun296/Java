public class Subclass {
    int[] arrmethod(int[] arr){
        return arr;
    }
    public static void main(String[] args){
        int a[] = {1, 12, 13, 14, 15};//1st array                                                                                                                                                                                                                                                                
        Subclass S1 = new Subclass();
        int[] b = S1.arrmethod(a);// 2nd array
        for (int i=0; i<b.length; i++){
            System.out.println(b[i]);
        }
    }
}