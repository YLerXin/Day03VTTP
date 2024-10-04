package first;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args){

        Monster m = new Monster();
        m.setName("kaiju");
        m.setHitPoints(100);



        System.out.println(m);

        Link link = new Link();
        link.hit(m);

        System.out.println(m);

        System.out.println("-----\n");

        Godzilla godzilla = new Godzilla();
        System.out.println(godzilla);
        link.hit(godzilla);
        System.out.println(godzilla);

        Box b = new Box();
        link.hit(b);

        // Damagable d = b;



        // LocalDateTime today = LocalDateTime.now();
        // System.out.println(today);




        
    }
}
