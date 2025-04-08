package extraLearnALLRepeated;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class RandomString {

    public static void main(String[] args) {

        Random rnd = new Random(100);

        System.out.println(rnd.nextInt(100));
        System.out.println(rnd.nextInt(100));
        System.out.println(rnd.nextInt(100));
         System.out.println(rnd.nextInt(100));

        String rs = RandomStringUtils.randomAlphabetic(10);

        System.out.println(rs);

        int nn = Integer.parseInt(RandomStringUtils.randomNumeric(100));

        System.out.println(nn);

    }
}
