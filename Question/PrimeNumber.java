package Question;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.print(1+" ");
        int n = 20;
        for (int i=2; i<=n; i++){
            for (int j=1; j<i; j++){
                if (i%j==0){
                    System.out.print(j+" ");
                }
            }
        }
    }
}
