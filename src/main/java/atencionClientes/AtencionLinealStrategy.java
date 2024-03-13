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
public class AtencionLinealStrategy implements AtencionStrategy {
    public int CalcularTiempo(int monto){
      return monto * 2 / 5;
    }
}
