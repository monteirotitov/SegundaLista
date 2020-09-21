
public class exercicioI {

	public static void main(String[] args) {
		  
		
		double n = Double.parseDouble(JOptionPane.showInputDialog("Informe um número:"));

	        int expoente = Integer.parseInt(JOptionPane.showInputDialog("Informe seu expoente:"));

	        double accumulator = 1;

	        

	        for (int i = 1; i <= expoente; i++) {

	            accumulator *= n;

	        }

	        

	        System.out.println(accumulator);
	}

}
