public class OrdenacaoDireta{

	public static void main(String[]args){
	
	int[] vet = {20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5,	4, 3, 2, 1};
	boolean alt;
	int valor = 0;
	alt = false;
	while(!alt){
	alt = true;
		for (int i = 1; i < 20; i++){
			
			if (vet[i] < vet[i-1]){
				valor = vet[i];
				vet[i] = vet[i-1];
				vet[i-1] = valor;
				alt = false;
			}
		}		
		} 
		for (int i = 0; i<20; i++){ 
		
			System.out.print(vet[i] + " ");
		}
	 
	
	
	}
	
}
