package academy.learnprogramming;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Creating custom annotations
// The annotation MaxNumber can be applied to Fields, Parameters and Methods
@Target({ElementType.FIELD,ElementType.PARAMETER,ElementType.METHOD})
// Indicates, how long it has to be retained
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface GuessCount {
}
