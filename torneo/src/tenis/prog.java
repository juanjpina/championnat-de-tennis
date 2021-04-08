package tenis;

public class prog {
	public void ftabla(int tab[][], int inf, int sup, int sup2){
	      
	       // int medio;
	        //if(inf==sup-1){    //recorre los jug impares y rellena los impares y los pares, intercambiandolos.
	        //    tab[inf][1]=sup;
	          //  tab[sup][1]=inf;
	            if(sup2==2) {
	        	tab[1][1]=2;
	        	tab[2][1]=1;
	        	
	        }
	        else{
	           // medio=(inf+sup)/2;
	       ftabla(tab,inf,sup,sup2/2);
	            //ftabla(tab,inf,medio,sup2);  //forma 2/1 en la columma 1
	          //  ftabla(tab,medio+1,sup,sup2); // forma 4/3 en la columna 1        
	         //   rellenar(tab,sup2); //rellena la fila de dias y la columna de jugadores en la fila 0 y columna 0
	          //  intercambioSup(tab, inf, sup, sup2);//funciona bien
	            recursiva( tab , (sup2/2)+1, sup2/2, sup2);
	            recursiva2( tab,  1,sup2/2,sup2);
	            recursiva3( tab,  (sup2/2)+1,1,sup2);
	            //formar2(tab,sup);//rellena la segunda fila. 
	            //formar3(tab,sup); //debe rellenar la fila 3 y 4.
	             //circular(tab,  inf, sup);
	            
	            //recurcirc(tab,inf,  sup2, 0); //rellena la jug 4 recursivamente desde la jug=1, recorrido circular.
	             
	          //  if(sup>4){
	          //   recurcirc2(tab, inf, sup2, 0); //rellena la jug 5.
	          //  }
	            
	            
	          //  intercambioInf(tab, inf, sup, sup2);// no funciona estamos viendolo
	            
	            
	            //formar(tab, inf, medio, medio, sup-1, medio+1); 
	            
	            
	            //formar(tab, medio+1, sup, medio, sup-1, inf);
	        }
	    
	    
	    }
	    
	    /***
	     * metodo que rellena varias lineas principales.
	     */
	    public void rellenar(int tab[][], int sup2){
	        int x=1;
	        for(int i=1; i<=sup2; i++){ //rellena la columna de jugadores
	            
	            tab[i][0]=x++;
	        }
	        x=1;
	        for(int j=1; j<=sup2-1; j++){ // rellana la fila de dias
	        
	            tab[0][j]=x++;
	        }
	        x=2;
	        for(int j=1; j<sup2; j++){ // rellena la i=1 de judadores 1...n
	            
	            tab[1][j]=x++;
	        
	        }
	    
	    }
	    /**
	     * metodo que rellena el cuadrante superior derecho.
	     * @param tab
	     * @param inf
	     * @param sup
	     * @param sup2
	     */
	  
	    
	    
	    
	    
	    public void intercambioInf(int tab[][],int inf, int sup, int sup2){
	    
	        sup2=sup2-1;
	        if(sup2<sup && sup2>1){           
	            
	        	
	        	
	        	if(sup>sup2) {
	        		tab[sup][sup2]=sup-sup2;
	        	}else {tab[sup][sup2]=sup;}
	        	
	        	
	            if(tab[sup][sup2]%2==0){
	                tab[sup-1][sup2+1]=tab[sup][sup2];
	                  intercambioInf(tab,inf,sup,sup2);
	            }
	             else{ 
	                  tab[sup-1][sup2-1]=tab[sup][sup2]; 
	                    intercambioInf(tab,inf,sup,sup2);
	                }  
	            }
	    }
	    
	    /**
	     * metodo que rellena con intercambio las lineas jug 2
	     */
	    public void intercambioSup(int tab[][],int inf, int sup, int sup2){
	         
	        
	        
	        sup2=sup2-1;
	        if(sup2<sup && sup2>1){           
	            
	            if(tab[inf][sup2]%2==0){
	                tab[inf+1][sup2-1]=tab[inf][sup2];
	                  intercambioSup(tab,inf,sup,sup2);
	            }
	             else{ 
	                  tab[inf+1][sup2+1]=tab[inf][sup2]; 
	                    intercambioSup(tab,inf,sup,sup2);
	                }
	               
	            }
	           
	    }
	     
