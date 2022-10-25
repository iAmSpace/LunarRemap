package obf;

import net.minecraft.network.play.server.S25PacketBlockBreakAnim;
import net.minecraft.network.play.server.S28PacketEffect;
import net.minecraft.network.play.server.S29PacketSoundEffect;

/*
 * Decompiled with CFR 0.150.
 */
public class class_2175
implements class_2249 {
    private class_0220 lllIIIllIIIIlllIlIIllIIll;
    private class_0976 lllIlIIlIIIlIlIIIllIlllIl;

    public class_2175(class_0220 class_02202, class_0976 class_09762) {
        this.lllIIIllIIIIlllIlIIllIIll = class_02202;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_09762;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(String string, double d, double d2, double d3, double d4, double d5, double d6) {
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        this.lllIlIIlIIIlIlIIIllIlllIl.lIlIlIIIIIIlIIllllIlIIllI().lllIIIllIIIIlllIlIIllIIll(class_15212);
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_1521 class_15212) {
        this.lllIlIIlIIIlIlIIIllIlllIl.lIlIlIIIIIIlIIllllIlIIllI().lllIlIIlIIIlIlIIIllIlllIl(class_15212);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(String string, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll.lIIIllIIIIIllllIlIlIllIll().lllIIIllIIIIlllIlIIllIIll(d, d2, d3, f > 1.0f ? (double)(16.0f * f) : 16.0, this.lllIlIIlIIIlIlIIIllIlllIl.IlIlIIlllIIlIllIIIlllllIl.IIIllIllIIlIlIlIlIllllIIl, new S29PacketSoundEffect(string, d, d2, d3, f, f2));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142, String string, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll.lIIIllIIIIIllllIlIlIllIll().lllIIIllIIIIlllIlIIllIIll(class_08142, d, d2, d3, f > 1.0f ? (double)(16.0f * f) : 16.0, this.lllIlIIlIIIlIlIIIllIlllIl.IlIlIIlllIIlIllIIIlllllIl.IIIllIllIIlIlIlIlIllllIIl, new S29PacketSoundEffect(string, d, d2, d3, f, f2));
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3, int n4, int n5, int n6) {
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        this.lllIlIIlIIIlIlIIIllIlllIl.IllllIIIIlIIlIIIIlllIIIIl().lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3) {
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(String string, int n, int n2, int n3) {
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142, int n, int n2, int n3, int n4, int n5) {
        this.lllIIIllIIIIlllIlIIllIIll.lIIIllIIIIIllllIlIlIllIll().lllIIIllIIIIlllIlIIllIIll(class_08142, n2, n3, n4, 64.0, this.lllIlIIlIIIlIlIIIllIlllIl.IlIlIIlllIIlIllIIIlllllIl.IIIllIllIIlIlIlIlIllllIIl, new S28PacketEffect(n, n2, n3, n4, n5, false));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4, int n5) {
        this.lllIIIllIIIIlllIlIIllIIll.lIIIllIIIIIllllIlIlIllIll().lllIIIllIIIIlllIlIIllIIll(new S28PacketEffect(n, n2, n3, n4, n5, true));
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3, int n4, int n5) {
        for (class_1822 class_18222 : this.lllIIIllIIIIlllIlIIllIIll.lIIIllIIIIIllllIlIlIllIll().IlIIIIIllllllIIlllIllllll) {
            double d;
            double d2;
            double d3;
            if (class_18222 == null || class_18222.lIlIllIIlIIlIIlIIlIIlIIll != this.lllIlIIlIIIlIlIIIllIlllIl || class_18222.llllllIlIllllIlIlIlIIIIlI() == n || !((d3 = (double)n2 - class_18222.IlIIlllllIIlIlIlllllIllll) * d3 + (d2 = (double)n3 - class_18222.llIIlIlIlllIIllIlIlllIllI) * d2 + (d = (double)n4 - class_18222.IllIIIIllIIllIllIlllIlIIl) * d < 1024.0)) continue;
            class_18222.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new S25PacketBlockBreakAnim(n, n2, n3, n4, n5));
        }
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII() {
    }
}

