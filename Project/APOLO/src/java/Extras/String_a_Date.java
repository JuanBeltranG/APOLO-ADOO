package Extras;

import java.sql.Date;

public class String_a_Date {
    public Date covertir(String texto){
        int ano=Integer.parseInt(texto.substring(0,4));
        int mes=Integer.parseInt(texto.substring(5,7));
        int dia=Integer.parseInt(texto.substring(8));
        Date fecha=new Date((ano-1900),(mes-1),dia);
        return fecha;
    }
}