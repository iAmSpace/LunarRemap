package obf;

import net.minecraft.client.Minecraft;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1306
implements class_0677 {
    private final class_1381 IlIllllllIIlIIllllIIlIIIl;
    protected final Minecraft lllIIIllIIIIlllIlIIllIIll;
    protected final class_0494 lllIlIIlIIIlIlIIIllIlllIl;
    private long lIlllIlllIIIIlIIlllIllIII = 0L;

    protected class_1306(class_1381 class_13812, class_0494 class_04942) {
        this.IlIllllllIIlIIllllIIlIIIl = class_13812;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_04942;
        this.lllIIIllIIIIlllIlIIllIIll = Minecraft.getMinecraft();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4, int n5, class_0868 class_08682, int n6, int n7, boolean bl) {
        this.lllIIIllIIIIlllIlIIllIIll.IlIlllIIIIIIlIIllIIllIlll.lllIlIIlIIIlIlIIIllIlllIl(class_0616.lllIIIllIIIIlllIlIIllIIll("lanServer.title", new Object[0]), n2 + 32 + 3, n3 + 1, 0xFFFFFF);
        this.lllIIIllIIIIlllIlIIllIIll.IlIlllIIIIIIlIIllIIllIlll.lllIlIIlIIIlIlIIIllIlllIl(this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(), n2 + 32 + 3, n3 + 12, 0x808080);
        if (this.lllIIIllIIIIlllIlIIllIIll.gameSettings.lIIllIlIllIlIlIIlIlIIIIll) {
            this.lllIIIllIIIIlllIlIIllIIll.IlIlllIIIIIIlIIllIIllIlll.lllIlIIlIIIlIlIIIllIlllIl(class_0616.lllIIIllIIIIlllIlIIllIIll("selectServer.hiddenAddress", new Object[0]), n2 + 32 + 3, n3 + 12 + 11, 0x303030);
        } else {
            this.lllIIIllIIIIlllIlIIllIIll.IlIlllIIIIIIlIIllIIllIlll.lllIlIIlIIIlIlIIIllIlllIl(this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl(), n2 + 32 + 3, n3 + 12 + 11, 0x303030);
        }
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4, int n5, int n6) {
        this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(n);
        if (Minecraft.llllllIlIllllIlIlIlIIIIlI() - this.lIlllIlllIIIIlIIlllIllIII < 250L) {
            this.IlIllllllIIlIIllllIIlIIIl.IIIllIIlIIIIIIlIlIIllIIlI();
        }
        this.lIlllIlllIIIIlIIlllIllIII = Minecraft.llllllIlIllllIlIlIlIIIIlI();
        return false;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3, int n4, int n5, int n6) {
    }

    public class_0494 lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }
}

