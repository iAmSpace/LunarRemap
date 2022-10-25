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

public class class_1303
implements class_0677 {
    private static final Logger lllIIIllIIIIlllIlIIllIIll = LogManager.getLogger();
    private static final ThreadPoolExecutor lllIlIIlIIIlIlIIIllIlllIl = new ScheduledThreadPoolExecutor(5, new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).build());
    private final class_1381 IlIllllllIIlIIllllIIlIIIl;
    private final Minecraft lIlllIlllIIIIlIIlllIllIII;
    private final class_1092 IlIIIIIllllllIIlllIllllll;
    private long lIllllIIlIIIlIllllllIIIll;
    private String IIIllIIlIIIIIIlIlIIllIIlI;
    private class_2202 IllIIlllllllIIlIIlIIIIlIl;
    private ResourceLocation IIIllIllIIlIlIlIlIllllIIl;
    private class_1727 IllIIIllIIIIlIlIlIllIIlll;
    private ResourceLocation lIIIIlIlIIlllllIIllIIlIII = new ResourceLocation("client/icons/star-64.png");

    protected class_1303(class_1381 class_13812, class_1092 class_10922) {
        this.IlIllllllIIlIIllllIIlIIIl = class_13812;
        this.IlIIIIIllllllIIlllIllllll = class_10922;
        this.lIlllIlllIIIIlIIlllIllIII = Minecraft.getMinecraft();
        this.IIIllIllIIlIlIlIlIllllIIl = new ResourceLocation("servers/" + class_10922.lllIlIIlIIIlIlIIIllIlllIl + "/icon");
        this.IllIIlllllllIIlIIlIIIIlIl = (class_2202)this.lIlllIlllIIIIlIIlllIllIII.llIIlIIllIIllIlIIllIIllII().lllIlIIlIIIlIlIIIllIlllIl(this.IIIllIllIIlIlIlIlIllllIIl);
        if (class_10922.lllIlIIlIIIlIlIIIllIlllIl.equalsIgnoreCase("lunar.gg")) {
            this.IllIIIllIIIIlIlIlIllIIlll = new class_1727();
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4, int n5, class_0868 class_08682, int n6, int n7, boolean bl) {
        String string;
        int n8;
        if (!this.IlIIIIIllllllIIlllIllllll.IllIIIllIIIIlIlIlIllIIlll) {
            this.IlIIIIIllllllIIlllIllllll.IllIIIllIIIIlIlIlIllIIlll = true;
            this.IlIIIIIllllllIIlllIllllll.IIIllIIlIIIIIIlIlIIllIIlI = -2L;
            this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll = "";
            this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl = "";
            lllIlIIlIIIlIlIIIllIlllIl.submit(new class_1374(this));
        }
        GL11.glColor4f((float)1.0f, (float)0.9f, (float)0.0f, (float)1.0f);
        class_0857.lllIIIllIIIIlllIlIIllIIll(this.lIIIIlIlIIlllllIIllIIlIII, 4.0f, (float)(n2 - 17), (float)(n3 + 10));
        GL11.glColor4f((float)0.85f, (float)0.85f, (float)0.85f, (float)1.0f);
        boolean bl2 = this.IlIIIIIllllllIIlllIllllll.IllIIlllllllIIlIIlIIIIlIl > 5;
        boolean bl3 = this.IlIIIIIllllllIIlllIllllll.IllIIlllllllIIlIIlIIIIlIl < 5;
        boolean bl4 = (bl2 || bl3) && this.IlIIIIIllllllIIlllIllllll.IllIIlllllllIIlIIlIIIIlIl != -1332;
        this.lIlllIlllIIIIlIIlllIllIII.IlIlllIIIIIIlIIllIIllIlll.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll, n2 + 32 + 3, n3 + 1, 0xFFFFFF);
        List list = this.lIlllIlllIIIIlIIlllIllIII.IlIlllIIIIIIlIIllIIllIlll.IlIllllllIIlIIllllIIlIIIl(this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll, n4 - 32 - 2);
        for (int i = 0; i < Math.min(list.size(), 2); ++i) {
            this.lIlllIlllIIIIlIIlllIllIII.IlIlllIIIIIIlIIllIIllIlll.lllIlIIlIIIlIlIIIllIlllIl((String)list.get(i), n2 + 32 + 3, n3 + 12 + this.lIlllIlllIIIIlIIlllIllIII.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll * i, 0x808080);
        }
        String string2 = bl4 ? (Object)((Object)class_1227.IlIIIIIllllllIIlllIllllll) + this.IlIIIIIllllllIIlllIllllll.IIIllIllIIlIlIlIlIllllIIl : this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl;
        int n9 = this.lIlllIlllIIIIlIIlllIllIII.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string2);
        this.lIlllIlllIIIIlIIlllIllIII.IlIlllIIIIIIlIIllIIllIlll.lllIlIIlIIIlIlIIIllIlllIl(string2, n2 + n4 - n9 - 15 - 2, n3 + 1, 0x808080);
        int n10 = 0;
        String string3 = null;
        if (bl4) {
            n8 = 5;
            string = bl2 ? "Client out of date!" : "Server out of date!";
            string3 = this.IlIIIIIllllllIIlllIllllll.lIIIIlIlIIlllllIIllIIlIII;
        } else if (this.IlIIIIIllllllIIlllIllllll.IllIIIllIIIIlIlIlIllIIlll && this.IlIIIIIllllllIIlllIllllll.IIIllIIlIIIIIIlIlIIllIIlI != -2L) {
            n8 = this.IlIIIIIllllllIIlllIllllll.IIIllIIlIIIIIIlIlIIllIIlI < 0L ? 5 : (this.IlIIIIIllllllIIlllIllllll.IIIllIIlIIIIIIlIlIIllIIlI < 150L ? 0 : (this.IlIIIIIllllllIIlllIllllll.IIIllIIlIIIIIIlIlIIllIIlI < 300L ? 1 : (this.IlIIIIIllllllIIlllIllllll.IIIllIIlIIIIIIlIlIIllIIlI < 600L ? 2 : (this.IlIIIIIllllllIIlllIllllll.IIIllIIlIIIIIIlIlIIllIIlI < 1000L ? 3 : 4))));
            if (this.IlIIIIIllllllIIlllIllllll.IIIllIIlIIIIIIlIlIIllIIlI < 0L) {
                string = "(no connection)";
            } else {
                string = this.IlIIIIIllllllIIlllIllllll.IIIllIIlIIIIIIlIlIIllIIlI + "ms";
                string3 = this.IlIIIIIllllllIIlllIllllll.lIIIIlIlIIlllllIIllIIlIII;
            }
        } else {
            n10 = 1;
            n8 = (int)(Minecraft.llllllIlIllllIlIlIlIIIIlI() / 100L + (long)(n * 2) & 7L);
            if (n8 > 4) {
                n8 = 8 - n8;
            }
            string = "Pinging...";
        }
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        this.lIlllIlllIIIIlIIlllIllIII.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(class_0210.lllIIlIIIllllllIIIIlIlIlI);
        class_0210.lllIIIllIIIIlllIlIIllIIll(n2 + n4 - 15, n3, n10 * 10, 176 + n8 * 8, 10, 8, 256.0f, 256.0f);
        if (this.IllIIIllIIIIlIlIlIllIIlll != null) {
            this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll((float)n2, (float)n3, 32.0f, 29.5f);
            this.IllIIIllIIIIlIlIlIllIIlll.lllIlIIlIIIlIlIIIllIlllIl(0.0f, 0.0f, true);
        } else {
            if (this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl() != null && !this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl().equals(this.IIIllIIlIIIIIIlIlIIllIIlI)) {
                this.IIIllIIlIIIIIIlIlIIllIIlI = this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl();
                this.lllIlIIlIIIlIlIIIllIlllIl();
                this.IlIllllllIIlIIllllIIlIIIl.IIIllIllIIlIlIlIlIllllIIl().lllIlIIlIIIlIlIIIllIlllIl();
            }
            if (this.IllIIlllllllIIlIIlIIIIlIl != null) {
                this.lIlllIlllIIIIlIIlllIllIII.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(this.IIIllIllIIlIlIlIlIllllIIl);
                class_0210.lllIIIllIIIIlllIlIIllIIll(n2, n3, 0.0f, 0.0f, 32, 32, 32.0f, 32.0f);
            }
        }
        int n11 = n6 - n2;
        int n12 = n7 - n3;
        if (n11 >= n4 - 15 && n11 <= n4 - 5 && n12 >= 0 && n12 <= 8) {
            this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(string);
        } else if (n11 >= n4 - n9 - 15 - 2 && n11 <= n4 - 15 - 2 && n12 >= 0 && n12 <= 8) {
            this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(string3);
        }
        Minecraft class_06672 = Minecraft.getMinecraft();
        if (class_06672.gameSettings.IllIlIlIIIlIllIlIlIIlllII || bl) {
            class_06672.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(class_0924.lllIIIllIIIIlllIlIIllIIll);
            class_0210.lllIIIllIIIIlllIlIIllIIll(n2, n3, n2 + 32, n3 + 32, -1601138544);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            int n13 = n6 - n2;
            if (n13 < 32) {
                class_0210.lllIIIllIIIIlllIlIIllIIll(n2, n3, 0.0f, 32.0f, 32, 32, 256.0f, 256.0f);
            } else {
                class_0210.lllIIIllIIIIlllIlIIllIIll(n2, n3, 0.0f, 0.0f, 32, 32, 256.0f, 256.0f);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void lllIlIIlIIIlIlIIIllIlllIl() {
        if (this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl() == null) {
            this.lIlllIlllIIIIlIIlllIllIII.llIIlIIllIIllIlIIllIIllII().IlIllllllIIlIIllllIIlIIIl(this.IIIllIllIIlIlIlIlIllllIIl);
            this.IllIIlllllllIIlIIlIIIIlIl = null;
        } else {
            BufferedImage bufferedImage;
            block8: {
                ByteBuf byteBuf = Unpooled.copiedBuffer((CharSequence)this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl(), (Charset)Charsets.UTF_8);
                ByteBuf byteBuf2 = Base64.decode((ByteBuf)byteBuf);
                try {
                    bufferedImage = ImageIO.read((InputStream)new ByteBufInputStream(byteBuf2));
                    Validate.validState((bufferedImage.getWidth() == 64 ? 1 : 0) != 0, (String)"Must be 64 pixels wide", (Object[])new Object[0]);
                    Validate.validState((bufferedImage.getHeight() == 64 ? 1 : 0) != 0, (String)"Must be 64 pixels high", (Object[])new Object[0]);
                    break block8;
                }
                catch (Exception exception) {
                    lllIIIllIIIIlllIlIIllIIll.error("Invalid icon for server " + this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll + " (" + this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl + ")", (Throwable)exception);
                    this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll((String)null);
                }
                finally {
                    byteBuf.release();
                    byteBuf2.release();
                }
                return;
            }
            if (this.IllIIlllllllIIlIIlIIIIlIl == null) {
                this.IllIIlllllllIIlIIlIIIIlIl = new class_2202(bufferedImage.getWidth(), bufferedImage.getHeight());
                this.lIlllIlllIIIIlIIlllIllIII.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(this.IIIllIllIIlIlIlIlIllllIIl, (class_0211)this.IllIIlllllllIIlIIlIIIIlIl);
            }
            bufferedImage.getRGB(0, 0, bufferedImage.getWidth(), bufferedImage.getHeight(), this.IllIIlllllllIIlIIlIIIIlIl.lIlllIlllIIIIlIIlllIllIII(), 0, bufferedImage.getWidth());
            this.IllIIlllllllIIlIIlIIIIlIl.lllIlIIlIIIlIlIIIllIlllIl();
        }
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4, int n5, int n6) {
        this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(n);
        if (Minecraft.llllllIlIllllIlIlIlIIIIlI() - this.lIllllIIlIIIlIllllllIIIll < 250L) {
            this.IlIllllllIIlIIllllIIlIIIl.IIIllIIlIIIIIIlIlIIllIIlI();
        }
        this.lIllllIIlIIIlIllllllIIIll = Minecraft.llllllIlIllllIlIlIlIIIIlI();
        if (n5 <= 32 && n5 < 32) {
            this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll);
            return true;
        }
        return false;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3, int n4, int n5, int n6) {
    }

    public class_1092 lllIIIllIIIIlllIlIIllIIll() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    static /* synthetic */ class_1092 lllIIIllIIIIlllIlIIllIIll(class_1303 class_13032) {
        return class_13032.IlIIIIIllllllIIlllIllllll;
    }

    static /* synthetic */ class_1381 lllIlIIlIIIlIlIIIllIlllIl(class_1303 class_13032) {
        return class_13032.IlIllllllIIlIIllllIIlIIIl;
    }
}

