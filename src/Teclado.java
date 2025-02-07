import java.util.Scanner;

public class Teclado {
    Scanner sc;
    public Teclado(){
        sc = new Scanner(System.in);
    }
    public String getString(String texto) {
        String s1 = "";

        while(s1.equals("")){
            System.out.println(texto);
            s1 = sc.nextLine();
        }
        return s1;

    }
    public int readInteger(String texto) {
        int numero;
        while (true) {
            try {
                System.out.println(texto);
                numero = Integer.parseInt(sc.nextLine());
                return numero;
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número entero válido.");
            }
        }
    }

    public double readDouble(String texto) {
        double numero;
        while (true) {
            try {
                System.out.println(texto);
                numero = Double.parseDouble(sc.nextLine());
                return numero;
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número decimal válido.");
            }
        }
    }
}