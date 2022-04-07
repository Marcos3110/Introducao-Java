package if_else.Lista_2;
import java.util.Scanner;
public class Atividade_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //DecimalFormat df = new DecimalFormat("R$ ######0.00");
        
        
        /*
        23.800 dias de vida
        23.800 / 365 = 65 anos
        75 dias / 30 = 2 meses
        15 dias
        
        11680 dias
        11.680 / 365 = 32 anos
        0 dias / 30 = 0 meses
        0 dias
        */
        
        //Entradas
        System.out.println("Informe dias de vida");
        int dias = s.nextInt(); //23800
        
        int anos = 0;
        int meses = 0;
        
        if (dias >= 365){
        anos = dias / 365;
        }
        
        int resto = dias % 365;
        if (resto >= 30)
        meses = resto / 30;
        
        dias = resto % 30;
        
        /*
        //anos > 0 e meses > 0 e dias > 0
        if (anos > 0 && meses > 0 && dias > 0)
        System.out.println("Vc tem " + anos + " anos, " + meses + " meses e " + dias + " dias");
        else
        //anos > 0 e meses = 0 e dias > 0
        if (anos > 0 && meses == 0 && dias > 0)
        System.out.println("Vc tem " + anos + " anos e " + dias + " dias");
        else
        //anos > 0 e meses > 0 e dias = 0
        if (anos > 0 && meses > 0 && dias == 0)
        System.out.println("Vc tem " + anos + " anos e " + meses + " meses");
        else
        //anos > 0 e meses = 0 e dias = 0
        if (anos > 0 && meses == 0 && dias == 0)
        System.out.println("Vc tem " + anos + " anos");
        else
        //anos = 0 e meses > 0 e dias > 0
        if (anos == 0 && meses > 0 && dias > 0)
        System.out.println("Vc tem " + meses + " meses e " + dias + " dias");
        else
        //anos = 0 e meses = 0 e dias > 0
        if (anos == 0 && meses == 0 && dias > 0)
        System.out.println("Vc tem " + dias + " dias");
        else
        //anos = 0 e meses > 0 e dias = 0
        if (anos == 0 && meses > 0 && dias == 0)
        System.out.println("Vc tem " + meses);
        else
        //anos = 0 e meses = 0 e dias = 0
        if (anos == 0 && meses == 0 && dias == 0)
        System.out.println("Vc nem nasceu ainda louco. ");
        
        */
        
        String msg = "Vc tem ";
        if (anos > 0)
        msg += anos + " anos ";
        
        if (meses > 0)
        msg += meses + " meses ";
        
        if (dias > 0)
        msg += dias + " dias ";
        
        if (msg.equalsIgnoreCase("Vc tem "))
        System.out.println("Vc nem nasceu ainda louco. ");
        else
        System.out.println(msg);
        
        
        System.out.println("Fim");
        }
}
