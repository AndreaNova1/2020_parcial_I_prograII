/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarjetabancaria;

import java.util.Scanner;
/**
 *
 * @author ANDREA_NOVA
 */  
    public static void main(String[] args) {
 Scanner informacion= new Scanner(System.in);
 int opciones;
   do{ 
 System.out.println("MENU DE LA TARJETA: ");
       System.out.println("TARJETA DE CREDITO: ");
              System.out.println("TARJETA DE DEBITO: ");
System.out.println("*SALIR");
System.out.println("\n* Que desea realizar: ");
       opciones=informacion.nextInt();
   switch(opciones){
       case 1: TarjetaCredito tar= new TarjetaCredito (0,6,0,1,2,0,1,9,5,10000.00);
        tar.getdatoscredito();
        tar.mensajedatoscredito();
        tar.metodocomprar();
        tar.metodopagar();
        break; 
       case 2:Tarjetadebi tarj= new Tarjetadebi(0,9,0,9,2,0,2,0,5000.00);
        tarj.getdatodedito();
        tarj.mensajedatosdebito();
        tarj.metododepositar();
        tarj.metodocomprar();
       case 3: System.out.println("SALIENDO");
        break;
   default:
   System.out.println("\n*Elija la opcion a realizar:  "); 
        }
    }   while(opciones!=3);
}
      