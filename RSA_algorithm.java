
package com.company; 
// Java Program to Implement the RSA Algorithm
import java.math.*;
import java.util.*;

class RSA_algorithm {
	static int gcd(int e, int z)
	{
		if (e == 0)
			return z;
		else
			return gcd(z % e, e);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int p, q, n, z, d = 0, e, i;

		
		double c;
		BigInteger msgback;

		
		System.out.println("Enter 1st prime number p");
		p = sc.nextInt();

		// 2nd prime number q
		System.out.println("Enter the 2nd prime number q: ");
		q = sc.nextInt();
		n = p * q;
		System.out.println("The value of the n :"+n);
		System.out.println("Enter number to be encrypted and decrypted which should be less then n:");
		int msg = sc.nextInt();
		z = (p - 1) * (q - 1);
		System.out.println("the value of z  = " + z);

		for (e = 2; e < z; e++) {

			// e is for public key exponent
			if (gcd(e, z) == 1) {
				break;
			}
		}
		System.out.println("the value of public-key(e) is:= " + e);

		for (i = 0; i <= 9; i++) {
			int x = 1 + (i * z);
			//Formula used is 
			// de=1mod(n)
			// de=1+i*n
			// d= (1+i*n)/e
			// so, x=1+i*n

			// d is for private key exponent
			if (x % e == 0) {
				d = x / e;
				break;
			}
		}
		System.out.println("the value of private-key(d) is: = " + d);
		c = (Math.pow(msg, e)) % n;
		System.out.println("Encrypted message is : " + c);

		// converting int value of n to BigInteger
		BigInteger N = BigInteger.valueOf(n);

		// converting float value of c to BigInteger
		BigInteger C = BigDecimal.valueOf(c).toBigInteger();
		msgback = (C.pow(d)).mod(N);
		System.out.println("Decrypted message is : "
						+ msgback);
	}

	
}

