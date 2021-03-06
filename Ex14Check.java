/**
 * @author Ruth Rivka Stiebel
 * @version 14-05-12
 */
public class Ex14Check
{
    /**
     * This method returns the number of cells in the array that are part of the same stain as the cell given.
     * @param mat The array checked
     * @param x X coodrdinate of the cell to be checked
     * @param y Y coodrdinate of the cell to be checked
     * @return Number of cells in the array that are part of the same stain as the cell given
     */
    public static int size (boolean[][] mat, int x, int y)
    {
        boolean[][] tmp = new boolean[mat.length][mat[0].length]; //defining an array that keeps track of the cells we already checked
        return checkEightSides(mat, tmp, x, y);
    }

    //checks size of stain
    private static int checkEightSides (boolean[][]mat, boolean[][] tmp, int x, int y)
    {
        if (!isValid(mat, x, y) || mat[x][y]==false || tmp[x][y]==true) //stopping condition
            return 0;
        else
        {
            if(mat[x][y]==true && tmp[x][y]==false) //if there is a stain and we haven't checked this cell previously  
                tmp[x][y]=true;
        } 
        //checking all cells that might enlarge the stain
        return 1+ checkEightSides(mat, tmp, x, y+1) + checkEightSides(mat, tmp, x, y-1) + checkEightSides(mat, tmp, x+1, y)
        + checkEightSides(mat, tmp, x-1, y) + checkEightSides(mat, tmp, x-1, y+1) + checkEightSides(mat, tmp, x+1, y+1)
        + checkEightSides(mat, tmp, x-1, y-1) + checkEightSides(mat, tmp, x+1, y-1);
    }

    //checks that the parameters given are valid
    private static boolean isValid (boolean[][] mat, int row, int col)
    {
        return row<mat.length && row>=0 && col<mat[0].length && col>=0;
    }

    /**
     * This method checks if the two arrays have the exact same values in their cells (though not necessarily in the same order)
     * @param a The first array
     * @param b The second array
     * @return true If the arrays have the exact same values
     */
    public static boolean isPermutation (int [] a, int [] b)
    {
        if (b.length!=a.length)
            return false;

        if(b.length==0 && a.length==0)
            return true;

        //saving the original arrays
        int[] originalA = new int[a.length];
        int[] originalB = new int[b.length];
        originalA = copyArray(a, originalA, 0);
        originalB = copyArray(b, originalB, 0);

        //solving the problem
        boolean answer = isPermutation(a, b, 0);

        //switching the arrays back to the way they were in the beginning
        a = copyArray(originalA, a, 0);
        b = copyArray(originalB, b, 0);
        return answer;
    }

    private static boolean isPermutation (int [] a, int [] b, int indexA)
    {
        int neuteralNum = findMax(a, 1, a[0])+1; //defining a neuteral number so I know where I was

        if (indexA==a.length) //stopping condition
            return true;

        if (a[indexA]==neuteralNum) //if the cell was already checked
            return isPermutation(a, b, indexA+1);

        int valueAIndexB = valueIndex(b, a[indexA], 0); //finding the index in the second array of the value in the first array
        if (valueAIndexB==-1) //if the second array doesn't have the value
            return false;
        else
        {
            //neuteralizing the cells
            b[valueAIndexB] = neuteralNum; 
            a[indexA] = neuteralNum;
            //continuing on
            return isPermutation(a, b, indexA+1);
        }
    }

    //checking if the array has a certain value
    private static int valueIndex (int [] a, int value, int startIndex)
    {
        if (startIndex==a.length) //stopping condition
            return -1;
        if (a[startIndex]==value) //sending index back
            return startIndex;

        return valueIndex(a, value, startIndex+1);
    }

    //finding the maximum number in the array
    private static int findMax (int [] a, int startIndex, int currMax)
    {
        if (startIndex==a.length)
            return currMax;
        if (a[startIndex]>currMax)
            currMax = a[startIndex];
        return findMax(a, startIndex+1, currMax);
    }

    //copies array
    private static int[] copyArray (int[] a, int[] b, int index)
    {
        if (index==a.length)
            return b;
        else
            b[index] = a[index];
        return copyArray(a, b, index+1);
    }
}
