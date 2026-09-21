import java.util.Scanner;
public class Problema1134 {
    public static void main (String[] args){
        Scanner leitor = new Scanner(System.in);
        int contAlcool = 0;
        int contGasolina = 0;
        int contDiesel = 0;
        int codigo = 0;
        while (codigo != 4) {
            codigo = Integer.parseInt(leitor.nextLine());
            if (codigo == 1) {
                contAlcool++;
            } else if (codigo == 2) {
                contGasolina++;
            } else if (codigo == 3) {
                contDiesel++;
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d\n", contAlcool);
        System.out.printf("Gasolina: %d\n", contGasolina);
        System.out.printf("Diesel: %d\n", contDiesel);
        leitor.close();
    }
}
