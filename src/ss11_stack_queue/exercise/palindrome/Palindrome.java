package ss11_stack_queue.exercise.palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
  public Palindrome(){
  }
  public boolean testString(String string){
    Stack<String> stack = new Stack<>();
    Queue<String> queue=new LinkedList<>();
    String[]array =string.split("");
    for (int i = 0; i < array.length; i++) {
      stack.push(array[i]);
      queue.add(array[i]);
    }
    for (int i = 0; i <stack.size() ; i++) {
      if (!queue.poll().equals(stack.pop())){
        return false;
      }
    }
    return true;
  }

}
