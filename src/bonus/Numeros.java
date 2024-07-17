package bonus;

import javax.swing.JOptionPane;

public class Numeros {
	
	//Declaramos el conjuntos de variables que utilizaremos en esta clase de manera publica
	int numero;
	int i, neg=0,par=0;
	
	//Realizamos un metodo llamado entrada 
	public void entrada() {
		//Se crea un ciclo que nos realizara una repeticion de 5 veces el metodo ingresarDatos()
		for( i=0; i<5 ;i++) {
			//al llamar un metodo  por medio de la variable global , todo numero que ingresemos sera lo que guardara numero
			numero= ingresarDatos("digite 1 numero");
			//Luego de tomar ese datos en numero, para a verificarlo con una condicional que nos indicara que 
			//si el numero es divisible por dos y eso es igual a 0 es un numero par
			if( numero %2 == 0) {
				//Si el numero ingresado entra por la condicion a la variable par se le suma 1 cada vez que entre
				par++;
				
				//si el numero registrado en la variable numero termina siendo menor a 0 entrara por la siguiente condicion
			}if(numero <0) {
				//si el numero ingresa entonces a la variable neg se le suma 1, por cada que ingrese a esta condicion
				neg++;
			}
		}
		//Nos muestra por pantalla un mensaje indicandonos cuantos de los 5 numeros registrados fueron pares o negativos
		JOptionPane.showMessageDialog(null, "El numero de numeros pares es: "+ par + "\n"
				+" y el numero de numeros negativos es: "+ neg);
		
	}
	
	
	//declaramos un metodo estatico de tipo int que recibira como parametro un mensaje de tipo String
	public static int ingresarDatos(String mensaje) {
		
		//Declaramos variables internas de forma privada que nos sirvan para guardar la informacion suministrada por el usuario
		String cadena;
		int valor;
		
		//Atravez de la variable cadena , solicitaremos la informacion al usuario el input JOptionPane
		cadena=JOptionPane.showInputDialog(null,mensaje);
		//en la variable valor , se transformara la respuesta del input a un entero y se almacenara en valor
		valor=Integer.parseInt(cadena);
		
		//Retornaremos el numero ingresado a travez de la variable valor
		return valor;
	}
	
	
	
}
