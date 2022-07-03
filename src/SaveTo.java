import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Target(value = ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface SaveTo {

    public String file();
}
