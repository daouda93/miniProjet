import java.util.Arrays;

public class Trier {

   public static void Tri( Object[] table) {
	 
   // trier le tableau
   Arrays.sort(table);

   // afficher tous les éléments triés
   int  n  =  table.length - 1 ;
   for (  int  i  =  0 ;  i <= n ;  i ++ ) 
     System.out.print ( table[i] + " , ");
    System.out.println ();
  }

   
    public static void main (String[] args) {
      /* code */
         Object[] iArr = {1, 8, 3, 98, 5};
         Tri(iArr);
         
   }
}