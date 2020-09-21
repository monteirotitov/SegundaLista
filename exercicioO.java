
public class exercicioO {
	
	  public static void main(String[] args) {

	        int [] valores = new int[51];

	        int flag = 1;

	        int i = 0;

	        while (flag == 1) {



	            int n = Integer.parseInt(JOptionPane.showInputDialog("Informe um número (Digite 0 para sair): "));

	            if(n > 0) {

	                valores[i] = n;

	                i++;

	            }else{

	                flag = 0;

	            }

	            

	        }

	        

	        int maiorValor = 0;

	        for (int valor : valores) {

	            if(valor > maiorValor){

	                maiorValor = valor;

	            }

	        }

	        

	        System.out.println("O maior valor é: " + maiorValor);

	    }

	}


