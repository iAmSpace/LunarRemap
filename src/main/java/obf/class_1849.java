package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;

class class_1849
extends class_0579 {
    public int lllIIIllIIIIlllIlIIllIIll;
    final /* synthetic */ class_0076 lllIlIIlIIIlIlIIIllIlllIl;

    public class_1849(class_0076 class_00762) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_00762;
        super(class_00762.lllllIlllIIllIlIIlIIIllII, class_00762.IlIlIIlllIIlIllIIIlllllIl, class_00762.lIIlIIIIIlIlllIlIIlIlIlll, 43, class_00762.lIIlIIIIIlIlllIlIIlIlIlll - 60, 24);
        this.lllIIIllIIIIlllIlIIllIIll = -1;
    }

    private void lllIIIllIIIIlllIlIIllIIll(int n, int n2, ItemStack class_08972) {
        this.IlIIIIIllllllIIlllIllllll(n + 1, n2 + 1);
        GL11.glEnable((int)32826);
        if (class_08972 != null) {
            class_0624.IlIllllllIIlIIllllIIlIIIl();
            class_0076.IllIIlllllllIIlIIlIIIIlIl().lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl.lIlIllIIlIIlIIlIIlIIlIIll, this.lllIlIIlIIIlIlIIIllIlllIl.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII(), class_08972, n + 2, n2 + 2);
            class_0624.lllIIIllIIIIlllIlIIllIIll();
        }
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
        class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, n2 + 18, class_0076.IlIlllIIIIIIlIIllIIllIlll, (float)(n3 + 0) * 0.0078125f, (float)(n4 + 18) * 0.0078125f);
        class_08682.lllIIIllIIIIlllIlIIllIIll(n + 18, n2 + 18, class_0076.IlIlllIIIIIIlIIllIIllIlll, (float)(n3 + 18) * 0.0078125f, (float)(n4 + 18) * 0.0078125f);
        class_08682.lllIIIllIIIIlllIlIIllIIll(n + 18, n2 + 0, class_0076.IlIlllIIIIIIlIIllIIllIlll, (float)(n3 + 18) * 0.0078125f, (float)(n4 + 0) * 0.0078125f);
        class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, n2 + 0, class_0076.IlIlllIIIIIIlIIllIIllIlll, (float)(n3 + 0) * 0.0078125f, (float)(n4 + 0) * 0.0078125f);
        class_08682.lllIIIllIIIIlllIlIIllIIll();
    }

    @Override
    protected int lllIIIllIIIIlllIlIIllIIll() {
        return class_0076.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl).IlIllllllIIlIIllllIIlIIIl().size();
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, boolean bl, int n2, int n3) {
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.lllIlIIlIIIlIlIIIllIlllIl.IIIllIIlIIIIIIlIlIIllIIlI();
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
        class_1324 class_13242 = (class_1324)class_0076.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl).IlIllllllIIlIIllllIIlIIIl().get(class_0076.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl).IlIllllllIIlIIllllIIlIIIl().size() - n - 1);
        Item class_06112 = Item.getItemFromBlock(class_13242.lllIlIIlIIIlIlIIIllIlllIl());
        ItemStack class_08972 = class_13242.lllIlIIlIIIlIlIIIllIlllIl() == Blocks.lllIIIllIIIIlllIlIIllIIll ? null : new ItemStack(class_06112, 1, class_13242.IlIllllllIIlIIllllIIlIIIl());
        String string = class_08972 != null && class_06112 != null ? class_06112.IIIllIllIIlIlIlIlIllllIIl(class_08972) : "Air";
        this.lllIIIllIIIIlllIlIIllIIll(n2, n3, class_08972);
        this.lllIlIIlIIIlIlIIIllIlllIl.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl(string, n2 + 18 + 5, n3 + 3, 0xFFFFFF);
        String string2 = n == 0 ? class_0616.lllIIIllIIIIlllIlIIllIIll("createWorld.customize.flat.layer.top", class_13242.lllIIIllIIIIlllIlIIllIIll()) : (n == class_0076.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl).IlIllllllIIlIIllllIIlIIIl().size() - 1 ? class_0616.lllIIIllIIIIlllIlIIllIIll("createWorld.customize.flat.layer.bottom", class_13242.lllIIIllIIIIlllIlIIllIIll()) : class_0616.lllIIIllIIIIlllIlIIllIIll("createWorld.customize.flat.layer", class_13242.lllIIIllIIIIlllIlIIllIIll()));
        this.lllIlIIlIIIlIlIIIllIlllIl.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl(string2, n2 + 2 + 213 - this.lllIlIIlIIIlIlIIIllIlllIl.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(string2), n3 + 3, 0xFFFFFF);
    }

    @Override
    protected int lIlllIlllIIIIlIIlllIllIII() {
        return this.IlIllllllIIlIIllllIIlIIIl - 70;
    }
}

