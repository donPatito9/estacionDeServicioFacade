/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atencionClientes;
import java.util.*;
/**
 *
 * @author Us
 */
public class AtencionAlternativaStrategy implements AtencionStrategy {
  private AtencionStrategy  finSemanaStrategy, diaSemanaStrategy, estadoActual;
  private DecisionFinSemanaStrategy decisionStrategy;
  
  public AtencionAlternativaStrategy(AtencionStrategy diaSemanaStrategy,
                                   AtencionStrategy finSemanaStrategy,
                                   DecisionFinSemanaStrategy decisionStrategy){
    this.diaSemanaStrategy = diaSemanaStrategy;
    this.finSemanaStrategy = finSemanaStrategy;
    this.estadoActual = null;
    this.decisionStrategy = decisionStrategy;
  }
  
  public int CalcularTiempo(int monto){
    if(decisionStrategy.isFinSemana()) {
       estadoActual = finSemanaStrategy;
    }else{
       estadoActual = diaSemanaStrategy;
    }
    return estadoActual.CalcularTiempo(monto);
   
  }
}
