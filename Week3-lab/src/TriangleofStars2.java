public class TriangleofStars2 {

  public static void main(String args []){

  for(int i=1; i<=6; i++) {
	  for (int j = 1; j<= i; j++ ) {
	  	System.out.print( "*" );
 	}
	  System.out.println();
	  } // end for loop



  int d = 6;
  int x = 0;

  for (d=6; d>0; d--){
	  for(x=1; x<=d; x++) {
		  System.out.print(x);
	  }
	  System.out.println();
	  }



}


}