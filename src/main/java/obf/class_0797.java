package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.realms.RealmsButton
 */
import net.minecraft.client.Minecraft;
import net.minecraft.realms.RealmsButton;

public class class_0797
extends class_1197 {
    private RealmsButton lllIIIllIIIIlllIlIIllIIll;

    public class_0797(RealmsButton realmsButton, int n, int n2, int n3, String string) {
        super(n, n2, n3, string);
        this.lllIIIllIIIIlllIlIIllIIll = realmsButton;
    }

    public class_0797(RealmsButton realmsButton, int n, int n2, int n3, String string, int n4, int n5) {
        super(n, n2, n3, n4, n5, string);
        this.lllIIIllIIIIlllIlIIllIIll = realmsButton;
    }

    public int lllIIIllIIIIlllIlIIllIIll() {
        return this.IIIllIllIIlIlIlIlIllllIIl;
    }

    public boolean IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.IllIIIllIIIIlIlIlIllIIlll;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(boolean bl) {
        this.IllIIIllIIIIlIlIlIllIIlll = bl;
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string) {
        this.IllIIlllllllIIlIIlIIIIlIl = string;
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll() {
        return super.IlIIIIIllllllIIlllIllllll();
    }

    public int IllIIlllllllIIlIIlIIIIlIl() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    @Override
    public boolean IlIllllllIIlIIllllIIlIIIl(Minecraft class_06672, int n, int n2) {
        if (super.IlIllllllIIlIIllllIIlIIIl(class_06672, n, n2)) {
            this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(n, n2);
        }
        return super.IlIllllllIIlIIllllIIlIIIl(class_06672, n, n2);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(n, n2);
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(Minecraft class_06672, int n, int n2) {
        this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(n, n2);
    }

    public RealmsButton IIIllIllIIlIlIlIlIllllIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        return this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(bl);
    }

    public int IlIllllllIIlIIllllIIlIIIl(boolean bl) {
        return super.lllIIIllIIIIlllIlIIllIIll(bl);
    }
}

