package ServiceCompanyInterviewQuestions;

public class FindArrayTripletsWhoseSumIsEqualToGivenNumber {

    public static void findTripletswhosSumEqualstoGivenNumber(int[] arr,int target)
    {
      int n =arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {

                    if(arr[i] + arr[j]==target)
                    {
                        System.out.println(arr[i] +" "+  arr[j] + " = " + target);
                    }


            }
        }


    }

    public static void main(String[] args) {
        int[] arr = {7, 5, 9, 3, 0, 8, 6};
        int target =12;

        findTripletswhosSumEqualstoGivenNumber(arr,target);
    }

}
