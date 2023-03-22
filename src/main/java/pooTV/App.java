package pooTV;

public class App {
   

    public static void main(String[] args) {
        Tv tv = new Tv();
        System.out.println(tv.toString());
        tv.setCanal(71);
        
        System.out.println(tv.toString());
        tv.aumentarVolume();
        
        System.out.print(tv.toString());
        tv.diminuirVolume();
        
        System.out.println(tv.toString());
    }
}
