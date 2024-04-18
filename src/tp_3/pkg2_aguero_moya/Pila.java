
package tp_3.pkg2_aguero_moya;

import java.util.Scanner;
import java.util.Stack;


public class Pila {
    private int n;
    private int [] pila;
    private int tope;
    private Scanner Leer=new Scanner(System.in);
    private Stack<Integer> pila1;
    private Stack<Integer> pila2;
    private Stack<Integer> pilaFinal;
    
    public Pila(){
        pila1=new Stack<>();
        pila2=new Stack<>();
        pilaFinal=new Stack<>();
        pila = new int [n];
    }  

    public int getN() {
        return n;
    }

    public int[] getPila() {
        return pila;
    }

    public int getTope() {
        return tope;
    }

   public void push(int x){
       if (tope< n-1){
           tope++;
           pila[tope]=x;
           
       }else{
           System.out.println("estructura completa, no se puede insertar");
           
       }
       
   }
   public void pop (int x){
       if(tope>=0){
           tope--;
           
       }else{
           System.out.println("La estructura está vacía");
       }
   }
   public boolean pilaVacia(){
        return tope == -1;
    }
   public boolean pilaLlena(){
        return tope==n-1;
    }
   public int verElemento(){
        return pila[tope];
    }
    
    public void unirPilas (Stack<Integer> pilaOriginal, Stack<Integer> pilaAux, Stack<Integer> pilaFinal){
        
    while(!pila1.isEmpty()&&!pila2.isEmpty()){
        int topeP1=pila1.pop();
        int topeP2=pila2.pop();
        if(topeP1>=topeP2){
            pilaFinal.push(topeP1);
            pila2.push(topeP2);
            
        }else{
            pilaFinal.push(topeP2);
            pila1.push(topeP1);
        }
    } 
    }
} 
