
public class exerc�cioL {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero: "));

	        int accumulator = 0;

	        

	        for (int i = 0; i <= n; i++) {

	            accumulator += i;

	        }

	        

	        System.out.println("Resultado: " + accumulator);
	}

}
