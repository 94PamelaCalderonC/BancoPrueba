/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Clases.CuentaAhorro;
import Clases.CuentaBancariaAbstracta;
import Clases.CuentaCorriente;
import Clases.CuentaAhorroJoven;

/**
 *
 * @author I7
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       CuentaAhorro cuentaAho= new CuentaAhorro();
        cuentaAho.setNombre("Pamela");
        cuentaAho.setApellido("Calderon");
        cuentaAho.setClienteid(00506242);
        cuentaAho.setTipocuenta("Cuenta de ahorros");
        cuentaAho.setEstado("Activo");
        
        CuentaCorriente CuentaCo= new CuentaCorriente();
        CuentaCo.setNombre("Luis");
        CuentaCo.setApellido("Rodriguez");
        CuentaCo.setClienteid(1234987544);
        CuentaCo.setTipocuenta("Cuenta corriente");
        CuentaCo.setSaldo(789.56);
         
        CuentaAhorroJoven Cuentajo= new CuentaAhorroJoven();
        Cuentajo.setNombre("Maria");
        Cuentajo.setApellido("Pin");
        Cuentajo.setMedad(14);
        Cuentajo.setClienteid(0450);
        Cuentajo.setTipocuenta("Cuenta de ahorros joven");
        Cuentajo.setEstado("inactiva");
        
       List<CuentaBancariaAbstracta> cuentabancarias = new ArrayList<CuentaBancariaAbstracta>();
       cuentabancarias.add(cuentaAho);
       cuentabancarias.add(CuentaCo);
       cuentabancarias.add(Cuentajo);
        
       cuentabancarias.forEach((persona) -> {
            persona.mostrar();
        });
        
        Scanner s = new Scanner(System.in);
        s.nextLine();
       
    } 
    
}