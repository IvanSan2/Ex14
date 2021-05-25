
/**
 * Write a description of class Ex14 here.
 *
 * @author (Ivan Sannikov 324450170)
 * @version (Ex14)
 */
public class Ex14
{

    public static int size (boolean[][] mat, int x, int y){
        boolean [][] tmp = new boolean [mat.length][mat[0].length]; 

        return size (mat,tmp,x,y);

    }

    /**
     * Method returns the size of stain in 2D board
     *
     * @param  mat 2D array whits (boolean) stains
     * @param  x  coordinate of cell in the array
     * @param  y  coordinate of cell in the array
     * @return    size of stain in board
     */
    public static int size (boolean[][] mat, boolean[][] tmp, int x, int y)
    {

        if (x>=mat.length || y>=mat[0].length || x<0 || y<0) // coordinates is out of array
            return 0;

        if (mat[x][y]==false || tmp[x][y]==true) //exit condition + prevent return to same cell
            return 0;

        tmp[x][y]=true;

        return 1  + size(mat,tmp,x,y+1) + size(mat,tmp,x,y-1) + size(mat,tmp,x-1,y) + size(mat,tmp,x-1,y+1)
        + size(mat,tmp,x-1,y-1) + size(mat,tmp,x+1,y) + size(mat,tmp,x+1,y-1) + size(mat,tmp,x+1,y+1);

    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param 
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static boolean isPermutation (int [] a, int [] b)

    {
        if (a.length!=b.length)
            return false;

        if (a.length==0 && b.length==0)
            return true;

        if(a.length==1 && b.length==1)
            return a[0]==b[0];

        int[] copyA = new int [a.length];
        int[] copyB = new int [b.length];

        copyArray(a,copyA,0);
        copyArray(b,copyB,0);

        sortArray(copyA,copyA.length-1);
        sortArray(copyB,copyB.length-1);

        return isPermutation (copyA,copyB,0);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param 
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static boolean isPermutation (int [] a, int [] b, int i)

    {
        if(a[i]!=b[i])
            return false;

        if (i==a.length-1)
            return true;

        return isPermutation(a,b,i+1);

    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    private static void copyArray(int [] array, int [] copy, int i)
    {
        if (i==array.length-1)
            return;
        copy[i]=array[i];
        copyArray(array,copy,i+1);

    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void sortArray(int[] array, int i)
    {

        if ( 0==i )
            return;

        int max_index = findMaxIndex(array, 0);

        
            int temp = array[max_index];
            array[max_index] = array[i];
            array[i] = temp;
        

        sortArray(array, i-1);
        return;
    }


    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    private static int findMaxIndex(int[] array, int i)
    {
        if (i==array.length-1)
            return i;
        int maxIndex = findMaxIndex (array, i+1);
        if (array[i]<array[maxIndex])
            return maxIndex;
         return i;
    }

    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void print(int[] array)
    {
        for (int i=0;i<array.length;i++)
            System.out.print(array[i] + "  ");
        System.out.println("");
    }
}
