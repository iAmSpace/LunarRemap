package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import net.minecraft.util.ResourceLocation;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class class_1290
implements class_0947 {
    protected final List lllIIIllIIIIlllIlIIllIIll = new ArrayList();
    private final class_0233 lllIlIIlIIIlIlIIIllIlllIl;

    public class_1290(class_0233 class_02332) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_02332;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0449 class_04492) {
        this.lllIIIllIIIIlllIlIIllIIll.add(class_04492);
    }

    @Override
    public Set lllIIIllIIIIlllIlIIllIIll() {
        return null;
    }

    @Override
    public class_2234 getResource(ResourceLocation class_17732) {
        Object object;
        class_0449 class_04492 = null;
        ResourceLocation class_17733 = class_1290.IlIllllllIIlIIllllIIlIIIl(class_17732);
        for (int i = this.lllIIIllIIIIlllIlIIllIIll.size() - 1; i >= 0; --i) {
            object = (class_0449)this.lllIIIllIIIIlllIlIIllIIll.get(i);
            if (class_04492 == null && object.lllIlIIlIIIlIlIIIllIlllIl(class_17733)) {
                class_04492 = object;
            }
            if (!object.lllIlIIlIIIlIlIIIllIlllIl(class_17732)) continue;
            InputStream inputStream = null;
            if (class_04492 != null) {
                inputStream = class_04492.lllIIIllIIIIlllIlIIllIIll(class_17733);
            }
            return new class_2149(class_17732, object.lllIIIllIIIIlllIlIIllIIll(class_17732), inputStream, this.lllIlIIlIIIlIlIIIllIlllIl);
        }
        String string = "assets/minecraft/" + class_17732.lllIIIllIIIIlllIlIIllIIll();
        if (class_0298.IlIllllllIIlIIllllIIlIIIl(string)) {
            object = class_0298.lllIIIllIIIIlllIlIIllIIll(string);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[])object);
            ByteArrayInputStream byteArrayInputStream2 = null;
            if (class_0298.IlIllllllIIlIIllllIIlIIIl(string + ".mcmeta")) {
                byteArrayInputStream2 = new ByteArrayInputStream(class_0298.lllIIIllIIIIlllIlIIllIIll(string + ".mcmeta"));
            }
            return new class_2149(class_17732, byteArrayInputStream, byteArrayInputStream2, this.lllIlIIlIIIlIlIIIllIlllIl);
        }
        throw new FileNotFoundException(class_17732.toString());
    }

    @Override
    public List lllIlIIlIIIlIlIIIllIlllIl(ResourceLocation class_17732) {
        ArrayList arrayList = Lists.newArrayList();
        ResourceLocation class_17733 = class_1290.IlIllllllIIlIIllllIIlIIIl(class_17732);
        for (class_0449 class_04492 : this.lllIIIllIIIIlllIlIIllIIll) {
            if (!class_04492.lllIlIIlIIIlIlIIIllIlllIl(class_17732)) continue;
            InputStream inputStream = class_04492.lllIlIIlIIIlIlIIIllIlllIl(class_17733) ? class_04492.lllIIIllIIIIlllIlIIllIIll(class_17733) : null;
            arrayList.add(new class_2149(class_17732, class_04492.lllIIIllIIIIlllIlIIllIIll(class_17732), inputStream, this.lllIlIIlIIIlIlIIIllIlllIl));
        }
        if (arrayList.isEmpty()) {
            throw new FileNotFoundException(class_17732.toString());
        }
        return arrayList;
    }

    static ResourceLocation IlIllllllIIlIIllllIIlIIIl(ResourceLocation class_17732) {
        return new ResourceLocation(class_17732.lllIlIIlIIIlIlIIIllIlllIl(), class_17732.lllIIIllIIIIlllIlIIllIIll() + ".mcmeta");
    }
}

