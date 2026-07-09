package Patterns;

public class Main {
    public static void main(String[] args) {
        pattern19(5);
    }

    public static void pattern1(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void pattern2(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern4(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void pattern5(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n-i+1 ; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void pattern6(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(' ');
            }
            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }


    public static void pattern7(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i-1; j++) {
                System.out.print(' ');
            }
            for (int j = 1; j <=2*n-2*i+1 ; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void pattern8(int n){
        for (int i = 1; i < 2* n; i++) {
           if(i<=n){
               for (int j = 1; j <= n-i; j++) {
                   System.out.print(' ');
               }
               for (int j = 1; j <=2*i-1 ; j++) {
                   System.out.print('*');
               }
           } else{
               for (int j = 1; j <= i-n; j++) {
                   System.out.print(' ');
               }
               for (int j = 1; j <=(2*n-i)*2-1 ; j++) {
                   System.out.print('*');
               }
           }
            System.out.println();
        }
    }


    public static void pattern8a(int n){
        for (int i = 0; i < 2*n; i++) {
            int spaces=i<=n?n-i:i-n;
            int stars= i<=n?2*n-1: (2*n-i)*2-1;

            for (int j = 1; j <=spaces; j++) {
                System.out.print(' ');
            }

            for (int j = 1; j <=stars; j++) {
                System.out.print('*');
            }
            System.out.println();

        }
    }

    public static void pattern9(int n){
        for (int i = 1; i < 2*n; i++) {
            int stars=i>n?2*n-i:i;
            for (int j = 1; j < stars; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void pattern10(int n){
        int start=1;
        for (int i = 1; i < n; i++) {
           if(i%2==0){
               start=0;
           } else {
               start=1;
           }
            for (int j = 1; j <= i; j++) {
                System.out.print(start);
                start=1-start;
            }
            System.out.println();
        }
    }

    public static void pattern11(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <=2*n-2*i; j++) {
                System.out.print(' ');
            }
            for (int j = i; j >0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern12(int n){
        int a=1;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(a+ " ");
                a++;
            }
            System.out.println();
        }
    }

    public static void pattern13(int n){

        for (int i = 1; i <=n; i++) {
            char ch='A';
            for (int j = 1; j <=i; j++) {
                System.out.print(ch+ " ");
                ch+=1;
            }
            System.out.println();
        }
    }

    public static void pattern14(int n){

        for (int i = n; i >0; i--) {
            char ch='A';

            for (int j = 1; j <= i; j++) {
                System.out.print(ch+" ");
                ch+=1;
            }
            System.out.println();
        }
    }

    public static void pattern15(int n){
        char ch='A';
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(ch);
            }
            ch+=1;
            System.out.println();
        }
    }

    public static void pattern16(int n){
        char ch1='A';
        for (int i = 1; i <= n; i++) {
            char ch2='A';

            for (int j = 1; j <=n-i; j++) {
                System.out.print(' ');
            }

            for (int j = 1; j <i; j++) {
                System.out.print(ch2);
                ch2++;
            }

            for (int j = i; j >0; j--) {
                System.out.print(ch2);
                ch2--;
            }
            System.out.println();
        }
    }

//    public static void pattern17(int n){
//        for (int i = n; i ; i++) {
//
//        }
//    }

    public static void pattern18(int n) {
        for (int i = 1; i <= 2 * n; i++) {

            int stars = i <= n ? n - i + 1 : i - n;
            int spaces = i <= n ? 2 * i - 2 : 2 * (2 * n - i);

            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void pattern19(int n) {
        for (int i = 1; i <=n; i++) {

            for (int j = 1; j <=n; j++) {
                if(i==1  || i==n || j==1 || j==n){
                    System.out.print('*');
                } else{
                    System.out.print(' ');
                }
            }

            System.out.println();
        }
    }
}

