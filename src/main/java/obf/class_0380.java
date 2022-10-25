package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.util.ResourceLocation;

import java.awt.image.BufferedImage;
import java.lang.ref.WeakReference;

public class class_0380
implements class_0702 {
    public final WeakReference lllIIIllIIIIlllIlIIllIIll;
    public final ResourceLocation lllIlIIlIIIlIlIIIllIlllIl;

    public class_0380(class_2174 class_21742, ResourceLocation class_17732) {
        this.lllIIIllIIIIlllIlIIllIIll = new WeakReference<class_2174>(class_21742);
        this.lllIlIIlIIIlIlIIIllIlllIl = class_17732;
    }

    @Override
    public BufferedImage lllIIIllIIIIlllIlIIllIIll(BufferedImage bufferedImage) {
        return class_1214.lllIIIllIIIIlllIlIIllIIll(bufferedImage);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll() {
        class_2174 class_21742 = (class_2174)this.lllIIIllIIIIlllIlIIllIIll.get();
        if (class_21742 != null) {
            class_21742.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl);
        }
    }
}

