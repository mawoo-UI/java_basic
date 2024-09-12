package lesson09_interface;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface UserAnno {
String value() default "";//어노테이션에서만 사용가능한 문법
int number() default 5;
}
