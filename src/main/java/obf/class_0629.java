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

class class_0629
extends class_0579 {
    private ArrayList lllIlIIlIIIlIlIIIllIlllIl;
    final class_1400 lllIIIllIIIIlllIlIIllIIll;

    public class_0629(class_1400 class_14002) {
        super(class_14002.lllIIIllIIIIlllIlIIllIIll.llIIlIIllIIllIlIIllIIllII, class_14002.lIIIIlIlIIlllllIIllIIlIII(), class_14002.llIIlllIllIllllIIIlIIIIII(), 54, class_14002.llIIlllIllIllllIIIlIIIIII() - 65 + 4, 18);
        this.lllIIIllIIIIlllIlIIllIIll = class_14002;
        this.lllIlIIlIIIlIlIIIllIlllIl = new ArrayList();
        for (class_0368 class_03682 : this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll()) {
            if (!class_03682.lllIIlIIIllllllIIIIlIlIlI || !class_03682.IlIlllIIIIIIlIIllIIllIlll) continue;
            this.lllIlIIlIIIlIlIIIllIlllIl.add(class_03682);
        }
    }

    @Override
    protected int lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl.size();
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, boolean bl, int n2, int n3) {
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll((class_0368)this.lllIlIIlIIIlIlIIIllIlllIl.get(n));
        int n4 = this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII() / 2 - 92 - 16;
        int n5 = 3;
        int n6 = 215;
        if (this.IIIllIllIIlIlIlIlIllllIIl >= n4 + n6 - 16 - n5 && this.IIIllIllIIlIlIlIlIllllIIl <= n4 + n6 + n5) {
            this.lllIIIllIIIIlllIlIIllIIll.IIIllIIlIIIIIIlIlIIllIIlI();
        } else if (bl) {
            Mouse.next();
            this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll.IlIIIIIllllllIIlllIllllll);
            return;
        }
    }

    @Override
    protected boolean lllIIIllIIIIlllIlIIllIIll(int n) {
        return ((class_0368)this.lllIlIIlIIIlIlIIIllIlllIl.get(n)).equals(this.lllIIIllIIIIlllIlIIllIIll.IlIIIIIllllllIIlllIllllll);
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
        class_0368 class_03682 = (class_0368)this.lllIlIIlIIIlIlIIIllIlllIl.get(n);
        String string = "";
        string = class_03682.llIIllIllIlIIlIIllIllllll ? "(Forced) " : "(Server) ";
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.lllIIlIIIllllllIIIIlIlIlI(), class_03682.lIlllIlllIIIIlIIlllIllIII ? (Object)((Object) EnumChatFormatting.GRAY) + string + (Object)((Object) EnumChatFormatting.RESET) + class_03682.lllIIIllIIIIlllIlIIllIIll : class_03682.lllIIIllIIIIlllIlIIllIIll, this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII() / 2, n3 + 3, class_03682.lllIIIllIIIIlllIlIIllIIll());
        int n7 = 3;
        if (this.IIIllIllIIlIlIlIlIllllIIl >= n2 - n7 && this.IllIIIllIIIIlIlIlIllIIlll >= n3 && this.IIIllIllIIlIlIlIlIllllIIl <= n2 + 215 + n7 && this.IllIIIllIIIIlIlIlIllIIlll <= n3 + this.IllIIlllllllIIlIIlIIIIlIl) {
            String string2;
            if (this.IIIllIllIIlIlIlIlIllllIIl >= n2 + 215 - 16 - n7 && this.IIIllIllIIlIlIlIlIllllIIl <= n2 + 215 + n7) {
                string2 = class_03682.llIIlllIllIllllIIIlIIIIII ? class_0950.lllIIIllIIIIlllIlIIllIIll("minimap.waypoints.disable") : class_0950.lllIIIllIIIIlllIlIIllIIll("minimap.waypoints.enable");
            } else {
                string2 = "X: " + class_03682.IlIllllllIIlIIllllIIlIIIl() + " Z: " + class_03682.lIlllIlllIIIIlIIlllIllIII();
                if (class_03682.IlIIIIIllllllIIlllIllllll() > 0) {
                    string2 = string2 + " Y: " + class_03682.IlIIIIIllllllIIlllIllllll();
                }
            }
            class_1400.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, string2);
        }
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        class_2210.lllIIIllIIIIlllIlIIllIIll("textures/gui/container/inventory.png");
        int n8 = class_03682.llIIlllIllIllllIIIlIIIIII ? 72 : 90;
        int n9 = 216;
        class_0857.lllIIIllIIIIlllIlIIllIIll((float)(n2 + 198), (float)(n3 - 2), (float)n8, (float)n9, 16, 16);
    }

    protected void lllIIIllIIIIlllIlIIllIIll(int n, boolean bl) {
        int n2 = bl ? 1 : -1;
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll.getClass();
        if (n == 1) {
            ArrayList arrayList = this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll();
            Collections.sort(this.lllIlIIlIIIlIlIIIllIlllIl, new class_0452(this, arrayList, n2));
        } else {
            this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll.getClass();
            if (n == 3) {
                if (bl) {
                    Collections.sort(this.lllIlIIlIIIlIlIIIllIlllIl);
                } else {
                    Collections.sort(this.lllIlIIlIIIlIlIIIllIlllIl, Collections.reverseOrder());
                }
            } else {
                this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll.getClass();
                if (n == 2) {
                    Collator collator = class_0950.lllIIIllIIIIlllIlIIllIIll();
                    Collections.sort(this.lllIlIIlIIIlIlIIIllIlllIl, new class_0606(this, collator, n2));
                } else {
                    this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll.getClass();
                    if (n == 4) {
                        Collections.sort(this.lllIlIIlIIIlIlIIIllIlllIl, new class_0217(this, n2));
                    }
                }
            }
        }
    }
}

