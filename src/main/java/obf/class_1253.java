package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

final class class_1253
implements ParameterizedType {
    class_1253() {
    }

    @Override
    public Type[] getActualTypeArguments() {
        return new Type[]{String.class, class_0871.class};
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

