package laboratorio13;

import javax.swing.JOptionPane;

public class Flechas {

	int longitud;
	String color;
	
	public Flechas() {
		longitud=18;
		color="negro";
	}
	
	
	public Flechas(int longitud, String color) {
		this.longitud=longitud;
		this.color=color;
	}
	
	
	public void imprimirEspacio() {
		System.out.println();
	}
	
	public void construirFlecha() {
		longitud=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud de su flecha"));
		color=JOptionPane.showInputDialog("Por favor ingrese el color de la flecha: \n\n"
				+ "negro \n"
				+ "rojo \n");
		
		for(int i=0;i<longitud;i++) {
			imprime("-");
		}
		imprime(">");
		
	}
	
	
	private void imprime(String simbolo) {
		
		
		
		if(color.equals("negro")) {
			System.out.print(simbolo);
		}else if(color.equals("rojo")) {
			System.err.print(simbolo);
		}else {
			JOptionPane.showMessageDialog(null, "Solo se permite  los colores indicados");
			
		}
		
	}
	
	
	

	
}
