// Stack1.java
// Simple Stack interface is implemented using a linked list
// The linked list used is a simple node class called N.  (See N.java)
//from lecture
public class Stack1 implements Stack {
    private N start = null;
    // constructor

    public Stack1() {}
    
    // selectors

    public void push(Object o) {
        start = new N(o, start);
    }

    public Object pop() {
        if (start == null)
            try {
                throw new EmptyException();
            } catch (EmptyException e) {
                e.printStackTrace();
            }
        else {
          Object data = start.getData();
          start = start.getNext();
          return data;
        }
        return "Shouldn't get to this";
    }

    public Object top() {
        if (start == null)
          return null;
        else return start.getData();
    }

    public boolean isEmpty() {
        if (start == null)
          return true;
        else return false;
    }

    // instance variables



}  // Stack1 class
