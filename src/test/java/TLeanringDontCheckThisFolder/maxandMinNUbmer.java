package TLeanringDontCheckThisFolder;

public class maxandMinNUbmer {

    public static void main(String[] args) {

        int arr[] = {50,30,40,20,60};

        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) { // ** IMP FOR Loop Array

            if(arr[i]>max)
                max = arr[i];

            if(arr[i] < min)
                min = arr[i];
        }

        System.out.println("min umber " + min);
        System.out.println("max umber " + max);
    }
}
