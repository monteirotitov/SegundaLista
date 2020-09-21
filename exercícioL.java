
public class exercícioL {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));

	        int accumulator = 0;

	        

	        for (int i = 0; i <= n; i++) {

	            accumulator += i;

	        }

	        

	        System.out.println("Resultado: " + accumulator);
	}

}
