package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.opengl.GL11
 */
import java.util.HashSet;
import java.util.Set;

import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.client.renderer.OpenGlHelper;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public abstract class class_1522
extends class_0229 {
    protected static final ResourceLocation IIIllIllIIlIlIlIlIllllIIl = new ResourceLocation("textures/gui/container/inventory.png");
    protected int IllIIIllIIIIlIlIlIllIIlll = 176;
    protected int lIIIIlIlIIlllllIIllIIlIII = 166;
    public class_1071 lIlllIlllIlIIIIlllIlIlIIl;
    protected int IlIIlllllIIlIlIlllllIllll;
    protected int llIIlIlIlllIIllIlIlllIllI;
    private class_1291 lllIIIllIIIIlllIlIIllIIll;
    private class_1291 lllIlIIlIIIlIlIIIllIlllIl;
    private boolean IlIllllllIIlIIllllIIlIIIl;
    private ItemStack lIlllIlllIIIIlIIlllIllIII;
    private int IlIIIIIllllllIIlllIllllll;
    private int lIllllIIlIIIlIllllllIIIll;
    private class_1291 IIIllIIlIIIIIIlIlIIllIIlI;
    private long IllIIlllllllIIlIIlIIIIlIl;
    private ItemStack IIlIIlIlIlIllIIlIlIIIIlll;
    private class_1291 llIIIlllIlllIlIllIIIIllIl;
    private long IIIIlIllIlIIlIIlIllIlIlll;
    protected final Set IllIIIIllIIllIllIlllIlIIl = new HashSet();
    protected boolean IIIIIIIIlIllIIllIIlllIllI;
    private int IlIlIIlllIllllllllIIIlIlI;
    private int llllIIIIlIIIlIIIIIIlIllll;
    private boolean llIIIIllIIIIIIIlIIIlIIIIl;
    private int IIllIllIIllIIlllIIIlIlllI;
    private long llllllIlIllllIlIlIlIIIIlI;
    private class_1291 lIlIIllllIlIIIIllIIIIlIIl;
    private int llIlllIIllIlllIlIlIlIIIll;
    private boolean IIIIlIIlIIIllIIIIllIIIlII;
    private ItemStack lllIIIIIIlIlllIIlIlIIIllI;

    public class_1522(class_1071 class_10712) {
        this.lIlllIlllIlIIIIlllIlIlIIl = class_10712;
        this.llIIIIllIIIIIIIlIIIlIIIIl = true;
    }

    @Override
    public void n_() {
        super.n_();
        this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.lIIIlIllllIlllIIIIIllIIIl = this.lIlllIlllIlIIIIlllIlIlIIl;
        this.IlIIlllllIIlIlIlllllIllll = (this.IlIlIIlllIIlIllIIIlllllIl - this.IllIIIllIIIIlIlIlIllIIlll) / 2;
        this.llIIlIlIlllIIllIlIlllIllI = (this.lIIlIIIIIlIlllIlIIlIlIlll - this.lIIIIlIlIIlllllIIllIIlIII) / 2;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        int n3;
        int n4;
        Object object;
        this.llIIlIllIllllIlIIIIlIIlll();
        int n5 = this.IlIIlllllIIlIlIlllllIllll;
        int n6 = this.llIIlIlIlllIIllIlIlllIllI;
        this.lllIIIllIIIIlllIlIIllIIll(f, n, n2);
        GL11.glDisable((int)32826);
        class_0624.lllIIIllIIIIlllIlIIllIIll();
        GL11.glDisable((int)2896);
        GL11.glDisable((int)2929);
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
        class_0624.IlIllllllIIlIIllllIIlIIIl();
        GL11.glPushMatrix();
        GL11.glTranslatef((float)n5, (float)n6, (float)0.0f);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glEnable((int)32826);
        this.lllIIIllIIIIlllIlIIllIIll = null;
        int n7 = 240;
        int n8 = 240;
        OpenGlHelper.lllIIIllIIIIlllIlIIllIIll(OpenGlHelper.IlIllllllIIlIIllllIIlIIIl, (float)n7 / 1.0f, (float)n8 / 1.0f);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        for (int i = 0; i < this.lIlllIlllIlIIIIlllIlIlIIl.IlIllllllIIlIIllllIIlIIIl.size(); ++i) {
            object = (class_1291)this.lIlllIlllIlIIIIlllIlIlIIl.IlIllllllIIlIIllllIIlIIIl.get(i);
            this.lllIIIllIIIIlllIlIIllIIll((class_1291)object);
            if (!this.lllIIIllIIIIlllIlIIllIIll((class_1291)object, n, n2) || !((class_1291)object).lIllllIIlIIIlIllllllIIIll()) continue;
            this.lllIIIllIIIIlllIlIIllIIll = object;
            GL11.glDisable((int)2896);
            GL11.glDisable((int)2929);
            n4 = ((class_1291)object).IllIIlllllllIIlIIlIIIIlIl;
            n3 = ((class_1291)object).IIIllIllIIlIlIlIlIllllIIl;
            GL11.glColorMask((boolean)true, (boolean)true, (boolean)true, (boolean)false);
            class_1522.lllIIIllIIIIlllIlIIllIIll((float)n4, (float)n3, (float)(n4 + 16), (float)(n3 + 16), -2130706433, -2130706433);
            GL11.glColorMask((boolean)true, (boolean)true, (boolean)true, (boolean)true);
            GL11.glEnable((int)2896);
            GL11.glEnable((int)2929);
        }
        this.lllIIIllIIIIlllIlIIllIIll(n, n2);
        class_0503 class_05032 = this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.lllIIlIIIllllllIIIIlIlIlI;
        Object object2 = object = this.lIlllIlllIIIIlIIlllIllIII == null ? class_05032.IllIIlllllllIIlIIlIIIIlIl() : this.lIlllIlllIIIIlIIlllIllIII;
        if (object != null) {
            n4 = 8;
            n3 = this.lIlllIlllIIIIlIIlllIllIII == null ? 8 : 16;
            String string = null;
            if (this.lIlllIlllIIIIlIIlllIllIII != null && this.IlIllllllIIlIIllllIIlIIIl) {
                object = ((ItemStack)object).llIIlllIllIllllIIIlIIIIII();
                ((ItemStack)object).lllIlIIlIIIlIlIIIllIlllIl = MathHelper.lIllllIIlIIIlIllllllIIIll((float)((ItemStack)object).lllIlIIlIIIlIlIIIllIlllIl / 2.0f);
            } else if (this.IIIIIIIIlIllIIllIIlllIllI && this.IllIIIIllIIllIllIlllIlIIl.size() > 1) {
                object = ((ItemStack)object).llIIlllIllIllllIIIlIIIIII();
                ((ItemStack)object).lllIlIIlIIIlIlIIIllIlllIl = this.IIllIllIIllIIlllIIIlIlllI;
                if (((ItemStack)object).lllIlIIlIIIlIlIIIllIlllIl == 0) {
                    string = "" + (Object)((Object)class_1227.IlIlllIIIIIIlIIllIIllIlll) + "0";
                }
            }
            this.lllIIIllIIIIlllIlIIllIIll((ItemStack)object, n - n5 - n4, n2 - n6 - n3, string);
        }
        if (this.IIlIIlIlIlIllIIlIlIIIIlll != null) {
            float f2 = (float)(Minecraft.llllllIlIllllIlIlIlIIIIlI() - this.IllIIlllllllIIlIIlIIIIlIl) / 100.0f;
            if (f2 >= 1.0f) {
                f2 = 1.0f;
                this.IIlIIlIlIlIllIIlIlIIIIlll = null;
            }
            n3 = this.IIIllIIlIIIIIIlIlIIllIIlI.IllIIlllllllIIlIIlIIIIlIl - this.IlIIIIIllllllIIlllIllllll;
            int n9 = this.IIIllIIlIIIIIIlIlIIllIIlI.IIIllIllIIlIlIlIlIllllIIl - this.lIllllIIlIIIlIllllllIIIll;
            int n10 = this.IlIIIIIllllllIIlllIllllll + (int)((float)n3 * f2);
            int n11 = this.lIllllIIlIIIlIllllllIIIll + (int)((float)n9 * f2);
            this.lllIIIllIIIIlllIlIIllIIll(this.IIlIIlIlIlIllIIlIlIIIIlll, n10, n11, null);
        }
        GL11.glPopMatrix();
        if (class_05032.IllIIlllllllIIlIIlIIIIlIl() == null && this.lllIIIllIIIIlllIlIIllIIll != null && this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl()) {
            ItemStack class_08972 = this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll();
            this.lllIIIllIIIIlllIlIIllIIll(class_08972, n, n2);
        }
        GL11.glEnable((int)2896);
        GL11.glEnable((int)2929);
        class_0624.lllIlIIlIIIlIlIIIllIlllIl();
    }

    private void lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, int n, int n2, String string) {
        GL11.glTranslatef((float)0.0f, (float)0.0f, (float)32.0f);
        IlIlllIIIIIIlIIllIIllIlll = 200.0f;
        class_1522.IlIlIIlIlIllIIlIlIIllIIIl.lIllllIIlIIIlIllllllIIIll = 200.0f;
        IlIlIIlIlIllIIlIlIIllIIIl.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIllIIlIIlIIlIIlIIlIIll, this.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII(), class_08972, n, n2);
        IlIlIIlIlIllIIlIlIIllIIIl.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, this.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII(), class_08972, n, n2 - (this.lIlllIlllIIIIlIIlllIllIII == null ? 0 : 8), string);
        IlIlllIIIIIIlIIllIIllIlll = 0.0f;
        class_1522.IlIlIIlIlIllIIlIlIIllIIIl.lIllllIIlIIIlIllllllIIIll = 0.0f;
    }

    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
    }

    protected abstract void lllIIIllIIIIlllIlIIllIIll(float var1, int var2, int var3);

    private void lllIIIllIIIIlllIlIIllIIll(class_1291 class_12912) {
        class_2102 class_21022;
        int n = class_12912.IllIIlllllllIIlIIlIIIIlIl;
        int n2 = class_12912.IIIllIllIIlIlIlIlIllllIIl;
        ItemStack class_08972 = class_12912.lllIIIllIIIIlllIlIIllIIll();
        boolean bl = false;
        boolean bl2 = class_12912 == this.lllIlIIlIIIlIlIIIllIlllIl && this.lIlllIlllIIIIlIIlllIllIII != null && !this.IlIllllllIIlIIllllIIlIIIl;
        ItemStack class_08973 = this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.lllIIlIIIllllllIIIIlIlIlI.IllIIlllllllIIlIIlIIIIlIl();
        String string = null;
        if (class_12912 == this.lllIlIIlIIIlIlIIIllIlllIl && this.lIlllIlllIIIIlIIlllIllIII != null && this.IlIllllllIIlIIllllIIlIIIl && class_08972 != null) {
            class_08972 = class_08972.llIIlllIllIllllIIIlIIIIII();
            class_08972.lllIlIIlIIIlIlIIIllIlllIl /= 2;
        } else if (this.IIIIIIIIlIllIIllIIlllIllI && this.IllIIIIllIIllIllIlllIlIIl.contains(class_12912) && class_08973 != null) {
            if (this.IllIIIIllIIllIllIlllIlIIl.size() == 1) {
                return;
            }
            if (class_1071.lllIIIllIIIIlllIlIIllIIll(class_12912, class_08973, true) && this.lIlllIlllIlIIIIlllIlIlIIl.lllIIIllIIIIlllIlIIllIIll(class_12912)) {
                class_08972 = class_08973.llIIlllIllIllllIIIlIIIIII();
                bl = true;
                class_1071.lllIIIllIIIIlllIlIIllIIll(this.IllIIIIllIIllIllIlllIlIIl, this.IlIlIIlllIllllllllIIIlIlI, class_08972, class_12912.lllIIIllIIIIlllIlIIllIIll() == null ? 0 : class_12912.lllIIIllIIIIlllIlIIllIIll().lllIlIIlIIIlIlIIIllIlllIl);
                if (class_08972.lllIlIIlIIIlIlIIIllIlllIl > class_08972.lIlllIlllIIIIlIIlllIllIII()) {
                    string = (Object)((Object)class_1227.IlIlllIIIIIIlIIllIIllIlll) + "" + class_08972.lIlllIlllIIIIlIIlllIllIII();
                    class_08972.lllIlIIlIIIlIlIIIllIlllIl = class_08972.lIlllIlllIIIIlIIlllIllIII();
                }
                if (class_08972.lllIlIIlIIIlIlIIIllIlllIl > class_12912.lIlllIlllIIIIlIIlllIllIII()) {
                    string = (Object)((Object)class_1227.IlIlllIIIIIIlIIllIIllIlll) + "" + class_12912.lIlllIlllIIIIlIIlllIllIII();
                    class_08972.lllIlIIlIIIlIlIIIllIlllIl = class_12912.lIlllIlllIIIIlIIlllIllIII();
                }
            } else {
                this.IllIIIIllIIllIllIlllIlIIl.remove(class_12912);
                this.lIllllIIlIIIlIllllllIIIll();
            }
        }
        IlIlllIIIIIIlIIllIIllIlll = 100.0f;
        class_1522.IlIlIIlIlIllIIlIlIIllIIIl.lIllllIIlIIIlIllllllIIIll = 100.0f;
        if (class_08972 == null && (class_21022 = class_12912.IlIIIIIllllllIIlllIllllll()) != null) {
            GL11.glDisable((int)2896);
            this.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(class_1511.lllIlIIlIIIlIlIIIllIlllIl);
            this.lllIIIllIIIIlllIlIIllIIll(n, n2, class_21022, 16, 16);
            GL11.glEnable((int)2896);
            bl2 = true;
        }
        if (!bl2) {
            if (bl) {
                class_1522.lllIIIllIIIIlllIlIIllIIll(n, n2, n + 16, n2 + 16, -2130706433);
            }
            GL11.glEnable((int)2929);
            IlIlIIlIlIllIIlIlIIllIIIl.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIllIIlIIlIIlIIlIIlIIll, this.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII(), class_08972, n, n2);
            IlIlIIlIlIllIIlIlIIllIIIl.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, this.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII(), class_08972, n, n2, string);
        }
        class_1522.IlIlIIlIlIllIIlIlIIllIIIl.lIllllIIlIIIlIllllllIIIll = 0.0f;
        IlIlllIIIIIIlIIllIIllIlll = 0.0f;
    }

    private void lIllllIIlIIIlIllllllIIIll() {
        ItemStack class_08972 = this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.lllIIlIIIllllllIIIIlIlIlI.IllIIlllllllIIlIIlIIIIlIl();
        if (class_08972 != null && this.IIIIIIIIlIllIIllIIlllIllI) {
            this.IIllIllIIllIIlllIIIlIlllI = class_08972.lllIlIIlIIIlIlIIIllIlllIl;
            for (class_1291 class_12912 : this.IllIIIIllIIllIllIlllIlIIl) {
                ItemStack class_08973 = class_08972.llIIlllIllIllllIIIlIIIIII();
                int n = class_12912.lllIIIllIIIIlllIlIIllIIll() == null ? 0 : class_12912.lllIIIllIIIIlllIlIIllIIll().lllIlIIlIIIlIlIIIllIlllIl;
                class_1071.lllIIIllIIIIlllIlIIllIIll(this.IllIIIIllIIllIllIlllIlIIl, this.IlIlIIlllIllllllllIIIlIlI, class_08973, n);
                if (class_08973.lllIlIIlIIIlIlIIIllIlllIl > class_08973.lIlllIlllIIIIlIIlllIllIII()) {
                    class_08973.lllIlIIlIIIlIlIIIllIlllIl = class_08973.lIlllIlllIIIIlIIlllIllIII();
                }
                if (class_08973.lllIlIIlIIIlIlIIIllIlllIl > class_12912.lIlllIlllIIIIlIIlllIllIII()) {
                    class_08973.lllIlIIlIIIlIlIIIllIlllIl = class_12912.lIlllIlllIIIIlIIlllIllIII();
                }
                this.IIllIllIIllIIlllIIIlIlllI -= class_08973.lllIlIIlIIIlIlIIIllIlllIl - n;
            }
        }
    }

    private class_1291 lllIlIIlIIIlIlIIIllIlllIl(int n, int n2) {
        for (int i = 0; i < this.lIlllIlllIlIIIIlllIlIlIIl.IlIllllllIIlIIllllIIlIIIl.size(); ++i) {
            class_1291 class_12912 = (class_1291)this.lIlllIlllIlIIIIlllIlIlIIl.IlIllllllIIlIIllllIIlIIIl.get(i);
            if (!this.lllIIIllIIIIlllIlIIllIIll(class_12912, n, n2)) continue;
            return class_12912;
        }
        return null;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
        boolean bl = n3 == this.lllllIlllIIllIlIIlIIIllII.gameSettings.IIlllllIIlIIlIlIIlIIlIlII.IIIllIllIIlIlIlIlIllllIIl() + 100;
        class_1291 class_12912 = this.lllIlIIlIIIlIlIIIllIlllIl(n, n2);
        long l = Minecraft.llllllIlIllllIlIlIlIIIIlI();
        this.IIIIlIIlIIIllIIIIllIIIlII = this.lIlIIllllIlIIIIllIIIIlIIl == class_12912 && l - this.llllllIlIllllIlIlIlIIIIlI < 250L && this.llIlllIIllIlllIlIlIlIIIll == n3;
        this.llIIIIllIIIIIIIlIIIlIIIIl = false;
        if (n3 == 0 || n3 == 1 || bl) {
            int n4 = this.IlIIlllllIIlIlIlllllIllll;
            int n5 = this.llIIlIlIlllIIllIlIlllIllI;
            boolean bl2 = n < n4 || n2 < n5 || n >= n4 + this.IllIIIllIIIIlIlIlIllIIlll || n2 >= n5 + this.lIIIIlIlIIlllllIIllIIlIII;
            int n6 = -1;
            if (class_12912 != null) {
                n6 = class_12912.IIIllIIlIIIIIIlIlIIllIIlI;
            }
            if (bl2) {
                n6 = -999;
            }
            if (this.lllllIlllIIllIlIIlIIIllII.gameSettings.IllIlIlIIIlIllIlIlIIlllII && bl2 && this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.lllIIlIIIllllllIIIIlIlIlI.IllIIlllllllIIlIIlIIIIlIl() == null) {
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll((class_0229)null);
                return;
            }
            if (n6 != -1) {
                if (this.lllllIlllIIllIlIIlIIIllII.gameSettings.IllIlIlIIIlIllIlIlIIlllII) {
                    if (class_12912 != null && class_12912.lllIlIIlIIIlIlIIIllIlllIl()) {
                        this.lllIlIIlIIIlIlIIIllIlllIl = class_12912;
                        this.lIlllIlllIIIIlIIlllIllIII = null;
                        this.IlIllllllIIlIIllllIIlIIIl = n3 == 1;
                    } else {
                        this.lllIlIIlIIIlIlIIIllIlllIl = null;
                    }
                } else if (!this.IIIIIIIIlIllIIllIIlllIllI) {
                    if (this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.lllIIlIIIllllllIIIIlIlIlI.IllIIlllllllIIlIIlIIIIlIl() == null) {
                        if (n3 == this.lllllIlllIIllIlIIlIIIllII.gameSettings.IIlllllIIlIIlIlIIlIIlIlII.IIIllIllIIlIlIlIlIllllIIl() + 100) {
                            this.lllIIIllIIIIlllIlIIllIIll(class_12912, n6, n3, 3);
                        } else {
                            boolean bl3 = n6 != -999 && (Keyboard.isKeyDown((int)42) || Keyboard.isKeyDown((int)54));
                            int n7 = 0;
                            if (bl3) {
                                this.lllIIIIIIlIlllIIlIlIIIllI = class_12912 != null && class_12912.lllIlIIlIIIlIlIIIllIlllIl() ? class_12912.lllIIIllIIIIlllIlIIllIIll() : null;
                                n7 = 1;
                            } else if (n6 == -999) {
                                n7 = 4;
                            }
                            this.lllIIIllIIIIlllIlIIllIIll(class_12912, n6, n3, n7);
                        }
                        this.llIIIIllIIIIIIIlIIIlIIIIl = true;
                    } else {
                        this.IIIIIIIIlIllIIllIIlllIllI = true;
                        this.llllIIIIlIIIlIIIIIIlIllll = n3;
                        this.IllIIIIllIIllIllIlllIlIIl.clear();
                        if (n3 == 0) {
                            this.IlIlIIlllIllllllllIIIlIlI = 0;
                        } else if (n3 == 1) {
                            this.IlIlIIlllIllllllllIIIlIlI = 1;
                        }
                    }
                }
            }
        }
        this.lIlIIllllIlIIIIllIIIIlIIl = class_12912;
        this.llllllIlIllllIlIlIlIIIIlI = l;
        this.llIlllIIllIlllIlIlIlIIIll = n3;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, long l) {
        class_1291 class_12912 = this.lllIlIIlIIIlIlIIIllIlllIl(n, n2);
        ItemStack class_08972 = this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.lllIIlIIIllllllIIIIlIlIlI.IllIIlllllllIIlIIlIIIIlIl();
        if (this.lllIlIIlIIIlIlIIIllIlllIl != null && this.lllllIlllIIllIlIIlIIIllII.gameSettings.IllIlIlIIIlIllIlIlIIlllII) {
            if (n3 == 0 || n3 == 1) {
                if (this.lIlllIlllIIIIlIIlllIllIII == null) {
                    if (class_12912 != this.lllIlIIlIIIlIlIIIllIlllIl) {
                        this.lIlllIlllIIIIlIIlllIllIII = this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll().llIIlllIllIllllIIIlIIIIII();
                    }
                } else if (this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl > 1 && class_12912 != null && class_1071.lllIIIllIIIIlllIlIIllIIll(class_12912, this.lIlllIlllIIIIlIIlllIllIII, false)) {
                    long l2 = Minecraft.llllllIlIllllIlIlIlIIIIlI();
                    if (this.llIIIlllIlllIlIllIIIIllIl == class_12912) {
                        if (l2 - this.IIIIlIllIlIIlIIlIllIlIlll > 500L) {
                            this.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, this.lllIlIIlIIIlIlIIIllIlllIl.IIIllIIlIIIIIIlIlIIllIIlI, 0, 0);
                            this.lllIIIllIIIIlllIlIIllIIll(class_12912, class_12912.IIIllIIlIIIIIIlIlIIllIIlI, 1, 0);
                            this.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, this.lllIlIIlIIIlIlIIIllIlllIl.IIIllIIlIIIIIIlIlIIllIIlI, 0, 0);
                            this.IIIIlIllIlIIlIIlIllIlIlll = l2 + 750L;
                            --this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl;
                        }
                    } else {
                        this.llIIIlllIlllIlIllIIIIllIl = class_12912;
                        this.IIIIlIllIlIIlIIlIllIlIlll = l2;
                    }
                }
            }
        } else if (this.IIIIIIIIlIllIIllIIlllIllI && class_12912 != null && class_08972 != null && class_08972.lllIlIIlIIIlIlIIIllIlllIl > this.IllIIIIllIIllIllIlllIlIIl.size() && class_1071.lllIIIllIIIIlllIlIIllIIll(class_12912, class_08972, true) && class_12912.lllIIIllIIIIlllIlIIllIIll(class_08972) && this.lIlllIlllIlIIIIlllIlIlIIl.lllIIIllIIIIlllIlIIllIIll(class_12912)) {
            this.IllIIIIllIIllIllIlllIlIIl.add(class_12912);
            this.lIllllIIlIIIlIllllllIIIll();
        }
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3) {
        LunarClient.getInstance().getEventBus().callEvent(new class_0773(n3));
        class_1291 class_12912 = this.lllIlIIlIIIlIlIIIllIlllIl(n, n2);
        int n4 = this.IlIIlllllIIlIlIlllllIllll;
        int n5 = this.llIIlIlIlllIIllIlIlllIllI;
        boolean bl = n < n4 || n2 < n5 || n >= n4 + this.IllIIIllIIIIlIlIlIllIIlll || n2 >= n5 + this.lIIIIlIlIIlllllIIllIIlIII;
        int n6 = -1;
        if (class_12912 != null) {
            n6 = class_12912.IIIllIIlIIIIIIlIlIIllIIlI;
        }
        if (bl) {
            n6 = -999;
        }
        if (this.IIIIlIIlIIIllIIIIllIIIlII && class_12912 != null && n3 == 0 && this.lIlllIlllIlIIIIlllIlIlIIl.lllIIIllIIIIlllIlIIllIIll((ItemStack)null, class_12912)) {
            if (class_1522.lIlllIlllIlIIIIlllIlIlIIl()) {
                if (class_12912 != null && class_12912.lIllllIIlIIIlIllllllIIIll != null && this.lllIIIIIIlIlllIIlIlIIIllI != null) {
                    for (class_1291 class_12913 : this.lIlllIlllIlIIIIlllIlIlIIl.IlIllllllIIlIIllllIIlIIIl) {
                        if (class_12913 == null || !class_12913.lllIIIllIIIIlllIlIIllIIll(this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII) || !class_12913.lllIlIIlIIIlIlIIIllIlllIl() || class_12913.lIllllIIlIIIlIllllllIIIll != class_12912.lIllllIIlIIIlIllllllIIIll || !class_1071.lllIIIllIIIIlllIlIIllIIll(class_12913, this.lllIIIIIIlIlllIIlIlIIIllI, true)) continue;
                        this.lllIIIllIIIIlllIlIIllIIll(class_12913, class_12913.IIIllIIlIIIIIIlIlIIllIIlI, n3, 1);
                    }
                }
            } else {
                this.lllIIIllIIIIlllIlIIllIIll(class_12912, n6, n3, 6);
            }
            this.IIIIlIIlIIIllIIIIllIIIlII = false;
            this.llllllIlIllllIlIlIlIIIIlI = 0L;
        } else {
            if (this.IIIIIIIIlIllIIllIIlllIllI && this.llllIIIIlIIIlIIIIIIlIllll != n3) {
                this.IIIIIIIIlIllIIllIIlllIllI = false;
                this.IllIIIIllIIllIllIlllIlIIl.clear();
                this.llIIIIllIIIIIIIlIIIlIIIIl = true;
                return;
            }
            if (this.llIIIIllIIIIIIIlIIIlIIIIl) {
                this.llIIIIllIIIIIIIlIIIlIIIIl = false;
                return;
            }
            if (this.lllIlIIlIIIlIlIIIllIlllIl != null && this.lllllIlllIIllIlIIlIIIllII.gameSettings.IllIlIlIIIlIllIlIlIIlllII) {
                if (n3 == 0 || n3 == 1) {
                    if (this.lIlllIlllIIIIlIIlllIllIII == null && class_12912 != this.lllIlIIlIIIlIlIIIllIlllIl) {
                        this.lIlllIlllIIIIlIIlllIllIII = this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll();
                    }
                    boolean bl2 = class_1071.lllIIIllIIIIlllIlIIllIIll(class_12912, this.lIlllIlllIIIIlIIlllIllIII, false);
                    if (n6 != -1 && this.lIlllIlllIIIIlIIlllIllIII != null && bl2) {
                        this.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, this.lllIlIIlIIIlIlIIIllIlllIl.IIIllIIlIIIIIIlIlIIllIIlI, n3, 0);
                        this.lllIIIllIIIIlllIlIIllIIll(class_12912, n6, 0, 0);
                        if (this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.lllIIlIIIllllllIIIIlIlIlI.IllIIlllllllIIlIIlIIIIlIl() != null) {
                            this.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, this.lllIlIIlIIIlIlIIIllIlllIl.IIIllIIlIIIIIIlIlIIllIIlI, n3, 0);
                            this.IlIIIIIllllllIIlllIllllll = n - n4;
                            this.lIllllIIlIIIlIllllllIIIll = n2 - n5;
                            this.IIIllIIlIIIIIIlIlIIllIIlI = this.lllIlIIlIIIlIlIIIllIlllIl;
                            this.IIlIIlIlIlIllIIlIlIIIIlll = this.lIlllIlllIIIIlIIlllIllIII;
                            this.IllIIlllllllIIlIIlIIIIlIl = Minecraft.llllllIlIllllIlIlIlIIIIlI();
                        } else {
                            this.IIlIIlIlIlIllIIlIlIIIIlll = null;
                        }
                    } else if (this.lIlllIlllIIIIlIIlllIllIII != null) {
                        this.IlIIIIIllllllIIlllIllllll = n - n4;
                        this.lIllllIIlIIIlIllllllIIIll = n2 - n5;
                        this.IIIllIIlIIIIIIlIlIIllIIlI = this.lllIlIIlIIIlIlIIIllIlllIl;
                        this.IIlIIlIlIlIllIIlIlIIIIlll = this.lIlllIlllIIIIlIIlllIllIII;
                        this.IllIIlllllllIIlIIlIIIIlIl = Minecraft.llllllIlIllllIlIlIlIIIIlI();
                    }
                    this.lIlllIlllIIIIlIIlllIllIII = null;
                    this.lllIlIIlIIIlIlIIIllIlllIl = null;
                }
            } else if (this.IIIIIIIIlIllIIllIIlllIllI && !this.IllIIIIllIIllIllIlllIlIIl.isEmpty()) {
                this.lllIIIllIIIIlllIlIIllIIll((class_1291)null, -999, class_1071.lllIlIIlIIIlIlIIIllIlllIl(0, this.IlIlIIlllIllllllllIIIlIlI), 5);
                for (class_1291 class_12914 : this.IllIIIIllIIllIllIlllIlIIl) {
                    this.lllIIIllIIIIlllIlIIllIIll(class_12914, class_12914.IIIllIIlIIIIIIlIlIIllIIlI, class_1071.lllIlIIlIIIlIlIIIllIlllIl(1, this.IlIlIIlllIllllllllIIIlIlI), 5);
                }
                this.lllIIIllIIIIlllIlIIllIIll((class_1291)null, -999, class_1071.lllIlIIlIIIlIlIIIllIlllIl(2, this.IlIlIIlllIllllllllIIIlIlI), 5);
            } else if (this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.lllIIlIIIllllllIIIIlIlIlI.IllIIlllllllIIlIIlIIIIlIl() != null) {
                if (n3 == this.lllllIlllIIllIlIIlIIIllII.gameSettings.IIlllllIIlIIlIlIIlIIlIlII.IIIllIllIIlIlIlIlIllllIIl() + 100) {
                    this.lllIIIllIIIIlllIlIIllIIll(class_12912, n6, n3, 3);
                } else {
                    boolean bl3;
                    boolean bl4 = bl3 = n6 != -999 && (Keyboard.isKeyDown((int)42) || Keyboard.isKeyDown((int)54));
                    if (bl3) {
                        this.lllIIIIIIlIlllIIlIlIIIllI = class_12912 != null && class_12912.lllIlIIlIIIlIlIIIllIlllIl() ? class_12912.lllIIIllIIIIlllIlIIllIIll() : null;
                    }
                    this.lllIIIllIIIIlllIlIIllIIll(class_12912, n6, n3, bl3 ? 1 : 0);
                }
            }
        }
        if (this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.lllIIlIIIllllllIIIIlIlIlI.IllIIlllllllIIlIIlIIIIlIl() == null) {
            this.llllllIlIllllIlIlIlIIIIlI = 0L;
        }
        this.IIIIIIIIlIllIIllIIlllIllI = false;
    }

    private boolean lllIIIllIIIIlllIlIIllIIll(class_1291 class_12912, int n, int n2) {
        return this.lllIlIIlIIIlIlIIIllIlllIl(class_12912.IllIIlllllllIIlIIlIIIIlIl, class_12912.IIIllIllIIlIlIlIlIllllIIl, 16, 16, n, n2);
    }

    protected boolean lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3, int n4, int n5, int n6) {
        int n7 = this.IlIIlllllIIlIlIlllllIllll;
        int n8 = this.llIIlIlIlllIIllIlIlllIllI;
        return (n5 -= n7) >= n - 1 && n5 < n + n3 + 1 && (n6 -= n8) >= n2 - 1 && n6 < n2 + n4 + 1;
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_1291 class_12912, int n, int n2, int n3) {
        if (class_12912 != null) {
            n = class_12912.IIIllIIlIIIIIIlIlIIllIIlI;
        }
        this.lllllIlllIIllIlIIlIIIllII.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIlIIIIlllIlIlIIl.lIlllIlllIIIIlIIlllIllIII, n, n2, n3, this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(char c, int n) {
        if (n == 1 || n == this.lllllIlllIIllIlIIlIIIllII.gameSettings.IIllllIIlIlIlIlllIIIllIIl.IIIllIllIIlIlIlIlIllllIIl()) {
            this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.IlIIIlIIIIllIIIllIIIIIIll();
        }
        this.lllIIIllIIIIlllIlIIllIIll(n);
        if (this.lllIIIllIIIIlllIlIIllIIll != null && this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl()) {
            if (n == this.lllllIlllIIllIlIIlIIIllII.gameSettings.IIlllllIIlIIlIlIIlIIlIlII.IIIllIllIIlIlIlIlIllllIIl()) {
                this.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.lllIIIllIIIIlllIlIIllIIll.IIIllIIlIIIIIIlIlIIllIIlI, 0, 3);
            } else if (n == this.lllllIlllIIllIlIIlIIIllII.gameSettings.lIlIlllIllllIIlllIlllIIIl.IIIllIllIIlIlIlIlIllllIIl()) {
                this.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.lllIIIllIIIIlllIlIIllIIll.IIIllIIlIIIIIIlIlIIllIIlI, class_1522.llIllllIlIllIIIlIllIIlIlI() ? 1 : 0, 4);
            }
        }
    }

    protected boolean lllIIIllIIIIlllIlIIllIIll(int n) {
        if (this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.lllIIlIIIllllllIIIIlIlIlI.IllIIlllllllIIlIIlIIIIlIl() == null && this.lllIIIllIIIIlllIlIIllIIll != null) {
            for (int i = 0; i < 9; ++i) {
                if (n != this.lllllIlllIIllIlIIlIIIllII.gameSettings.llllIllIIIlIllIllllllIlIl[i].IIIllIllIIlIlIlIlIllllIIl()) continue;
                this.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.lllIIIllIIIIlllIlIIllIIll.IIIllIIlIIIIIIlIlIIllIIlI, i, 2);
                return true;
            }
        }
        return false;
    }

    @Override
    public void o_() {
        super.o_();
        if (this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII != null) {
            this.lIlllIlllIlIIIIlllIlIlIIl.lllIlIIlIIIlIlIIIllIlllIl(this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII);
        }
    }

    @Override
    public boolean lIlllIlllIIIIlIIlllIllIII() {
        return false;
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        super.IlIllllllIIlIIllllIIlIIIl();
        if (!this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.IlllIIlllllllIIllIlIllllI() || this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.IllllIIIIlIIlIIIIlllIIIIl) {
            this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.IlIIIlIIIIllIIIllIIIIIIll();
        }
    }
}

