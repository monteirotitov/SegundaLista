
public class exerc�cioF {

	public static void main(String[] args) {
		
int acumulador = 0;

        

        for (int i = 0; i <= 365; i++) {

            int temperatura = Integer.parseInt(JOptionPane.showInputDialog("Informe a temperatura:"));

            acumulador += temperatura;

        }

        int media = (int) (accumulator / 365);

        JOptionPane.showMessageDialog(null, "A m�dia de temperatura anual foi de: " + media);
		
	}

}
