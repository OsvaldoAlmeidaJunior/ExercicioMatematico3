import javax.swing.JOptionPane;

public class ExercicioMatematico3 {

	public static void main(String[] args) {
		
		String a = JOptionPane.showInputDialog("Digite o Valor A");
		
		int numa=Integer.parseInt(a);
		
String b = JOptionPane.showInputDialog("Digite o Valor B");
		
		int numb=Integer.parseInt(b);
		
String c = JOptionPane.showInputDialog("Digite o Valor C");
		
		int numc=Integer.parseInt(c);
		
String d = JOptionPane.showInputDialog("Digite o Valor D");
		
		int numd=Integer.parseInt(d);
		
		int dif = (numa*numb)-(numc * numd);
		
		JOptionPane.showMessageDialog(null, "A Diferença é de  " + dif);
		
		
		

	}

}
