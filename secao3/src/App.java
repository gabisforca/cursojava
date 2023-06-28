import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        String Nome = JOptionPane.showInputDialog("Qual é seu nome ?");
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Qual é sua primeira nota?"));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Qual é sua segunda nota?"));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Qual é sua terceira nota?"));
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Quantos anos você faz/fez no ano que estamos?"));
        int nasci = Integer.parseInt(JOptionPane.showInputDialog("Qual o ano você nasceu?"));


        double media = (nota1 + nota2 + nota3) / 3;
        int anoatual = idade + nasci;
        JOptionPane.showMessageDialog(null, String.format("Seu nome é: " + Nome));
        JOptionPane.showMessageDialog(null, String.format("O ano que estamos é " + anoatual));
        JOptionPane.showMessageDialog(null, String.format("Sua média é: " + media));

    }
}