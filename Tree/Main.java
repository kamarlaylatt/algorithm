package Tree;

public class Main {
    public static void main(String[] args) {
        // n! = n * (n-1)!
        Tree tree = new Tree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);

        Tree tree2 = new Tree();
        tree2.insert(7);
        tree2.insert(4);
        tree2.insert(9);
        tree2.insert(1);
        tree2.insert(6);
        tree2.insert(8);
        tree2.insert(11);
        tree.traverseLevelOrder();

        // tree.swapRoot();

    }

    public static int factorial(int n) {
        // Base condition
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }

    // public static int factorial(int n) {
    // var factorial = 1;
    // for (var i = n; i > 1; i--) {
    // factorial *= i;
    // }
    // return factorial;
    // }
}
