import java.text.SimpleDateFormat;
import java.util.Date;

public class Mensagem {
    public static void mensagem(int hora){

        if(hora > 6){
            System.out.print("Bom dia!");
        }
        else if (hora > 12) {
            System.out.print("Boa tarde!");
        }
        else if (hora > 18) {
            System.out.print("Boa noite!");
        }
    }
}
