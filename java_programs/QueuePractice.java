/*Q1: Create a queue of integers. Perform the following operations: 
	- Add 3 elements (10, 20, 30)
	- Remove one element
	- Print the front element
	- Print the entire queue

Q2: Given a queue of integers, reverse its elements and print the final queue. Input: [1, 2, 3, 4] Output: [4, 3, 2, 1]

Q3: Write a program to display all elements of a queue without removing them. Without using Poll.
 */

import java.util.*;
public class QueuePractice {
    public static void main(String[] args) {
        Queue<Integer> que = new ArrayDeque<>();
        // que.offer(1);
        // que.offer(2);
        // que.offer(3);
        // que.offer(1);
        // System.out.println(que);
        // System.out.println(que.peek());
        // que.poll();
        // System.out.println(que);
        // que.add(5);
        // System.out.println(que);
        // que.remove();
        // System.out.println(que);
        // que.remove(1);
        // System.out.println(que);

        Queue<Integer> q1 = new LinkedList<>();
        q1.offer(1);
        q1.offer(2);
        q1.offer(3);
        q1.offer(4);
        System.out.println("original: " + q1);
        // que1(q1);
        // que2(q1);
        que3(q1);
    }

    public static void que3(Queue<Integer> que){
        Iterator itr = que.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public static void que1(Queue<Integer> q1){
        // Collections.sort(q1);   not possible
        Deque<Integer> revque = new ArrayDeque<Integer>();
        int size = q1.size();
        for(int i = 0; i <= size-1; i++){
            int a = q1.poll();
            revque.offerFirst(a);
        }
        System.out.println("reversed: " + revque);
        
    }
    public static void que2(Queue<Integer> q1){
        Deque<Integer> que = new ArrayDeque<>();
        // better way = use stack - (1)poll queue ele and add in stack 
        //                          (2)pop stack ele and offer it back to queue

        // way 1 - without polling out ele of queue
        // Iterator itr = q1.iterator();
        // while(itr.hasNext()){
        //     Object o = itr.next();
        //     que.offerFirst((Integer) o);
        // }
        // way2 - with polling out ele of queue
        int n = q1.size();
        for(int i = 0; i <= n-1; i++){
            int a = q1.poll();
            que.offerFirst(a);
        }
         System.out.println(que);

    }
}
