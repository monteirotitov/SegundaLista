
public class exerc�cioN {
	
	  public static void main(String[] args) {

	        int n = Integer.parseInt(JOptionPane.showInputDialog("Informe uma sequ�ncia: "));

	        double h = 1;

	        

	        for (int i = 0; i <= n; i++) {

	            h += 1.0 / i;

	        }

	         System.out.println("O resultado da s�rie �: " + h);

}
