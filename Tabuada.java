// Murilo Gabriel Ferreira - 0050015801

public class Tabuada {
    public static void main(String[] args) {
        
        for(int tab = 0; tab<=10; tab++){

            System.out.println("<--Tabuada de:" + tab + "-->"); 

            for(int i = 0; i<=10; i++){

                System.out.println(tab + "x" + i + "=" + i*tab); 
            }
   
        }
    }
}
