
public class exercicioP {
	
	 public static void main(String[] args) {

	        double saldo = Double.parseDouble(JOptionPane.showInputDialog("Informe o saldo da conta "));

	        int flag = 1;

	        

	        

	         while (flag == 1) {            

	            double movimentacao = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da movimentação "));

	            if(movimentacao == 0) {

	                flag = 0;

	            }else {

	                saldo += movimentacao;

	            }

	        }

	        

	        System.out.println("O saldo final da conta é de: " + saldo);

	         

	    }

}
