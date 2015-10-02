package holdingyourobjects;

import net.mindview.util.Stack;
public class Exercise15 {
	public static void main(String[] args){
		Stack<Character> stack = new Stack<Character>();
		String s = "+U+n+c—+e+r+t—+a-+i-+n+t+y—+ -+r+u—+l+e+s—";
		char[] charArray = s.toCharArray();
		for(int i =0; i<charArray.length; i++){
			if(charArray[i]=='+'){
				stack.push(charArray[i+1]);
			}
			else if(charArray[i]=='-'){
				if(!stack.empty()){
					stack.pop();
				}
			}
		}
		System.out.println(stack);
	}
	
}
