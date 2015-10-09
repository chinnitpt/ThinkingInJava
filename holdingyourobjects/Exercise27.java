package holdingyourobjects;

import java.util.*;
class Command{
	private String stringValue;
	
	public Command(String stringValue){
		this.stringValue = stringValue;
	}
	
	public void operation(){
		System.out.println(stringValue);
	}
	
}

class QueueFiller{
	
	public static  Queue<Command> fillQueue(){
		Queue<Command> queue = new LinkedList<Command>();
		for(int i= 0; i<10; i++){
			Command c = new Command(Integer.toString(i));
			queue.offer(c);
		}
		return queue;
	}
	
	
}




public class Exercise27 {

	public static void main(String[] args) {
		Queue<Command> queue = QueueFiller.fillQueue();
		while(queue.peek()!= null){
			queue.poll().operation();
			System.out.println("Queue Size:"+queue.size());
		}
		
	}
}
