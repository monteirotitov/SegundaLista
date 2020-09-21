
public class exercícioG {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Informe um número:"));

        double fatorial = n;

        

        for (int i = 1; i < n ; i++) {

            fatorial *= i;

        }

        System.out.println("O fatorial de " + n  + " é: " + fatorial);
	}

}
