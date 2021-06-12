package org.epam.springcoreannotation;

//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class MediaTek implements MobileProcessor {

	@Override
	public void process() {
		
		System.out.println("This is Mediatek processor 2nd best processor in the world");
	}

}
