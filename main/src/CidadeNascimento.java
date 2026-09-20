import javax.swing.JOptionPane;

public class CidadeNascimento {

    public static void main(String [] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        String cidade = JOptionPane.showInputDialog("Digite a cidade em que você nasceu:");
        System.out.print("Oi " + nome + "! Que legal saber que você é da cidade " + cidade);
    }
}