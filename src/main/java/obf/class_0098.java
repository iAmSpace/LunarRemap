package obf;

import net.minecraft.client.Minecraft;

/*
 * Decompiled with CFR 0.150.
 */
@Deprecated
public class class_0098
extends class_0851 {
    public class_0098(int n, float f, int n2, int n3, int n4, int n5) {
        super(n, f, n2, n3, n4, n5);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1665 class_16652) {
        return !class_16652.lIllllIIlIIIlIllllllIIIll();
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_1665 class_16652) {
        if (class_16652.IlIlllIIIIIIlIIllIIllIlll() == null || class_16652.IIIllIIlIIIIIIlIlIIllIIlI().equalsIgnoreCase("Zans Minimap")) {
            if (!class_16652.lIllllIIlIIIlIllllllIIIll()) {
                Minecraft.getMinecraft().IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
                class_16652.lllIIIllIIIIlllIlIIllIIll(true);
            }
        } else if (!class_16652.lIllllIIlIIIlIllllllIIIll()) {
            Minecraft.getMinecraft().lllIIIllIIIIlllIlIIllIIll(new class_1998(class_0822.lllIIIllIIIIlllIlIIllIIll, class_16652));
        }
    }
}

