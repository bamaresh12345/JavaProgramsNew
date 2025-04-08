package ServiceCompanyInterviewQuestions;

public class FindTripletsWithSumOfTwoEelmentsEqualsThird {

    public static void findTriplets(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) { // **IMP   j = i+1
                for (int k = j+1; k < n; k++) {   // **IMP   k = j+1

                    if(arr[i]+ arr[j]==arr[k])
                    {
                        System.out.println(arr[i] +" "+ arr[j] + " " +arr[k]);
                    } else if (arr[j]+ arr[k]==arr[i]) {
                        System.out.println(arr[j] +" "+ arr[k] + " " +arr[i]);
                    } else if (arr[k]+ arr[i]==arr[j]) {
                        System.out.println(arr[k] +" "+ arr[i] + " " +arr[j]);
                    }

                }

            }

        }

    }

    public static void main(String[] args) {
        int[] arr= {21, 13, 47, 61, 34, 40, 55, 71, 87};
        findTriplets(arr);

    }
}
