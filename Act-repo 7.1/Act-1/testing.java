import javax.swing.JOptionPane;

public class testing {

	public static void main(String[] args) {
		//Se crean tres rectangulos con nuevos datos
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(10.7,12.3);
		Rectangle r3 = new Rectangle(4.5,9.1);
		
		//Aqui en el paso 4, utilizamos la segunda variable para apuntar a un nuevo rectangulo
		r2 = new Rectangle(6.3,21.2);
		
		//Garbage collector
		System.gc();
		
		JOptionPane.showMessageDialog(null,"Pausa.");
		
		r2 = null;
		System.gc();
		
		
		
		
	}

}
