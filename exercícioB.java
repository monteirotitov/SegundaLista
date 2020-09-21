import javax.swing.JOptionPane;

public class exercícioB {

	public static void main(String[] args) {
		int numero = 1; 
		int acumulador = 0;
		int i = 0;
		
		while (numero ==1) {
			
			int n = Integer.parseInt(JOptionPane.showInputDialog("Informe um número (Tecle zero para sair): "));
			if(n > 0) {
				acumulador += n;
				i++;
			}else {
				numero = 0;
			}
			
		}
		
		double media = acumulador / i; 
		JOptionPane.showMessageDialog(null, "A média é: " +media);

	}

}
