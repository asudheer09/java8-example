package com.example.java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("one", "two");
		List<String> list2 = Arrays.asList("three", "four", "five");
		List<String> list3 = Arrays.asList("six");
		List<String> finalList = Stream.of(list1, list2, list3)
										.flatMap(Collection::stream)
										.collect(Collectors.toList());
		System.out.println(finalList);
		//[one, two, three, four, five, six]
	}

}
