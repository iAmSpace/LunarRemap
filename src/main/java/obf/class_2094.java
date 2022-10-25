package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.UUID;

public abstract class class_2094
extends class_0003
implements class_0683 {
    protected class_1357 lIIIlIllllIlllIIIIIllIIIl = new class_1357(this);

    public class_2094(class_1334 class_13342) {
        super(class_13342);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl() {
        super.lllIlIIlIIIlIlIIIllIlllIl();
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(16, (Object)0);
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(17, "");
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        if (this.IlIllllllIIlIIllllIIlIIIl() == null) {
            class_07752.lllIIIllIIIIlllIlIIllIIll("OwnerUUID", "");
        } else {
            class_07752.lllIIIllIIIIlllIlIIllIIll("OwnerUUID", this.IlIllllllIIlIIllllIIlIIIl());
        }
        class_07752.lllIIIllIIIIlllIlIIllIIll("Sitting", this.IlIllIIIIllllIIllIllIIIIl());
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        String string = "";
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("OwnerUUID", 8)) {
            string = class_07752.IllIIIllIIIIlIlIlIllIIlll("OwnerUUID");
        } else {
            String string2 = class_07752.IllIIIllIIIIlIlIlIllIIlll("Owner");
            string = class_0470.lllIIIllIIIIlllIlIIllIIll(string2);
        }
        if (string.length() > 0) {
            this.lllIlIIlIIIlIlIIIllIlllIl(string);
            this.IllIIIllIIIIlIlIlIllIIlll(true);
        }
        this.lIIIlIllllIlllIIIIIllIIIl.lllIIIllIIIIlllIlIIllIIll(class_07752.lllIIlIIIllllllIIIIlIlIlI("Sitting"));
        this.lIIIIlIlIIlllllIIllIIlIII(class_07752.lllIIlIIIllllllIIIIlIlIlI("Sitting"));
    }

    protected void IIIllIllIIlIlIlIlIllllIIl(boolean bl) {
        String string = "heart";
        if (!bl) {
            string = "smoke";
        }
        for (int i = 0; i < 7; ++i) {
            double d = this.IlllIIlllllllIIllIlIllllI.nextGaussian() * 0.02;
            double d2 = this.IlllIIlllllllIIllIlIllllI.nextGaussian() * 0.02;
            double d3 = this.IlllIIlllllllIIllIlIllllI.nextGaussian() * 0.02;
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(string, this.IlIIlllllIIlIlIlllllIllll + (double)(this.IlllIIlllllllIIllIlIllllI.nextFloat() * this.IIIIlIlIIlIIIIlIlllIlIIII * 2.0f) - (double)this.IIIIlIlIIlIIIIlIlllIlIIII, this.llIIlIlIlllIIllIlIlllIllI + 0.5 + (double)(this.IlllIIlllllllIIllIlIllllI.nextFloat() * this.lllIIIIlIlIIlIIlllIIIIIIl), this.IllIIIIllIIllIllIlllIlIIl + (double)(this.IlllIIlllllllIIllIlIllllI.nextFloat() * this.IIIIlIlIIlIIIIlIlllIlIIII * 2.0f) - (double)this.IIIIlIlIIlIIIIlIlllIlIIII, d, d2, d3);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(byte by) {
        if (by == 7) {
            this.IIIllIllIIlIlIlIlIllllIIl(true);
        } else if (by == 6) {
            this.IIIllIllIIlIlIlIlIllllIIl(false);
        } else {
            super.lllIIIllIIIIlllIlIIllIIll(by);
        }
    }

    public boolean lllIIIIlIIllIIIlIllIlllII() {
        return (this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(16) & 4) != 0;
    }

    public void IllIIIllIIIIlIlIlIllIIlll(boolean bl) {
        byte by = this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(16);
        if (bl) {
            this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(16, (byte)(by | 4));
        } else {
            this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(16, (byte)(by & 0xFFFFFFFB));
        }
    }

    public boolean IlIllIIIIllllIIllIllIIIIl() {
        return (this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(16) & 1) != 0;
    }

    public void lIIIIlIlIIlllllIIllIIlIII(boolean bl) {
        byte by = this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(16);
        if (bl) {
            this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(16, (byte)(by | 1));
        } else {
            this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(16, (byte)(by & 0xFFFFFFFE));
        }
    }

    @Override
    public String IlIllllllIIlIIllllIIlIIIl() {
        return this.IlIlIllIIlIIIIlllIlIllIlI.IlIIIIIllllllIIlllIllllll(17);
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(String string) {
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(17, string);
    }

    public class_1965 lIlIlIIllIlIIIIIlIIlllIlI() {
        try {
            UUID uUID = UUID.fromString(this.IlIllllllIIlIIllllIIlIIIl());
            return uUID == null ? null : this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(uUID);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return null;
        }
    }

    public boolean IlIIIIIllllllIIlllIllllll(class_1965 class_19652) {
        return class_19652 == this.lIlIlIIllIlIIIIIlIIlllIlI();
    }

    public class_1357 llllIllllllIllIIIlIlIIllI() {
        return this.lIIIlIllllIlllIIIIIllIIIl;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, class_1965 class_19653) {
        return true;
    }

    @Override
    public class_0827 llllIllIIIlIllIllllllIlIl() {
        class_1965 class_19652;
        if (this.lllIIIIlIIllIIIlIllIlllII() && (class_19652 = this.lIlIlIIllIlIIIIIlIIlllIlI()) != null) {
            return class_19652.llllIllIIIlIllIllllllIlIl();
        }
        return super.llllIllIIIlIllIllllllIlIl();
    }

    @Override
    public boolean lIlllIlllIIIIlIIlllIllIII(class_1965 class_19652) {
        if (this.lllIIIIlIIllIIIlIllIlllII()) {
            class_1965 class_19653 = this.lIlIlIIllIlIIIIIlIIlllIlI();
            if (class_19652 == class_19653) {
                return true;
            }
            if (class_19653 != null) {
                return class_19653.lIlllIlllIIIIlIIlllIllIII(class_19652);
            }
        }
        return super.lIlllIlllIIIIlIIlllIllIII(class_19652);
    }

    @Override
    public /* synthetic */ class_1521 lIlllIlllIIIIlIIlllIllIII() {
        return this.lIlIlIIllIlIIIIIlIIlllIlI();
    }
}

