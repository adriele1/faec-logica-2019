public class MultiplicadorMatriz{

        public static void main(String[] args){
				
			
				
				
			int[][] A = { {2, 3, 4}, {9, 10, 11}, {7, 5, 2}};
			int[][] B = { {2, 3, 4}, {9, 10, 11}, {7, 5, 2}};
		
			int[][] R = new int[3][3];
			
			for(int i = 0; i<3; i++){
			
				 for (int j =0; j<3; j++){
					 
					for (int k =0; k<3; k++){
						
					R[i][j] = R[i][j] + A[i][k] * B[k][j];	
										
					 	  
				}
			}
			  
			        }
			
			for(int i = 0; i<3; i++){
			
				 for (int j = 0; j<3; j++){
					 	
					System.out.println(R[i][j]+ "");
					 
				 }
			}
		
	
	    }
	}