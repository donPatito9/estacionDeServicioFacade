/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import atencionClientes.EstacionDeServicio;
import atencionClientes.EstacionDeServicioFactory;
import atencionClientes.EstacionDeServicioImpl;
import atencionClientes.Recibo;
import atencionClientes.SubDepartamentoDosFactory;
import atencionClientes.SubDepartamentoTresFactory;
import atencionClientes.SubDepartamentoUnoFactory;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

//import softcollection.lcd.*;
/**
 *
 * @author Robinson Concha
 */
public class EstacionDeServicioFacade extends JFrame{
    
    public static void main(String[] args) {
        // TODO code application logic here
        try{
           UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch(Exception e){}
        new EstacionDeServicioFacade();
        }
    
        
        EstacionDeServicio estacionDeServicio;
        
        public EstacionDeServicioFacade(){
          super("EstacionDeServicio Facade");
          estacionDeServicio = new EstacionDeServicioImpl(new SubDepartamentoDosFactory());
          JFrame.setDefaultLookAndFeelDecorated(true);
          setLocation(100, 20);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          Container cpane = getContentPane();
          cpane.setLayout(new BorderLayout());
       
        }
        
     private JMenuBar createAllMenus(){
       JMenuBar menuBar;
       JMenu menu, submenu;
       JMenuItem menuItem;
       menuBar = new JMenuBar();
       menu = new JMenu("Variant Selection");
       
       menu.getAccessibleContext().
               setAccessibleDescription("Select pay station variante here.");
       menuBar.add(menu);
       menuItem = makeTownMenuItem("Departamento1", new SubDepartamentoUnoFactory());
       menu.add(menuItem);
       menuItem = makeTownMenuItem("Departamento2", new SubDepartamentoDosFactory());
       menu.add(menuItem);
       menuItem = makeTownMenuItem("departamento3", new SubDepartamentoTresFactory());
       menu.add(menuItem);
       addMoreProductVariants(menu);
       return menuBar;
     }
     
     protected void addMoreProductVariants(JMenu menu){}
     
     protected JMenuItem makeTownMenuItem(final String name,
                                          final EstacionDeServicioFactory factory){
        JMenuItem menuItem;
        menuItem = new JMenuItem(name);
        menuItem.getAccessibleContext().
                setAccessibleDescription("Reconfig to basic "+name+" behavior.");
        menuItem.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
              estacionDeServicio = new EstacionDeServicioImpl(factory);
              updateDisplay();
            }

            private void updateDisplay() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        return menuItem;
     }
   }
                
                
                
        
                
                


                


