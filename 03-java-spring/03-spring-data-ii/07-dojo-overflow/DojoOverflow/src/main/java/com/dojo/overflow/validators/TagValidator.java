package com.dojo.overflow.validators;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import com.dojo.overflow.models.Question;

@Component
public class TagValidator {


    public boolean supports(Class<?> clazz) {
        return Question.class.equals(clazz);
    }
    

    public void validate(Object target, Errors errors) {
    	Question question = (Question) target;
      
    	String[] tags = question.getTagsFromFrontEnd().split(", ");
        		
    	if(tags.length > 3) {
        			errors.rejectValue("tagsFromFrontEnd", "too Many", "Less than 3 tags");
        		}
        		
    }
}
