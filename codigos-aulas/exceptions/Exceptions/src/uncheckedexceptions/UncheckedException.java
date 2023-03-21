package uncheckedexceptions;

import javax.swing.*;
import java.text.NumberFormat;

public class UncheckedException {
    public static void main(String[] args) {

        boolean continueLooping = true;

        do{

            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLooping = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida, informe um número inteiro! " + e.getMessage());
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Impossível divir um número por 0.");
            } finally {
                System.out.println("Chegou ao finally!");
            }
        } while(continueLooping);
    }

    public static int dividir(int a, int b){
        return a/b;
    }
}
