package com.example.springmvc.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String>
{
    private String coursePrefix;

    @Override
    public void initialize(CourseCode courseCode)
    {
        coursePrefix = courseCode.value();
    }

    @Override
    public boolean isValid(String courseCode, ConstraintValidatorContext constraintValidatorContext)
    {
        if(courseCode != null)
        {
            return courseCode.startsWith(coursePrefix);
        }
        return true;
    }
}
