package Patterns;

public class Main {
    public static void main(String[] args) {
        print(4);
    }

    public static void print(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}

