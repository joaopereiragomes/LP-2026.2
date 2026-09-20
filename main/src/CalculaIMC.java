import javax.swing.JOptionPane;

public class CalculaIMC {

    public static void main(String [] args) {
        String pesoStr = JOptionPane.showInputDialog("Qual é o seu peso?");
        double peso = Double.parseDouble(pesoStr);
        String alturaStr = JOptionPane.showInputDialog("Qual é a sua altura?");
        double altura = Double.parseDouble(alturaStr);
        double valorIMC = peso/(altura*altura);
        System.out.print("O seu IMC é de " + valorIMC);
    }
}
