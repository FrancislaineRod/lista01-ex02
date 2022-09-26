import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);
        
        double numero;
        System.out.print("Digite um numero: ");
        numero = console.nextDouble();
        
        System.out.println("O número informado foi "+numero);
        console.close();
    }
}
