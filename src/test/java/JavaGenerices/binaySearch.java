package JavaGenerices;

public class binaySearch {

    public static void main(String[] args) {
        int[] arr1= {-10,-2,0,6,8,12,13,15,18,39};
        int target =6;
        System.out.println(binarySearch(arr1,target));
        System.out.println(binarySearch(arr1,-10));
        System.out.println(binarySearch(arr1,15));

        System.out.println("***************");
        int[] arr2= {39,22,12,8,6,5,1,0};
        System.out.println(binarySearchAnogistics(arr2,39));
        System.out.println(binarySearchAnogistics(arr2,-12));
        System.out.println(binarySearchAnogistics(arr2,-38));


    }

    //Generic binay search
    public static int binarySearch(int[] arr1, int target) {

        int left =0;   //start=0;
        int right =arr1.length-1;    //end=arr1.length-1

        while(left <= right)  // while(start < end)  <= *** IMP else will mis the negative elemlent some times**
        {
         int mid = left + (right -left)/2;    //   mid = start + (end -start)/2;

           if(arr1[mid] < target )
            {
                left = mid + 1;           //  start = mid + 1;
            } else if (arr1[mid] > target) {
                right = mid -1;            //  end = mid - 1;
            }
            else {
                return mid; // ans found
            }


        }
        return -1;
    }

    //Generic binay search --> check this method again
    public static int binarySearchAnogistics(int[] arr1, int target) {

        int left =0;   //start=0;
        int right =arr1.length-1;    //end=arr1.length-1

        boolean isAsc = arr1[left] <arr1[right];

        while(left <= right)  // while(start < end)  <= *** IMP else will mis the negative elemlent some times**
        {
            int mid = left + (right -left)/2;    //   mid = start + (end -start)/2;

            if(arr1[mid]== target)
            {
                return mid; // ans found
            }

           if(isAsc)
           {
               if(arr1[mid] < target )
               {
                   left = mid + 1;           //  start = mid + 1;
               } else if (arr1[mid] >target ) {
                   right = mid -1;            //  end = mid - 1;
               }
           }
           else
           {
               if(target > arr1[mid])
               {
                   left = mid - 1;           //  start = mid + 1;
               } else  {
                   right = mid +1;            //  end = mid - 1;
               }
           }




        }
        return -1;
    }
}
