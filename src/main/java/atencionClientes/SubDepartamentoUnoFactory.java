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
public class SubDepartamentoUnoFactory implements EstacionDeServicioFactory {
    @Override
    public AtencionStrategy creaAtencionStrategy(){
      return new AtencionLinealStrategy();  
    }
    
    @Override
    public Recibo creaRecibo(int tiempoEstacionado){
      return new ReciboEstandar(tiempoEstacionado);
    }
    
    @Override
    public DisplayStrategy creaDisplayStrategy(){
      return new TiempoDisplayStrategy();
    }
}
