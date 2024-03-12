package other;
import java.util.Scanner;


public class Ladder {

    public Ladder() {
        // TODO Auto-generated constructor stub
    }
    
   /* public static int calculate(double h,double v) {
        
        return (int) Math.ceil(((h/Math.sin(Math.toRadians(v)))));
        
    }
    */
    
    public static void main(String []args) {
        
        double h,v=0;
        
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        Scanner s_2 = new Scanner(input);
        h=s_2.nextDouble();
        v=s_2.nextDouble();
        System.out.println((int)(Math.ceil(h/(Math.sin(v*Math.PI/180)))));

        s.close();
        s_2.close();
        
    }
}
