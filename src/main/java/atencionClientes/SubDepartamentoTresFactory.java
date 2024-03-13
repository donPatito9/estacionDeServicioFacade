/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atencionClientes;

/**
 *
 * @author Us
 */
public class SubDepartamentoTresFactory implements EstacionDeServicioFactory {
  
    public AtencionStrategy creaAtencionStrategy(){
      return new AtencionAlternativaStrategy(new AtencionLinealStrategy(),
                                           new AtencionProgresivaStrategy(),
                                           new DecisionRelojStrategy());  
    }
    
    public Recibo creaRecibo(int tiempoEstacionado){
      return new ReciboEstandar(tiempoEstacionado);
    }
    
    public DisplayStrategy creaDisplayStrategy(){
      return new ValorDisplayStrategy();
    
       
}
}
