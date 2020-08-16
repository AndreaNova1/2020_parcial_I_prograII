/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarjetabancaria;
        

import java.util.Random;
import java.util.Scanner;
public class Tarjeta extends TarjetaBancaria{
    Random aleatori = new Random();
   
    int T9, T10,T11,T12,T13,T14,T15,T16,T3,T5 ;
     
   Double limite3,salactual,limite4,interes,metodo3,metodo4;
   String nom; 
 
  
  
    public Tarjeta(int T1, int T2, int T3, int T4, int T5, int T6, int T7, int T8, double limite) {
        super(T1, T2, T3, T4, T5, T6, T7, T8);

    this.limite=limite;
    }
        public void getdatodedito(){
         Scanner informacion= new Scanner(System.in);
        System.out.println("\n**********************INGRESO DE DATOS**********************");
       System.out.println("*INGRESA EL NOMBRE DE LA TARJETA");
       nom=informacion.nextLine();
             
        System.out.println("*INGRESA EL SALDO ACTUAL");
       salactual=informacion.nextDouble();
            
    
        }
         public void mensajedatosdebito(){
             this.T9=aleatori.nextInt(9);this.T10=aleatori.nextInt(9);this.T11=aleatori.nextInt(9);
             this.T12=aleatori.nextInt(9);this.T13=aleatori.nextInt(9);this.T16=aleatori.nextInt(9);
             this.T15=aleatori.nextInt(9);this.T16=aleatori.nextInt(9);
        System.out.println("\n**********************DATOS DE LA TARJETA DE DEBITO**********************");
     System.out.println("*LIMITE DE SALDO: "+limite3);
        System.out.println("*NOMBRE DE LA TARJETA: "+nom);
    System.out.println("*SALDO ACTUAL: "+salactual);
    System.out.println("*NUMERO DE LA TARJETA "+T1+T2+T3+T4+"-"+T5+T6+T7+T8+"-"+T9+T10+T11+T12+"-"+T13+T14+T15+T16);
    
    }public void metododepositar(){
         Scanner informacion= new Scanner(System.in);  
        System.out.println("\n*DESEAS DEPOSITAR A TU TARJETA");
    System.out.println("*1. YES");
    System.out.println("*2. NO");
    opc3=informacion.nextInt();
    switch(opc3){
        case 1:    System.out.println("\n*CUANTO ES TU DEPOSITO");
        metodo3=informacion.nextDouble();
        System.out.println("\n**********************DATOS DE LA TARJETA DE DEBITO**********************");
       
      System.out.println("*LIMITE DE SALDO: "+limite3); 
    System.out.println("*NOMBRE DE LA TARJETA: "+nom);
    
     
    System.out.println("*NUMERO DE LA TARJETA "+T1+T2+T3+T4+"-"+T5+T6+T7+T8+"-"+T9+T10+T11+T12+"-"+T13+T14+T15+T16);
    System.out.println("*TU DEPOSITO FUE: "+metodo3);
    salactual=salactual+metodo3;
    System.out.println("*SALDO ACTUAL: "+salactual);
    break;
        case 2:
            System.out.println("\n*ESCOGIO NO  "); break;
        default:
            System.out.println("\n*ELIJA LAS OPCIONES DEL MENU  "); 
            metododepositar();break;
    }
 }