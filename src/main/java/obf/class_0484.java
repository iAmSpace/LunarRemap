package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;
import net.minecraft.util.IChatComponent;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class class_0484
implements class_1969 {
    private static final SimpleDateFormat lllIIIllIIIIlllIlIIllIIll = new SimpleDateFormat("HH:mm:ss");
    private int lllIlIIlIIIlIlIIIllIlllIl;
    private boolean IlIllllllIIlIIllllIIlIIIl = true;
    private IChatComponent lIlllIlllIIIIlIIlllIllIII = null;
    private String IlIIIIIllllllIIlllIllllll = "";
    private String lIllllIIlIIIlIllllllIIIll = "@";

    public int lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public IChatComponent lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        class_07752.lllIIIllIIIIlllIlIIllIIll("Command", this.IlIIIIIllllllIIlllIllllll);
        class_07752.lllIIIllIIIIlllIlIIllIIll("SuccessCount", this.lllIlIIlIIIlIlIIIllIlllIl);
        class_07752.lllIIIllIIIIlllIlIIllIIll("CustomName", this.lIllllIIlIIIlIllllllIIIll);
        if (this.lIlllIlllIIIIlIIlllIllIII != null) {
            class_07752.lllIIIllIIIIlllIlIIllIIll("LastOutput", class_2095.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII));
        }
        class_07752.lllIIIllIIIIlllIlIIllIIll("TrackOutput", this.IlIllllllIIlIIllllIIlIIIl);
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        this.IlIIIIIllllllIIlllIllllll = class_07752.IllIIIllIIIIlIlIlIllIIlll("Command");
        this.lllIlIIlIIIlIlIIIllIlllIl = class_07752.lIllllIIlIIIlIllllllIIIll("SuccessCount");
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("CustomName", 8)) {
            this.lIllllIIlIIIlIllllllIIIll = class_07752.IllIIIllIIIIlIlIlIllIIlll("CustomName");
        }
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("LastOutput", 8)) {
            this.lIlllIlllIIIIlIIlllIllIII = class_2095.lllIIIllIIIIlllIlIIllIIll(class_07752.IllIIIllIIIIlIlIlIllIIlll("LastOutput"));
        }
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("TrackOutput", 1)) {
            this.IlIllllllIIlIIllllIIlIIIl = class_07752.lllIIlIIIllllllIIIIlIlIlI("TrackOutput");
        }
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(int n, String string) {
        return n <= 2;
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string) {
        this.IlIIIIIllllllIIlllIllllll = string;
    }

    public String IlIllllllIIlIIllllIIlIIIl() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342) {
        class_0220 class_02202;
        if (class_13342.IllIIIIllIIllIllIlllIlIIl) {
            this.lllIlIIlIIIlIlIIIllIlllIl = 0;
        }
        if ((class_02202 = class_0220.IlIIlllllIIlIlIlllllIllll()) != null && class_02202.llIlIIlllIIIIIllIIlIlIIII()) {
            class_0044 class_00442 = class_02202.llIIlIlIlllIIllIlIlllIllI();
            this.lllIlIIlIIIlIlIIIllIlllIl = class_00442.lllIIIllIIIIlllIlIIllIIll(this, this.IlIIIIIllllllIIlllIllllll);
        } else {
            this.lllIlIIlIIIlIlIIIllIlllIl = 0;
        }
    }

    @Override
    public String llllIIIIlIIIlIIIIIIlIllll() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    @Override
    public IChatComponent llIIIIllIIIIIIIlIIIlIIIIl() {
        return new class_0722(this.llllIIIIlIIIlIIIIIIlIllll());
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(String string) {
        this.lIllllIIlIIIlIllllllIIIll = string;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(IChatComponent class_22552) {
        if (this.IlIllllllIIlIIllllIIlIIIl && this.IIllIllIIllIIlllIIIlIlllI() != null && !this.IIllIllIIllIIlllIIIlIlllI().IllIIIIllIIllIllIlllIlIIl) {
            this.lIlllIlllIIIIlIIlllIllIII = new class_0722("[" + lllIIIllIIIIlllIlIIllIIll.format(new Date()) + "] ").lllIIIllIIIIlllIlIIllIIll(class_22552);
            this.lIlllIlllIIIIlIIlllIllIII();
        }
    }

    public abstract void lIlllIlllIIIIlIIlllIllIII();

    public abstract int IlIIIIIllllllIIlllIllllll();

    public abstract void lllIIIllIIIIlllIlIIllIIll(ByteBuf var1);

    public void lllIlIIlIIIlIlIIIllIlllIl(IChatComponent class_22552) {
        this.lIlllIlllIIIIlIIlllIllIII = class_22552;
    }
}

