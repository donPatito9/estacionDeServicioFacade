/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atencionClientes;
import java.util.*;
/*
 *
 * @author Robinson
 */
public class DecisionRelojStrategy implements DecisionFinSemanaStrategy{

    DecisionRelojStrategy() {
 
    }
    public boolean isFinSemana(){
    Date d = new Date();
    Calendar c = new GregorianCalendar();
    c.setTime(d);
    int diaDeSemana = c.get(Calendar.DAY_OF_WEEK);
    return(diaDeSemana == Calendar.SATURDAY || diaDeSemana == Calendar.SUNDAY);
    }
    
}

