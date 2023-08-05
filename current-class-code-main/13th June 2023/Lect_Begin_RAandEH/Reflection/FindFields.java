package FairWork.Lect_Begin_RAandEH.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class FindFields {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class pdetails = Class.forName("FairWork.Lect_Begin_RAandEH.Reflection.Person");
        Constructor ctorWith2Params = pdetails.getDeclaredConstructor(int.class, String.class);
        Object p = ctorWith2Params.newInstance(10, "Sumeet");
        System.out.println(p);

        Field ageField = pdetails.getDeclaredField("age");
        ageField.setAccessible(true);

        int valueOfAgeField = (int)ageField.get(p);
        System.out.println(valueOfAgeField);

        ageField.set(p, 20);
    }
}
