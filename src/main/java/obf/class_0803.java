package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

class class_0803
extends class_0579 {
    private ArrayList lllIlIIlIIIlIlIIIllIlllIl;
    private class_1203 llIIllIllIlIIlIIllIllllll;
    final class_1472 lllIIIllIIIIlllIlIIllIIll;

    public class_0803(class_1472 class_14722) {
        super(class_14722.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll, class_14722.lIIIIlIlIIlllllIIllIIlIII(), class_14722.llIIlllIllIllllIIIlIIIIII(), 32, class_14722.llIIlllIllIllllIIIlIIIIII() - 41 + 4, 18);
        this.lllIIIllIIIIlllIlIIllIIll = class_14722;
        this.llIIllIllIlIIlIIllIllllll = this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll;
        this.lllIlIIlIIIlIlIIIllIlllIl = new ArrayList();
        for (class_1667 class_16672 : class_1667.values()) {
            if (!class_16672.IIIIlIlIIlIIIIlIlllIlIIII || (!class_16672.lIIIllIIIIIllllIlIlIllIll || !this.llIIllIllIlIIlIIllIllllll.IlIllllllIIlIIllllIIlIIIl) && (!class_16672.lIIIlIIIlIlllIllIIIlIIIlI || !this.llIIllIllIlIIlIIllIllllll.IlIIIIIllllllIIlllIllllll)) continue;
            this.lllIlIIlIIIlIlIIIllIlllIl.add(class_16672.llllIlIIIIIIIIIlllIIlIIIl);
        }
        for (class_0562 class_05622 : class_0812.lllIIIllIIIIlllIlIIllIIll) {
            if ((!class_05622.IlIllllllIIlIIllllIIlIIIl || !this.llIIllIllIlIIlIIllIllllll.IlIllllllIIlIIllllIIlIIIl) && (!class_05622.lIlllIlllIIIIlIIlllIllIII || !this.llIIllIllIlIIlIIllIllllll.IlIIIIIllllllIIlllIllllll)) continue;
            this.lllIlIIlIIIlIlIIIllIlllIl.add(class_05622.lllIIIllIIIIlllIlIIllIIll);
        }
        Collator collator = class_0950.lllIIIllIIIIlllIlIIllIIll();
        Collections.sort(this.lllIlIIlIIIlIlIIIllIlllIl, new class_0884(this, collator));
    }

    private static String lllIlIIlIIIlIlIIIllIlllIl(String string) {
        string = class_1586.lllIIIllIIIIlllIlIIllIIll("entity." + string + ".name");
        string = string.replaceAll("^entity.", "").replaceAll(".name$", "");
        return string;
    }

    @Override
    protected int lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl.size();
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, boolean bl, int n2, int n3) {
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll((String)this.lllIlIIlIIIlIlIIIllIlllIl.get(n));
        int n4 = this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII() / 2 - 92 - 16;
        int n5 = 3;
        int n6 = 215;
        if (this.IIIllIllIIlIlIlIlIllllIIl >= n4 + n6 - 16 - n5 && this.IIIllIllIIlIlIlIlIllllIIl <= n4 + n6 + n5) {
            this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll();
        } else if (bl) {
            Mouse.next();
            this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll();
            return;
        }
    }

    @Override
    protected boolean lllIIIllIIIIlllIlIIllIIll(int n) {
        return ((String)this.lllIlIIlIIIlIlIIIllIlllIl.get(n)).equals(this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl);
    }

    @Override
    protected int lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIIIllIIIIlllIlIIllIIll() * 18;
    }

    @Override
    protected void IlIllllllIIlIIllllIIlIIIl() {
        this.lllIIIllIIIIlllIlIIllIIll.llIIlIllIllllIlIIIIlIIlll();
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4, class_0868 class_08682, int n5, int n6) {
        String string = (String)this.lllIlIIlIIIlIlIIIllIlllIl.get(n);
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = true;
        class_1667 class_16672 = class_1667.lllIIIllIIIIlllIlIIllIIll(string);
        if (class_16672 != null) {
            bl = class_16672.lIIIllIIIIIllllIlIlIllIll;
            bl2 = class_16672.lIIIlIIIlIlllIllIIIlIIIlI;
            bl3 = class_16672.lIIlIlllIllIlIlllIIIIIIII;
        } else {
            class_0562 class_05622 = class_0812.lllIIIllIIIIlllIlIIllIIll(string);
            if (class_05622 != null) {
                bl = class_05622.IlIllllllIIlIIllllIIlIIIl;
                bl2 = class_05622.lIlllIlllIIIIlIIlllIllIII;
                bl3 = class_05622.lllIlIIlIIIlIlIIIllIlllIl;
            }
        }
        int n7 = bl ? 255 : 0;
        int n8 = bl2 ? 255 : 0;
        int n9 = -16777216 + (n7 << 16) + (n8 << 8) + 0;
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.lllIIlIIIllllllIIIIlIlIlI(), class_0803.lllIlIIlIIIlIlIIIllIlllIl(string), this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII() / 2, n3 + 3, n9);
        int n10 = 3;
        if (this.IIIllIllIIlIlIlIlIllllIIl >= n2 - n10 && this.IllIIIllIIIIlIlIlIllIIlll >= n3 && this.IIIllIllIIlIlIlIlIllllIIl <= n2 + 215 + n10 && this.IllIIIllIIIIlIlIlIllIIlll <= n3 + this.IllIIlllllllIIlIIlIIIIlIl) {
            String string2 = this.IIIllIllIIlIlIlIlIllllIIl >= n2 + 215 - 16 - n10 && this.IIIllIllIIlIlIlIlIllllIIl <= n2 + 215 + n10 ? (bl3 ? class_0950.lllIIIllIIIIlllIlIIllIIll("options.minimap.mobs.disable") : class_0950.lllIIIllIIIIlllIlIIllIIll("options.minimap.mobs.enable")) : (bl3 ? class_0950.lllIIIllIIIIlllIlIIllIIll("options.minimap.mobs.enabled") : class_0950.lllIIIllIIIIlllIlIIllIIll("options.minimap.mobs.disabled"));
            class_1472.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, string2);
        }
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        class_2210.lllIIIllIIIIlllIlIIllIIll("textures/gui/container/inventory.png");
        int n11 = bl3 ? 72 : 90;
        int n12 = 216;
        class_1472.lllIIIllIIIIlllIlIIllIIll(n2 + 198, n3 - 2, n11, n12, 16, 16);
    }

    static /* synthetic */ String lllIIIllIIIIlllIlIIllIIll(String string) {
        return class_0803.lllIlIIlIIIlIlIIIllIlllIl(string);
    }
}

