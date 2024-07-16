package com.neoofcomstudio.godot3_5_3_demo_plugin.utils.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface GodotMethod {
    //boolean isGodotMethod() default true;
}
