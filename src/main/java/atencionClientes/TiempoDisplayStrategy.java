/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atencionClientes;
import java.util.*;
/**
 *
 * @author Robinson
 */
public class TiempoDisplayStrategy implements DisplayStrategy{
   public int calcularSalida(int minutos){
   
   Calendar now = GregorianCalendar.getInstance();
   now.add(Calendar.MINUTE, minutos);
   int resultado =
       now.get(Calendar.HOUR_OF_DAY) * 100 + now.get(Calendar.MINUTE);
   return resultado;
   }   
}
