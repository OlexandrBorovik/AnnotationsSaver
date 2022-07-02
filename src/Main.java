import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        TextContainer c = new TextContainer();

        final Class<?> cls = TextContainer.class;
        Class[] classes = cls.getDeclaredClasses();
        for (Class clas: classes)
            if(clas.isAnnotationPresent(SaveTo.class)) {
                SaveTo st = (SaveTo) clas.getAnnotation(SaveTo.class);
                String strr = st.file();
                TextContainer.Containre tc = new TextContainer.Containre();
                Method[] methods = tc.getClass().getDeclaredMethods();
                for (Method method : methods) {

                    if (method.isAnnotationPresent(Saver.class)) {
                         method.invoke(tc,strr);



                    }

                }
            }
    }

}
