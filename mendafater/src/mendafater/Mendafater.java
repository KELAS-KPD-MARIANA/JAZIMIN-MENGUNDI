
package mendafater;
import java.util.Scanner;
public class Mendafater {

   
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int umur;
        
        System.out.println("Berapakah umur anda : ");
        umur = input.nextInt();
        
        boolean status;
        
        System.out.println("Adakah anda mendaftar (true/false)? : ");
        status = input.nextBoolean();
        
        if (umur < 18){
        System.out.println("Anda terlalu muda untuk mengundi");
        } 
        else if (umur >=18 && status == false){
        System.out.println("Anda perlu mendafter dahulu sebelum mengundi");
        } 
        else if (umur >= 18 && status == true){
        System.out.println("Anda layak mengundi");
        }
    }
    
}
