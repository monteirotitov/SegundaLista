
public class exU {
	
    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero para sequ�ncia: "));

                

        for (int i = 0; i <= n; i++) {

            System.out.print("(" + i + "):" + Fibonacci.fibo(i) + "\t");

         }
  
    
   }
    
    
}