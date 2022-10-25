package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.network.play.client.C17PacketCustomPayload;
import net.minecraft.util.ResourceLocation;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import net.minecraft.item.ItemStack;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

public class class_1669
extends class_1522 {
    private static final Logger lllIIIllIIIIlllIlIIllIIll = LogManager.getLogger();
    private static final ResourceLocation lllIlIIlIIIlIlIIIllIlllIl = new ResourceLocation("textures/gui/container/villager.png");
    private class_1510 IlIllllllIIlIIllllIIlIIIl;
    private class_0715 lIlllIlllIIIIlIIlllIllIII;
    private class_0715 IlIIIIIllllllIIlllIllllll;
    private int lIllllIIlIIIlIllllllIIIll;
    private String IIIllIIlIIIIIIlIlIIllIIlI;

    public class_1669(class_0503 class_05032, class_1510 class_15102, class_1334 class_13342, String string) {
        super(new class_0610(class_05032, class_15102, class_13342));
        this.IlIllllllIIlIIllllIIlIIIl = class_15102;
        this.IIIllIIlIIIIIIlIlIIllIIlI = string != null && string.length() >= 1 ? string : class_0616.lllIIIllIIIIlllIlIIllIIll("entity.Villager.name", new Object[0]);
    }

    @Override
    public void n_() {
        super.n_();
        int n = (this.IlIlIIlllIIlIllIIIlllllIl - this.IllIIIllIIIIlIlIlIllIIlll) / 2;
        int n2 = (this.lIIlIIIIIlIlllIlIIlIlIlll - this.lIIIIlIlIIlllllIIllIIlIII) / 2;
        this.lIlllIlllIIIIlIIlllIllIII = new class_0715(1, n + 120 + 27, n2 + 24 - 1, true);
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(this.lIlllIlllIIIIlIIlllIllIII);
        this.IlIIIIIllllllIIlllIllllll = new class_0715(2, n + 36 - 19, n2 + 24 - 1, false);
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(this.IlIIIIIllllllIIlllIllllll);
        this.lIlllIlllIIIIlIIlllIllIII.IllIIIllIIIIlIlIlIllIIlll = false;
        this.IlIIIIIllllllIIlllIllllll.IllIIIllIIIIlIlIlIllIIlll = false;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl(this.IIIllIIlIIIIIIlIlIIllIIlI, this.IllIIIllIIIIlIlIlIllIIlll / 2 - this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI) / 2, 6, 0x404040);
        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl(class_0616.lllIIIllIIIIlllIlIIllIIll("container.inventory", new Object[0]), 8, this.lIIIIlIlIIlllllIIllIIlIII - 96 + 2, 0x404040);
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        super.IlIllllllIIlIIllllIIlIIIl();
        class_1596 class_15962 = this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl(this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII);
        if (class_15962 != null) {
            this.lIlllIlllIIIIlIIlllIllIII.IllIIIllIIIIlIlIlIllIIlll = this.lIllllIIlIIIlIllllllIIIll < class_15962.size() - 1;
            this.IlIIIIIllllllIIlllIllllll.IllIIIllIIIIlIlIlIllIIlll = this.lIllllIIlIIIlIllllllIIIll > 0;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1197 class_11972) {
        boolean bl = false;
        if (class_11972 == this.lIlllIlllIIIIlIIlllIllIII) {
            ++this.lIllllIIlIIIlIllllllIIIll;
            bl = true;
        } else if (class_11972 == this.IlIIIIIllllllIIlllIllllll) {
            --this.lIllllIIlIIIlIllllllIIIll;
            bl = true;
        }
        if (bl) {
            ((class_0610)this.lIlllIlllIlIIIIlllIlIlIIl).IlIIIIIllllllIIlllIllllll(this.lIllllIIlIIIlIllllllIIIll);
            ByteBuf byteBuf = Unpooled.buffer();
            try {
                byteBuf.writeInt(this.lIllllIIlIIIlIllllllIIIll);
                this.lllllIlllIIllIlIIlIIIllII.llIIlIllIllllIlIIIIlIIlll().lllIIIllIIIIlllIlIIllIIll(new C17PacketCustomPayload("MC|TrSel", byteBuf));
            }
            catch (Exception exception) {
                lllIIIllIIIIlllIlIIllIIll.error("Couldn't send trade info", (Throwable)exception);
            }
            finally {
                byteBuf.release();
            }
        }
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(float f, int n, int n2) {
        int n3;
        class_2187 class_21872;
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        this.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(lllIlIIlIIIlIlIIIllIlllIl);
        int n4 = (this.IlIlIIlllIIlIllIIIlllllIl - this.IllIIIllIIIIlIlIlIllIIlll) / 2;
        int n5 = (this.lIIlIIIIIlIlllIlIIlIlIlll - this.lIIIIlIlIIlllllIIllIIlIII) / 2;
        class_1669.lllIIIllIIIIlllIlIIllIIll(n4, n5, 0, 0, this.IllIIIllIIIIlIlIlIllIIlll, this.lIIIIlIlIIlllllIIllIIlIII);
        class_1596 class_15962 = this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl(this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII);
        if (class_15962 != null && !class_15962.isEmpty() && (class_21872 = (class_2187)class_15962.get(n3 = this.lIllllIIlIIIlIllllllIIIll)).lIllllIIlIIIlIllllllIIIll()) {
            this.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(lllIlIIlIIIlIlIIIllIlllIl);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glDisable((int)2896);
            class_1669.lllIIIllIIIIlllIlIIllIIll(this.IlIIlllllIIlIlIlllllIllll + 83, this.llIIlIlIlllIIllIlIlllIllI + 21, 212, 0, 28, 21);
            class_1669.lllIIIllIIIIlllIlIIllIIll(this.IlIIlllllIIlIlIlllllIllll + 83, this.llIIlIlIlllIIllIlIlllIllI + 51, 212, 0, 28, 21);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
        class_1596 class_15962 = this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl(this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII);
        if (class_15962 != null && !class_15962.isEmpty()) {
            int n3 = (this.IlIlIIlllIIlIllIIIlllllIl - this.IllIIIllIIIIlIlIlIllIIlll) / 2;
            int n4 = (this.lIIlIIIIIlIlllIlIIlIlIlll - this.lIIIIlIlIIlllllIIllIIlIII) / 2;
            int n5 = this.lIllllIIlIIIlIllllllIIIll;
            class_2187 class_21872 = (class_2187)class_15962.get(n5);
            GL11.glPushMatrix();
            ItemStack class_08972 = class_21872.lllIIIllIIIIlllIlIIllIIll();
            ItemStack class_08973 = class_21872.lllIlIIlIIIlIlIIIllIlllIl();
            ItemStack class_08974 = class_21872.lIlllIlllIIIIlIIlllIllIII();
            class_0624.IlIllllllIIlIIllllIIlIIIl();
            GL11.glDisable((int)2896);
            GL11.glEnable((int)32826);
            GL11.glEnable((int)2903);
            GL11.glEnable((int)2896);
            class_1669.IlIlIIlIlIllIIlIlIIllIIIl.lIllllIIlIIIlIllllllIIIll = 100.0f;
            IlIlIIlIlIllIIlIlIIllIIIl.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIllIIlIIlIIlIIlIIlIIll, this.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII(), class_08972, n3 + 36, n4 + 24);
            IlIlIIlIlIllIIlIlIIllIIIl.IlIllllllIIlIIllllIIlIIIl(this.lIlIllIIlIIlIIlIIlIIlIIll, this.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII(), class_08972, n3 + 36, n4 + 24);
            if (class_08973 != null) {
                IlIlIIlIlIllIIlIlIIllIIIl.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIllIIlIIlIIlIIlIIlIIll, this.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII(), class_08973, n3 + 62, n4 + 24);
                IlIlIIlIlIllIIlIlIIllIIIl.IlIllllllIIlIIllllIIlIIIl(this.lIlIllIIlIIlIIlIIlIIlIIll, this.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII(), class_08973, n3 + 62, n4 + 24);
            }
            IlIlIIlIlIllIIlIlIIllIIIl.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIllIIlIIlIIlIIlIIlIIll, this.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII(), class_08974, n3 + 120, n4 + 24);
            IlIlIIlIlIllIIlIlIIllIIIl.IlIllllllIIlIIllllIIlIIIl(this.lIlIllIIlIIlIIlIIlIIlIIll, this.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII(), class_08974, n3 + 120, n4 + 24);
            class_1669.IlIlIIlIlIllIIlIlIIllIIIl.lIllllIIlIIIlIllllllIIIll = 0.0f;
            GL11.glDisable((int)2896);
            if (this.lllIlIIlIIIlIlIIIllIlllIl(36, 24, 16, 16, n, n2)) {
                this.lllIIIllIIIIlllIlIIllIIll(class_08972, n, n2);
            } else if (class_08973 != null && this.lllIlIIlIIIlIlIIIllIlllIl(62, 24, 16, 16, n, n2)) {
                this.lllIIIllIIIIlllIlIIllIIll(class_08973, n, n2);
            } else if (this.lllIlIIlIIIlIlIIIllIlllIl(120, 24, 16, 16, n, n2)) {
                this.lllIIIllIIIIlllIlIIllIIll(class_08974, n, n2);
            }
            GL11.glPopMatrix();
            GL11.glEnable((int)2896);
            GL11.glEnable((int)2929);
            class_0624.lllIlIIlIIIlIlIIIllIlllIl();
        }
    }

    public class_1510 lIllllIIlIIIlIllllllIIIll() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    static /* synthetic */ ResourceLocation IIIllIIlIIIIIIlIlIIllIIlI() {
        return lllIlIIlIIIlIlIIIllIlllIl;
    }
}

