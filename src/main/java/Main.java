public class Main {

        public static void main(String args[])
        {
            Stack s = new Stack(20);
            s.push("dom");
            s.push(10);
            s.push(20);
            s.push(30);
            s.push(200);
            s.push(10);
            s.push(20);
            s.push(30);
            s.push(200);
            System.out.println( s.size() );
            System.out.println(s.pop() + " Popped from stack");

        }
}

