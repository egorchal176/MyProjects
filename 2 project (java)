import java.util.Random;
import java.util.Scanner;

class Main{
    private final String sl = "qwertyuiopasdfghjklzxcvbnm"
            + "1234567890!*"
            + "QWERTYUIOPASDFGHJKLZXCVBNM";
    private final Random random = new Random();
    private final Scanner in = new Scanner(System.in);

    void main(){
        System.out.print("enter password length\t");
        int lenPas = in.nextInt();
        if(lenPas > 0){
            System.out.println(choose(lenPas));
        }else{
            System.out.println("eror");
        }
    }

    String choose(int lenPas){
        String newPas = "";
        for(int i = 0; i<lenPas; i++){
            newPas += sl.charAt(random.nextInt(sl.length()));
        }
        return newPas;
    }
}
