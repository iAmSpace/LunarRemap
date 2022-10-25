package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.TypeAdapter
 *  com.google.gson.TypeAdapterFactory
 *  com.google.gson.reflect.TypeToken
 */
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import java.util.HashMap;
import java.util.Locale;

public class class_1351
implements TypeAdapterFactory {
    public TypeAdapter create(Gson gson, TypeToken typeToken) {
        Class class_ = typeToken.getRawType();
        if (!class_.isEnum()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Object t : class_.getEnumConstants()) {
            hashMap.put(this.lllIIIllIIIIlllIlIIllIIll(t), t);
        }
        return new class_1642(this, hashMap);
    }

    private String lllIIIllIIIIlllIlIIllIIll(Object object) {
        return object instanceof Enum ? ((Enum)object).name().toLowerCase(Locale.US) : object.toString().toLowerCase(Locale.US);
    }

    static /* synthetic */ String lllIIIllIIIIlllIlIIllIIll(class_1351 class_13512, Object object) {
        return class_13512.lllIIIllIIIIlllIlIIllIIll(object);
    }
}

