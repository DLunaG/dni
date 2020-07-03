import java.util.Scanner;

public class Dni {

    public static void main(String[] args) {

        Scanner sc = new Scanner();
        System.out.println("Vamos a averiguar la letra de tu DNI." +
                "\nIntroduce los números de tu DNI: ");
        int dni = sc.nextInt();
        int resultado = dni % 23;


    }

}
