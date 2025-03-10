package customqualifier;

import java.lang.annotation.Target;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType; 
import java.lang.annotation.Retention; 
import java.lang.annotation.RetentionPolicy; 

@Qualifier
@Target({ ElementType.FIELD, ElementType.PARAMETER, ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomQualifier {
	String value() default "";

}
