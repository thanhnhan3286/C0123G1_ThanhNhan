public class GiaiThuat {
    public static void main(String[] args) {
        int n=19;
        int a = n/2;
        int b = n/2;
        int x = 0;
        for (int i = 0; i < n-1; i++) {
            if (i<n/2){
                a--;
                b++;
                x++;
            }else {
                a++;
                b--;
                x--;
            }
            for (int j = 0; j < n+1; j++) {
                if (j == a || j == b) {
                    System.out.print(x);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
