package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonParser
 *  net.minecraft.realms.RealmsBridge
 *  org.apache.commons.io.Charsets
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GLContext
 *  org.lwjgl.util.glu.Project
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URI;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.moonsworth.lunar.client.LunarClient;
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

public class class_0270
extends class_0229
implements class_0945 {
    private static final Logger lllIlIIlIIIlIlIIIllIlllIl = LogManager.getLogger();
    private static final Random IlIllllllIIlIIllllIIlIIIl = new Random();
    private float lIlllIlllIIIIlIIlllIllIII;
    private String IlIIIIIllllllIIlllIllllll = "missingno";
    private class_1197 lIllllIIlIIIlIllllllIIIll;
    private static int IIIllIIlIIIIIIlIlIIllIIlI;
    private class_2202 IllIIlllllllIIlIIlIIIIlIl;
    private final Object IIIllIllIIlIlIlIlIllllIIl = new Object();
    private String IllIIIllIIIIlIlIlIllIIlll;
    private String lIIIIlIlIIlllllIIllIIlIII = lllIIIllIIIIlllIlIIllIIll;
    private String lIlllIlllIlIIIIlllIlIlIIl;
    private static final ResourceLocation IlIIlllllIIlIlIlllllIllll;
    private static final ResourceLocation llIIlIlIlllIIllIlIlllIllI;
    private static final ResourceLocation[] IllIIIIllIIllIllIlllIlIIl;
    public static final String lllIIIllIIIIlllIlIIllIIll;
    private int IIIIIIIIlIllIIllIIlllIllI;
    private int IIlIIlIlIlIllIIlIlIIIIlll;
    private int llIIIlllIlllIlIllIIIIllIl;
    private int IIIIlIllIlIIlIIlIllIlIlll;
    private int IlIlIIlllIllllllllIIIlIlI;
    private int llllIIIIlIIIlIIIIIIlIllll;
    private ResourceLocation llIIIIllIIIIIIIlIIIlIIIIl;
    private List IIllIllIIllIIlllIIIlIlllI = new ArrayList();
    private class_1226 llllllIlIllllIlIlIlIIIIlI;
    private boolean lIlIIllllIlIIIIllIIIIlIIl = false;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public class_0270() {
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
        ++IIIllIIlIIIIIIlIlIIllIIlI;
    }

    @Override
    public boolean lIlllIlllIIIIlIIlllIllIII() {
        return false;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(char c, int n) {
        if (n == 1) {
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_2097());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void n_() {
        String string;
        Object object2;
        this.IllIIlllllllIIlIIlIIIIlIl = new class_2202(256, 256);
        this.llIIIIllIIIIIIIlIIIlIIIIl = this.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll("background", this.IllIIlllllllIIlIIlIIIIlIl);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_0102(0, 45, 0, 50, 25, "OPTIONS", false));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_0102(5, 95, 0, 50, 25, "LANGUAGE", false));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_0102(66, 145, 0, 65, 25, "COSMETICS", false));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_2160(4, new ResourceLocation("client/icons/exit-64.png"), this.IlIlIIlllIIlIllIIIlllllIl - 65, 0, 65, 25, "EXIT", false));
        File file = new File(Minecraft.getMinecraft().mcDataDir + File.separator + "launcher_profiles.json");
        ArrayList arrayList = new ArrayList();
        if (file.exists()) {
            try {
                FileReader fileReader = new FileReader(file);
                object2 = new JsonParser();
                JsonElement object4 = object2.parse((Reader)fileReader);
                string = "";
                for (Object object : object4.getAsJsonObject().entrySet()) {
                    if (((String)object.getKey()).equalsIgnoreCase("clientToken")) {
                        string = ((JsonElement)object.getValue()).getAsString();
                    }
                    if (!((String)object.getKey()).equalsIgnoreCase("authenticationDatabase")) continue;
                    for (Map.Entry entry : ((JsonElement)object.getValue()).getAsJsonObject().entrySet()) {
                        HashMap<String, Object> hashMap = new HashMap<String, Object>();
                        hashMap.put("clientToken", string);
                        for (Map.Entry entry2 : ((JsonElement)entry.getValue()).getAsJsonObject().entrySet()) {
                            if (((String)entry2.getKey()).equalsIgnoreCase("profiles")) {
                                for (Map.Entry entry3 : ((JsonElement)entry2.getValue()).getAsJsonObject().entrySet()) {
                                    hashMap.put("uuid", entry3.getKey());
                                    for (Map.Entry entry4 : ((JsonElement)entry3.getValue()).getAsJsonObject().entrySet()) {
                                        hashMap.put("displayName", ((JsonElement)entry4.getValue()).getAsString());
                                    }
                                }
                                continue;
                            }
                            if (!((String)entry2.getKey()).equalsIgnoreCase("username") && !((String)entry2.getKey()).equalsIgnoreCase("displayName") && !((String)entry2.getKey()).equalsIgnoreCase("uuid") && !((String)entry2.getKey()).equalsIgnoreCase("accessToken")) continue;
                            hashMap.put((String)entry2.getKey(), ((JsonElement)entry2.getValue()).getAsString());
                        }
                        arrayList.add(hashMap);
                    }
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        this.llllllIlIllllIlIlIlIIIIlI = null;
        this.IIllIllIIllIIlllIIIlIlllI.clear();
        int n = 0;
        for (Map map : arrayList) {
            string = (String)map.get("displayName");
            class_1226 class_12262 = new class_1226(50, map, this.IlIlIIlllIIlIllIIIlllllIl - 200, n * 25, 130, 25);
            this.IIllIllIIllIIlllIIIlIlllI.add(class_12262);
            if (this.lllllIlllIIllIlIIlIIIllII.getSession() != null && string.equalsIgnoreCase(this.lllllIlllIIllIlIIlIIIllII.getSession().getUsername())) {
                this.llllllIlIllllIlIlIlIIIIlI = class_12262;
                if (n != 0) {
                    Object object;
                    object = (class_1226)this.IIllIllIIllIIlllIIIlIlllI.get(0);
                    ((class_1226)object).IIIllIIlIIIIIIlIlIIllIIlI = n * 25;
                    this.llllllIlIllllIlIlIlIIIIlI.IIIllIIlIIIIIIlIlIIllIIlI = 0;
                }
            }
            ++n;
        }
        if (this.llllllIlIllllIlIlIlIIIIlI == null && !this.IIllIllIIllIIlllIIIlIlllI.isEmpty()) {
            this.llllllIlIllllIlIlIlIIIIlI = (class_1226)this.IIllIllIIllIIlllIIIlIlllI.get(0);
        }
        object2 = this.IIIllIllIIlIlIlIlIllllIIl;
        Object object = this.IIIllIllIIlIlIlIlIllllIIl;
        synchronized (object) {
            this.IIlIIlIlIlIllIIlIlIIIIlll = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this.IllIIIllIIIIlIlIlIllIIlll);
            this.IIIIIIIIlIllIIllIIlllIllI = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this.lIIIIlIlIIlllllIIllIIlIII);
            int n2 = Math.max(this.IIlIIlIlIlIllIIlIlIIIIlll, this.IIIIIIIIlIllIIllIIlllIllI);
            this.llIIIlllIlllIlIllIIIIllIl = (this.IlIlIIlllIIlIllIIIlllllIl - n2) / 2;
            this.IIIIlIllIlIIlIIlIllIlIlll = ((class_1197)this.lIlIlIIlIIIIlIIIIIlllIIII.get((int)0)).IIIllIIlIIIIIIlIlIIllIIlI - 24;
            this.IlIlIIlllIllllllllIIIlIlI = this.llIIIlllIlllIlIllIIIIllIl + n2;
            this.llllIIIIlIIIlIIIIIIlIllll = this.IIIIlIllIlIIlIIlIllIlIlll + 24;
        }
    }

    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_0102(1, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 65, n + 24, 130, 24, class_0616.lllIIIllIIIIlllIlIIllIIll("menu.singleplayer", new Object[0])));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_0102(2, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 65, n + 52, 130, 24, class_0616.lllIIIllIIIIlllIlIIllIIll("menu.multiplayer", new Object[0])));
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
        if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 66) {
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_2146());
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
            GL11.glRotatef((float)(MathHelper.lllIIIllIIIIlllIlIIllIIll(((float)IIIllIIlIIIIIIlIlIIllIIlI + f) / 400.0f) * 25.0f + 20.0f), (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)(-((float)IIIllIIlIIIIIIlIlIIllIIlI + f) * 0.1f), (float)0.0f, (float)1.0f, (float)0.0f);
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
        int n3 = 274;
        int n4 = this.IlIlIIlllIIlIllIIIlllllIl / 2 - n3 / 2;
        int n5 = 30;
        class_0270.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, (float)this.IlIlIIlllIIlIllIIIlllllIl, (float)this.lIIlIIIIIlIlllIlIIlIlIlll, 0x5FFFFFFF, 0x2FFFFFFF);
        class_0210.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, this.IlIlIIlllIIlIllIIIlllllIl, 25.0f, -819846622);
        String string = "Lunar Client Alpha (" + LunarClient.getGitCommitIdAbbrv() + "/" + LunarClient.llIIlllIllIllllIIIlIIIIII() + ")";
        this.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIllIIlIIlIIlIIlIIlIIll, string, 2, this.lIIlIIIIIlIlllIlIIlIlIlll - 10, -1);
        String string2 = "Copyright Mojang AB. Do not distribute!";
        this.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIllIIlIIlIIlIIlIIlIIll, string2, this.IlIlIIlllIIlIllIIIlllllIl - this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(string2) - 2, this.lIIlIIIIIlIlllIlIIlIlIlll - 10, -1);
        if (this.IllIIIllIIIIlIlIlIllIIlll != null && this.IllIIIllIIIIlIlIlIllIIlll.length() > 0) {
            class_0270.lllIIIllIIIIlllIlIIllIIll(this.llIIIlllIlllIlIllIIIIllIl - 2, this.IIIIlIllIlIIlIIlIllIlIlll - 2, this.IlIlIIlllIllllllllIIIlIlI + 2, this.llllIIIIlIIIlIIIIIIlIllll - 1, 0x55200000);
            this.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIllIIlIIlIIlIIlIIlIIll, this.IllIIIllIIIIlIlIlIllIIlll, this.llIIIlllIlllIlIllIIIIllIl, this.IIIIlIllIlIIlIIlIllIlIlll, -1);
            this.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIllIIlIIlIIlIIlIIlIIll, this.lIIIIlIlIIlllllIIllIIlIII, (this.IlIlIIlllIIlIllIIIlllllIl - this.IIIIIIIIlIllIIllIIlllIllI) / 2, ((class_1197)this.lIlIlIIlIIIIlIIIIIlllIIII.get((int)0)).IIIllIIlIIIIIIlIlIIllIIlI - 12, -1);
        }
        GL11.glPushMatrix();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        float f2 = 30.0f;
        float f3 = 15.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 10.0f;
        float f7 = 5.0f;
        GL11.glEnable((int)3042);
        this.lllllIlllIIllIlIIlIIIllII.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("client/icons/lc.png"));
        GL11.glBegin((int)7);
        GL11.glTexCoord2d((double)(f4 / 5.0f), (double)(f5 / 5.0f));
        GL11.glVertex2d((double)f6, (double)f7);
        GL11.glTexCoord2d((double)(f4 / 5.0f), (double)((f5 + 5.0f) / 5.0f));
        GL11.glVertex2d((double)f6, (double)(f7 + f3));
        GL11.glTexCoord2d((double)((f4 + 5.0f) / 5.0f), (double)((f5 + 5.0f) / 5.0f));
        GL11.glVertex2d((double)(f6 + f2), (double)(f7 + f3));
        GL11.glTexCoord2d((double)((f4 + 5.0f) / 5.0f), (double)(f5 / 5.0f));
        GL11.glVertex2d((double)(f6 + f2), (double)f7);
        GL11.glEnd();
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
    }

    protected void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2) {
        int n3;
        for (n3 = 0; n3 < this.lIlIlIIlIIIIlIIIIIlllIIII.size(); ++n3) {
            ((class_1197)this.lIlIlIIlIIIIlIIIIIlllIIII.get(n3)).lllIIIllIIIIlllIlIIllIIll(this.lllllIlllIIllIlIIlIIIllII, n, n2);
        }
        for (n3 = 0; n3 < this.IlIIIlIIIIllIIIllIIIIIIll.size(); ++n3) {
            ((class_0343)this.IlIIIlIIIIllIIIllIIIIIIll.get(n3)).lllIIIllIIIIlllIlIIllIIll(this.lllllIlllIIllIlIIlIIIllII, n, n2);
        }
        if (this.llllllIlIllllIlIlIlIIIIlI != null) {
            this.lIlIIllllIlIIIIllIIIIlIIl = !this.lIlIIllllIlIIIIllIIIIlIIl ? n > this.llllllIlIllllIlIlIlIIIIlI.lIllllIIlIIIlIllllllIIIll && n < this.llllllIlIllllIlIlIlIIIIlI.lIllllIIlIIIlIllllllIIIll + this.llllllIlIllllIlIlIlIIIIlI.lllIlIIlIIIlIlIIIllIlllIl() && n2 > this.llllllIlIllllIlIlIlIIIIlI.IIIllIIlIIIIIIlIlIIllIIlI && n2 < this.llllllIlIllllIlIlIlIIIIlI.IIIllIIlIIIIIIlIlIIllIIlI + this.llllllIlIllllIlIlIlIIIIlI.IlIllllllIIlIIllllIIlIIIl() : n > this.llllllIlIllllIlIlIlIIIIlI.lIllllIIlIIIlIllllllIIIll && n < this.llllllIlIllllIlIlIlIIIIlI.lIllllIIlIIIlIllllllIIIll + this.llllllIlIllllIlIlIlIIIIlI.lllIlIIlIIIlIlIIIllIlllIl() && n2 > this.llllllIlIllllIlIlIlIIIIlI.IIIllIIlIIIIIIlIlIIllIIlI && n2 < this.llllllIlIllllIlIlIlIIIIlI.IIIllIIlIIIIIIlIlIIllIIlI + 25 * this.IIllIllIIllIIlllIIIlIlllI.size();
            this.llllllIlIllllIlIlIlIIIIlI.lllIIIllIIIIlllIlIIllIIll(this.lllllIlllIIllIlIIlIIIllII, n, n2);
            if (this.lIlIIllllIlIIIIllIIIIlIIl) {
                int n4 = this.IIllIllIIllIIlllIIIlIlllI.size();
                int n5 = this.llllllIlIllllIlIlIlIIIIlI.IlIllllllIIlIIllllIIlIIIl();
                for (int i = 0; i < n4; ++i) {
                    class_1226 class_12262 = (class_1226)this.IIllIllIIllIIlllIIIlIlllI.get(i);
                    if (class_12262 != this.llllllIlIllllIlIlIlIIIIlI) {
                        class_12262.lllIIIllIIIIlllIlIIllIIll(this.lllllIlllIIllIlIIlIIIllII, n, n2);
                    }
                    n5 += class_12262.IlIllllllIIlIIllllIIlIIIl();
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
        Object object = this.IIIllIllIIlIlIlIlIllllIIl;
        if (n <= 45 && n2 <= 25) {
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_2097());
        }
        if (this.lIlIIllllIlIIIIllIIIIlIIl) {
            int n4 = this.IIllIllIIllIIlllIIIlIlllI.size();
            int n5 = this.llllllIlIllllIlIlIlIIIIlI.IlIllllllIIlIIllllIIlIIIl();
            for (int i = 0; i < n4; ++i) {
                class_1226 class_12262 = (class_1226)this.IIllIllIIllIIlllIIIlIlllI.get(i);
                if (class_12262 != this.llllllIlIllllIlIlIlIIIIlI && n < class_12262.lIllllIIlIIIlIllllllIIIll + class_12262.lllIlIIlIIIlIlIIIllIlllIl() && n2 > class_12262.IIIllIIlIIIIIIlIlIIllIIlI && n2 < class_12262.IIIllIIlIIIIIIlIlIIllIIlI + class_12262.IlIllllllIIlIIllllIIlIIIl()) {
                    if (!class_12262.lllIIIllIIIIlllIlIIllIIll() || class_12262 == this.llllllIlIllllIlIlIlIIIIlI) break;
                    this.llllllIlIllllIlIlIlIIIIlI.IIIllIIlIIIIIIlIlIIllIIlI = class_12262.IIIllIIlIIIIIIlIlIIllIIlI;
                    class_12262.IIIllIIlIIIIIIlIlIIllIIlI = 0;
                    this.llllllIlIllllIlIlIlIIIIlI = class_12262;
                    break;
                }
                n5 += class_12262.IlIllllllIIlIIllllIIlIIIl();
            }
        }
        Object object2 = this.IIIllIllIIlIlIlIlIllllIIl;
        synchronized (object2) {
            if (this.IllIIIllIIIIlIlIlIllIIlll.length() > 0 && n >= this.llIIIlllIlllIlIllIIIIllIl && n <= this.IlIlIIlllIllllllllIIIlIlI && n2 >= this.IIIIlIllIlIIlIIlIllIlIlll && n2 <= this.llllIIIIlIIIlIIIIIIlIllll) {
                class_1616 class_16162 = new class_1616((class_0945)this, this.lIlllIlllIlIIIIlllIlIlIIl, 13, true);
                class_16162.IIIllIIlIIIIIIlIlIIllIIlI();
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(class_16162);
            }
        }
    }

    static {
        IlIIlllllIIlIlIlllllIllll = new ResourceLocation("texts/splashes.txt");
        llIIlIlIlllIIllIlIlllIllI = new ResourceLocation("textures/gui/title/minecraft.png");
        IllIIIIllIIllIllIlllIlIIl = new ResourceLocation[]{new ResourceLocation("textures/gui/title/background/panorama_0.png"), new ResourceLocation("textures/gui/title/background/panorama_1.png"), new ResourceLocation("textures/gui/title/background/panorama_2.png"), new ResourceLocation("textures/gui/title/background/panorama_3.png"), new ResourceLocation("textures/gui/title/background/panorama_4.png"), new ResourceLocation("textures/gui/title/background/panorama_5.png")};
        lllIIIllIIIIlllIlIIllIIll = "Please click " + (Object)((Object)class_1227.lIlIlIIlIIIIlIIIIIlllIIII) + "here" + (Object)((Object)class_1227.IIlllIlIlllIllIIIlllIIlIl) + " for more information.";
    }
}

