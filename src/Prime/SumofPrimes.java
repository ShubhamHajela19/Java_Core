package Prime;

public class SumofPrimes {
    public static void main(String[] args){
        int sum = 0;
        for(int n = 1; n <= 100; n++){
            boolean isPrime = true;
            if(n <= 1){
                isPrime = false;
            }else{
                for(int i = 2; i<= Math.sqrt(n); i++){
                    if(n % i == 0){
                        isPrime = false;
                        break;
                    }
                }
            }
            if(isPrime){
                sum += n;
            }
        }
        System.out.println("Sum of Prime Numbers: " + sum);
    }
}
