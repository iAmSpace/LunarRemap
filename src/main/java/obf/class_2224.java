package obf;

import net.minecraft.network.play.client.C00PacketKeepAlive;

/*
 * Decompiled with CFR 0.150.
 */
public class class_2224
extends class_0229 {
    private class_1764 lllIIIllIIIIlllIlIIllIIll;
    private int lllIlIIlIIIlIlIIIllIlllIl;
    private long IlIllllllIIlIIllllIIlIIIl;

    public class_2224(class_1764 class_17642) {
        this.lllIIIllIIIIlllIlIIllIIll = class_17642;
        this.IlIllllllIIlIIllllIIlIIIl = System.currentTimeMillis();
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(char c, int n) {
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1197 class_11972) {
        if (this.lllllIlllIIllIlIIlIIIllII.IlIllllllIIlIIllllIIlIIIl != null && this.lllllIlllIIllIlIIlIIIllII.theWorld != null) {
            this.lllllIlllIIllIlIIlIIIllII.theWorld.q_();
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll((class_0564)null);
        }
        if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 1) {
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_0019(this, this.lllllIlllIIllIlIIlIIIllII, this.lllllIlllIIllIlIIlIIIllII.lIlllIlllIIIIlIIlllIllIII));
        }
        if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 2) {
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_2097());
        }
    }

    @Override
    public void n_() {
        this.lIlIlIIlIIIIlIIIIIlllIIII.clear();
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        ++this.lllIlIIlIIIlIlIIIllIlllIl;
        if (this.lllIIIllIIIIlllIlIIllIIll == null) {
            return;
        }
        if (System.currentTimeMillis() - this.IlIllllllIIlIIllllIIlIIIl >= 5000L && this.lIlIlIIlIIIIlIIIIIlllIIII.isEmpty()) {
            this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(1, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, this.lIIlIIIIIlIlllIlIIlIlIlll / 4 + 120 + 36, 99, 20, "Reconnect"));
            this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(2, this.IlIlIIlllIIlIllIIIlllllIl / 2 + 2, this.lIIlIIIIIlIlllIlIIlIlIlll / 4 + 120 + 36, 99, 20, "Disconnect"));
        }
        if (this.lllIlIIlIIIlIlIIIllIlllIl % 20 == 0) {
            this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new C00PacketKeepAlive());
        }
        if (this.lllIIIllIIIIlllIlIIllIIll != null) {
            this.lllIIIllIIIIlllIlIIllIIll.onNetworkTick();
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        this.IlIllllllIIlIIllllIIlIIIl(0);
        this.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, class_0616.lllIIIllIIIIlllIlIIllIIll("multiplayer.downloadingTerrain", new Object[0]), this.IlIlIIlllIIlIllIIIlllllIl / 2, this.lIIlIIIIIlIlllIlIIlIlIlll / 2 - 50, 0xFFFFFF);
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
    }

    @Override
    public boolean lIlllIlllIIIIlIIlllIllIII() {
        return false;
    }
}

