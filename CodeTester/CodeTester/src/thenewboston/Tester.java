package thenewboston;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Tester {

	public static void main(String[] args) {
		tuna tunaObject = new tuna();
		tunaObject.eat();
		tunaObject.done();
		//hi
		
	}
	public static int average(int...numbers){ //... is elipse, it means you don't know how many arguments your gonna have
		int total =0;
		for(int x:numbers)
			total+=x;
		return total/numbers.length;
	}
	public static void change(int x[]) {
		for (int counter = 0; counter < x.length; counter++)
			x[counter] += 5;
	}
	public static int[] primeSieve(int n) {
		List<Integer> cleanSieve = new ArrayList<>(); 			//Create ArrayList "cleanSieve"
		int nroot = (int) Math.sqrt(n) + 1; 					// Square root of n
		int[] sieve = IntStream.rangeClosed(2, n).toArray(); 	// Fill list
		for (int i = 2; i < nroot; i++) {
			for (int j = i - 1; j < sieve.length; j++) {
				if(sieve[j] != 0){								//Check if non-prime isn't replaced by zero yet
					if (sieve[j] % i == 0) {
						sieve[j] = 0;							//Replace non-prime with zero
					}
					
				}
			}
		}
//		System.out.println("resultaat: " + Arrays.toString(sieve));
		for (int j:sieve) {
			if(j != 0){
				cleanSieve.add(j);
			}
		}
		System.out.println("The primes from 2 till " + n + " are: \n" + cleanSieve);
		return sieve;
		
		// System.out.println(Arrays.toString(array));
	}
	public static List<Integer> primeSieveTwo(int n) {
		List<Integer> primes = new ArrayList<>();
		boolean[] sieve = new boolean[n];
		Arrays.fill(sieve, true);
		
		for(int i = 2; i < (int) Math.sqrt(n) + 1; i++) {
			if(sieve[i] == true) {
				primes.add(i);
				for(int j = i * i; j < n; j += i) {
					sieve[j] = false;
				}
			}
		}
		
		for(int i = (int) Math.sqrt(n) + 1; i < n; i++) {
			if(sieve[i] == true) {
				primes.add(i);
			}
		}
		
		return primes;
	}
	public static boolean isPrime (int n) {
		if (n < 2)
			return false;
		if (n < 4)
			return true;
		if (n % 2 == 0)
			return false;
		if (n % 3 == 0)
			return false;
		// Speeding up check by using that all primes are 6k+-1 when n > 3
		for(int i = 5; i < (int) Math.sqrt(n) + 1; i += 6) {
			if(n % i == 0) 
				return false;
			if(n % (i + 2) == 0)
				return false;
		}
		
		return n > 1;
	}

}