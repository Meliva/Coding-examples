//Name:Ciaran Bishop 
//Student ID:19374275
//User Name:
//Subject:CSE30AD
//Assignment:Part1
//Reference:
//Date due:26/09/2018
//Completed date: 25/09/2018

import java.lang.reflect.*;
import java.lang.annotation.Annotation;

public class NotNullValidator extends Validator {

	private static NotNull notNull;

	public void applyRule(Annotation annotation, Object fieldValue, Class<?> fieldType) throws Exception {
		/**
		 * developer/coder throws for potential annotating errors
		 */
		if (isReflectedAsNumber(fieldType))
			throw new ValidationException(" is a primitive number type or a subclass of Number. Annotation @NotNull for null check cannot be applied.");

		notNull = (NotNull) annotation;
		
		boolean valid = fieldValue != null;
		if (!valid) {
			String message = " must not be null.";
			throw new ValidationException(message);
		}	
	}
}