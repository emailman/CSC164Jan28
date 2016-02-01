package p1;

public class Main {

    public static void main(String[] args) {
        int a = 4;
        int b = 1;
        int c = 8;

        System.out.println("The biggest number = " + biggest(a, b, c));
    }

    static int biggest(int n1, int n2, int n3) {
        return  biggest(biggest(n1, n2), n3);
    }

    static int biggest(int n1, int n2) {
        return (n1 > n2) ? n1 : n2;
    }
}
