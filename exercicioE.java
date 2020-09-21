import javax.swing.JOptionPane;

public class exercicioE {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
		
		if(n <= 10 && n >=1) {
			int resultado = n * i;
			System.out.println(n + "x" + i + " = " + resultado);
		}else {
			JOptionPane.showMessageDialog(null, "Informe um número entra 1 e 10");
		}
		
	}

}
