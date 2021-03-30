//Name:Ciaran Bishop 
//Student ID:19374275
//User Name:
//Subject:CSE30AD
//Assignment:Part1
//Reference:
//Date due:26/09/2018
//Completed date: 25/09/2018

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*	Define annotation interface Min
*/

@Retention(RetentionPolicy.RUNTIME)
// Process this annotation at runtime

@Target(ElementType.FIELD)
// This is an annotation on a field (attribute)

public @interface Max {
	public double value();
	public boolean inclusive() default true;
}