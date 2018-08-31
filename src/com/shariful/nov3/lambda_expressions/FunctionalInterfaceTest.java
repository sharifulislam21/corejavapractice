/*6.	LAMBDA EXPRESSIONS: 
 * Use the functional interfaces Supplier, Consumer, Predicate & Function to invoke built-in methods from Java API.*/

package com.shariful.nov3.lambda_expressions;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceTest {
	
	public static void main(String args[])
	{
		Supplier<Long> supplier=() -> System.currentTimeMillis();
		Consumer<Long> consumer1=(Long a) -> System.out.println(a);
		Consumer<Object> consumer2=(Object b)-> System.out.println(b);
		
		Predicate<String> predicate=(String c) -> c.equals("Xoriant Solutions Pvt. Ltd.");
		Function<String,String> function=(String d) -> d.toUpperCase().concat(" Welcome To Company");
		
		consumer1.accept(supplier.get());
		consumer2.accept(predicate.test("Xoriant Solutions Pvt. Ltd."));
		consumer2.accept(function.apply("Shariful"));
		
		
		
	}

}

