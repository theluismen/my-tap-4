package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)               // Annotación APLICABLE a CLASES
@Retention(RetentionPolicy.RUNTIME)     // Annotación DISPONIBLE durante el TIEMPO DE EJECUCIÓN
public @interface MyAnnotation {
    public String   type()      default "Normal";
    public int      priority()  default 1;
}
