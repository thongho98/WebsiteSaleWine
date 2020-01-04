package validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import dto.RegisterRequest;

public class UserValidator implements Validator {
	@Override
	public boolean supports(Class<?> arg0) {
		return RegisterRequest.class.equals(arg0);
	}

	@Override
	public void validate(Object target, Errors error) {


	}
}
