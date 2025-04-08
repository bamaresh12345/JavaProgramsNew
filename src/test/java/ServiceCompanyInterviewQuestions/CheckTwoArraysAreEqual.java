package ServiceCompanyInterviewQuestions;

public class CheckTwoArraysAreEqual {

    public static boolean checkArraysareEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length)
            return false;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i])
                return false;
        }
        return true;

        /*  OR
            Arrays.sort(arr1);
            Arrays.sort(arr1);
           If(Arrays.equal(arr1,arr2))
           return true;
           else
           return false;

         */


    }

    public static void main(String args[]) {

        int[] arr1 = {2, 5, 1, 7, 4};

        int[] arr2 = {2, 5, 1, 7, 4, 8};

        System.out.println(checkArraysareEqual(arr1, arr2));
    }
}
