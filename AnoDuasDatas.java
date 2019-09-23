public class AnoDuasDatas {

int dia1, mes1, ano1, dia2, mes2, ano2, diasEntreDatas;

public static void main(String[] args) {

 int dia1 = 30;
 int mes1 = 1;
 int ano1 = 2010;

 int dia2 = 24;
 int mes2 = 4;
 int ano2 = 2019;
 int diasEntreDatas = 0;

   for(int i = ano1; i < ano2; i++){
       if(i % 4 == 0){
        diasEntreDatas += 366;
       } else {
        diasEntreDatas += 365;
       }
   
         for (int j = dia1; j < dia2; j++) {
        if(j % 4== 0){
        diasEntreDatas += 366;
         } else {
          diasEntreDatas += 365;
         }
   
   for (int k = mes1; k < mes2; k++) {
   
    if(k % 4 == 0){
    diasEntreDatas += 366;
       } else {
        diasEntreDatas += 365;
       }
   }
        }
   }    
 
   System.out.println("Os dias entre " + ano1 + " e " + ano2 + " é: " + diasEntreDatas);
}


} 
