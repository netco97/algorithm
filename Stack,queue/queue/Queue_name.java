package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_name
{
    public static void main(String[] args)
    {
        Queue<String> queue = new LinkedList<>();
        queue.add("test1");
        System.out.println(queue);
        queue.add("test2");
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);

        /*
        queue.offer(1);     // queue에 값 1 추가
        queue.offer(2);     // queue에 값 2 추가
        queue.offer(3);     // queue에 값 3 추가
        queue.poll();       // queue에 첫번째 값을 반환하고 제거 비어있다면 null
        queue.remove();     // queue에 첫번째 값 제거
        queue.clear();      // queue 초기화
        */



    }
}
