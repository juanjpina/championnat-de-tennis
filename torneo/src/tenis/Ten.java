package tenis;

public class Ten {
	
	
	public Ten () {			
		
	}
	
	/**
	 * metodo principal 
	 * @param tab
	 * @param inf
	 * @param sup
	 * @param sup2
	 */
	
	public void ftabla(int tab[][], int inf, int sup, int sup2){
	      
        if(sup2==2){
    	   tab[1][1]=2;
    	   tab[2][1]=1;
        }
        else{
        	ftabla(tab,inf,sup,sup2/2);
            recursiva( tab , (sup2/2)+1, sup2/2, sup2);
            recursiva2( tab,  1,sup2/2,sup2);
            recursiva3( tab,  (sup2/2)+1,1,sup2);
        }
    }
    
    
     /**
      * Rellena la tabla de resultados 
      * @param tab
      */
    public void pantalla(int tab[][]) {
    	int a=1;
        for(int i=1; i<=tab.length-2; i++){ //rellena la fila de dias
            System.out.print("\t"+"d" + a++ );
        }
    	
    	System.out.println();
    	
    	for(int x=1; x<tab.length; x++) { //rellena la tabla de resultados
    		System.out.print("j" + x );
    		for(int y=1; y<tab.length-1; y++) {
    			System.out.print("\t" + tab[x][y]);
    		}
    		System.out.println();
    	}	
    }
    
    /**
     * rellena el cuadrante inferior izquierda
     * @param tab
     * @param inf
     * @param sup
     * @param sup2
     */
    public void recursiva3( int tab [][], int inf, int sup, int sup2)
    {
        if ((inf>=((sup2/2)+1)) && (inf<=sup2) && (sup>=1) && (sup<=((sup2/2)-1))){
            
            	tab[inf][sup]=tab[inf-(sup2/2)][sup]+(sup2/2);
            	 
        if(sup==(sup2/2)-1){
        	sup=1;
        	inf=inf+1;
        }
        else {	
        	sup=sup+1;
        }
            recursiva3(tab, inf, sup,sup2);
        }
    }
    
    /**
     * rellena el cuadrante superior derecha
     * @param tab
     * @param inf
     * @param sup
     * @param sup2
     */
    public void recursiva2( int tab [][], int inf, int sup, int sup2)
    {
        if (inf >= 1 && inf <= sup2/2 && sup>= sup2/2 && sup <= sup2-1){
            if((inf+sup)<=sup2) {
            	tab[inf][sup]=inf+sup;
            }else {
            	tab[inf][sup]=((inf+sup)-sup2/2); }
            if(sup==sup2-1){
            	sup=sup2/2;
            	inf=inf+1;
            }
            else {	
            	sup=sup+1;
            }
            recursiva2(tab, inf, sup,sup2);
        }
    }
    
	/**
	 * rellena el cuadrante inferior derecha
	 * @param tab
	 * @param inf
	 * @param sup
	 * @param sup2
	 */
    public void recursiva( int tab [][], int inf, int sup, int sup2)
    {
        if (inf >= (sup2/2)+1 && inf <= sup2 && sup>= sup2/2 && sup < sup2+1){
            if(inf>sup) {
            	tab[inf][sup]=inf-sup;
            }else {
            	tab[inf][sup]=(inf+(sup2/2))-sup; }
      
            if(sup==sup2-1){
            	sup=sup2/2;
            	inf=inf+1;
            }
            else {	
            	sup=sup+1;
            }   
            recursiva(tab, inf, sup,sup2);
        }
    } 
}
