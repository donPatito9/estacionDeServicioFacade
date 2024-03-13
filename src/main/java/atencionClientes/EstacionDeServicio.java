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
public interface EstacionDeServicio {
   public void agregarPago(int moneda); 
   public int leeDisplay();
   public Recibo compra();
   public void cancela();


}
