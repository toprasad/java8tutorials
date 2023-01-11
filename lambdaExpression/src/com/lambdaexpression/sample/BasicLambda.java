package com.lambdaexpression.sample;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class BasicLambda {

	public static void main(String[] args) {

		Map<Integer, String> employeeMap = new HashMap<>();
		employeeMap.put(1, "anu");
		employeeMap.put(2, "tinu");
		employeeMap.put(3, "sanu");
		employeeMap.put(4, "manu");
		
		Map <Integer,String> sortedEmployeeMap=employeeMap.entrySet().stream()
		.sorted(Map.Entry.comparingByKey())
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		
		sortedEmployeeMap.entrySet().stream().forEach(System.out :: println);
	}

	
// 	Map<String, Map<String, String>> test = resultMap.entrySet().stream()
// 				.filter(e -> LocalDate.parse(e.getValue().get(SCASH_DATE_EFFECT)).compareTo(dateEffect) <= 0)
// 				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

// 		test.entrySet().stream().forEach(System.out::println);
// 		var tst2 = resultMap.entrySet().stream()
// 				.filter(e -> LocalDate.parse(e.getValue().get(SCASH_DATE_EFFECT)).compareTo(dateEffect) <= 0)
// 				.sorted((m1, m2) -> m2.getValue().get(SCASH_DATE_EFFECT)
// 						.compareTo(m1.getValue().get(SCASH_DATE_EFFECT)))
// 				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
// 		test.entrySet().stream().forEach(System.out::println);
}
