package java_8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
	public static void main(String[] args) {
		
		String[] array = {"", "AA", "BB", "CC", "DD"};
		
		List<String> strList = Arrays.asList(array);
		
		foreachPrint(strList, (String str) -> System.out.println(str.toLowerCase()));
	}
	
	public static void foreachPrint (List<String> list, Consumer<String> consumer) {
		for( String str : list) {
			consumer.accept(str);
		}
	}
}
