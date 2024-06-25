package cl.praxis.verified;

public class Factorial {
	public String factorial( int valor) {
		int suma = 1;
	    for(int i = 1; i <= valor; i++){
	        suma = suma * i;
	    }
		return String.valueOf(suma);		
	}

}
