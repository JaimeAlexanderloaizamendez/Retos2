import java.util.Scanner;

public class Reto4{
    public static void main(String[] args) {

    Scanner lectura=new Scanner(System.in);

    String[][] calculadora =new String[5][6];

    calculadora[0] = new String [] { " |C " ," () " ,  " % ",  "/| "};
    calculadora[1] = new String [] { " |7 " , " 8 " , " 9 " , " x| ",};
    calculadora[2] = new String [] { " |4 " , " 5 " , " 6 " , " -| ",};
    calculadora[3] = new String [] { " |1 " , " 2 " , " 3 " , " +| "};
    calculadora[4] = new String [] { " |0 " , " . " , " - " , " =| "};

    System.out.println("calculadora");

    for(int i=0;i<calculadora.length; i++) {
        for(int j=0;j<calculadora[i].length;j++) {
            System.out.print(""+calculadora[i][j]+"");

            
        }
        System.out.println(); 
    }
    lectura.close();
    }
}
