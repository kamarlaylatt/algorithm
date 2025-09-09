package Tree;

public class Main {
    public static void main(String[] args) {
        var tree = new AVLTree();
        tree.insert(10);
        tree.insert(30);
        tree.insert(20);

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
