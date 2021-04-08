package tenis;

public class Main {
	private static int nj;
	
    private static int tabla [][];

    
    public static void main(String [] args) {
		// TODO Auto-generated method stub
		  
    	String captura =  args[0];
    
    	int n = Integer.parseInt(captura);
    	
		Potencia a = new Potencia();
	
		
		if(n>=2) {
			if(a.po(n)){
				Ten ten = new Ten();
				nj=n+1;
			    int day = nj-1;
			    tabla = new int [nj][day];
			    
				ten.ftabla(tabla, 1, n, n);
				ten.pantalla(tabla);	
		}else {
			
			System.out.print("Introduce un numero potencia de 2");
		}	
	  }else {System.out.print("Introduce un numero potencia de 2");}

}
}