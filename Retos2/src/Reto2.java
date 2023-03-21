import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) {
        char [] palindromo;
        String nombre;
        String palabra;
        int izquierda=0;
        int derecha;
        

         Scanner lectura = new Scanner(System.in);{

        
         System.out.println("Ingrese su nombre");nombre=lectura.nextLine();
        

         System.out.println("Por favor ingrese la palabra");palabra = lectura.next();
         

         
         palabra = palabra.toLowerCase();
         palindromo=palabra.toCharArray();
         
         derecha=palindromo.length -1;
         
         while(izquierda< derecha){
            if(palindromo[izquierda] == palindromo[derecha]){
                derecha --;
                izquierda ++;
            } else{
                System.out.println(nombre+" la palabra no es  palindromo");
                break;
            }
         }
         if(izquierda ==derecha){
            System.out.println(nombre+", la palabra "+palabra+"  es un palindromo ");
         }
         lectura.close();
        }
    }
 }

  

    
