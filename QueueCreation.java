package stackPrograms;

import java.util.LinkedList;
import java.util.Queue;

public class QueueCreation {

    public static void main(String[] args) {
        Queue<Integer> num = new LinkedList<>();
        num.add(56);
        num.add(30);
        num.add(70);
        System.out.println(num);
    }
}
