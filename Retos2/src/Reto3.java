import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String[][] Matriz = new String[3][3];
    
    System.out.println("Bienvenido");
   
     for (int filas = 0; filas < 3; filas++) {     
            for (int columnas = 0; columnas < 3; columnas++) {
                System.out.println("escriba el nombre y el costo del producto");
                Matriz[filas][columnas] = lectura.next();
            }
        }
        for (int j = 0; j < 3; j++) {
        System.out.println(" ___________________________");
        System.out.print("                            |");
            for (int i = 0; i < 3; i++) {

                System.out.print(j+""+i+" "+Matriz[j][i]);
                if (i != Matriz[j].length - 1)   
            System.out.print("\t");
            }
        System.out.println("                          |");
        }
        System.out.println( " _________________________");
        lectura.close();
    }
}
