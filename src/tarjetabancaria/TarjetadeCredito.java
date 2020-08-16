/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarjetabancaria;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ANDREA_NOVA
 */
public class TarjetadeCredito extends TarjetaBancaria {
    Random aleatori = new Random();
    int T9, T10,T11,T12,T13,T14,T15,T16;
    float tasa;
    int opc1,opc2;
    String tipo;
    double Limite;
    double disponibilidad;
    String Nombre; 
    float Credito;
    float deuda;
    float Numero;
public TarjetadeCredito (int T1, int T2, int T3, int T4, int T5, int T6, int T7, int T8,int tasa,double disponibilidad){
    super(T1, T2, T3, T4, T5, T6, T7, T8);
    this.limite=1000;
    this.tipo= "Credito";
    this.tasa=(float) 0.05;
}
public void SetNombre (String Nombre){
    System.out.println("Ingrese nombre completo:");
    Nombre=input.nextLine();
}
public void SetNumero(String Numero){
    System.out.println("ingrese los ultimos 8 digitos de su tarjeta: ");
    Numero = input.nextLine();
}
public void SetSaldo (float saldo){
    System.out.println("Ingrese la deuda actual de la tarjeta");
    Saldo=input.nextFloat ();
    System.out.println("continue con la compra, deuda verificada");
}
public void compracredito(){
System.out.println("Inicializando modulo de compra: ");
System.out.println("Inicializando modulo de compra: ");
}
public void visual(){
    System.out.println("*LIMITE DE CREDITO: "+limite);
    System.out.println("*NOMBRE DE LA TARJETA: "+nombre);
    System.out.println("*SALDO ACTUAL: "+disponibilidad);  
    System.out.println("*NUMERO DE LA TARJETA "+T1+T2+T3+T4+"-"+T5+T6+T7+T8+"-"+T9+T10+T11+T12+"-"+T13+T14+T15+T16);
    System.out.println("Nombre completo"+Nombre);
    System.out.println("No. de tarjeta"+Numero);
    System.out.println("Limite de credito de la tarjeta"+limite);
    System.out.println("Saldo total de la tarjeta"+deuda); 
    }
}
   

