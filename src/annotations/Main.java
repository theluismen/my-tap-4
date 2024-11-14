package annotations;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        Class<?> class1 = Class1.class;
        Class<?> class2 = Class2.class;

        if ( class1.isAnnotationPresent( MyAnnotation.class ) ) {
            MyAnnotation myAnnotation = class1.getAnnotation( MyAnnotation.class );
            System.out.println( myAnnotation.type() );          // type = Normal ( default )
            System.out.println( myAnnotation.priority() );      // priority = 1 ( default )s
        }

        if ( class2.isAnnotationPresent( MyAnnotation.class ) ) {
            MyAnnotation myAnnotation = class2.getAnnotation( MyAnnotation.class );
            System.out.println( myAnnotation.type() );          // type = High
            System.out.println( myAnnotation.priority() );      // priority = 0
        }
    }
}