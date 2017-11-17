package ec.edu.ister.modelo;

import javax.swing.JOptionPane;

/**
  * @Instituto Rumiñahui
 *  Ayo Esteban
 * 3ºsistemas
 * Ing. Solis Santiago
 */
public class EjerciciosDeber {
    public static void ejercicio1(){
       
        //1
        for (int i = 1; i <= 100; i++) 
          if(i%5==0&&i%25==0)
                System.out.print(i+",");
        //2
        for (int i = 1; i <= 100; i++) 
        if  (i%75==0)
                System.out.print(i+","+"\n");
        
        
    }
    public static void ejercicio2(){
        
        int[]primes={1,3,6};
        int sum=0;
        for(int t:primes){
            sum+=t;
        }
        System.out.print(sum++ +"\n");
    }
    public static void ejercicio3(){
        
        for (int i = 1; i < 6; i+=2) {
            for (int j = 0; j < 3; j++) {
                if(i+j>4)
                    break;
                System.out.print(i*j+"\n");
            }
        }
    }
    public static void ejercicio4(){
       
        int[]n={0,1,0,-1};
        for (int i = 1; i < n.length; i++) 
        if(n[i]==0&&n[i-1]!=0){
            int x=n[i-1];
            n[i-1]=n[i];
            n[i]=x;
        }       
        System.out.print(n[2]+"\n");
    }
    public static void ejercicio5(){
         
        int total=0;
           for(int i=0;i<=5;i++){
               total+=2;
           }
           System.out.print(total+"\n");
    }
    public static void ejercicio6(){
         
        int x=0;
        do{
            System.out.print(x+"\n");
            x++;
        }while(x>0);
    }
    public static void menu(){
       int op;
        do {   
            
            op=Integer.parseInt(JOptionPane.showInputDialog(""
                    + "1.- Ejercicio1\n"
                    + "2.- Ejercicio2\n"
                    + "3.- Ejercicio3\n"
                    + "4.- Ejercicio4\n"
                    + "5.- Ejercicio5\n"
                    + "6.- Ejercicio6\n"
                    + "7.- Salir"
                    + "ingrese opcion"));
            switch(op){
                case 1:
                    ejercicio1();
                    break;
                case 2:
                    ejercicio2();
                    break;
                case 3:
                    ejercicio3();
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
