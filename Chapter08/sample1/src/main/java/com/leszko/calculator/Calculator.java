package com.leszko.calculator;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Calculator service class that provides basic arithmetic operations.
 *
 * @author Binbin
 */
@Service
public class Calculator {

	/**
        * Constant representing the number 3.
        */
        final static int umlNUMBER1 = 3;

	/**
        * Calculates the sum of two integers and caches the result.
        *
        * @param a the first integer
        * @param b the second integer
        * @return the sum of a and b
        */
	@Cacheable("sum")
	public int sum(int a, int b) {
		return a + b;
	}
}
