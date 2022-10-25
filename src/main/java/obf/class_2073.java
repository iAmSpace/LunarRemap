package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

public final class class_2073
implements ParameterizedType {
    public class_2073() {
    }

    @Override
    public Type[] getActualTypeArguments() {
        return new Type[]{String.class};
    }

    @Override
    public Type getRawType() {
        return List.class;
    }

    @Override
    public Type getOwnerType() {
        return null;
    }
}

