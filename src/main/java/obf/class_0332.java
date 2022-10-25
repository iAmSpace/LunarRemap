package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;

public class class_0332 {
    private String lllIIIllIIIIlllIlIIllIIll;
    private int lllIlIIlIIIlIlIIIllIlllIl;
    private long IlIllllllIIlIIllllIIlIIIl;
    private long lIlllIlllIIIIlIIlllIllIII;
    private Minecraft IlIIIIIllllllIIlllIllllll = Minecraft.getMinecraft();
    private ItemStack lIllllIIlIIIlIllllllIIIll;

    public class_0332(String string, int n, long l) {
        this.lllIIIllIIIIlllIlIIllIIll = string;
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
        this.IlIllllllIIlIIllllIIlIIIl = l;
        this.lIlllIlllIIIIlIIlllIllIII = System.currentTimeMillis();
        this.lIllllIIlIIIlIllllllIIIll = new ItemStack(Item.lllIIIllIIIIlllIlIIllIIll(n));
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1609 class_16092, float f, float f2, int n) {
        float f3;
        int n2 = 17;
        GL11.glPushMatrix();
        float f4 = class_0283.llIIlllIllIllllIIIlIIIIII.lIllllIIlIIIlIllllllIIIll;
        class_0283.llIIlllIllIllllIIIlIIIIII.lIllllIIlIIIlIllllllIIIll = -200.0f;
        float f5 = 1.35f;
        GL11.glTranslatef((float)-0.5f, (float)-1.0f, (float)0.0f);
        GL11.glScalef((float)f5, (float)f5, (float)f5);
        class_0624.lllIlIIlIIIlIlIIIllIlllIl();
        class_0283.llIIlllIllIllllIIIlIIIIII.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIIIIllllllIIlllIllllll.IlIlllIIIIIIlIIllIIllIlll, this.IlIIIIIllllllIIlllIllllll.llIIlIIllIIllIlIIllIIllII(), this.lIllllIIlIIIlIllllllIIIll, (int)((f + (float)(n2 / 2)) / f5), (int)((f2 + (float)(n2 / 2)) / f5));
        class_0624.lllIIIllIIIIlllIlIIllIIll();
        GL11.glPopMatrix();
        class_0283.llIIlllIllIllllIIIlIIIIII.lIllllIIlIIIlIllllllIIIll = f4;
        double d = this.IlIllllllIIlIIllllIIlIIIl - (System.currentTimeMillis() - this.lIlllIlllIIIIlIIlllIllIII);
        if (d <= 0.0) {
            return;
        }
        if (((String)class_16092.lIlllIlllIIIIlIIlllIllIII()).equalsIgnoreCase("Bright")) {
            GL11.glColor4f((float)0.0f, (float)0.0f, (float)0.0f, (float)0.2f);
            class_0857.lllIIIllIIIIlllIlIIllIIll((double)(f + (float)n2), (double)(f2 + (float)n2), (double)n2, 0.0, (float)this.IlIllllllIIlIIllllIIlIIIl / 3.95f, (int)this.IlIllllllIIlIIllllIIlIIIl, d);
            GL11.glColor4f((float)0.9f, (float)0.9f, (float)0.9f, (float)1.0f);
            class_0857.lllIIIllIIIIlllIlIIllIIll((double)(f + (float)n2), (double)(f2 + (float)n2), (double)((float)n2 + 0.1f), (double)(n2 - 2), (float)this.IlIllllllIIlIIllllIIlIIIl / 3.95f, (int)this.IlIllllllIIlIIllllIIlIIIl, this.IlIllllllIIlIIllllIIlIIIl);
            GL11.glColor4f((float)0.35f, (float)0.35f, (float)0.35f, (float)0.6f);
            class_0857.lllIIIllIIIIlllIlIIllIIll((double)(f + (float)n2), (double)(f2 + (float)n2), (double)((float)n2 + 0.1f), (double)(n2 - 2), (float)this.IlIllllllIIlIIllllIIlIIIl / 3.95f, (int)this.IlIllllllIIlIIllllIIlIIIl, d);
        } else if (((String)class_16092.lIlllIlllIIIIlIIlllIllIII()).equalsIgnoreCase("Dark")) {
            GL11.glColor4f((float)0.0f, (float)0.0f, (float)0.0f, (float)0.2f);
            class_0857.lllIIIllIIIIlllIlIIllIIll(f + (float)n2, f2 + (float)n2, n2);
            GL11.glColor4f((float)0.0f, (float)0.0f, (float)0.0f, (float)0.2f);
            class_0857.lllIIIllIIIIlllIlIIllIIll((double)(f + (float)n2), (double)(f2 + (float)n2), (double)n2, 0.0, (float)this.IlIllllllIIlIIllllIIlIIIl / 3.95f, (int)this.IlIllllllIIlIIllllIIlIIIl, d);
            GL11.glColor4f((float)0.0f, (float)0.9f, (float)0.0f, (float)1.0f);
            class_0857.lllIIIllIIIIlllIlIIllIIll((double)(f + (float)n2), (double)(f2 + (float)n2), (double)((float)n2 + 0.1f), (double)(n2 - 2), (float)this.IlIllllllIIlIIllllIIlIIIl / 3.95f, (int)this.IlIllllllIIlIIllllIIlIIIl, this.IlIllllllIIlIIllllIIlIIIl);
            GL11.glColor4f((float)0.0f, (float)0.5f, (float)0.0f, (float)1.0f);
            class_0857.lllIIIllIIIIlllIlIIllIIll((double)(f + (float)n2), (double)(f2 + (float)n2), (double)((float)n2 + 0.1f), (double)(n2 - 2), (float)this.IlIllllllIIlIIllllIIlIIIl / 3.95f, (int)this.IlIllllllIIlIIllllIIlIIIl, d);
        } else if (((String)class_16092.lIlllIlllIIIIlIIlllIllIII()).equalsIgnoreCase("Colored")) {
            float f6 = (float)(n >> 24 & 0xFF) / 255.0f;
            f3 = (float)(n >> 16 & 0xFF) / 255.0f;
            float f7 = (float)(n >> 8 & 0xFF) / 255.0f;
            float f8 = (float)(n & 0xFF) / 255.0f;
            GL11.glColor4f((float)f3, (float)f7, (float)f8, (float)0.15f);
            class_0857.lllIIIllIIIIlllIlIIllIIll(f + (float)n2, f2 + (float)n2, n2);
            GL11.glColor4f((float)f3, (float)f7, (float)f8, (float)0.25f);
            class_0857.lllIIIllIIIIlllIlIIllIIll((double)(f + (float)n2), (double)(f2 + (float)n2), (double)n2, 0.0, (float)this.IlIllllllIIlIIllllIIlIIIl / 3.95f, (int)this.IlIllllllIIlIIllllIIlIIIl, d);
            GL11.glColor4f((float)f3, (float)f7, (float)f8, (float)1.0f);
            class_0857.lllIIIllIIIIlllIlIIllIIll((double)(f + (float)n2), (double)(f2 + (float)n2), (double)((float)n2 + 0.1f), (double)(n2 - 2), (float)this.IlIllllllIIlIIllllIIlIIIl / 3.95f, (int)this.IlIllllllIIlIIllllIIlIIIl, this.IlIllllllIIlIIllllIIlIIIl);
            GL11.glColor4f((float)f3, (float)f7, (float)f8, (float)0.15f);
            class_0857.lllIIIllIIIIlllIlIIllIIll((double)(f + (float)n2), (double)(f2 + (float)n2), (double)((float)n2 + 0.1f), (double)(n2 - 2), (float)this.IlIllllllIIlIIllllIIlIIIl / 3.95f, (int)this.IlIllllllIIlIIllllIIlIIIl, d);
        }
        String string = String.format("%.1f", d / 1000.0);
        f3 = LunarClient.getInstance().ubuntuMedium16px.lllIlIIlIIIlIlIIIllIlllIl(string);
        LunarClient.getInstance().ubuntuMedium16px.lllIIIllIIIIlllIlIIllIIll(string, (double)(f + (float)n2 - f3 / 2.0f), (double)(f2 + (float)(n2 / 2) + 4.0f), -1, 0x6F000000);
    }

    public boolean lllIIIllIIIIlllIlIIllIIll() {
        return this.lIlllIlllIIIIlIIlllIllIII < System.currentTimeMillis() - this.IlIllllllIIlIIllllIIlIIIl;
    }

    public void lllIIIllIIIIlllIlIIllIIll(long l) {
        this.IlIllllllIIlIIllllIIlIIIl = l;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl() {
        this.lIlllIlllIIIIlIIlllIllIII = System.currentTimeMillis();
    }

    public String IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public long lIlllIlllIIIIlIIlllIllIII() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public int IlIIIIIllllllIIlllIllllll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }
}

