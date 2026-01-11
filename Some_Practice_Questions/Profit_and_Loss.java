import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int s = sc.nextInt();

        if(s > b) System.out.println("Profit");
         else if(s < b) System.out.println("Loss");
         else System.out.println("No Profit No Loss");
    }
}