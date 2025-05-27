package remind;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Remaind {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(List.of("가","A","10","나","가","A","10","나"));
		System.out.println(list.subList(3, 5)); //[나,가]
		
		String str =  String.join("-", list);
		System.out.println(str); //리스트를 문자로 / 스플릿의 반대
		
		List<String> list2 = Arrays.asList(str.split("-"));
		
		list.addAll(list2);
		System.out.println(list2);
		
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		System.out.println(stack);
		System.out.println(stack.pop()); 
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack);
	
		//-----------------------------------
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		System.out.println(queue);
		
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue);
		
		
		
		
	}
}
