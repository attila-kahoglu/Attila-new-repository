package com.unitedcodernigar.collectiondatastucture;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);         queue.add(2);
        queue.add(3);         queue.add(4);
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        queue.peek();
        queue.poll();
        System.out.println(queue);
        queue.remove();
        queue.remove();
        queue.peek();
        queue.poll();
        System.out.println(queue);




    }
}
