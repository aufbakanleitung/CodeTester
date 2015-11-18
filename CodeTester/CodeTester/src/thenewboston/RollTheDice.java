package thenewboston;

import java.util.Arrays;
import java.util.Random;

public class RollTheDice {
	public static void DieCount(int rolls,int faces){ //how many times did you roll each die-face
		Random rand = new Random();
		int freq[]=new int[faces+1];
		int sum=0;
		
		for(int roll=0;roll<rolls;roll++){
			++freq[1+rand.nextInt(faces)];
		}
		
		System.out.println("Face\tFrequency");
		for(int face=1;face<freq.length;face++){
			System.out.println(face+"\t"+freq[face]);
			
			sum+=freq[face];
		}
		System.out.println("\nOut of a total rolls of " + sum);
	}
	
	public static int[] PrimeSieve(int n){
		int array[] = new int[n];
		array[0] = 2;
		return array;
//		System.out.println(Arrays.toString(array));
		
	}
	public static void PrimeSieve2(int N){
//		int N = Integer.parseInt(args[0]);

        // initially assume all integers are prime
        boolean[] isPrime = new boolean[N + 1];
        for (int i = 2; i <= N; i++) {
            isPrime[i] = true;
        }

        // mark non-primes <= N using Sieve of Eratosthenes
        for (int i = 2; i*i <= N; i++) {

            // if i is prime, then mark multiples of i as nonprime
            // suffices to consider mutiples i, i+1, ..., N/i
            if (isPrime[i]) {
                for (int j = i; i*j <= N; j++) {
                    isPrime[i*j] = false;
                }
            }
        }

        // count primes
        int primes = 0;
        for (int i = 2; i <= N; i++) {
            if (isPrime[i]) primes++;
        }
        System.out.println("The number of primes <= " + N + " is " + primes);
	}
}
