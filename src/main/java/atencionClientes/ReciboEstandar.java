/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atencionClientes;
import java.io.*;
import java.util.*;
/**
 *
 * @author Us
 */
public class ReciboEstandar implements Recibo{
    private int valor;
    private boolean conCodigoBarra;

    public ReciboEstandar(int valor, boolean conCodigoBarra) {
        this.valor = valor;
        this.conCodigoBarra = conCodigoBarra;
    }

    public ReciboEstandar(int valor) {
        this(valor, false);
    }
    public int valor() {return valor;}
    public void imprime(PrintStream stream){
        String mensaje = ""+valor;
        if(mensaje.length()== 1){ mensaje = "00"+mensaje;}
        if(mensaje.length()== 2){ mensaje = "0"+mensaje;}
        Calendar now = GregorianCalendar.getInstance();
        String hora= ""+now.get(Calendar.HOUR_OF_DAY);
        if(hora.length()== 1){ hora = "0"+hora;}
        String min= ""+now.get(Calendar.MINUTE);
        if(min.length()== 1){ min = "0"+min;}
        String nowstring = hora+":"+min;
        
        stream.println("---------------------------------------------");
        stream.println("-----------  RECIBO  ELECTRONICO  -----------");
        stream.println("           Valor "+mensaje+" minutos.");
        stream.println("           Auto estacionado desde "+nowstring);
        if(conCodigoBarra) {
           stream.println("||  ||||| |  || ||| || ||  ||| |  ||  |||| |  ||");
        }
        stream.println("------------------------------------------------");
    }
}
