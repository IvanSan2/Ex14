
public class Mmn14StudentTester {

	public static void main(String[] args) {
		boolean [][]a = {
				{true, 	false, 	false, 	true},
				{false, 	true, 	false, 	false},
				{false, 	true, 	false, 	true},
				{false, 	false, 	false, 	true},
				{true, 	true, 	true, 	false}
		};
		System.out.println("************ test Q1 - size START *************");
		
		int res = Ex14.size(a, 0, 0);
		System.out.println("\nrunning size(a, 0, 0); expected 3, got " + res);

		res = Ex14.size(a, 1, 1);
		System.out.println("\nrunning size(a, 1, 1); expected 3, got " + res);

		res = Ex14.size(a, 2, 2);
		System.out.println("\nrunning size(a, 2, 2); expected 0, got " + res);

		res = Ex14.size(a, 4, 0);
		System.out.println("\nrunning size(a, 4, 0); expected 5, got " + res);

		System.out.println("\n************ test Q1 - size END *************");


		System.out.println("\n************ test Q2 - isPermutation START *************");
		int [] a1 = {1, 2, 3, 4};
		int [] b1 = {1, 2, 3, 4};
		boolean ans = Ex14.isPermutation(a1, b1);
		System.out.println("\nrunning isPermutation{a1, b1}; expected true, 	got " + ans);

		int [] a2 = {1, 2, 3, 4};
		int [] b2 = {1, 2, 3, 2};
		ans = Ex14.isPermutation(a2, b2);
		System.out.println("\nrunning isPermutation{a2, b2}; expected false,	got " + ans);

		int [] a3 = {1, 2, 3, 4};
		int [] b3 = {4, 2, 1, 3};
		ans = Ex14.isPermutation(a3, b3);
		System.out.println("\nrunning isPermutation{a3, b3}; expected true, 	got " + ans);

		int [] a4 = {1, 2, 2, 4};
		int [] b4 = {4, 2, 1, 2};
		ans = Ex14.isPermutation(a4, b4);
		System.out.println("\nrunning isPermutation{a4, b4}; expected true, 	got " + ans);

		int [] a5 = {1, 2, 2, 4, 5};
		int [] b5 = {4, 5, 1, 2};
		ans = Ex14.isPermutation(a5, b5);
		System.out.println("\nrunning isPermutation{a5, b5}; expected false,	got " + ans);

		
		System.out.println("\n************ test Q2 - isPermutation END *************");

	}

	public static void main2(String[] args) {
	    int [] a5 = {1, 2, 2, 4, 5};
		int [] b5 = {4, 5, 1, 2};
		
		int [] x4 = {2,2,3,3,5,1};
		int [] x5 = {3,3,2,2,5,5};
		
		System.out.println("a5 is: "); Ex14.print(a5);
	    System.out.println("b5 is: "); Ex14.print(a5);
	    System.out.println("x4 is: "); Ex14.print(x4);
	    System.out.println("x5 is: "); Ex14.print(x5);
	    
	    Ex14.sortArray(a5,a5.length-1);
	    Ex14.sortArray(b5,b5.length-1);
	    Ex14.sortArray(x4,x4.length-1);
	    Ex14.sortArray(x5,x5.length-1);
	    
		System.out.println("a5 is: "); Ex14.print(a5);
	    System.out.println("b5 is: "); Ex14.print(a5);
	    System.out.println("x4 is: "); Ex14.print(x4);
	    System.out.println("x5 is: "); Ex14.print(x5);
	   }
}
