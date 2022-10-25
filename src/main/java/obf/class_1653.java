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
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

public class class_1653
extends class_1522 {
    private static final Logger lllIIIllIIIIlllIlIIllIIll = LogManager.getLogger();
    private static final ResourceLocation lllIlIIlIIIlIlIIIllIlllIl = new ResourceLocation("textures/gui/container/beacon.png");
    private class_0396 IlIllllllIIlIIllllIIlIIIl;
    private class_2241 lIlllIlllIIIIlIIlllIllIII;
    private boolean IlIIIIIllllllIIlllIllllll;

    public class_1653(class_0503 class_05032, class_0396 class_03962) {
        super(new class_1410(class_05032, class_03962));
        this.IlIllllllIIlIIllllIIlIIIl = class_03962;
        this.IllIIIllIIIIlIlIlIllIIlll = 230;
        this.lIIIIlIlIIlllllIIllIIlIII = 219;
    }

    @Override
    public void n_() {
        super.n_();
        this.lIlllIlllIIIIlIIlllIllIII = new class_2241(this, -1, this.IlIIlllllIIlIlIlllllIllll + 164, this.llIIlIlIlllIIllIlIlllIllI + 107);
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(this.lIlllIlllIIIIlIIlllIllIII);
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1738(this, -2, this.IlIIlllllIIlIlIlllllIllll + 190, this.llIIlIlIlllIIllIlIlllIllI + 107));
        this.IlIIIIIllllllIIlllIllllll = true;
        this.lIlllIlllIIIIlIIlllIllIII.IllIIIllIIIIlIlIlIllIIlll = false;
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        super.IlIllllllIIlIIllllIIlIIIl();
        if (this.IlIIIIIllllllIIlllIllllll && this.IlIllllllIIlIIllllIIlIIIl.IlIlIIlIlIllIIlIlIIllIIIl() >= 0) {
            class_1820 class_18202;
            int n;
            int n2;
            int n3;
            int n4;
            int n5;
            this.IlIIIIIllllllIIlllIllllll = false;
            for (n5 = 0; n5 <= 2; ++n5) {
                n4 = class_0396.IllIIlllllllIIlIIlIIIIlIl[n5].length;
                n3 = n4 * 22 + (n4 - 1) * 2;
                for (n2 = 0; n2 < n4; ++n2) {
                    n = class_0396.IllIIlllllllIIlIIlIIIIlIl[n5][n2].IlIlIIlllIllllllllIIIlIlI;
                    class_18202 = new class_1820(this, n5 << 8 | n, this.IlIIlllllIIlIlIlllllIllll + 76 + n2 * 24 - n3 / 2, this.llIIlIlIlllIIllIlIlllIllI + 22 + n5 * 25, n, n5);
                    this.lIlIlIIlIIIIlIIIIIlllIIII.add(class_18202);
                    if (n5 >= this.IlIllllllIIlIIllllIIlIIIl.IlIlIIlIlIllIIlIlIIllIIIl()) {
                        class_18202.IllIIIllIIIIlIlIlIllIIlll = false;
                        continue;
                    }
                    if (n != this.IlIllllllIIlIIllllIIlIIIl.lllIIlIIIllllllIIIIlIlIlI()) continue;
                    class_18202.lllIlIIlIIIlIlIIIllIlllIl(true);
                }
            }
            n5 = 3;
            n4 = class_0396.IllIIlllllllIIlIIlIIIIlIl[n5].length + 1;
            n3 = n4 * 22 + (n4 - 1) * 2;
            for (n2 = 0; n2 < n4 - 1; ++n2) {
                n = class_0396.IllIIlllllllIIlIIlIIIIlIl[n5][n2].IlIlIIlllIllllllllIIIlIlI;
                class_18202 = new class_1820(this, n5 << 8 | n, this.IlIIlllllIIlIlIlllllIllll + 167 + n2 * 24 - n3 / 2, this.llIIlIlIlllIIllIlIlllIllI + 47, n, n5);
                this.lIlIlIIlIIIIlIIIIIlllIIII.add(class_18202);
                if (n5 >= this.IlIllllllIIlIIllllIIlIIIl.IlIlIIlIlIllIIlIlIIllIIIl()) {
                    class_18202.IllIIIllIIIIlIlIlIllIIlll = false;
                    continue;
                }
                if (n != this.IlIllllllIIlIIllllIIlIIIl.IlIlllIIIIIIlIIllIIllIlll()) continue;
                class_18202.lllIlIIlIIIlIlIIIllIlllIl(true);
            }
            if (this.IlIllllllIIlIIllllIIlIIIl.lllIIlIIIllllllIIIIlIlIlI() > 0) {
                class_1820 class_18203 = new class_1820(this, n5 << 8 | this.IlIllllllIIlIIllllIIlIIIl.lllIIlIIIllllllIIIIlIlIlI(), this.IlIIlllllIIlIlIlllllIllll + 167 + (n4 - 1) * 24 - n3 / 2, this.llIIlIlIlllIIllIlIlllIllI + 47, this.IlIllllllIIlIIllllIIlIIIl.lllIIlIIIllllllIIIIlIlIlI(), n5);
                this.lIlIlIIlIIIIlIIIIIlllIIII.add(class_18203);
                if (n5 >= this.IlIllllllIIlIIllllIIlIIIl.IlIlIIlIlIllIIlIlIIllIIIl()) {
                    class_18203.IllIIIllIIIIlIlIlIllIIlll = false;
                } else if (this.IlIllllllIIlIIllllIIlIIIl.lllIIlIIIllllllIIIIlIlIlI() == this.IlIllllllIIlIIllllIIlIIIl.IlIlllIIIIIIlIIllIIllIlll()) {
                    class_18203.lllIlIIlIIIlIlIIIllIlllIl(true);
                }
            }
        }
        this.lIlllIlllIIIIlIIlllIllIII.IllIIIllIIIIlIlIlIllIIlll = this.IlIllllllIIlIIllllIIlIIIl.llIIllIllIlIIlIIllIllllll(0) != null && this.IlIllllllIIlIIllllIIlIIIl.lllIIlIIIllllllIIIIlIlIlI() > 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1197 class_11972) {
        if (class_11972.IIIllIllIIlIlIlIlIllllIIl == -2) {
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll((class_0229)null);
        } else if (class_11972.IIIllIllIIlIlIlIlIllllIIl == -1) {
            String string = "MC|Beacon";
            ByteBuf byteBuf = Unpooled.buffer();
            try {
                byteBuf.writeInt(this.IlIllllllIIlIIllllIIlIIIl.lllIIlIIIllllllIIIIlIlIlI());
                byteBuf.writeInt(this.IlIllllllIIlIIllllIIlIIIl.IlIlllIIIIIIlIIllIIllIlll());
                this.lllllIlllIIllIlIIlIIIllII.llIIlIllIllllIlIIIIlIIlll().lllIIIllIIIIlllIlIIllIIll(new C17PacketCustomPayload(string, byteBuf));
            }
            catch (Exception exception) {
                lllIIIllIIIIlllIlIIllIIll.error("Couldn't send beacon info", (Throwable)exception);
            }
            finally {
                byteBuf.release();
            }
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll((class_0229)null);
        } else if (class_11972 instanceof class_1820) {
            if (((class_1820)class_11972).lllIIIllIIIIlllIlIIllIIll()) {
                return;
            }
            int n = class_11972.IIIllIllIIlIlIlIlIllllIIl;
            int n2 = n & 0xFF;
            int n3 = n >> 8;
            if (n3 < 3) {
                this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl(n2);
            } else {
                this.IlIllllllIIlIIllllIIlIIIl.IlIllllllIIlIIllllIIlIIIl(n2);
            }
            this.lIlIlIIlIIIIlIIIIIlllIIII.clear();
            this.n_();
            this.IlIllllllIIlIIllllIIlIIIl();
        }
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        class_0624.lllIIIllIIIIlllIlIIllIIll();
        this.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, class_0616.lllIIIllIIIIlllIlIIllIIll("tile.beacon.primary", new Object[0]), 62, 10, 0xE0E0E0);
        this.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, class_0616.lllIIIllIIIIlllIlIIllIIll("tile.beacon.secondary", new Object[0]), 169, 10, 0xE0E0E0);
        for (class_1197 class_11972 : this.lIlIlIIlIIIIlIIIIIlllIIII) {
            if (!class_11972.lIlllIlllIIIIlIIlllIllIII()) continue;
            class_11972.lllIlIIlIIIlIlIIIllIlllIl(n - this.IlIIlllllIIlIlIlllllIllll, n2 - this.llIIlIlIlllIIllIlIlllIllI);
            break;
        }
        class_0624.IlIllllllIIlIIllllIIlIIIl();
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(float f, int n, int n2) {
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        this.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(lllIlIIlIIIlIlIIIllIlllIl);
        int n3 = (this.IlIlIIlllIIlIllIIIlllllIl - this.IllIIIllIIIIlIlIlIllIIlll) / 2;
        int n4 = (this.lIIlIIIIIlIlllIlIIlIlIlll - this.lIIIIlIlIIlllllIIllIIlIII) / 2;
        class_1653.lllIIIllIIIIlllIlIIllIIll(n3, n4, 0, 0, this.IllIIIllIIIIlIlIlIllIIlll, this.lIIIIlIlIIlllllIIllIIlIII);
        class_1653.IlIlIIlIlIllIIlIlIIllIIIl.lIllllIIlIIIlIllllllIIIll = 100.0f;
        IlIlIIlIlIllIIlIlIIllIIIl.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIllIIlIIlIIlIIlIIlIIll, this.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII(), new ItemStack(Items.IIllllIIlIlIlIlllIIIllIIl), n3 + 42, n4 + 109);
        IlIlIIlIlIllIIlIlIIllIIIl.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIllIIlIIlIIlIIlIIlIIll, this.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII(), new ItemStack(Items.diamond), n3 + 42 + 22, n4 + 109);
        IlIlIIlIlIllIIlIlIIllIIIl.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIllIIlIIlIIlIIlIIlIIll, this.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII(), new ItemStack(Items.lIIIIlIlIIlllllIIllIIlIII), n3 + 42 + 44, n4 + 109);
        IlIlIIlIlIllIIlIlIIllIIIl.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIllIIlIIlIIlIIlIIlIIll, this.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII(), new ItemStack(Items.iron_ingot), n3 + 42 + 66, n4 + 109);
        class_1653.IlIlIIlIlIllIIlIlIIllIIIl.lIllllIIlIIIlIllllllIIIll = 0.0f;
    }

    static /* synthetic */ ResourceLocation lIllllIIlIIIlIllllllIIIll() {
        return lllIlIIlIIIlIlIIIllIlllIl;
    }

    static /* synthetic */ void lllIIIllIIIIlllIlIIllIIll(class_1653 class_16532, String string, int n, int n2) {
        class_16532.lllIlIIlIIIlIlIIIllIlllIl(string, n, n2);
    }

    static /* synthetic */ void lllIlIIlIIIlIlIIIllIlllIl(class_1653 class_16532, String string, int n, int n2) {
        class_16532.lllIlIIlIIIlIlIIIllIlllIl(string, n, n2);
    }

    static /* synthetic */ void IlIllllllIIlIIllllIIlIIIl(class_1653 class_16532, String string, int n, int n2) {
        class_16532.lllIlIIlIIIlIlIIIllIlllIl(string, n, n2);
    }
}

