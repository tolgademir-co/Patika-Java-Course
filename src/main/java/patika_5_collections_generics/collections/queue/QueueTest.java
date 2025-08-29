package patika_5_collections_generics.collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {

    public static void main(String[] args) {

        // FIFO -- First In First Out * İLK GELEN İLK ÇIKAR--

        Queue<String> breadQueue = new PriorityQueue<>();

        breadQueue.add("Tolga");
        breadQueue.add("Cem");
        breadQueue.add("Serra");
        breadQueue.add("Ahmet");

        System.out.println(breadQueue);

        breadQueue.remove();

        System.out.println(breadQueue);

    }
}
