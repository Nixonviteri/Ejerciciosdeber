/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class ejerciciosdeber {
    public static void ejercicio1(){
        
            for(int i=1;i<=100;i++){
            if(i%5==0&&i%25==0){
                System.out.println(i+",");
            }
            }
              
           for(int i=1;i<=100;i++){
               
            if(i%75==0){
                System.out.println("\n"+i+",");
            }
        }

        
    }
        
    public static void ejercicio2(){
        int total=0;
        for(int i=0;i<=5;i++){
            total+=2;
        }
         System.out.println(total+"");
    }
    
    public static void ejercicio3(){
        int[] primes= {1,3,6};
        int sum=0;
        for(int t:primes){
            sum+=t;
            
        }
        
        System.out.println(sum++);
        
    }
    
    public static void ejercicio4(){
        for(int i =1;i<6;i+=2){
            for(int j=0; j<3;j++){
                if(i+j>4){
                    break;
                                      
                }
                
                System.out.println(i*j);
            }
        }
       
        
    }
    
    public static void ejercicio5(){
        int x=0;
        do{
            System.out.println(x+"");
            x++;
           
        }while(x>0);
         
    }
    
    public static void ejercicio6(){
        int[] n={0,1,0,-1};
        for(int i =1;i<n.length;i++){
            if(n[i]==0&&n[i-1]!=0){
                int x=n[i-1];
                n[i-1]=n[i];
                n[i]=x;
                System.out.println(n[2]);
        
            }
            
        }
    }
    public static void menu(){
       int op;
        do {   
            
            op=Integer.parseInt(JOptionPane.showInputDialog("ingrese la opcion que quiere observar : \n "
                    + "1.- Ejercicio 1\n"
                    + "2.- Ejercicio 2\n"
                    + "3.- Ejercicio 3\n"
                    + "4.- Ejercicio 4\n"
                    + "5.- Ejercicio 5\n"
                    + "6.- Ejercicio 6\n"
                    + "7.- Salir"));
            switch(op){
                case 1:
                    ejercicio1();
                    
                    break;
                case 2: 
                    ejercicio2();
                    
                    break;
                 
                case 4:
                    ejercicio4();
                    
                    break;
                    
                case 5:
                    ejercicio5();
                    
                    break;
                    
                case 6:
                    ejercicio6();
                    
                    break;
            }
        } while (op!=7);
    }
}

    

