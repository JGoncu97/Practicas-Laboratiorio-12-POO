package laboratorio13;

public class Principal {
	
	Flechas flecha1,flecha2,flecha3;
	
	public static void main(String[]args) {
		
		Principal miPrincipal=new Principal();
		
		
	}
	
	
	public Principal() {
		flecha1=new Flechas();
		flecha1.construirFlecha();
		flecha1.imprimirEspacio();
		
		flecha2=new Flechas();
		flecha2.construirFlecha();
		flecha2.imprimirEspacio();
		
		flecha3=new Flechas();
		flecha3.construirFlecha();
		flecha3.imprimirEspacio();
		
	}
}
