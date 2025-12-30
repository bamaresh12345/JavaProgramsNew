package JavaGenerices;

public class Loops {

    public static void main(String[] args) {

        int[] arr = {3,1,5,6};

        for (int i = arr.length-1; i >=0; i--) {  //  i = 4-1 ; i>=0; i--***
            System.out.println(" Just for loop number : " + arr[i]);  // print in reverse order
        }

        for(int i=0; i<10; i++)
        {
            System.out.println(" Just for loop number : " + i);
        }

        for(int i=0; i<10; i++)
        {


            if(i==3)
                continue;

            if(i==5)
            {
                System.out.println(" number : " + i + 12);
                break;
            }

            System.out.println(" number : " + i);
        }
/*
        while (i > 0)  --> When i == 0 or j == 0, index 0 is still a valid element
         while (j > 0) --> When i == 0 or j == 0, index 0 is still a valid element

         🧾 Quick Cheat Sheet
        Goal	      Start	            Condition	        Move
     array forward	    0	            i < arr.length	    i++
     array backward	arr.lenght-1	        i >= 0	        i--
        0 → 10	        0	            i <= 10	            i++
        0 → 9	        0	            i < 10	            i++
        n → 0	        n	            i >= 0	            i--

        If pointer moves backward → condition must use >= 0.
        If pointer moves forward → condition must use < length.

✅ 2️⃣ Forward Loop: 0 → 9 (Array of size 10)
        int i = 0;
        while (i < arr.length) {   //while (i <= arr.length) -- gives ArrayIndexOutOfBounds
        System.out.println(arr[i]);
        i++;
        }

  ✅ 3️⃣ Backward Loop: 10 → 0 (Inclusive)
     int i = 10;
        while (i >= 0) {   // while (i > 0) --> this will miss 0th element
        System.out.println(i);
        i--;
    }

    ✅ 4️⃣ Backward Loop: Last Index → 0 (Array)
    ✔️ Correct
    int i = arr.length - 1;
    while (i >= 0) {
        System.out.println(arr[i]);
        i--;
    }

    🚫 Common Generic Mistakes
        Mistake	                        Result
        i > 0 instead of i >= 0	        Miss index 0
        i <= arr.length	                ArrayIndexOutOfBounds
        Forward condition with i--	    Infinite loop
        Backward condition with i++	     loop
 */

        /*
        🔹 6️⃣ Nested for Loops (Matrix / Pattern)
                Case	        for loop
                Row-wise	    for (int i = 0; i < rows; i++)
                Column-wise	    for (int j = 0; j < cols; j++)
         */

        /*

        🔹 7️⃣ Enhanced for loop (Read-only)
                Case	    Syntax
                Array	    for (int x : arr)   // ** IMP    ❌ Cannot modify structure
                List	    for (String s : list)  //  ❌ Cannot modify structure

                ❌ No index access
                ❌ Cannot modify structure

         */
/*=================================================================================

🧠 Why while (left < right)?
•	When pointers meet or cross → everything already reversed
•	Avoids double swapping
•	⚠️ COMMON MISTAKES
•	❌ Using left <= right (extra swap)
    ❌ Forgetting left++ or right--
    ❌ Using extra array (not in-place)

 */

        /*
        🧠 Common Mistakes in for Loops
Mistake	                                Example	        Why it’s Wrong / Effect
=======================================================================================================
Off-by-one (inclusive/exclusive)	for(int i = 0; i <= arr.length; i++) -->	arr[arr.length] → ArrayIndexOutOfBounds
Wrong direction	                    for(int i = 0; i >= 0; i++)	 --> Infinite loop or skips elements
Wrong step	                        for(int i = arr.length - 1; i > 0; i++)	 --> Backward loop but incrementing → skips 0 or infinite loop
Modifying index inside loop incorrectly	for(int i = 0; i < n; i++) { i++; }	 --> Skips elements unintentionally
Using wrong array length	        for(int i = 0; i <= n; i++)	 --> If n = arr.length -1, goes out of bounds
Nested loop variable reuse	        for(int i=0;i<n;i++){ for(int i=0;i<m;i++){...}}  -->	Inner loop overwrites outer loop variable → bug
Empty loop body confusion	        for(int i=0;i<n;i++); { doSomething(); }  -->	Semicolon ends loop → executes block once, not in loop
         */

        /*
        🧠 Common Mistakes in while Loops
    Mistake	                                    Example	            Why it’s Wrong / Effect
    Off-by-one / skipping first or last index	while(i > 0) { ... }	Skips i=0 element
    Infinite loop	                            while(i < n) { ... }    but forgot i++	Never terminates
    Wrong condition direction	                while(i >= 0) { i++ }	Infinite loop because i keeps increasing
    Using wrong array length	                while(i <= arr.length)	ArrayIndexOutOfBounds at i = arr.length
    Comparing wrong variable	                while(j < n && i < n)	Pointer logic may fail; off-by-one bug
    Uninitialized variables	int i; while(i < n)	Compiler error or undefined behavior
         */
        int i=0;

        while(i>2)   // It will not go into while loop becasue 0 is not greater than 2
        {
            System.out.println("While  i>2--> " +i);
            i=i+1;
        }

        while(i<2) // It will go into while loop because i<2 , it will go till 0,1
        {
            System.out.println("While  i<2--> " +i); //prints -> 0,1
            i=i+1;
        }

        i=0;
        while(i<=2)
        {
            System.out.println("While i<=2 --> " +i);   // prints -> 0,1,2
            i=i+1;
        }

        int j=0;
        do {

            System.out.println(" DO While executed once i>2 --> " +j);
            j = j+1;
        } while(j>2);

        int[] arr2323 = {6,8,3};
        System.out.println("Array length  arr.length = 3 ,starts from 1,2,3--> " + arr.length);

        String str ="abc";
        System.out.println("String length  str.length() = 3 ,starts from 1,2,3--> " + str.length());

        char[] chars = str.toCharArray();
        System.out.println("Chars length  chars.length = 3 ,starts from 1,2,3--> " + chars.length);

        for(int k=0; k<arr.length; k++)
        {
            System.out.println("arr value : " + arr[k]);
        }

        for(int k=1; k<arr.length-1; k++)
        {
            System.out.println("arr value startt index 1 : " + arr[k]);
        }


        for(int k=0; k<str.length(); k++)
        {

            System.out.println("str.charAt(i) with 0 value : " +  str.charAt(k));
        }

        for(int k=1; k<str.length()-1; k++)
        {

            System.out.println("str.charAt(i) with k=1 and str.length()-1 value : " +  str.charAt(k));
        }


    }
}
