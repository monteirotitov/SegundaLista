
public class exerc�cioM {
	
	  public static void main(String[] args) {

		  

	        int [] valores = new int[50];

	        int accumulator = 0;

	        

	        for (int i = 0; i < valores.length; i++) {

	            int valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor: "));

	            valores[i] = valor;

	            accumulator += valor;

	        }

	            int maiorValor = 0;

	            int menorValor = valores[0];

	        

	        for (int valor : valores) {

	            if(valor > maiorValor){

	                maiorValor = valor;

	            }

	            if(valor < menorValor){

	                menorValor = valor;

	            }

	        }

	        

	        int media = (int) (accumulator / 50);

	        System.out.println("O maior valor �: " + maiorValor);

	        System.out.println("O menor valor �: " + menorValor);

	        System.out.println("A m�dia dos valores � de : " + media);

  
	  }
}