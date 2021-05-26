
/**
 * Ex14 
 *
 * @author (Ivan Sannikov 324450170)
 * @version (Ex14)
 */
public class Ex14
{

    public static int size (boolean[][] mat, int x, int y){
        boolean [][] tmp = new boolean [mat.length][mat[0].length]; // new boolean array with same size for cheking 

        return size (mat,tmp,x,y); 

    }

    /**
     * Method returns the size of stain in 2D board
     *
     * @param  mat 2D array whits (boolean) stains
     * @param  tmp Control array
     * @param  x  Coordinate of cell in the array
     * @param  y  Coordinate of cell in the array
     * @return int   Size of stain in board
     */
    public static int size (boolean[][] mat, boolean[][] tmp, int x, int y)
    {

        if (x>=mat.length || y>=mat[0].length || x<0 || y<0) // coordinates is out of array
            return 0;

        if (mat[x][y]==false || tmp[x][y]==true) //exit condition + prevent return to same cell
            return 0;

        tmp[x][y]=true; //mark as cheked

        //cheking tight cells
        return 1  + size(mat,tmp,x,y+1) + size(mat,tmp,x,y-1) + size(mat,tmp,x-1,y) + size(mat,tmp,x-1,y+1)
        + size(mat,tmp,x-1,y-1) + size(mat,tmp,x+1,y) + size(mat,tmp,x+1,y-1) + size(mat,tmp,x+1,y+1);

    }

    
    
    
    
    
    
    /**
     * Cheking if content of arrays are the same
     *
     * @param  a  Int array
     * @param  b  Int array
     * @return  true If content of arrays are the same
     */
    public static boolean isPermutation (int [] a, int [] b)

    {
        if (a.length!=b.length) 
            return false; 

        if (a.length==0 && b.length==0)
            return true;

        if(a.length==1 && b.length==1) 
            return a[0]==b[0];

        int[] copyA = new int [a.length]; // new array with same length as array a
        int[] copyB = new int [b.length]; // new array with same length as array b
        
        //copy arrays 
        copyArray(a,copyA,0); 
        copyArray(b,copyB,0); 
        
        //sorting copy arrays by increase
        sortArray(copyA,copyA.length-1);
        sortArray(copyB,copyB.length-1);
        
        //sending sorted copy arrays to method with index
        return isPermutation (copyA,copyB,0);
    }

    /**
     * Cheking if content of arrays are the same (with index)
     * 
     *
     * @param  a  Int array
     * @param  b  Int array
     * @param  i  Index
     * @return true If content of arrays are the same
     */
    public static boolean isPermutation (int [] a, int [] b, int i)

    {
        if(a[i]!=b[i]) // false if content at index i are diffrent
            return false;

        if (i==a.length-1)  // exit condition (end of array)
            return true;

        return isPermutation(a,b,i+1); //recursion

    }

    /**
     * Gets original array and emty array with same size, then copy one to the other
     *
     * @param  array  Original array
     * @param  copy   Emty array with same length as original
     */
    private static void copyArray(int [] array, int [] copy, int i)
    {
        if (i==array.length) //exit condition
            return;
        copy[i]=array[i]; //copy one to the other
        copyArray(array,copy,i+1); //recursion

    }

    /**
     * Sorting array by increase
     *
     * @param  array  Array
     * @param i Index
     */
    public static void sortArray(int[] array, int i)
    {

        if ( i==0 ) //exit condition
            return;

        int max_index = findMaxIndex(array, i); // finding the index of max num in the array
        
        //swap the max num to the last plase in array
        int temp = array[max_index];
        array[max_index] = array[i];
        array[i] = temp;

        sortArray(array, i-1); // recursion (without index of last place in array)
        return;
    }

    /**
     * Finding index of max num in array
     *
     * @param  array Array
     * @param  i Idex
     */
    private static int findMaxIndex(int[] array, int i)
    {
        if (i==0) //exit condition
            return i;
        
        //recursive going to the first num in array and compare him with max num at exit  
        int maxIndex = findMaxIndex (array, i-1); 
        if (array[i]<array[maxIndex])
            return maxIndex;
        return i;
    }

}
