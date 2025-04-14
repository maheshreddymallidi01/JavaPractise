package com.practise.FunctionalProgramming;

import java.util.Collection;
import java.util.function.Supplier;

public class ConstructorMethodReference {

	public static <T,DEST extends Collection<T>, Source extends Collection<T>> DEST transform(Source source, Supplier<DEST> supplier) {
		DEST destination = supplier.get();
		destination.addAll(source);
		return destination;
	}
}
