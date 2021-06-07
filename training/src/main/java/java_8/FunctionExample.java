package java_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
	public static void main(String[] args) {
		
		String[] array = {"", "sai", "ram", "", "virat", "kohli", "dhoni"};
		List<String> strList = Arrays.asList(array);
		List<Integer> resultList = getStringLenght(strList, (String str)-> str.length());
		System.out.println(resultList);
		
	}

	private static List<Integer> getStringLenght(List<String> list,Function<String, Integer> function) {
		
		List<Integer> finalList = new ArrayList<>();
		for(String str : list) {
			finalList.add(function.apply(str));
		}
		return finalList;
	}
	
}
