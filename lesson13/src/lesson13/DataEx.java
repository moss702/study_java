package lesson13;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DataEx {
	public static void main(String[] args) {
		//==========stack========================
		Stack<String> stack = new Stack<String>();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		//넣고
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());		
		//빼고 (c b a 순으로 나옴)
		
		//==========queue========================
		Queue<String> queue = new LinkedList<String>();
		queue.add("가");
		queue.add("나");
		queue.add("다");
		
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		//que 뺄때는 선입선출!! 가나다 순으로 나옴.
		
		//==========Deque========================
		Deque<String> deque = new LinkedList<String>();
		deque.add("1");
		deque.add("2");
		deque.addFirst("3"); //밑에서 넣기
		System.out.println(deque);
		// [출력] 3, 1, 2
		
		System.out.println(deque.removeLast());
		System.out.println(deque.removeLast());
		System.out.println(deque.removeLast());
		//밑에서부터 빼기
		//2,1,3
	}
}
