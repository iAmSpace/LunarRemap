package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.commons.io.Charsets
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.opengl.GL11
 */
import java.util.List;

import net.minecraft.network.play.client.C17PacketCustomPayload;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import org.apache.commons.io.Charsets;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class class_0466
extends class_1522
implements class_1283 {
    private static final ResourceLocation lllIIIllIIIIlllIlIIllIIll = new ResourceLocation("textures/gui/container/anvil.png");
    private class_0631 lllIlIIlIIIlIlIIIllIlllIl;
    private class_0598 IlIllllllIIlIIllllIIlIIIl;
    private class_0503 lIlllIlllIIIIlIIlllIllIII;

    public class_0466(class_0503 class_05032, class_1334 class_13342, int n, int n2, int n3) {
        super(new class_0631(class_05032, class_13342, n, n2, n3, Minecraft.getMinecraft().lIIIIlIlIIlllllIIllIIlIII));
        this.lIlllIlllIIIIlIIlllIllIII = class_05032;
        this.lllIlIIlIIIlIlIIIllIlllIl = (class_0631)this.lIlllIlllIlIIIIlllIlIlIIl;
    }

    @Override
    public void n_() {
        super.n_();
        Keyboard.enableRepeatEvents((boolean)true);
        int n = (this.IlIlIIlllIIlIllIIIlllllIl - this.IllIIIllIIIIlIlIlIllIIlll) / 2;
        int n2 = (this.lIIlIIIIIlIlllIlIIlIlIlll - this.lIIIIlIlIIlllllIIllIIlIII) / 2;
        this.IlIllllllIIlIIllllIIlIIIl = new class_0598(this.lIlIllIIlIIlIIlIIlIIlIIll, n + 62, n2 + 24, 103, 12);
        this.IlIllllllIIlIIllllIIlIIIl.IIIllIIlIIIIIIlIlIIllIIlI(-1);
        this.IlIllllllIIlIIllllIIlIIIl.IllIIlllllllIIlIIlIIIIlIl(-1);
        this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(false);
        this.IlIllllllIIlIIllllIIlIIIl.lIllllIIlIIIlIllllllIIIll(40);
        this.lIlllIlllIlIIIIlllIlIlIIl.lllIlIIlIIIlIlIIIllIlllIl(this);
        this.lIlllIlllIlIIIIlllIlIlIIl.lllIIIllIIIIlllIlIIllIIll(this);
    }

    @Override
    public void o_() {
        super.o_();
        Keyboard.enableRepeatEvents((boolean)false);
        this.lIlllIlllIlIIIIlllIlIlIIl.lllIlIIlIIIlIlIIIllIlllIl(this);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        GL11.glDisable((int)2896);
        GL11.glDisable((int)3042);
        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl(class_0616.lllIIIllIIIIlllIlIIllIIll("container.repair", new Object[0]), 60, 6, 0x404040);
        if (this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll > 0) {
            int n3 = 8453920;
            boolean bl = true;
            String string = class_0616.lllIIIllIIIIlllIlIIllIIll("container.repair.cost", this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll);
            if (this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll >= 40 && !this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII) {
                string = class_0616.lllIIIllIIIIlllIlIIllIIll("container.repair.expensive", new Object[0]);
                n3 = 0xFF6060;
            } else if (!this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(2).lllIlIIlIIIlIlIIIllIlllIl()) {
                bl = false;
            } else if (!this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(2).lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII.lIlllIlllIIIIlIIlllIllIII)) {
                n3 = 0xFF6060;
            }
            if (bl) {
                int n4 = 0xFF000000 | (n3 & 0xFCFCFC) >> 2 | n3 & 0xFF000000;
                int n5 = this.IllIIIllIIIIlIlIlIllIIlll - 8 - this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(string);
                int n6 = 67;
                if (this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll()) {
                    class_0466.lllIIIllIIIIlllIlIIllIIll(n5 - 3, n6 - 2, this.IllIIIllIIIIlIlIlIllIIlll - 7, n6 + 10, -16777216);
                    class_0466.lllIIIllIIIIlllIlIIllIIll(n5 - 2, n6 - 1, this.IllIIIllIIIIlIlIlIllIIlll - 8, n6 + 9, -12895429);
                } else {
                    this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl(string, n5, n6 + 1, n4);
                    this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl(string, n5 + 1, n6, n4);
                    this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl(string, n5 + 1, n6 + 1, n4);
                }
                this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl(string, n5, n6, n3);
            }
        }
        GL11.glEnable((int)2896);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(char c, int n) {
        if (this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(c, n)) {
            this.lIllllIIlIIIlIllllllIIIll();
        } else {
            super.lllIIIllIIIIlllIlIIllIIll(c, n);
        }
    }

    private void lIllllIIlIIIlIllllllIIIll() {
        String string = this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl();
        class_1291 class_12912 = this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(0);
        if (class_12912 != null && class_12912.lllIlIIlIIIlIlIIIllIlllIl() && !class_12912.lllIIIllIIIIlllIlIIllIIll().IlIIIlIIIIllIIIllIIIIIIll() && string.equals(class_12912.lllIIIllIIIIlllIlIIllIIll().lIIlIIIIIlIlllIlIIlIlIlll())) {
            string = "";
        }
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(string);
        this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new C17PacketCustomPayload("MC|ItemName", string.getBytes(Charsets.UTF_8)));
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
        this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
        GL11.glDisable((int)2896);
        GL11.glDisable((int)3042);
        this.IlIllllllIIlIIllllIIlIIIl.lIllllIIlIIIlIllllllIIIll();
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(float f, int n, int n2) {
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        this.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(lllIIIllIIIIlllIlIIllIIll);
        int n3 = (this.IlIlIIlllIIlIllIIIlllllIl - this.IllIIIllIIIIlIlIlIllIIlll) / 2;
        int n4 = (this.lIIlIIIIIlIlllIlIIlIlIlll - this.lIIIIlIlIIlllllIIllIIlIII) / 2;
        class_0466.lllIIIllIIIIlllIlIIllIIll(n3, n4, 0, 0, this.IllIIIllIIIIlIlIlIllIIlll, this.lIIIIlIlIIlllllIIllIIlIII);
        class_0466.lllIIIllIIIIlllIlIIllIIll(n3 + 59, n4 + 20, 0, this.lIIIIlIlIIlllllIIllIIlIII + (this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(0).lllIlIIlIIIlIlIIIllIlllIl() ? 0 : 16), 110, 16);
        if ((this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(0).lllIlIIlIIIlIlIIIllIlllIl() || this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(1).lllIlIIlIIIlIlIIIllIlllIl()) && !this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(2).lllIlIIlIIIlIlIIIllIlllIl()) {
            class_0466.lllIIIllIIIIlllIlIIllIIll(n3 + 99, n4 + 45, this.IllIIIllIIIIlIlIlIllIIlll, 0, 28, 21);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1071 class_10712, List list) {
        this.lllIIIllIIIIlllIlIIllIIll(class_10712, 0, class_10712.lllIIIllIIIIlllIlIIllIIll(0).lllIIIllIIIIlllIlIIllIIll());
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1071 class_10712, int n, ItemStack class_08972) {
        if (n == 0) {
            this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(class_08972 == null ? "" : class_08972.lIIlIIIIIlIlllIlIIlIlIlll());
            this.IlIllllllIIlIIllllIIlIIIl.IlIllllllIIlIIllllIIlIIIl(class_08972 != null);
            if (class_08972 != null) {
                this.lIllllIIlIIIlIllllllIIIll();
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1071 class_10712, int n, int n2) {
    }
}

