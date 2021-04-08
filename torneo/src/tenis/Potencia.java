package tenis;

public class Potencia {

	/**
	 * clase que comprueba si el numero que entra es potencia de 2
	 * @param x
	 * @return
	 */

	public boolean po(int x) {
		
	if(x==1) {return false;}	
		
	int a= log(x);
	
	int b= (int) Math.pow(2,a);
	
	if(x==b) {return true;}
	
		else return false;
	
	}
	
	public int log(int x)
	{
	    return (int) (Math.log(x) / Math.log(2));
	}
	
}
