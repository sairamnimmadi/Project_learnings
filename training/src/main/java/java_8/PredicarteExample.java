package java_8;

import java.util.*;
import java.util.function.Predicate;

public class PredicarteExample {

	public static void main(String[] args) {
		String[] array = {"", "sai", "ram", "", "virat", "kohli", "dhoni"};
		List<String> strList = Arrays.asList(array);
		
		List<String> listWithoutEmptystr = filterStrings(strList, (String str)-> !str.isEmpty());
		System.out.println(listWithoutEmptystr);
	}
	
	public static List<String> filterStrings(List<String> list, Predicate<String> predicate){
		List<String> finalList = new ArrayList<>();
		for(String str : list) {
			if(predicate.test(str)) {
				finalList.add(str);
			}
		}
		return finalList;
	}
}
