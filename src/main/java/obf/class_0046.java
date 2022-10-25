package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.TypeAdapterFactory
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapterFactory;
import net.minecraft.util.IChatComponent;

public class class_0046
extends class_0703 {
    private static final Gson lllIIIllIIIIlllIlIIllIIll = new GsonBuilder().registerTypeAdapter(class_0496.class, (Object)new class_0750()).registerTypeAdapter(class_0305.class, (Object)new class_0253()).registerTypeAdapter(class_0111.class, (Object)new class_0538()).registerTypeHierarchyAdapter(IChatComponent.class, (Object)new class_2095()).registerTypeHierarchyAdapter(class_1401.class, (Object)new class_2115()).registerTypeAdapterFactory((TypeAdapterFactory)new class_1351()).create();
    private class_0111 lllIlIIlIIIlIlIIIllIlllIl;

    public class_0046() {
    }

    public class_0046(class_0111 class_01112) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_01112;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0181 class_01812) {
        this.lllIlIIlIIIlIlIIIllIlllIl = (class_0111)lllIIIllIIIIlllIlIIllIIll.fromJson(class_01812.IlIllllllIIlIIllllIIlIIIl(32767), class_0111.class);
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0181 class_01812) {
        class_01812.lllIIIllIIIIlllIlIIllIIll(lllIIIllIIIIlllIlIIllIIll.toJson((Object)this.lllIlIIlIIIlIlIIIllIlllIl));
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0709 class_07092) {
        class_07092.lllIIIllIIIIlllIlIIllIIll(this);
    }

    public class_0111 IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll() {
        return true;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_2075 class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0709)class_20752);
    }
}

