package Trive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class ReverseSublist {

    public static void main(String[] args) {
        // Generate random integer bound to get maximal five elements from the ArrayList
        Random random = new Random();
        int b = random.nextInt(6 - 2) + 2;

        // Generate an ArrayList as an immutable object
        ArrayList<Integer> price = new ArrayList<>(Collections.singleton(9999));
        // The statement has generated to add 100 elements as random
        IntStream.range(0, 100).forEachOrdered(i -> price.add(new Random().nextInt(1000)));

        // Generate subList through the random number
        List<Integer> subPrice = price.subList(price.size() - b, price.size());
        // subPrice has sorted as a reverse
        subPrice.sort(Collections.reverseOrder());
        System.out.println(subPrice);
    }
}
