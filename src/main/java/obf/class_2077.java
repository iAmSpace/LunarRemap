package obf;

import net.minecraft.util.ResourceLocation;
import net.minecraft.client.Minecraft;

/*
 * Decompiled with CFR 0.150.
 */
@Deprecated
public class class_2077
extends class_0851 {
    public class_2077(int n, float f, int n2, int n3, int n4, int n5) {
        super(n, f, n2, n3, n4, n5);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(AbstractModule class_16652) {
        return class_16652.lIllllIIlIIIlIllllllIIIll();
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(AbstractModule class_16652) {
        if (class_16652.lIllllIIlIIIlIllllllIIIll()) {
            Minecraft.getMinecraft().IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
            class_16652.lllIIIllIIIIlllIlIIllIIll(false);
        }
    }
}

