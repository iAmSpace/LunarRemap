package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;

class class_2008
extends class_0579 {
    public int lllIIIllIIIIlllIlIIllIIll;
    final /* synthetic */ class_1164 lllIlIIlIIIlIlIIIllIlllIl;

    public class_2008(class_1164 class_11642) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_11642;
        super(class_11642.lllllIlllIIllIlIIlIIIllII, class_11642.IlIlIIlllIIlIllIIIlllllIl, class_11642.lIIlIIIIIlIlllIlIIlIlIlll, 80, class_11642.lIIlIIIIIlIlllIlIIlIlIlll - 37, 24);
        this.lllIIIllIIIIlllIlIIllIIll = -1;
    }

    private void lllIIIllIIIIlllIlIIllIIll(int n, int n2, Item class_06112) {
        this.IlIIIIIllllllIIlllIllllll(n + 1, n2 + 1);
        GL11.glEnable((int)32826);
        class_0624.IlIllllllIIlIIllllIIlIIIl();
        class_1164.IIIllIIlIIIIIIlIlIIllIIlI().lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl.lIlIllIIlIIlIIlIIlIIlIIll, this.lllIlIIlIIIlIlIIIllIlllIl.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII(), new ItemStack(class_06112, 1, 0), n + 2, n2 + 2);
        class_0624.lllIIIllIIIIlllIlIIllIIll();
        GL11.glDisable((int)32826);
    }

    private void IlIIIIIllllllIIlllIllllll(int n, int n2) {
        this.IlIllllllIIlIIllllIIlIIIl(n, n2, 0, 0);
    }

    private void IlIllllllIIlIIllllIIlIIIl(int n, int n2, int n3, int n4) {
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        this.lllIlIIlIIIlIlIIIllIlllIl.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(class_0210.llIIllIllIlIIlIIllIllllll);
        float f = 0.0078125f;
        float f2 = 0.0078125f;
        boolean bl = true;
        boolean bl2 = true;
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, n2 + 18, class_1164.IlIlllIIIIIIlIIllIIllIlll, (float)(n3 + 0) * 0.0078125f, (float)(n4 + 18) * 0.0078125f);
        class_08682.lllIIIllIIIIlllIlIIllIIll(n + 18, n2 + 18, class_1164.IlIlllIIIIIIlIIllIIllIlll, (float)(n3 + 18) * 0.0078125f, (float)(n4 + 18) * 0.0078125f);
        class_08682.lllIIIllIIIIlllIlIIllIIll(n + 18, n2 + 0, class_1164.IlIlllIIIIIIlIIllIIllIlll, (float)(n3 + 18) * 0.0078125f, (float)(n4 + 0) * 0.0078125f);
        class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, n2 + 0, class_1164.IlIlllIIIIIIlIIllIIllIlll, (float)(n3 + 0) * 0.0078125f, (float)(n4 + 0) * 0.0078125f);
        class_08682.lllIIIllIIIIlllIlIIllIIll();
    }

    @Override
    protected int lllIIIllIIIIlllIlIIllIIll() {
        return class_1164.IllIIlllllllIIlIIlIIIIlIl().size();
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, boolean bl, int n2, int n3) {
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.lllIlIIlIIIlIlIIIllIlllIl.lIllllIIlIIIlIllllllIIIll();
        class_1164.lllIlIIlIIIlIlIIIllIlllIl(this.lllIlIIlIIIlIlIIIllIlllIl).lllIIIllIIIIlllIlIIllIIll(((class_0530)class_1164.IllIIlllllllIIlIIlIIIIlIl().get((int)class_1164.lllIIIllIIIIlllIlIIllIIll((class_1164)this.lllIlIIlIIIlIlIIIllIlllIl).lllIIIllIIIIlllIlIIllIIll)).IlIllllllIIlIIllllIIlIIIl);
    }

    @Override
    protected boolean lllIIIllIIIIlllIlIIllIIll(int n) {
        return n == this.lllIIIllIIIIlllIlIIllIIll;
    }

    @Override
    protected void IlIllllllIIlIIllllIIlIIIl() {
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4, class_0868 class_08682, int n5, int n6) {
        class_0530 class_05302 = (class_0530)class_1164.IllIIlllllllIIlIIlIIIIlIl().get(n);
        this.lllIIIllIIIIlllIlIIllIIll(n2, n3, class_05302.lllIIIllIIIIlllIlIIllIIll);
        this.lllIlIIlIIIlIlIIIllIlllIl.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl(class_05302.lllIlIIlIIIlIlIIIllIlllIl, n2 + 18 + 5, n3 + 6, 0xFFFFFF);
    }
}

