package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class class_1736 {
    public static Object lllIIIllIIIIlllIlIIllIIll(Object object, Class class_, Class class_2) {
        return class_1736.lllIIIllIIIIlllIlIIllIIll(object, class_, class_2, 0);
    }

    public static Object lllIIIllIIIIlllIlIIllIIll(Object object, Class class_, Class class_2, int n) {
        Class<?> class_3 = object.getClass();
        while (!class_3.equals(class_) && class_3.getSuperclass() != null) {
            class_3 = class_3.getSuperclass();
        }
        int n2 = 0;
        Field[] arrfield = class_3.getDeclaredFields();
        for (int i = 0; i < arrfield.length; ++i) {
            if (!class_2.equals(arrfield[i].getType())) continue;
            if (n2 == n) {
                try {
                    arrfield[i].setAccessible(true);
                    return arrfield[i].get(object);
                }
                catch (IllegalAccessException illegalAccessException) {
                    // empty catch block
                }
            }
            ++n2;
        }
        return null;
    }

    public static Object lllIIIllIIIIlllIlIIllIIll(Object object, String string) {
        Field[] arrfield = object.getClass().getFields();
        for (int i = 0; i < arrfield.length; ++i) {
            if (!string.equals(arrfield[i].getName())) continue;
            try {
                arrfield[i].setAccessible(true);
                return arrfield[i].get(object);
            }
            catch (IllegalAccessException illegalAccessException) {
                // empty catch block
            }
        }
        return null;
    }

    public static ArrayList lllIlIIlIIIlIlIIIllIlllIl(Object object, Class class_, Class class_2) {
        ArrayList<Field> arrayList = new ArrayList<Field>();
        Class<?> class_3 = object.getClass();
        while (!class_3.equals(class_) && class_3.getSuperclass() != null) {
            Field[] arrfield = class_3.getDeclaredFields();
            for (int i = 0; i < arrfield.length; ++i) {
                if (!class_2.equals(arrfield[i].getType())) continue;
                arrfield[i].setAccessible(true);
                arrayList.add(arrfield[i]);
            }
            class_3 = class_3.getSuperclass();
        }
        return arrayList;
    }

    public static Field IlIllllllIIlIIllllIIlIIIl(Object object, Class class_, Class class_2) {
        return class_1736.lllIlIIlIIIlIlIIIllIlllIl(object, class_, class_2, 0);
    }

    public static Field lllIlIIlIIIlIlIIIllIlllIl(Object object, Class class_, Class class_2, int n) {
        Class<?> class_3 = object.getClass();
        while (!class_3.equals(class_) && class_3.getSuperclass() != null) {
            class_3 = class_3.getSuperclass();
        }
        int n2 = 0;
        Field[] arrfield = class_3.getDeclaredFields();
        for (int i = 0; i < arrfield.length; ++i) {
            if (!class_2.equals(arrfield[i].getType())) continue;
            if (n2 == n) {
                arrfield[i].setAccessible(true);
                return arrfield[i];
            }
            ++n2;
        }
        return null;
    }

    public static Method lllIIIllIIIIlllIlIIllIIll(Class class_, Class class_2, Class ... arrclass) {
        return class_1736.lllIIIllIIIIlllIlIIllIIll(0, class_, class_2, arrclass);
    }

    public static Method lllIIIllIIIIlllIlIIllIIll(int n, Class class_, Class class_2, Class ... arrclass) {
        Method[] arrmethod = class_.getDeclaredMethods();
        int n2 = 0;
        for (int i = 0; i < arrmethod.length; ++i) {
            if (!class_2.equals(arrmethod[i].getReturnType())) continue;
            Class<?>[] arrclass2 = arrmethod[i].getParameterTypes();
            if (arrclass.length == arrclass2.length) {
                boolean bl = true;
                for (int j = 0; j < arrclass.length; ++j) {
                    if (arrclass[j] == arrclass2[j]) continue;
                    bl = false;
                }
                if (n2 == n) {
                    arrmethod[i].setAccessible(true);
                    return arrmethod[i];
                }
            }
            ++n2;
        }
        return null;
    }

    public static boolean lllIIIllIIIIlllIlIIllIIll(String string) {
        try {
            Class.forName(string);
            return true;
        }
        catch (ClassNotFoundException classNotFoundException) {
            return false;
        }
    }
}

