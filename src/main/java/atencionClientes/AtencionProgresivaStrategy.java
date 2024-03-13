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
public class AtencionProgresivaStrategy implements AtencionStrategy{
    public int CalcularTiempo(int monto){
      int tiempo = 0;
        if(monto >= 150+200){
            monto -=350;
            tiempo = 120 + monto / 5;
        }else if (monto >= 150){
          monto -= 150;
          tiempo = 60 + monto * 3 / 10;
        }else{
           tiempo = monto * 2 / 5;
        
        }
         return tiempo;
    }
}
