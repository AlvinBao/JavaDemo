package com.hulu.annotation;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Provide info about the program
 */
@Repeatable(value = Goods.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface Good {
}
