import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Conta conta = new Conta("victor");

        conta.setBalance(1000);
        System.out.println("");

        System.out.println("");
        
        conta.removeBalance(1500);
        System.out.println("");
        conta.removeBalance(500);
        
        System.out.println("---------------------");
        System.out.println("");
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("creating your account, insert your name:");
        String nome = ler.next();
        
        Conta conta1 = new Conta(nome);
        
        conta.transferBalance(200, conta1);
        System.out.println("---------------------");
        System.out.println("");
        
        conta.getBalance();
        conta1.getBalance();
        
        System.out.println("---------------------");
        System.out.println("");
        
        System.out.println("finishing the system");
        System.out.printf("total accounts: %d", Conta.getTotal());
    }
}