	    /**
	     * metodo que rellena la jug 4 partiendo desde la linea 1, invierte los numeros.
	     */
	    public void recurcirc(int tab[][], int inf,  int sup2, int cero){
	    	
	    //	final Integer x= new Integer(sup2);
	    	
	    	if(cero==0) {  	
	    		inf=sup2/2;
	    		sup2=sup2/2-1;
	    	}
	        if(sup2>=0 && sup2<=sup2-1){   
	            tab[4][sup2]=tab[1][cero];
	            recurcirc(tab,inf,sup2-1,cero+1);
	        }
	    }
	    
	    /**
	     * metodo que rellena la linea 5. suma +4 a la primera linea jug 1.
	     */
	    public void recurcirc2(int tab[][],int inf, int sup2, int cero){// 
	        
	        if(sup2>0 && cero<4){
	            sup2=--sup2;
	            int a=tab[1][cero];
	            tab[5][cero]=a+4;
	            recurcirc2(tab,inf,sup2,cero+1);
	        }
	        
	    }
	    
	      /*public void circular(int tab[][], int inf, int sup){ // metodo que va intentar mover circularmente los jugadores
	        int x=sup;
	        for(int jug=1; jug<sup/2;jug++){
	            for(int dia=0; dia<=sup-1;dia++){
	            
	                if(jug%2!=0){
	                    tab[sup][x-1]=tab[jug][dia];
	        
	                        
	        
	               }
	                
	                
	                
	            }
	        }
	        
	       
	       
	    
	      } 
	      */
	    
	    /*public void formar2(int tab[][], int n){ // cuadrante superior derecha
	        int x=2;
	       
	        
	        for (int jug=1; jug<=n/2; jug++) {
	            for (int dia=n/(n/2); dia<=3; dia++) {//ojo con dia<=3 hay modificarlo
	                if(jug==1){tabla[1][dia]=++x;} // primer jugador 
	                
	                    if(dia<=(n/2)+1){//tabla[jug][dia] = tabla[n/2+1][(n/2)-1];
	                    
	                    if(jug!=1 ){
	                        if((jug+dia)%2==0){ 
	                            tabla[jug][dia]=tabla[jug-1][dia+1]; }
	                 
	                    if((jug+dia)%2!=0){ 
	                        tabla[jug][dia]= tabla[jug-1][dia-1]; }
	                   }
	                }
	                
	                  //  else{tabla[jug][dia]=9;}
	                
	            }
	        }
	        }*/
	      /*
	      public void formar3(int tab[][], int n){
	        int x=1;
	        int d1=n-1;
	        
	        for (int jug=n/2; jug<=n; jug++) {
	            for (int dia=0; dia<=n-1; dia++) {//verificar el dia<=n-1 ver hasta donde tiene que llegar
	                //tabla[jug][dia] = tabla[n/2+1][(n/2)-1];
	                if(jug+1<=n){
	                    tabla[(jug+1)][d1]=tabla[jug][dia];
	                }
	                
	                
	                /*if((jug+dia)%2==0){
	                    
	                    tabla[(n/2)+1][n-1]=tabla[jug][dia]; 
	                }
	                
	                    
	                    
	                    if((jug+dia)%2!=0){
	                    tabla[jug][dia]=(n/2)-1; 
	                }
	                
	                d1=d1-1;
	            }
	            d1=n-1;
	        }
	        }
	    
	    
	    
	         */
	    
	    
	    
	    
	    
	    
	      /*
	    
	    public void formar(int tab[][], int eqInf, int eqSup, int diaInf, int diaSup, int eqInic){
	    
	        for(int j=diaInf; j<=diaSup; j++){
	            tab[eqInf][j]=eqInic+j-diaInf;
	            
	            
	        }
	    
	        for(int i=eqInf+1; i<=eqSup; i++){
	            tab[i][diaInf]=tab[i-1][diaSup];
	            for(int j=diaInf+1; j<=diaSup; j++){ 
	             
	                tab[i][j]=tab[i-1][j-1];
	            }
	    
	    
	        }
	    
	    
	    
	    }
	      */
	   
	    /**
	    * imprime en pantalla
	    */    
	    public void imprime(int tabla[][]){
	           for(int x []: tabla){
	            for(int z:x){
	                System.out.print(z+ " ");
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

