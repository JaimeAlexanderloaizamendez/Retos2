
 import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        int vecesQueSeRepite=3;
        int vidas=2;
        String palabraoculta="gato";
        int intentos=0,i;

        
        Scanner lectura=new Scanner(System.in);
        String[] palabra = new String[] { "s","o","l"};
        String[] letras = new String[3];
       
        for (i = 0; i < vecesQueSeRepite; i++) {
            System.out.println("tienes estas vidas: " + vidas );
            System.out.println("escriba la letra ");
            letras[i]=lectura.next();

            if(letras[i].equals(palabra[0])){
    
            }
            else if(letras[i].equals(palabra[1])){
                
            }
            else if(letras[i].equals(palabra[2])){
                
            }
            
            else if (letras[i].equals(palabraoculta)){
                System.out.println("adivino la palabras es"+palabraoculta);
                System.out.println(palabra[0]);
                System.out.println(palabra[1]);
                System.out.println(palabra[2]);
                break;
            }
            else if(vidas==0){
                vidas=intentos;
            }
            else if(letras[i]!=palabra[i]){
                System.out.println("no ha adivinado menos vidas "+ (vidas --));
            }
        }
    
        System.out.println("gracias por jugar");
        lectura.close();
        

    }
}

