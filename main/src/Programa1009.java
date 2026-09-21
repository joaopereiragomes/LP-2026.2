import java.util.Scanner;

public class Programa1009 {
    public static void main(String [] args){
        Scanner leitor = new Scanner (System.in);
        String nome = leitor.nextLine();
        Double salarioFixo = Double.parseDouble(leitor.nextLine());
        Double vendaTotal = Double.parseDouble(leitor.nextLine());
        Double total = salarioFixo + 0.15 * vendaTotal;
        System.out.printf("TOTAL = R$ %.2f\n", total);
        leitor.close();
    }
}
