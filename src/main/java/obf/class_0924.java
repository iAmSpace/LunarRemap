package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.ByteBufInputStream
 *  io.netty.buffer.Unpooled
 *  io.netty.handler.codec.base64.Base64
 *  org.apache.commons.lang3.Validate
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.opengl.GL11
 */
import com.google.common.base.Charsets;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import net.minecraft.util.ResourceLocation;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufInputStream;
import io.netty.buffer.Unpooled;
import io.netty.handler.codec.base64.Base64;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import javax.imageio.ImageIO;

import net.minecraft.client.Minecraft;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

public class class_0924
implements class_0677 {
    static final ResourceLocation lllIIIllIIIIlllIlIIllIIll = new ResourceLocation("textures/gui/resource_packs.png");
    private static final Logger lllIlIIlIIIlIlIIIllIlllIl = LogManager.getLogger();
    private static final ThreadPoolExecutor IlIllllllIIlIIllllIIlIIIl = new ScheduledThreadPoolExecutor(5, new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).build());
    private final class_1381 lIlllIlllIIIIlIIlllIllIII;
    private final Minecraft IlIIIIIllllllIIlllIllllll;
    private final class_1092 lIllllIIlIIIlIllllllIIIll;
    private long IIIllIIlIIIIIIlIlIIllIIlI;
    private String IllIIlllllllIIlIIlIIIIlIl;
    private class_2202 IIIllIllIIlIlIlIlIllllIIl;
    private ResourceLocation IllIIIllIIIIlIlIlIllIIlll;
    private class_1727 lIIIIlIlIIlllllIIllIIlIII;

    protected class_0924(class_1381 class_13812, class_1092 class_10922) {
        this.lIlllIlllIIIIlIIlllIllIII = class_13812;
        this.lIllllIIlIIIlIllllllIIIll = class_10922;
        this.IlIIIIIllllllIIlllIllllll = Minecraft.getMinecraft();
        this.IllIIIllIIIIlIlIlIllIIlll = new ResourceLocation("servers/" + class_10922.lllIlIIlIIIlIlIIIllIlllIl + "/icon");
        this.IIIllIllIIlIlIlIlIllllIIl = (class_2202)this.IlIIIIIllllllIIlllIllllll.llIIlIIllIIllIlIIllIIllII().lllIlIIlIIIlIlIIIllIlllIl(this.IllIIIllIIIIlIlIlIllIIlll);
        if (class_10922.lllIlIIlIIIlIlIIIllIlllIl.endsWith("lunar.gg")) {
            this.lIIIIlIlIIlllllIIllIIlIII = new class_1727();
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4, int n5, class_0868 class_08682, int n6, int n7, boolean bl) {
        String string;
        int n8;
        if (!this.lIllllIIlIIIlIllllllIIIll.IllIIIllIIIIlIlIlIllIIlll) {
            this.lIllllIIlIIIlIllllllIIIll.IllIIIllIIIIlIlIlIllIIlll = true;
            this.lIllllIIlIIIlIllllllIIIll.IIIllIIlIIIIIIlIlIIllIIlI = -2L;
            this.lIllllIIlIIIlIllllllIIIll.lIllllIIlIIIlIllllllIIIll = "";
            this.lIllllIIlIIIlIllllllIIIll.IlIllllllIIlIIllllIIlIIIl = "";
            IlIllllllIIlIIllllIIlIIIl.submit(new class_0052(this));
        }
        GL11.glColor4f((float)0.85f, (float)0.85f, (float)0.85f, (float)1.0f);
        if (this.lIllllIIlIIIlIllllllIIIll.lllIIlIIIllllllIIIIlIlIlI) {
            float f = 16.0f;
            float f2 = 8.0f;
            float f3 = 0.0f;
            float f4 = 0.0f;
            float f5 = n2 - 20;
            float f6 = n3 + 14;
            GL11.glEnable((int)3042);
            Minecraft.getMinecraft().IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("client/icons/lc.png"));
            GL11.glBegin((int)7);
            GL11.glTexCoord2d((double)(f3 / 5.0f), (double)(f4 / 5.0f));
            GL11.glVertex2d((double)f5, (double)f6);
            GL11.glTexCoord2d((double)(f3 / 5.0f), (double)((f4 + 5.0f) / 5.0f));
            GL11.glVertex2d((double)f5, (double)(f6 + f2));
            GL11.glTexCoord2d((double)((f3 + 5.0f) / 5.0f), (double)((f4 + 5.0f) / 5.0f));
            GL11.glVertex2d((double)(f5 + f), (double)(f6 + f2));
            GL11.glTexCoord2d((double)((f3 + 5.0f) / 5.0f), (double)(f4 / 5.0f));
            GL11.glVertex2d((double)(f5 + f), (double)f6);
            GL11.glEnd();
            GL11.glDisable((int)3042);
        }
        boolean bl2 = this.lIllllIIlIIIlIllllllIIIll.IllIIlllllllIIlIIlIIIIlIl > 5;
        boolean bl3 = this.lIllllIIlIIIlIllllllIIIll.IllIIlllllllIIlIIlIIIIlIl < 5;
        boolean bl4 = (bl2 || bl3) && this.lIllllIIlIIIlIllllllIIIll.IllIIlllllllIIlIIlIIIIlIl != -1332;
        this.IlIIIIIllllllIIlllIllllll.IlIlllIIIIIIlIIllIIllIlll.lllIlIIlIIIlIlIIIllIlllIl(this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll, n2 + 32 + 3, n3 + 1, 0xFFFFFF);
        List list = this.IlIIIIIllllllIIlllIllllll.IlIlllIIIIIIlIIllIIllIlll.IlIllllllIIlIIllllIIlIIIl(this.lIllllIIlIIIlIllllllIIIll.lIllllIIlIIIlIllllllIIIll, n4 - 32 - 2);
        for (int i = 0; i < Math.min(list.size(), 2); ++i) {
            this.IlIIIIIllllllIIlllIllllll.IlIlllIIIIIIlIIllIIllIlll.lllIlIIlIIIlIlIIIllIlllIl((String)list.get(i), n2 + 32 + 3, n3 + 12 + this.IlIIIIIllllllIIlllIllllll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll * i, 0x808080);
        }
        String string2 = bl4 ? (Object)((Object) EnumChatFormatting.DARK_RED) + this.lIllllIIlIIIlIllllllIIIll.IIIllIllIIlIlIlIlIllllIIl : this.lIllllIIlIIIlIllllllIIIll.IlIllllllIIlIIllllIIlIIIl;
        int n9 = this.IlIIIIIllllllIIlllIllllll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string2);
        this.IlIIIIIllllllIIlllIllllll.IlIlllIIIIIIlIIllIIllIlll.lllIlIIlIIIlIlIIIllIlllIl(string2, n2 + n4 - n9 - 15 - 2, n3 + 1, 0x808080);
        int n10 = 0;
        String string3 = null;
        if (bl4) {
            n8 = 5;
            string = bl2 ? "Client out of date!" : "Server out of date!";
            string3 = this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII;
        } else if (this.lIllllIIlIIIlIllllllIIIll.IllIIIllIIIIlIlIlIllIIlll && this.lIllllIIlIIIlIllllllIIIll.IIIllIIlIIIIIIlIlIIllIIlI != -2L) {
            n8 = this.lIllllIIlIIIlIllllllIIIll.IIIllIIlIIIIIIlIlIIllIIlI < 0L ? 5 : (this.lIllllIIlIIIlIllllllIIIll.IIIllIIlIIIIIIlIlIIllIIlI < 150L ? 0 : (this.lIllllIIlIIIlIllllllIIIll.IIIllIIlIIIIIIlIlIIllIIlI < 300L ? 1 : (this.lIllllIIlIIIlIllllllIIIll.IIIllIIlIIIIIIlIlIIllIIlI < 600L ? 2 : (this.lIllllIIlIIIlIllllllIIIll.IIIllIIlIIIIIIlIlIIllIIlI < 1000L ? 3 : 4))));
            if (this.lIllllIIlIIIlIllllllIIIll.IIIllIIlIIIIIIlIlIIllIIlI < 0L) {
                string = "(no connection)";
            } else {
                string = this.lIllllIIlIIIlIllllllIIIll.IIIllIIlIIIIIIlIlIIllIIlI + "ms";
                string3 = this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII;
            }
        } else {
            n10 = 1;
            n8 = (int)(Minecraft.getSystemTime() / 100L + (long)(n * 2) & 7L);
            if (n8 > 4) {
                n8 = 8 - n8;
            }
            string = "Pinging...";
        }
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        this.IlIIIIIllllllIIlllIllllll.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(class_0210.lllIIlIIIllllllIIIIlIlIlI);
        class_0210.lllIIIllIIIIlllIlIIllIIll(n2 + n4 - 15, n3, n10 * 10, 176 + n8 * 8, 10, 8, 256.0f, 256.0f);
        if (this.lIIIIlIlIIlllllIIllIIlIII != null) {
            this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll((float)n2, (float)n3, 32.0f, 29.5f);
            this.lIIIIlIlIIlllllIIllIIlIII.lllIlIIlIIIlIlIIIllIlllIl(0.0f, 0.0f, true);
        } else {
            if (this.lIllllIIlIIIlIllllllIIIll.IlIllllllIIlIIllllIIlIIIl() != null && !this.lIllllIIlIIIlIllllllIIIll.IlIllllllIIlIIllllIIlIIIl().equals(this.IllIIlllllllIIlIIlIIIIlIl)) {
                this.IllIIlllllllIIlIIlIIIIlIl = this.lIllllIIlIIIlIllllllIIIll.IlIllllllIIlIIllllIIlIIIl();
                this.lllIlIIlIIIlIlIIIllIlllIl();
                this.lIlllIlllIIIIlIIlllIllIII.IIIllIllIIlIlIlIlIllllIIl().lllIlIIlIIIlIlIIIllIlllIl();
            }
            if (this.IIIllIllIIlIlIlIlIllllIIl != null) {
                this.IlIIIIIllllllIIlllIllllll.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(this.IllIIIllIIIIlIlIlIllIIlll);
                class_0210.lllIIIllIIIIlllIlIIllIIll(n2, n3, 0.0f, 0.0f, 32, 32, 32.0f, 32.0f);
            }
        }
        int n11 = n6 - n2;
        int n12 = n7 - n3;
        if (n11 >= n4 - 15 && n11 <= n4 - 5 && n12 >= 0 && n12 <= 8) {
            this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(string);
        } else if (n11 >= n4 - n9 - 15 - 2 && n11 <= n4 - 15 - 2 && n12 >= 0 && n12 <= 8) {
            this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(string3);
        }
        Minecraft class_06672 = Minecraft.getMinecraft();
        if (class_06672.gameSettings.IllIlIlIIIlIllIlIlIIlllII || bl) {
            class_06672.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(lllIIIllIIIIlllIlIIllIIll);
            class_0210.lllIIIllIIIIlllIlIIllIIll(n2, n3, n2 + 32, n3 + 32, -1601138544);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            int n13 = n6 - n2;
            int n14 = n7 - n3;
            boolean bl5 = this.lIlllIlllIIIIlIIlllIllIII.IlIIIIIllllllIIlllIllllll(this);
            boolean bl6 = this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(this);
            boolean bl7 = bl5 || bl6;
            if (n13 < (bl7 ? 16 : 32)) {
                class_0210.lllIIIllIIIIlllIlIIllIIll(n2 - (bl7 ? 6 : 0), n3, 0.0f, 32.0f, 32, 32, 256.0f, 256.0f);
            } else {
                class_0210.lllIIIllIIIIlllIlIIllIIll(n2 - (bl7 ? 6 : 0), n3, 0.0f, 0.0f, 32, 32, 256.0f, 256.0f);
            }
            if (bl5) {
                if (n13 < 32 && n13 > 16 && n14 < 16) {
                    class_0210.lllIIIllIIIIlllIlIIllIIll(n2, n3, 96.0f, 32.0f, 32, 32, 256.0f, 256.0f);
                } else {
                    class_0210.lllIIIllIIIIlllIlIIllIIll(n2, n3, 96.0f, 0.0f, 32, 32, 256.0f, 256.0f);
                }
            }
            if (bl6) {
                if (n13 < 32 && n13 > 16 && n14 > 16) {
                    class_0210.lllIIIllIIIIlllIlIIllIIll(n2, n3, 64.0f, 32.0f, 32, 32, 256.0f, 256.0f);
                } else {
                    class_0210.lllIIIllIIIIlllIlIIllIIll(n2, n3, 64.0f, 0.0f, 32, 32, 256.0f, 256.0f);
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void lllIlIIlIIIlIlIIIllIlllIl() {
        if (this.lIllllIIlIIIlIllllllIIIll.IlIllllllIIlIIllllIIlIIIl() == null) {
            this.IlIIIIIllllllIIlllIllllll.llIIlIIllIIllIlIIllIIllII().IlIllllllIIlIIllllIIlIIIl(this.IllIIIllIIIIlIlIlIllIIlll);
            this.IIIllIllIIlIlIlIlIllllIIl = null;
        } else {
            BufferedImage bufferedImage;
            block8: {
                ByteBuf byteBuf = Unpooled.copiedBuffer((CharSequence)this.lIllllIIlIIIlIllllllIIIll.IlIllllllIIlIIllllIIlIIIl(), (Charset)Charsets.UTF_8);
                ByteBuf byteBuf2 = Base64.decode((ByteBuf)byteBuf);
                try {
                    bufferedImage = ImageIO.read((InputStream)new ByteBufInputStream(byteBuf2));
                    Validate.validState((bufferedImage.getWidth() == 64 ? 1 : 0) != 0, (String)"Must be 64 pixels wide", (Object[])new Object[0]);
                    Validate.validState((bufferedImage.getHeight() == 64 ? 1 : 0) != 0, (String)"Must be 64 pixels high", (Object[])new Object[0]);
                    break block8;
                }
                catch (Exception exception) {
                    lllIlIIlIIIlIlIIIllIlllIl.error("Invalid icon for server " + this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll + " (" + this.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl + ")", (Throwable)exception);
                    this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll((String)null);
                }
                finally {
                    byteBuf.release();
                    byteBuf2.release();
                }
                return;
            }
            if (this.IIIllIllIIlIlIlIlIllllIIl == null) {
                this.IIIllIllIIlIlIlIlIllllIIl = new class_2202(bufferedImage.getWidth(), bufferedImage.getHeight());
                this.IlIIIIIllllllIIlllIllllll.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(this.IllIIIllIIIIlIlIlIllIIlll, (class_0211)this.IIIllIllIIlIlIlIlIllllIIl);
            }
            bufferedImage.getRGB(0, 0, bufferedImage.getWidth(), bufferedImage.getHeight(), this.IIIllIllIIlIlIlIlIllllIIl.lIlllIlllIIIIlIIlllIllIII(), 0, bufferedImage.getWidth());
            this.IIIllIllIIlIlIlIlIllllIIl.lllIlIIlIIIlIlIIIllIlllIl();
        }
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4, int n5, int n6) {
        boolean bl;
        this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(n);
        if (Minecraft.getSystemTime() - this.IIIllIIlIIIIIIlIlIIllIIlI < 250L) {
            this.lIlllIlllIIIIlIIlllIllIII.IIIllIIlIIIIIIlIlIIllIIlI();
        }
        this.IIIllIIlIIIIIIlIlIIllIIlI = Minecraft.getSystemTime();
        Minecraft class_06672 = Minecraft.getMinecraft();
        boolean bl2 = this.lIlllIlllIIIIlIIlllIllIII.IlIIIIIllllllIIlllIllllll(this);
        boolean bl3 = this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(this);
        boolean bl4 = bl = bl2 || bl3;
        if (n5 <= 32) {
            if (n5 < (bl ? 16 : 32)) {
                this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(this);
                return true;
            }
            if (n5 > 16 && n6 < 16 && bl2) {
                this.lIlllIlllIIIIlIIlllIllIII.IlIllllllIIlIIllllIIlIIIl(this);
                return true;
            }
            if (n5 > 16 && n6 > 16 && bl3) {
                this.lIlllIlllIIIIlIIlllIllIII.lIlllIlllIIIIlIIlllIllIII(this);
                return true;
            }
        }
        return false;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3, int n4, int n5, int n6) {
    }

    public class_1092 lllIIIllIIIIlllIlIIllIIll() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    static /* synthetic */ class_1092 lllIIIllIIIIlllIlIIllIIll(class_0924 class_09242) {
        return class_09242.lIllllIIlIIIlIllllllIIIll;
    }

    static /* synthetic */ class_1381 lllIlIIlIIIlIlIIIllIlllIl(class_0924 class_09242) {
        return class_09242.lIlllIlllIIIIlIIlllIllIII;
    }
}

