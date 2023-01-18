public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(12);
//        System.out.println(stack.peek());
        stack.push(15);
//        System.out.println(stack.peek());
        stack.push(3);
//        System.out.println(stack.peek());

        stack.forEach(System.out::println);
    }
}