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
public interface EstacionDeServicioFactory {
  public AtencionStrategy creaAtencionStrategy();
  public Recibo creaRecibo (int tiempoEstacionado);
  public DisplayStrategy creaDisplayStrategy();
}
