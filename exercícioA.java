import javax.swing.JOptionPane;

public class exercícioA {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número"));
		int acumulador = 0;
		
		for (int i =0; i < numero; i++) {
			acumulador += i;
		}
		
		double media = acumulador/numero;
		
		JOptionPane.showMessageDialog(null, media);
	
	}

}
