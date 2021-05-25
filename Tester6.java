/**
 * Write a description of class Tester here.
 *
 * @author Ruth Rivka Stiebel
 * @version 13-05-21
 */
public class Tester6 extends Ex14
{
    public static void main (String [] args)
    {
        boolean [][]a = {
                {true,     true,     true,     true},
                {true,     true,     true,     true},
                {true,     true,     true,     true},
                {true,     true,     true,     true},
                {true,     true,     true,     true}
            };

        boolean [][]b = {
                {false,     false,     false,     false},
                {false,     false,     false,     false},
                {false,     false,     false,     false},
                {false,     false,     false,     false},
                {false,     false,     false,     false}
            };

        boolean [][]c = {
                {false,     false,     false,     false},
                {false,     false,     false,     false},
                {false,     false,     true,      false},
                {false,     false,     false,     false},
                {false,     false,     false,     false}
            };

        boolean [][]d = {
                {true,     false,     false,     true},
                {false,     true,     false,     false},
                {false,     true,     false,     true},
                {false,     false,     false,     true},
                {true,     true,     true,     false}
            };

        System.out.println("-----TESTING size-----");
        if (size(a, 0, 0)==20)
            System.out.println("GOOD"); 
        else
            System.out.println("ERROR - should get 20, got " + size(a, 0, 0));
        if (size(a, 7, 0)==0)
            System.out.println("GOOD"); 
        else
            System.out.println("ERROR - should get 0, got " + size(a, 7, 0));
        if (size(b, 0, 0)==0)
            System.out.println("GOOD"); 
        else
            System.out.println("ERROR - should get 0, got " + size(b, 0, 0));
        if (size(b, 5, 5)==0)
            System.out.println("GOOD"); 
        else
            System.out.println("ERROR - should get 0, got " + size(b, 5, 5));
        if (size(c, 2, 2)==1)
            System.out.println("GOOD"); 
        else
            System.out.println("ERROR - should get 1, got " + size(c, 2, 2));
        if (size(c, 2, 3)==0)
            System.out.println("GOOD"); 
        else
            System.out.println("ERROR - should get 0, got " + size(c, 2, 3));
        if (size(d, 0, 0)==3)
            System.out.println("GOOD"); 
        else
            System.out.println("ERROR - should get 3, got " + size(d, 0, 0));
        if (size(d, 1, 1)==3)
            System.out.println("GOOD"); 
        else
            System.out.println("ERROR - should get 3, got " + size(d, 1, 1));
        if (size(d, 2, 0)==0)
            System.out.println("GOOD"); 
        else
            System.out.println("ERROR - should get 0, got " + size(d, 2, 2));
        if (size(d, 4, 0)==5)
            System.out.println("GOOD"); 
        else
            System.out.println("ERROR - should get 5, got " + size(d, 4, 0));
        System.out.println("-----END of size-----\n");

        System.out.println("-----TESTING isPermutation-----");
        int [] a1 = {1, 2, 3, 4};
        int [] b1 = {1, 2, 1, 5};

        //saving orginal arrays
        String a1Original =  print(a1, 0, "");
        String b1Original =  print(b1, 0, "");
        //activating the method
        if(! isPermutation(a1, b1))
            System.out.println("GOOD"); 
        else
            System.out.println("ERROR - should get false, got true.");

        //checking if the arrays changed permanently during the method
        String a1After =  print(a1, 0, "");
        String b1After =  print(b1, 0, "");
        if (a1Original.equals(a1After) && b1Original.equals(b1After))
            System.out.println("GOOD - the arrays haven't changed."); 
        else
            System.out.println("ERROR - the arrays have been changed!");

        int [] a2 = {1, 2, 2, 4};
        int [] b2 = {1, 2, 3, 2};

        //saving orginal arrays
        String a2Original =   print(a2, 0, "");
        String b2Original =  print(b2, 0, "");
        //activating the method
        if(! isPermutation(a2, b2))
            System.out.println("GOOD"); 
        else
            System.out.println("ERROR - should get false, got true.");
        //checking if the arrays changed permanently during the method
        String a2After =  print(a2, 0, "");
        String b2After =  print(b2, 0, "");
        if (a2Original.equals(a2After) && b2Original.equals(b2After))
            System.out.println("GOOD - the arrays haven't changed."); 
        else
            System.out.println("ERROR - the arrays have been changed!");

        int [] a3 = {1, 2, 3, 4};
        int [] b3 = {4, 2, 1, 3};

        //saving orginal arrays
        String a3Original =   print(a3, 0, "");
        String b3Original =  print(b3, 0, "");
        //activating the method
        if( isPermutation(a3, b3))
            System.out.println("GOOD"); 
        else
            System.out.println("ERROR - should get true, got false.");
        //checking if the arrays changed permanently during the method
        String a3After =  print(a3, 0, "");
        String b3After =  print(b3, 0, "");
        if (a3Original.equals(a3After) && b3Original.equals(b3After))
            System.out.println("GOOD - the arrays haven't changed."); 
        else
            System.out.println("ERROR - the arrays have been changed!");

        int [] a4 = {1, 2, 2, 4};
        int [] b4 = {4, 2, 1, 2};

        //saving orginal arrays
        String a4Original =   print(a4, 0, "");
        String b4Original =  print(b4, 0, "");
        //activating the method
        if( isPermutation(a4, b4))
            System.out.println("GOOD"); 
        else
            System.out.println("ERROR - should get true, got false.");
        //checking if the arrays changed permanently during the method
        String a4After =  print(a4, 0, "");
        String b4After =  print(b4, 0, "");
        if (a4Original.equals(a4After) && b4Original.equals(b4After))
            System.out.println("GOOD - the arrays haven't changed."); 
        else
            System.out.println("ERROR - the arrays have been changed!");

        int [] a5 = {1, 2, 2, 4, 5};
        int [] b5 = {4, 5, 1, 2};
        //saving orginal arrays
        String a5Original =   print(a5, 0, "");
        String b5Original =  print(b5, 0, "");
        if(! isPermutation(a5, b5))
            System.out.println("GOOD"); 
        else
            System.out.println("ERROR - should get false, got true.");
        //checking if the arrays changed permanently during the method
        String a5After =  print(a5, 0, "");
        String b5After =  print(b5, 0, "");
        if (a5Original.equals(a5After) && b5Original.equals(b5After))
            System.out.println("GOOD - the arrays haven't changed."); 
        else
            System.out.println("ERROR - the arrays have been changed!");

        int [] a6 = {};
        int [] b6 = {};
        //saving orginal arrays
        String a6Original =   print(a6, 0, "");
        String b6Original =  print(b6, 0, "");
        if(isPermutation(a6, b6))
            System.out.println("GOOD"); 
        else
            System.out.println("ERROR - should get true, got false.");
        //checking if the arrays changed permanently during the method
        String a6After =  print(a6, 0, "");
        String b6After =  print(b6, 0, "");
        if (a6Original.equals(a6After) && b6Original.equals(b6After))
            System.out.println("GOOD - the arrays haven't changed."); 
        else
            System.out.println("ERROR - the arrays have been changed!");

        int [] a7 = {1}; 
        int [] b7 = {2};
        //saving orginal arrays
        String a7Original =   print(a7, 0, "");
        String b7Original =  print(b7, 0, "");
        if(! isPermutation(a7, b7))
            System.out.println("GOOD"); 
        else
            System.out.println("ERROR - should get false, got true.");
        //checking if the arrays changed permanently during the method
        String a7After =  print(a7, 0, "");
        String b7After =  print(b7, 0, "");
        if (a7Original.equals(a7After) && b7Original.equals(b7After))
            System.out.println("GOOD - the arrays haven't changed."); 
        else
            System.out.println("ERROR - the arrays have been changed!");

        int [] a8 = {2,2, 3}; 
        int [] b8 = {2,2, 3};
        //saving orginal arrays
        String a8Original =   print(a8, 0, "");
        String b8Original =  print(b8, 0, "");
        if(isPermutation(a8, b8))
            System.out.println("GOOD"); 
        else
            System.out.println("ERROR - should get true, got false.");
        //checking if the arrays changed permanently during the method
        String a8After =  print(a8, 0, "");
        String b8After =  print(b8, 0, "");
        if (a8Original.equals(a8After) && b8Original.equals(b8After))
            System.out.println("GOOD - the arrays haven't changed."); 
        else
            System.out.println("ERROR - the arrays have been changed!");
        System.out.println("-----End of isPermutation-----");
    }

    public static String print (int[] a, int startIndex, String str)
    {
        if (startIndex==a.length)
            return str;
        str+= "\t" + a[startIndex];
        return print(a, startIndex+1, str);
    }
}
