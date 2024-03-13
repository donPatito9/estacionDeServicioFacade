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
public class EstacionDeServicioImpl implements EstacionDeServicio{
    private int insertadas;
    private int tiempoComprado;
    private AtencionStrategy atencionStrategy;
    private DisplayStrategy displayStrategy;
    private EstacionDeServicioFactory factory;
    
    public EstacionDeServicioImpl(EstacionDeServicioFactory factory){
    this.factory = factory;
    this.atencionStrategy = factory.creaAtencionStrategy();
    this.displayStrategy = factory.creaDisplayStrategy();
    reset();
    }
    public void agregarPago(int moneda){
            //throws MonedaNoPermitidaException{
            switch (moneda){
            case  5: break;
            case 10: break;
            case 25: break;
            default:
               //throw new MonedaNoPermitidaException("Moneda Invalida: "+moneda);
            }
            insertadas += moneda;
            tiempoComprado = atencionStrategy.CalcularTiempo(insertadas);
        }
        
    public int leeDisplay(){
        return displayStrategy.calcularSalida(tiempoComprado);
    }
    
    public Recibo compra(){
        Recibo r = factory.creaRecibo(tiempoComprado);
        reset();
        return r;    
    }
    
    public void cancela(){
        reset();
    }
     
    private void reset(){
       tiempoComprado = insertadas = 0;
    }
    
}