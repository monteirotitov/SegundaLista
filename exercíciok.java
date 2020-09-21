
public class exercíciok {

	public static void main(String[] args) {
		
        double [] saldos = new double[3];

        

       for (int i = 0; i < saldos.length; i++) {

           double saldo = Double.parseDouble(JOptionPane.showInputDialog("Informe o saldo: "));

           saldos[i] = saldo;

           System.out.println(saldos[i]);

       }

       double maiorSaldo = 0;

       double menorSaldo = saldos[0];

       

       for (double saldo : saldos) {

           if(saldo > maiorSaldo){

               maiorSaldo = saldo;

           }

           if(saldo < menorSaldo){

               menorSaldo = saldo;

           }

       }

       System.out.println("O maior saldo do cliente no período de 30 dias foi : " + "R$ " + maiorSaldo);

       System.out.println("O menor saldo do cliente no período de 30 dias foi : " + "R$ " + menorSaldo);

	}

}
