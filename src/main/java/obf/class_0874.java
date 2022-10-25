package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;

class class_0874
implements ParameterizedType {
    final /* synthetic */ class_2090 lllIIIllIIIIlllIlIIllIIll;

    class_0874(class_2090 class_20902) {
        this.lllIIIllIIIIlllIlIIllIIll = class_20902;
    }

    @Override
    public Type[] getActualTypeArguments() {
        return new Type[]{String.class};
    }

    @Override
    public Type getRawType() {
        return Collection.class;
    }

    @Override
    public Type getOwnerType() {
        return null;
    }
}

