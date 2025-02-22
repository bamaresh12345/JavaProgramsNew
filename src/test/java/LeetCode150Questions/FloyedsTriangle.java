package LeetCode150Questions;

/*

How many rows you want in Floyd's Triangle?
5
Floyd's Triangle :
1
2   3
4   5   6
7   8   9   10
11   12   13   14   15

 */
public class FloyedsTriangle {

    public static void main(String[] args) {


        for (int i = 0; i > 10; i++) {
            for (int j = i; j > i; j++) {

                System.out.print(i);
            }
            System.out.println();
        }
    }
}
