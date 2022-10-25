package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.realms.RealmsBridge
 *  org.apache.commons.io.Charsets
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GLContext
 *  org.lwjgl.util.glu.Project
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import net.minecraft.util.ResourceLocation;
import net.minecraft.client.Minecraft;
import net.minecraft.realms.RealmsBridge;
import net.minecraft.util.MathHelper;
import net.minecraft.client.renderer.OpenGlHelper;
import org.apache.commons.io.Charsets;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.util.glu.Project;

public class class_2097
extends class_0229
implements class_0945 {
    private static final Logger lllIlIIlIIIlIlIIIllIlllIl = LogManager.getLogger();
    private static final Random IlIllllllIIlIIllllIIlIIIl = new Random();
    private float lIlllIlllIIIIlIIlllIllIII;
    private String IlIIIIIllllllIIlllIllllll = "missingno";
    private class_1197 lIllllIIlIIIlIllllllIIIll;
    private int IIIllIIlIIIIIIlIlIIllIIlI;
    private class_2202 IllIIlllllllIIlIIlIIIIlIl;
    private final Object IIIllIllIIlIlIlIlIllllIIl = new Object();
    private String IllIIIllIIIIlIlIlIllIIlll;
    private String lIIIIlIlIIlllllIIllIIlIII = lllIIIllIIIIlllIlIIllIIll;
    private String lIlllIlllIlIIIIlllIlIlIIl;
    private static final ResourceLocation IlIIlllllIIlIlIlllllIllll = new ResourceLocation("texts/splashes.txt");
    private static final ResourceLocation llIIlIlIlllIIllIlIlllIllI = new ResourceLocation("textures/gui/title/minecraft.png");
    private static final ResourceLocation[] IllIIIIllIIllIllIlllIlIIl = new ResourceLocation[]{new ResourceLocation("textures/gui/title/background/0.png"), new ResourceLocation("textures/gui/title/background/1.png"), new ResourceLocation("textures/gui/title/background/2.png"), new ResourceLocation("textures/gui/title/background/3.png"), new ResourceLocation("textures/gui/title/background/4.png"), new ResourceLocation("textures/gui/title/background/5.png")};
    public static final String lllIIIllIIIIlllIlIIllIIll = "Please click " + (Object)((Object) EnumChatFormatting.UNDERLINE) + "here" + (Object)((Object) EnumChatFormatting.RESET) + " for more information.";
    private int IIIIIIIIlIllIIllIIlllIllI;
    private int IIlIIlIlIlIllIIlIlIIIIlll;
    private int llIIIlllIlllIlIllIIIIllIl;
    private int IIIIlIllIlIIlIIlIllIlIlll;
    private int IlIlIIlllIllllllllIIIlIlI;
    private int llllIIIIlIIIlIIIIIIlIllll;
    private ResourceLocation llIIIIllIIIIIIIlIIIlIIIIl;
    private double IIllIllIIllIIlllIIIlIlllI;
    private float llllllIlIllllIlIlIlIIIIlI = 0.0f;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public class_2097() {
        BufferedReader bufferedReader = null;
        try {
            String string;
            ArrayList<String> arrayList = new ArrayList<String>();
            bufferedReader = new BufferedReader(new InputStreamReader(Minecraft.getMinecraft().getResourceManager().getResource(IlIIlllllIIlIlIlllllIllll).getInputStream(), Charsets.UTF_8));
            while ((string = bufferedReader.readLine()) != null) {
                if ((string = string.trim()).isEmpty()) continue;
                arrayList.add(string);
            }
            if (!arrayList.isEmpty()) {
                do {
                    this.IlIIIIIllllllIIlllIllllll = (String)arrayList.get(IlIllllllIIlIIllllIIlIIIl.nextInt(arrayList.size()));
                } while (this.IlIIIIIllllllIIlllIllllll.hashCode() == 125780783);
            }
        }
        catch (IOException iOException) {
        }
        finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                }
                catch (IOException iOException) {}
            }
        }
        this.lIlllIlllIIIIlIIlllIllIII = IlIllllllIIlIIllllIIlIIIl.nextFloat();
        this.IllIIIllIIIIlIlIlIllIIlll = "";
        if (!GLContext.getCapabilities().OpenGL20 && !OpenGlHelper.lllIlIIlIIIlIlIIIllIlllIl()) {
            this.IllIIIllIIIIlIlIlIllIIlll = class_0616.lllIIIllIIIIlllIlIIllIIll("title.oldgl1", new Object[0]);
            this.lIIIIlIlIIlllllIIllIIlIII = class_0616.lllIIIllIIIIlllIlIIllIIll("title.oldgl2", new Object[0]);
            this.lIlllIlllIlIIIIlllIlIlIIl = "https://help.mojang.com/customer/portal/articles/325948?ref=game";
        }
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        ++this.IIIllIIlIIIIIIlIlIIllIIlI;
        this.IIllIllIIllIIlllIIIlIlllI += 0.06283185307179587;
        this.llllllIlIllllIlIlIlIIIIlI = (float)((Math.sin(this.IIllIllIIllIIlllIIIlIlllI) / 2.0 + 0.5) * 180.0);
    }

    @Override
    public boolean lIlllIlllIIIIlIIlllIllIII() {
        return false;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(char c, int n) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void n_() {
        this.IllIIlllllllIIlIIlIIIIlIl = new class_2202(256, 256);
        this.llIIIIllIIIIIIIlIIIlIIIIl = this.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll("background", this.IllIIlllllllIIlIIlIIIIlIl);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        if (calendar.get(2) + 1 == 11 && calendar.get(5) == 9) {
            this.IlIIIIIllllllIIlllIllllll = "Happy birthday, ez!";
        } else if (calendar.get(2) + 1 == 6 && calendar.get(5) == 1) {
            this.IlIIIIIllllllIIlllIllllll = "Happy birthday, Notch!";
        } else if (calendar.get(2) + 1 == 12 && calendar.get(5) == 24) {
            this.IlIIIIIllllllIIlllIllllll = "Merry X-mas!";
        } else if (calendar.get(2) + 1 == 1 && calendar.get(5) == 1) {
            this.IlIIIIIllllllIIlllIllllll = "Happy new year!";
        } else if (calendar.get(2) + 1 == 10 && calendar.get(5) == 31) {
            this.IlIIIIIllllllIIlllIllllll = "OOoooOOOoooo! Spooky!";
        }
        boolean bl = true;
        int n = this.lIIlIIIIIlIlllIlIIlIlIlll / 4 + 48;
        if (this.lllllIlllIIllIlIIlIIIllII.lIlIllIIlIIlIIlIIlIIlIIll()) {
            this.lllIlIIlIIIlIlIIIllIlllIl(n, 24);
        } else {
            this.lllIIIllIIIIlllIlIIllIIll(n, 24);
        }
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(0, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, n + 48, 98, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("menu.options", new Object[0])));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(4, this.IlIlIIlllIIlIllIIIlllllIl / 2 + 2, n + 48, 98, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("menu.quit", new Object[0])));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_2193(5, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 124, n + 48));
        Object object = this.IIIllIllIIlIlIlIlIllllIIl;
        Object object2 = this.IIIllIllIIlIlIlIlIllllIIl;
        synchronized (object2) {
            this.IIlIIlIlIlIllIIlIlIIIIlll = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this.IllIIIllIIIIlIlIlIllIIlll);
            this.IIIIIIIIlIllIIllIIlllIllI = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this.lIIIIlIlIIlllllIIllIIlIII);
            int n2 = Math.max(this.IIlIIlIlIlIllIIlIlIIIIlll, this.IIIIIIIIlIllIIllIIlllIllI);
            this.llIIIlllIlllIlIllIIIIllIl = (this.IlIlIIlllIIlIllIIIlllllIl - n2) / 2;
            this.IIIIlIllIlIIlIIlIllIlIlll = ((class_1197)this.lIlIlIIlIIIIlIIIIIlllIIII.get((int)0)).IIIllIIlIIIIIIlIlIIllIIlI - 24;
            this.IlIlIIlllIllllllllIIIlIlI = this.llIIIlllIlllIlIllIIIIllIl + n2;
            this.llllIIIIlIIIlIIIIIIlIllll = this.IIIIlIllIlIIlIIlIllIlIlll + 24;
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(1, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, n, class_0616.lllIIIllIIIIlllIlIIllIIll("menu.singleplayer", new Object[0])));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(2, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, n + n2 * 1, class_0616.lllIIIllIIIIlllIlIIllIIll("menu.multiplayer", new Object[0])));
    }

    private void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2) {
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(11, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, n, class_0616.lllIIIllIIIIlllIlIIllIIll("menu.playdemo", new Object[0])));
        this.lIllllIIlIIIlIllllllIIIll = new class_1197(12, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, n + n2 * 1, class_0616.lllIIIllIIIIlllIlIIllIIll("menu.resetdemo", new Object[0]));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(this.lIllllIIlIIIlIllllllIIIll);
        class_2055 class_20552 = this.lllllIlllIIllIlIIlIIIllII.lIllllIIlIIIlIllllllIIIll();
        class_0770 class_07702 = class_20552.IlIllllllIIlIIllllIIlIIIl("Demo_World");
        if (class_07702 == null) {
            this.lIllllIIlIIIlIllllllIIIll.IllIIIllIIIIlIlIlIllIIlll = false;
        }
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1197 class_11972) {
        class_2055 class_20552;
        class_0770 class_07702;
        if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 0) {
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_2003(this, this.lllllIlllIIllIlIIlIIIllII.gameSettings));
        }
        if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 5) {
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_0671(this, this.lllllIlllIIllIlIIlIIIllII.gameSettings, this.lllllIlllIIllIlIIlIIIllII.llllIlIIIIIIIIIlllIIlIIIl()));
        }
        if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 1) {
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_2083(this));
        }
        if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 2) {
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_1381(this));
        }
        if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 14) {
            this.lIllllIIlIIIlIllllllIIIll();
        }
        if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 4) {
            this.lllllIlllIIllIlIIlIIIllII.llIIllIllIlIIlIIllIllllll();
        }
        if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 11) {
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll("Demo_World", "Demo_World", class_0595.lllIIIllIIIIlllIlIIllIIll);
        }
        if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 12 && (class_07702 = (class_20552 = this.lllllIlllIIllIlIIlIIIllII.lIllllIIlIIIlIllllllIIIll()).IlIllllllIIlIIllllIIlIIIl("Demo_World")) != null) {
            class_0923 class_09232 = class_2083.lllIIIllIIIIlllIlIIllIIll(this, class_07702.lIIIIlIlIIlllllIIllIIlIII(), 12);
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(class_09232);
        }
    }

    private void lIllllIIlIIIlIllllllIIIll() {
        RealmsBridge realmsBridge = new RealmsBridge();
        realmsBridge.lllIIIllIIIIlllIlIIllIIll((class_0229)this);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(boolean bl, int n) {
        if (bl && n == 12) {
            class_2055 class_20552 = this.lllllIlllIIllIlIIlIIIllII.lIllllIIlIIIlIllllllIIIll();
            class_20552.lIlllIlllIIIIlIIlllIllIII();
            class_20552.IlIIIIIllllllIIlllIllllll("Demo_World");
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(this);
        } else if (n == 13) {
            if (bl) {
                try {
                    Class<?> class_ = Class.forName("java.awt.Desktop");
                    Object object = class_.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
                    class_.getMethod("browse", URI.class).invoke(object, new URI(this.lIlllIlllIlIIIIlllIlIlIIl));
                }
                catch (Throwable throwable) {
                    lllIlIIlIIIlIlIIIllIlllIl.error("Couldn't open link", throwable);
                }
            }
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(this);
        }
    }

    private void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, float f) {
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        GL11.glMatrixMode((int)5889);
        GL11.glPushMatrix();
        GL11.glLoadIdentity();
        Project.gluPerspective((float)120.0f, (float)1.0f, (float)0.05f, (float)10.0f);
        GL11.glMatrixMode((int)5888);
        GL11.glPushMatrix();
        GL11.glLoadIdentity();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glRotatef((float)180.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3008);
        GL11.glDisable((int)2884);
        GL11.glDepthMask((boolean)false);
        OpenGlHelper.glBlendFunc(770, 771, 1, 0);
        int n3 = 8;
        for (int i = 0; i < n3 * n3; ++i) {
            GL11.glPushMatrix();
            float f2 = ((float)(i % n3) / (float)n3 - 0.5f) / 64.0f;
            float f3 = ((float)(i / n3) / (float)n3 - 0.5f) / 64.0f;
            float f4 = 0.0f;
            GL11.glTranslatef((float)f2, (float)f3, (float)f4);
            GL11.glRotatef((float)(MathHelper.lllIIIllIIIIlllIlIIllIIll(((float)this.IIIllIIlIIIIIIlIlIIllIIlI + f) / 400.0f) * 25.0f + 20.0f), (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)(-((float)this.IIIllIIlIIIIIIlIlIIllIIlI + f) * 0.1f), (float)0.0f, (float)1.0f, (float)0.0f);
            for (int j = 0; j < 6; ++j) {
                GL11.glPushMatrix();
                if (j == 1) {
                    GL11.glRotatef((float)90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                }
                if (j == 2) {
                    GL11.glRotatef((float)180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                }
                if (j == 3) {
                    GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                }
                if (j == 4) {
                    GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                }
                if (j == 5) {
                    GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                }
                this.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(IllIIIIllIIllIllIlllIlIIl[j]);
                class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                class_08682.lllIIIllIIIIlllIlIIllIIll(0xFFFFFF, 255 / (i + 1));
                float f5 = 0.0f;
                class_08682.lllIIIllIIIIlllIlIIllIIll(-1.0, -1.0, 1.0, 0.0f + f5, 0.0f + f5);
                class_08682.lllIIIllIIIIlllIlIIllIIll(1.0, -1.0, 1.0, 1.0f - f5, 0.0f + f5);
                class_08682.lllIIIllIIIIlllIlIIllIIll(1.0, 1.0, 1.0, 1.0f - f5, 1.0f - f5);
                class_08682.lllIIIllIIIIlllIlIIllIIll(-1.0, 1.0, 1.0, 0.0f + f5, 1.0f - f5);
                class_08682.lllIIIllIIIIlllIlIIllIIll();
                GL11.glPopMatrix();
            }
            GL11.glPopMatrix();
            GL11.glColorMask((boolean)true, (boolean)true, (boolean)true, (boolean)false);
        }
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(0.0, 0.0, 0.0);
        GL11.glColorMask((boolean)true, (boolean)true, (boolean)true, (boolean)true);
        GL11.glMatrixMode((int)5889);
        GL11.glPopMatrix();
        GL11.glMatrixMode((int)5888);
        GL11.glPopMatrix();
        GL11.glDepthMask((boolean)true);
        GL11.glEnable((int)2884);
        GL11.glEnable((int)2929);
    }

    private void lllIIIllIIIIlllIlIIllIIll(float f) {
        this.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(this.llIIIIllIIIIIIIlIIIlIIIIl);
        GL11.glTexParameteri((int)3553, (int)10241, (int)9729);
        GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
        GL11.glCopyTexSubImage2D((int)3553, (int)0, (int)0, (int)0, (int)0, (int)0, (int)256, (int)256);
        GL11.glEnable((int)3042);
        OpenGlHelper.glBlendFunc(770, 771, 1, 0);
        GL11.glColorMask((boolean)true, (boolean)true, (boolean)true, (boolean)false);
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        GL11.glDisable((int)3008);
        int n = 3;
        for (int i = 0; i < n; ++i) {
            class_08682.lllIIIllIIIIlllIlIIllIIll(1.0f, 1.0f, 1.0f, 1.0f / (float)(i + 1));
            int n2 = this.IlIlIIlllIIlIllIIIlllllIl;
            int n3 = this.lIIlIIIIIlIlllIlIIlIlIlll;
            float f2 = (float)(i - n / 2) / 256.0f;
            class_08682.lllIIIllIIIIlllIlIIllIIll(n2, n3, IlIlllIIIIIIlIIllIIllIlll, 0.0f + f2, 1.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n2, 0.0, IlIlllIIIIIIlIIllIIllIlll, 1.0f + f2, 1.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, IlIlllIIIIIIlIIllIIllIlll, 1.0f + f2, 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll(0.0, n3, IlIlllIIIIIIlIIllIIllIlll, 0.0f + f2, 0.0);
        }
        class_08682.lllIIIllIIIIlllIlIIllIIll();
        GL11.glEnable((int)3008);
        GL11.glColorMask((boolean)true, (boolean)true, (boolean)true, (boolean)true);
    }

    private void IlIllllllIIlIIllllIIlIIIl(int n, int n2, float f) {
        this.lllllIlllIIllIlIIlIIIllII.lllIlIIlIIIlIlIIIllIlllIl().IlIIIIIllllllIIlllIllllll();
        GL11.glViewport((int)0, (int)0, (int)256, (int)256);
        this.lllIlIIlIIIlIlIIIllIlllIl(n, n2, f);
        this.lllIIIllIIIIlllIlIIllIIll(f);
        this.lllIIIllIIIIlllIlIIllIIll(f);
        this.lllIIIllIIIIlllIlIIllIIll(f);
        this.lllIIIllIIIIlllIlIIllIIll(f);
        this.lllIIIllIIIIlllIlIIllIIll(f);
        this.lllIIIllIIIIlllIlIIllIIll(f);
        this.lllIIIllIIIIlllIlIIllIIll(f);
        this.lllllIlllIIllIlIIlIIIllII.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(true);
        GL11.glViewport((int)0, (int)0, (int)this.lllllIlllIIllIlIIlIIIllII.displayWidth, (int)this.lllllIlllIIllIlIIlIIIllII.displayHeight);
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        float f2 = this.IlIlIIlllIIlIllIIIlllllIl > this.lIIlIIIIIlIlllIlIIlIlIlll ? 120.0f / (float)this.IlIlIIlllIIlIllIIIlllllIl : 120.0f / (float)this.lIIlIIIIIlIlllIlIIlIlIlll;
        float f3 = (float)this.lIIlIIIIIlIlllIlIIlIlIlll * f2 / 256.0f;
        float f4 = (float)this.IlIlIIlllIIlIllIIIlllllIl * f2 / 256.0f;
        class_08682.lllIIIllIIIIlllIlIIllIIll(1.0f, 1.0f, 1.0f, 1.0f);
        int n3 = this.IlIlIIlllIIlIllIIIlllllIl;
        int n4 = this.lIIlIIIIIlIlllIlIIlIlIlll;
        class_08682.lllIIIllIIIIlllIlIIllIIll(0.0, n4, IlIlllIIIIIIlIIllIIllIlll, 0.5f - f3, 0.5f + f4);
        class_08682.lllIIIllIIIIlllIlIIllIIll(n3, n4, IlIlllIIIIIIlIIllIIllIlll, 0.5f - f3, 0.5f - f4);
        class_08682.lllIIIllIIIIlllIlIIllIIll(n3, 0.0, IlIlllIIIIIIlIIllIIllIlll, 0.5f + f3, 0.5f - f4);
        class_08682.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, IlIlllIIIIIIlIIllIIllIlll, 0.5f + f3, 0.5f + f4);
        class_08682.lllIIIllIIIIlllIlIIllIIll();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        GL11.glDisable((int)3008);
        this.IlIllllllIIlIIllllIIlIIIl(n, n2, f);
        GL11.glEnable((int)3008);
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        int n3 = 274;
        int n4 = this.IlIlIIlllIIlIllIIIlllllIl / 2 - n3 / 2;
        int n5 = 30;
        class_2097.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, (float)this.IlIlIIlllIIlIllIIIlllllIl, (float)this.lIIlIIIIIlIlllIlIIlIlIlll, -2130706433, 0xFFFFFF);
        class_2097.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, (float)this.IlIlIIlllIIlIllIIIlllllIl, (float)this.lIIlIIIIIlIlllIlIIlIlIlll, 0, Integer.MIN_VALUE);
        String string = "Lunar Client 1.7.10 Dev";
        this.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIllIIlIIlIIlIIlIIlIIll, string, 2, this.lIIlIIIIIlIlllIlIIlIlIlll - 10, -1);
        String string2 = "Copyright Mojang AB. Do not distribute!";
        this.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIllIIlIIlIIlIIlIIlIIll, string2, this.IlIlIIlllIIlIllIIIlllllIl - this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(string2) - 2, this.lIIlIIIIIlIlllIlIIlIlIlll - 10, -1);
        if (this.IllIIIllIIIIlIlIlIllIIlll != null && this.IllIIIllIIIIlIlIlIllIIlll.length() > 0) {
            class_2097.lllIIIllIIIIlllIlIIllIIll(this.llIIIlllIlllIlIllIIIIllIl - 2, this.IIIIlIllIlIIlIIlIllIlIlll - 2, this.IlIlIIlllIllllllllIIIlIlI + 2, this.llllIIIIlIIIlIIIIIIlIllll - 1, 0x55200000);
            this.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIllIIlIIlIIlIIlIIlIIll, this.IllIIIllIIIIlIlIlIllIIlll, this.llIIIlllIlllIlIllIIIIllIl, this.IIIIlIllIlIIlIIlIllIlIlll, -1);
            this.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIllIIlIIlIIlIIlIIlIIll, this.lIIIIlIlIIlllllIIllIIlIII, (this.IlIlIIlllIIlIllIIIlllllIl - this.IIIIIIIIlIllIIllIIlllIllI) / 2, ((class_1197)this.lIlIlIIlIIIIlIIIIIlllIIII.get((int)0)).IIIllIIlIIIIIIlIlIIllIIlI - 12, -1);
        }
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
        Object object = this.IIIllIllIIlIlIlIlIllllIIl;
        Object object2 = this.IIIllIllIIlIlIlIlIllllIIl;
        synchronized (object2) {
            if (this.IllIIIllIIIIlIlIlIllIIlll.length() > 0 && n >= this.llIIIlllIlllIlIllIIIIllIl && n <= this.IlIlIIlllIllllllllIIIlIlI && n2 >= this.IIIIlIllIlIIlIIlIllIlIlll && n2 <= this.llllIIIIlIIIlIIIIIIlIllll) {
                class_1616 class_16162 = new class_1616((class_0945)this, this.lIlllIlllIlIIIIlllIlIlIIl, 13, true);
                class_16162.IIIllIIlIIIIIIlIlIIllIIlI();
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(class_16162);
            }
        }
    }
}

