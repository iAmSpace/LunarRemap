package obf;

import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S33PacketUpdateSign;

/*
 * Decompiled with CFR 0.150.
 */
public class class_2219
extends class_1774 {
    public String[] IllIIlllllllIIlIIlIIIIlIl = new String[]{"", "", "", ""};
    public int IIIllIllIIlIlIlIlIllllIIl = -1;
    private boolean IllIIIllIIIIlIlIlIllIIlll = true;
    private class_0814 lIIIIlIlIIlllllIIllIIlIII;

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        class_07752.lllIIIllIIIIlllIlIIllIIll("Text1", this.IllIIlllllllIIlIIlIIIIlIl[0]);
        class_07752.lllIIIllIIIIlllIlIIllIIll("Text2", this.IllIIlllllllIIlIIlIIIIlIl[1]);
        class_07752.lllIIIllIIIIlllIlIIllIIll("Text3", this.IllIIlllllllIIlIIlIIIIlIl[2]);
        class_07752.lllIIIllIIIIlllIlIIllIIll("Text4", this.IllIIlllllllIIlIIlIIIIlIl[3]);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        this.IllIIIllIIIIlIlIlIllIIlll = false;
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        for (int i = 0; i < 4; ++i) {
            this.IllIIlllllllIIlIIlIIIIlIl[i] = class_07752.IllIIIllIIIIlIlIlIllIIlll("Text" + (i + 1));
            if (this.IllIIlllllllIIlIIlIIIIlIl[i].length() <= 15) continue;
            this.IllIIlllllllIIlIIlIIIIlIl[i] = this.IllIIlllllllIIlIIlIIIIlIl[i].substring(0, 15);
        }
    }

    @Override
    public Packet IllIIlllllllIIlIIlIIIIlIl() {
        String[] arrstring = new String[4];
        System.arraycopy(this.IllIIlllllllIIlIIlIIIIlIl, 0, arrstring, 0, 4);
        return new S33PacketUpdateSign(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, arrstring);
    }

    public boolean lllIIIllIIIIlllIlIIllIIll() {
        return this.IllIIIllIIIIlIlIlIllIIlll;
    }

    public void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        this.IllIIIllIIIIlIlIlIllIIlll = bl;
        if (!bl) {
            this.lIIIIlIlIIlllllIIllIIlIII = null;
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142) {
        this.lIIIIlIlIIlllllIIllIIlIII = class_08142;
    }

    public class_0814 IlIIIIIllllllIIlllIllllll() {
        return this.lIIIIlIlIIlllllIIllIIlIII;
    }
}

