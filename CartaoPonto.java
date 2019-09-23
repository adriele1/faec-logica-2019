public class CartaoPonto {

	int EM;
	int SM;
	int ET;
	int ST;
	int totalmes;
	
	void inicializaMes(CartaoPonto[]dia){
		
		for (int i = 1; i<10; i++){
	
		dia[i] = new CartaoPonto();
		
		dia[i].EM = 9;
		dia[i].SM = 12;
		dia[i].ET = 13;
		dia[i].ST = 18;
		
		
		}
	}
	void imprimeRegistroMensal(CartaoPonto[]dia){
		for (int i = 1; i<10; i++){
		
			
		    System.out.println("" +dia[i].EM);
			 System.out.println("" +dia[i].SM);
			  System.out.println("" +dia[i].ET);
			   System.out.println("" +dia[i].ST);
		}	
	}		
			
	    public static void main(String[] args){
				
			CartaoPonto[] dia = new CartaoPonto[30];
		
		        CartaoPonto arquivoMensal = 
				       new CartaoPonto();
				
				arquivoMensal.inicializaMes(dia);
				
			 	arquivoMensal.imprimeRegistroMensal(dia);
		}
		
		
	
}