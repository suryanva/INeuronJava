public class Main {
    public static void main(String[] args) {

        int  n = 5;
        for (int i = 0; i < n; i++) {
//The alphabet I
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == (n - 1) || j == (n - 1) / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print(" ");
//The Alphabet N
            for (int j = 0; j < n; j++) {
                    if (j==0||i==j||j==(n-1)){
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }

            }
            System.out.print(" ");
//  The Alphabet E
            for (int j = 0; j < n; j++) {
                if (i==0||i==(n-1)/2||i==n-1||j==0){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }

            }
            System.out.print(" ");
//  Alphabet U
            for (int j = 0; j < n; j++) {
                if(j==0&&i!=(n-1)||j==(n-1)&&i!=(n-1)||i==(n-1)&&j!=0&&j!=(n-1)){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }

            }
            System.out.print(" ");
//  Alphabet R
            for (int j = 0; j < n; j++) {
                if(j==0||i==0&&j!=(n-1)||i==(n-1)/2&&j!=(n-1)||i>(n-1)/2&&i==j||j==(n-1)&&i<(n-1)/2&&i!=0&&i!=(n-1)/2){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }

            }
            System.out.print(" ");
//  Alphabet O
            for (int j = 0; j < n; j++) {
                if(i==0&&j!=0&&j!=(n-1)||i==(n-1)&&j!=0&&j!=(n-1)||j==0&&i!=0&&i!=(n-1)||j==(n-1)&&i!=0&&i!=(n-1)){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }

            }
            System.out.print(" ");
//  Alphabet N
            for (int j = 0; j < n; j++) {
                if (j==0||i==j||j==(n-1)){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }

            }
        System.out.println("");
        }
    }
}