package obf;

import com.moonsworth.lunar.client.LunarClient;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0944
extends class_0759 {
    private String IIIllIIlIIIIIIlIlIIllIIlI;
    private final class_0730 IllIIlllllllIIlIIlIIIIlIl;
    private final class_0730 IIIllIllIIlIlIlIlIllllIIl;
    private final class_0730 IllIIIllIIIIlIlIlIllIIlll;
    private int[] lIIIIlIlIIlllllIIllIIlIII;

    public class_0944(String string) {
        this.IIIllIIlIIIIIIlIlIIllIIlI = string;
        this.IllIIlllllllIIlIIlIIIIlIl = new class_0730(0x4FFFFFFF, -1);
        this.IIIllIllIIlIlIlIlIllllIIl = new class_0730(0x40000000, 444958085);
        this.IllIIIllIIIIlIlIlIllIIlll = new class_0730(0x40000000, 444958085);
    }

    public void IllIIlllllllIIlIIlIIIIlIl() {
        this.lllIIIllIIIIlllIlIIllIIll(new int[]{-11119018, -11493284, -10329502, -10176146, -11579569, -11164318});
    }

    public void IIIllIllIIlIlIlIlIllllIIl() {
        this.lllIIIllIIIIlllIlIIllIIll(new int[]{-11493284, -11493284, -10176146, -10176146, -11164318, -11164318});
    }

    public void IllIIIllIIIIlIlIlIllIIlll() {
        this.lllIIIllIIIIlllIlIIllIIll(new int[]{-14277082, -11493284, -13487566, -10176146, -14013910, -11164318});
    }

    private void lllIIIllIIIIlllIlIIllIIll(int[] arrn) {
        this.lIIIIlIlIIlllllIIllIIlIII = arrn;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(float f, float f2, boolean bl) {
        boolean bl2;
        boolean bl3 = bl2 = bl && this.lllIIIllIIIIlllIlIIllIIll(f, f2);
        if (this.lIIIIlIlIIlllllIIllIIlIII != null && this.IllIIlllllllIIlIIlIIIIlIl.IlIIIIIllllllIIlllIllllll()) {
            this.IllIIlllllllIIlIIlIIIIlIl.lllIlIIlIIIlIlIIIllIlllIl(this.lIIIIlIlIIlllllIIllIIlIII[0]);
            this.IllIIlllllllIIlIIlIIIIlIl.IlIllllllIIlIIllllIIlIIIl(this.lIIIIlIlIIlllllIIllIIlIII[1]);
            this.IIIllIllIIlIlIlIlIllllIIl.lllIlIIlIIIlIlIIIllIlllIl(this.lIIIIlIlIIlllllIIllIIlIII[2]);
            this.IIIllIllIIlIlIlIlIllllIIl.IlIllllllIIlIIllllIIlIIIl(this.lIIIIlIlIIlllllIIllIIlIII[3]);
            this.IllIIIllIIIIlIlIlIllIIlll.lllIlIIlIIIlIlIIIllIlllIl(this.lIIIIlIlIIlllllIIllIIlIII[4]);
            this.IllIIIllIIIIlIlIlIllIIlll.IlIllllllIIlIIllllIIlIIIl(this.lIIIIlIlIIlllllIIllIIlIII[5]);
            this.lIIIIlIlIIlllllIIllIIlIII = null;
        }
        class_0857.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl, this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII, this.IllIIlllllllIIlIIlIIIIlIl.lllIlIIlIIIlIlIIIllIlllIl(bl2).getRGB(), this.IIIllIllIIlIlIlIlIllllIIl.lllIlIIlIIIlIlIIIllIlllIl(bl2).getRGB(), this.IllIIIllIIIIlIlIlIllIIlll.lllIlIIlIIIlIlIIIllIlllIl(bl2).getRGB());
        LunarClient.getInstance().robotoRegular13px.lllIlIIlIIIlIlIIIllIlllIl(this.IIIllIIlIIIIIIlIlIIllIIlI, this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl / 2.0f, this.lllIlIIlIIIlIlIIIllIlllIl + 2.0f, -1);
    }

    public void IlIllllllIIlIIllllIIlIIIl(float f, float f2, boolean bl) {
        this.lllIIIllIIIIlllIlIIllIIll(f, f2, bl);
    }

    public void lIlllIlllIIIIlIIlllIllIII(float f, float f2, boolean bl) {
        this.lllIIIllIIIIlllIlIIllIIll(f, f2, bl);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(float f, float f2, int n, boolean bl) {
        if (!bl) {
            return false;
        }
        return false;
    }

    public String lIIIIlIlIIlllllIIllIIlIII() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string) {
        this.IIIllIIlIIIIIIlIlIIllIIlI = string;
    }
}

