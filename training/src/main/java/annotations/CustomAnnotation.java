package annotations;
import java.lang.annotation.*;

// @interface is used to make custom annotations

// Marker annotation An annotation that has no method @Override and @Deprecated are marker annotations.

// Single-Value annotation has one method

// Multi -Value annotation has more than one method

// @Target tag is used to specify at which type, the annotation is used.

// @Retention annotation is used to specify to what level annotation will be available.

// @Inherited annotation marks the annotation to be inherited to subclasses


@Target(ElementType.TYPE)

@Retention(RetentionPolicy.RUNTIME) 




@interface SmartPhone{
	
	String os() default "Andriod";
	int version() default 9;
	
}

@SmartPhone(os = "IOS", version = 10 )

class Mobile{
	
	String processor;
	int price;
	
	public Mobile(String processor, int price) {
		
		this.processor = processor;
		this.price = price;
	}
	
	
}

public class CustomAnnotation {
	

	@SuppressWarnings({ "unchecked", "rawtypes" })
	
	public static void main(String[] args) {
		
		Mobile phone = new Mobile("Snapdragon888",39999);
		
		
		
		Class demo = phone.getClass();
		
		
		Annotation annotation = demo.getAnnotation(SmartPhone.class);
		
		SmartPhone smartPhone = (SmartPhone) annotation;
		
		System.out.println(smartPhone.os());
	}

}
