public class Stack<Item> implements StackInterface <Item>
{
    private Item myStack[];
    private int top;
    private int initSize;
//    private final static int DEFAULT_SIZE = 50;


//    public Stack ()
//    {
//        this(DEFAULT_SIZE);
//    }

    public Stack (int initSize) {
        this.initSize = initSize;
        myStack = (Item[]) new Object [initSize];
        top = -1;
    }

    public Item getTop() {
        if (top == -1)
            return null;
        return myStack[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public Item pop() {
        if (top == -1)
            return null;
        return myStack[top--];
    }

    public void push(Item itm) {
        if (top == initSize - 1) // if stack is full
            throw new IndexOutOfBoundsException("Stack is smaller then yotu input !");
//            throw new FullStackException(String.format("Stack is full, cannot push %s", pushValue));
        myStack[++top] = itm;
    }

    public int size() {
        return (top + 1);
    }
}