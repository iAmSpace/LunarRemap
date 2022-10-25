package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import net.minecraft.util.ResourceLocation;

import java.util.Map;

public class class_0975 {
    private static final ResourceLocation lllIIIllIIIIlllIlIIllIIll = new ResourceLocation("textures/map/map_icons.png");
    private final class_1682 lllIlIIlIIIlIlIIIllIlllIl;
    private final Map IlIllllllIIlIIllllIIlIIIl = Maps.newHashMap();

    public class_0975(class_1682 class_16822) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_16822;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0963 class_09632) {
        class_1481.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl(class_09632));
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0963 class_09632, boolean bl) {
        class_1481.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl(class_09632), bl);
    }

    private class_1481 lllIlIIlIIIlIlIIIllIlllIl(class_0963 class_09632) {
        class_1481 class_14812 = (class_1481)this.IlIllllllIIlIIllllIIlIIIl.get(class_09632.lllIIIllIIIIlllIlIIllIIll);
        if (class_14812 == null) {
            class_14812 = new class_1481(this, class_09632, null);
            this.IlIllllllIIlIIllllIIlIIIl.put(class_09632.lllIIIllIIIIlllIlIIllIIll, class_14812);
        }
        return class_14812;
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        for (class_1481 class_14812 : this.IlIllllllIIlIIllllIIlIIIl.values()) {
            this.lllIlIIlIIIlIlIIIllIlllIl.IlIllllllIIlIIllllIIlIIIl(class_1481.lllIlIIlIIIlIlIIIllIlllIl(class_14812));
        }
        this.IlIllllllIIlIIllllIIlIIIl.clear();
    }

    static /* synthetic */ class_1682 lllIIIllIIIIlllIlIIllIIll(class_0975 class_09752) {
        return class_09752.lllIlIIlIIIlIlIIIllIlllIl;
    }

    static /* synthetic */ ResourceLocation lllIlIIlIIIlIlIIIllIlllIl() {
        return lllIIIllIIIIlllIlIIllIIll;
    }
}

