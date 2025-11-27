public class Primes {
    public static void main(String[] args) {
        int index = Integer.parseInt(args[0]);
        boolean[] prime = new boolean[index + 1];
        prime[0] = false;
        prime[1] = false;
        for (int i = 2; i < index +1; i++){
            prime[i] = true;
        }

        for (int i = 2; i <= Math.sqrt(index); i++){
            if (prime[i]){
                for (int j = i*2; j < index + 1; j += i){
                    prime [j] = false;
                    }
                }
            }
        System.out.println("Prime numbers up to " + index + ":");
        int count = 0;
        for (int i = 0; i < index +1; i++){
            if (prime[i]){
                count ++;
                System.out.println(i);
            }
        }
        int p = 100 * count / (index);
        System.out.printf("There are %d primes between 2 and %d (%d%% are primes)\n",
                  count, index, p);

    }
}
