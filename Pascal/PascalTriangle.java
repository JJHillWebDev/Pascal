import java.util.*; 

/**
	The PascalTriangle class is used to create Pascal Triangle objects.
	@author Jeremy Hill
    	@version 12.0.2
 */
public class PascalTriangle
{ 
	/**
	 *  The getChoices method returns 1 if n = 0 or if n = k. If that is not 
	 * 	the case then the method returns C(n + k).
	 *  @param n Index of outer Arraylist from pascal call.
	 *  @param k Index of inner Arraylist from pascal call.
 	 */
  	static int getChoices(int n, int k) 
  	{
  		//if either n is 0 or n = k return 1
    	if(n == 0 || n == k)
    	{
      		return 1;
    	}
    	//else returns C(n + k)
    	else
    	{
      		return getChoices(n, k - 1) + getChoices(n - 1, k - 1);
    	}
  	}

  	/**
	 *  The pascal method creates an arrayList of arrayLists. The arrayList
	 *  will have as many arrayLists as the parameter specifies. Uses the 
	 *  getChoices method to populate the triangle and printPascal to 
	 *  display the trinagle to the terminal.
	 *  @param s The number of line the trinagle will have.
 	 */
  	static void pascal(int s)
 	{
 		//creates an empty arrayList of arrayLists
    	ArrayList<ArrayList<Integer>> pasc = new ArrayList<>();
    	//for i less than the number of line the trinagle will have
    	for (int i = 0; i < s; i++)
    	{   
    		//adds a new arrayList<Integer> to the main arrayList
      		pasc.add(new ArrayList<Integer>());

      		//for j less than or equal to i
      		for(int j = 0; j <= i; j++)
      		{              
      			//add the return from the getCoices call to the arrayList 
      			//at index i
        		pasc.get(i).add(getChoices(j, i));
      		}
    	}
    	printPascal(pasc);   //calls the printPascal method
  	}
  
 	/**
	 *  The printPascal method accepts an arrayList of arrayLists as an
	 *  argument. The method uses a nested froEach loop to traverse through
	 *  the parameter t.
	 *  @param t An arrayList of arrayLists representing the triangle.
 	 */
  	static void printPascal(ArrayList<ArrayList<Integer>> t)
  	{
  		//forEach arrayList<Integer> in t
    	for (ArrayList<Integer> row : t) 
    	{
    		//forEach Integer in the row
      		for (Integer num : row) 
      		{
      			//print the Integer
        		System.out.print(num + " ");
      		}
      		//new line for formatting
      		System.out.println();
    	}
  	}
} 
