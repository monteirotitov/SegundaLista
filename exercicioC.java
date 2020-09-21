import javax.swing.JOptionPane;

public class exercicioC {

	public static void main(String[] args) {
		
		int n =  Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		int raiz = (int)Math.sqrt(n);
		System.out.println(raiz);

	}

}
