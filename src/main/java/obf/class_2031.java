package obf;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.Options;

/*
 * Decompiled with CFR 0.150.
 */
public class class_2031
implements class_0677 {
    private final Minecraft lllIIIllIIIIlllIlIIllIIll = Minecraft.getMinecraft();
    private final class_1197 lllIlIIlIIIlIlIIIllIlllIl;
    private final class_1197 IlIllllllIIlIIllllIIlIIIl;

    public class_2031(class_1197 class_11972, class_1197 class_11973) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_11972;
        this.IlIllllllIIlIIllllIIlIIIl = class_11973;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4, int n5, class_0868 class_08682, int n6, int n7, boolean bl) {
        if (this.lllIlIIlIIIlIlIIIllIlllIl != null) {
            this.lllIlIIlIIIlIlIIIllIlllIl.IIIllIIlIIIIIIlIlIIllIIlI = n3;
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n6, n7);
        }
        if (this.IlIllllllIIlIIllllIIlIIIl != null) {
            this.IlIllllllIIlIIllllIIlIIIl.IIIllIIlIIIIIIlIlIIllIIlI = n3;
            this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n6, n7);
        }
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4, int n5, int n6) {
        if (this.lllIlIIlIIIlIlIIIllIlllIl.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll, n2, n3)) {
            if (this.lllIlIIlIIIlIlIIIllIlllIl instanceof class_1249) {
                this.lllIIIllIIIIlllIlIIllIIll.gameSettings.lllIIIllIIIIlllIlIIllIIll(((class_1249)this.lllIlIIlIIIlIlIIIllIlllIl).lllIIIllIIIIlllIlIIllIIll(), 1);
                this.lllIlIIlIIIlIlIIIllIlllIl.IllIIlllllllIIlIIlIIIIlIl = this.lllIIIllIIIIlllIlIIllIIll.gameSettings.IlIllllllIIlIIllllIIlIIIl(Options.getEnumOptions(this.lllIlIIlIIIlIlIIIllIlllIl.IIIllIllIIlIlIlIlIllllIIl));
            }
            return true;
        }
        if (this.IlIllllllIIlIIllllIIlIIIl != null && this.IlIllllllIIlIIllllIIlIIIl.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll, n2, n3)) {
            if (this.IlIllllllIIlIIllllIIlIIIl instanceof class_1249) {
                this.lllIIIllIIIIlllIlIIllIIll.gameSettings.lllIIIllIIIIlllIlIIllIIll(((class_1249)this.IlIllllllIIlIIllllIIlIIIl).lllIIIllIIIIlllIlIIllIIll(), 1);
                this.IlIllllllIIlIIllllIIlIIIl.IllIIlllllllIIlIIlIIIIlIl = this.lllIIIllIIIIlllIlIIllIIll.gameSettings.IlIllllllIIlIIllllIIlIIIl(Options.getEnumOptions(this.IlIllllllIIlIIllllIIlIIIl.IIIllIllIIlIlIlIlIllllIIl));
            }
            return true;
        }
        return false;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3, int n4, int n5, int n6) {
        if (this.lllIlIIlIIIlIlIIIllIlllIl != null) {
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(n2, n3);
        }
        if (this.IlIllllllIIlIIllllIIlIIIl != null) {
            this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(n2, n3);
        }
    }
}

