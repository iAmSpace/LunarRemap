package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

final class class_0347
implements ParameterizedType {
    class_0347() {
    }

    @Override
    public Type[] getActualTypeArguments() {
        return new Type[]{class_1356.class};
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

