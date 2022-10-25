package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

public final class class_2090
implements ParameterizedType {

    @Override
    public Type[] getActualTypeArguments() {
        return new Type[]{String.class, new class_0874(this)};
    }

    @Override
    public Type getRawType() {
        return Map.class;
    }

    @Override
    public Type getOwnerType() {
        return null;
    }
}

