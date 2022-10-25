package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.Sys
 *  org.lwjgl.input.Keyboard
 */
import com.google.common.collect.Lists;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.moonsworth.lunar.client.config.Setting;
import com.moonsworth.lunar.client.LunarClient;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.Sys;
import org.lwjgl.input.Keyboard;

public class class_2018
extends class_0229 {
    private static final Logger lllIIIllIIIIlllIlIIllIIll = LogManager.getLogger();
    private class_0229 lllIlIIlIIIlIlIIIllIlllIl;
    private List IlIllllllIIlIIllllIIlIIIl;
    private List lIlllIlllIIIIlIIlllIllIII;
    private List IlIIIIIllllllIIlllIllllll;
    private List lIllllIIlIIIlIllllllIIIll;
    private class_0154 IIIllIIlIIIIIIlIlIIllIIlI;
    private class_2264 IllIIlllllllIIlIIlIIIIlIl;
    private class_0598 IIIllIllIIlIlIlIlIllllIIl;
    private boolean IllIIIllIIIIlIlIlIllIIlll;
    private class_1197 lIIIIlIlIIlllllIIllIIlIII;
    private class_1197 lIlllIlllIlIIIIlllIlIlIIl;
    private class_1197 IlIIlllllIIlIlIlllllIllll;
    private class_1249 llIIlIlIlllIIllIlIlllIllI;

    public class_2018(class_0229 class_02292) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_02292;
    }

    @Override
    public void n_() {
        this.IllIIIllIIIIlIlIlIllIIlll = false;
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1249(2, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 154, this.lIIlIIIIIlIlllIlIIlIlIlll - 48, class_0616.lllIIIllIIIIlllIlIIllIIll("resourcePack.openFolder", new Object[0])));
        this.llIIlIlIlllIIllIlIlllIllI = new class_1249(1, this.IlIlIIlllIIlIllIIIlllllIl / 2 + 4, this.lIIlIIIIIlIlllIlIIlIlIlll - 48, class_0616.lllIIIllIIIIlllIlIIllIIll("gui.done", new Object[0]));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(this.llIIlIlIlllIIllIlIlllIllI);
        this.IlIllllllIIlIIllllIIlIIIl = new ArrayList();
        this.lIlllIlllIIIIlIIlllIllIII = new ArrayList();
        this.llIIlIlIlllIIllIlIlllIllI.IllIIIllIIIIlIlIlIllIIlll = false;
        class_2018 class_20182 = this;
        class_1605 class_16052 = this.lllllIlllIIllIlIIlIIIllII.IllllIIIIlIIlIIIIlllIIIIl();
        new class_0077(this, class_16052, class_20182).start();
        try {
            this.lIlllIlllIIIIlIIlllIllIII.add(new class_0582(this));
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.IIIllIIlIIIIIIlIlIIllIIlI = new class_0154(this.lllllIlllIIllIlIIlIIIllII, 200, this.lIIlIIIIIlIlllIlIIlIlIlll - 26, this.IlIllllllIIlIIllllIIlIIIl);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lIllllIIlIIIlIllllllIIIll(this.IlIlIIlllIIlIllIIIlllllIl / 2 - 4 - 200);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lIlllIlllIIIIlIIlllIllIII(7, 8);
        this.IllIIlllllllIIlIIlIIIIlIl = new class_2264(this.lllllIlllIIllIlIIlIIIllII, 200, this.lIIlIIIIIlIlllIlIIlIlIlll - 46, this.lIlllIlllIIIIlIIlllIllIII);
        this.IllIIlllllllIIlIIlIIIIlIl.lIllllIIlIIIlIllllllIIIll(this.IlIlIIlllIIlIllIIIlllllIl / 2 + 4);
        this.IllIIlllllllIIlIIlIIIIlIl.lIlllIlllIIIIlIIlllIllIII(7, 8);
        this.IIIllIllIIlIlIlIlIllllIIl = new class_0598(this.lIlIllIIlIIlIIlIIlIIlIIll, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 204, this.lIIlIIIIIlIlllIlIIlIlIlll - 70, 200, 18);
        this.lIIIIlIlIIlllllIIllIIlIII = new class_1249(100, this.IlIlIIlllIIlIllIIIlllllIl / 2 + 4, this.lIIlIIIIIlIlllIlIIlIlIlll - 71, 114, 20, "Clear Glass: " + (String) LunarClient.getInstance().getSettingsManager().rsClearGlass.getValue());
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(this.lIIIIlIlIIlllllIIllIIlIII);
        this.lIlllIlllIlIIIIlllIlIlIIl = new class_1249(101, this.IlIlIIlllIIlIllIIIlllllIl / 2 + 118, this.lIIlIIIIIlIlllIlIIlIlIlll - 71, 86, 20, "Red String: " + ((Boolean) LunarClient.getInstance().getSettingsManager().rsRedString.getValue() != false ? "ON" : "OFF"));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(this.lIlllIlllIlIIIIlllIlIlIIl);
        this.IlIIlllllIIlIlIlllllIllll = new class_1249(102, this.IlIlIIlllIIlIllIIIlllllIl / 2 + 4, this.lIIlIIIIIlIlllIlIIlIlIlll - 91, 200, 20, "Background: " + ((Boolean) LunarClient.getInstance().getSettingsManager().rsTransparentBg.getValue() != false ? "Transparent" : "Normal"));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(this.IlIIlllllIIlIlIlllllIllll);
    }

    @Override
    public void o_() {
        Keyboard.enableRepeatEvents((boolean)false);
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_1924 class_19242) {
        return this.lIlllIlllIIIIlIIlllIllIII.contains(class_19242);
    }

    public List lllIlIIlIIIlIlIIIllIlllIl(class_1924 class_19242) {
        return this.lllIIIllIIIIlllIlIIllIIll(class_19242) ? this.lIlllIlllIIIIlIIlllIllIII : this.IlIllllllIIlIIllllIIlIIIl;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(char c, int n) {
        super.lllIIIllIIIIlllIlIIllIIll(c, n);
        if (this.IllIIIllIIIIlIlIlIllIIlll) {
            this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(c, n);
            if (this.IIIllIllIIlIlIlIlIllllIIl.lllIlIIlIIIlIlIIIllIlllIl() != "") {
                ArrayList arrayList = new ArrayList();
                for (Object e : this.IlIIIIIllllllIIlllIllllll) {
                    class_0718 class_07182 = (class_0718)e;
                    if (!class_07182.lllIlIIlIIIlIlIIIllIlllIl().toLowerCase().contains(this.IIIllIllIIlIlIlIlIllllIIl.lllIlIIlIIIlIlIIIllIlllIl().toLowerCase()) && !class_07182.lllIIIllIIIIlllIlIIllIIll().toLowerCase().contains(this.IIIllIllIIlIlIlIlIllllIIl.lllIlIIlIIIlIlIIIllIlllIl().toLowerCase())) continue;
                    arrayList.add(e);
                }
                this.IIIllIIlIIIIIIlIlIIllIIlI.lllIlIIlIIIlIlIIIllIlllIl = arrayList;
            } else {
                this.IIIllIIlIIIIIIlIlIIllIIlI.lllIlIIlIIIlIlIIIllIlllIl = this.IlIIIIIllllllIIlllIllllll;
            }
        }
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll();
    }

    public List lIllllIIlIIIlIllllllIIIll() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public List IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    private boolean IllIIlllllllIIlIIlIIIIlIl() {
        if (this.lIllllIIlIIIlIllllllIIIll.isEmpty() && !this.lIlllIlllIIIIlIIlllIllIII.isEmpty() || this.lIlllIlllIIIIlIIlllIllIII.size() < this.lIllllIIlIIIlIllllllIIIll.size()) {
            return true;
        }
        for (Object e : this.lIlllIlllIIIIlIIlllIllIII) {
            if (this.lIllllIIlIIIlIllllllIIIll.contains(e) && this.lIllllIIlIIIlIllllllIIIll.indexOf(e) == this.lIlllIlllIIIIlIIlllIllIII.indexOf(e)) continue;
            return true;
        }
        return false;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1197 class_11972) {
        if (class_11972.IllIIIllIIIIlIlIlIllIIlll) {
            Object object;
            if (class_11972 == this.lIIIIlIlIIlllllIIllIIlIII) {
                object = LunarClient.getInstance().getSettingsManager().rsClearGlass;
                for (int i = 0; i < ((String[])((Setting)object).IllIIlllllllIIlIIlIIIIlIl()).length; ++i) {
                    if (!((String[])((Setting)object).IllIIlllllllIIlIIlIIIIlIl())[i].toLowerCase().equalsIgnoreCase((String)((Setting)object).getValue())) continue;
                    if (i + 1 >= ((String[])((Setting)object).IllIIlllllllIIlIIlIIIIlIl()).length) {
                        ((Setting)object).setValue(((String[])((Setting)object).IllIIlllllllIIlIIlIIIIlIl())[0]);
                        break;
                    }
                    ((Setting)object).setValue(((String[])((Setting)object).IllIIlllllllIIlIIlIIIIlIl())[i + 1]);
                    ((Setting)object).setValue(((String[])((Setting)object).IllIIlllllllIIlIIlIIIIlIl())[i + 1]);
                    break;
                }
                this.lIIIIlIlIIlllllIIllIIlIII.IllIIlllllllIIlIIlIIIIlIl = "Clear Glass: " + (String)((Setting)object).getValue();
                this.lllllIlllIIllIlIIlIIIllII.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll();
            }
            if (class_11972 == this.lIlllIlllIlIIIIlllIlIlIIl) {
                ((Setting)object).setValue((Boolean)((Setting)(object = LunarClient.getInstance().getSettingsManager().rsRedString)).getValue() == false);
                this.lIlllIlllIlIIIIlllIlIlIIl.IllIIlllllllIIlIIlIIIIlIl = "Red String: " + ((Boolean)((Setting)object).getValue() != false ? "ON" : "OFF");
                this.lllllIlllIIllIlIIlIIIllII.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll();
            }
            if (class_11972 == this.IlIIlllllIIlIlIlllllIllll) {
                ((Setting)object).setValue((Boolean)((Setting)(object = LunarClient.getInstance().getSettingsManager().rsTransparentBg)).getValue() == false);
                this.IlIIlllllIIlIlIlllllIllll.IllIIlllllllIIlIIlIIIIlIl = "Background: " + ((Boolean)((Setting)object).getValue() != false ? "TRANSPARENT" : "NORMAL");
                this.lllllIlllIIllIlIIlIIIllII.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll();
            }
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 2) {
                object = this.lllllIlllIIllIlIIlIIIllII.IllllIIIIlIIlIIIIlllIIIIl().lIlllIlllIIIIlIIlllIllIII();
                String string = ((File)object).getAbsolutePath();
                if (class_0155.lllIIIllIIIIlllIlIIllIIll() == class_0344.lIlllIlllIIIIlIIlllIllIII) {
                    try {
                        lllIIIllIIIIlllIlIIllIIll.info(string);
                        Runtime.getRuntime().exec(new String[]{"/usr/bin/open", string});
                        return;
                    }
                    catch (IOException iOException) {
                        lllIIIllIIIIlllIlIIllIIll.error("Couldn't open file", (Throwable)iOException);
                    }
                } else if (class_0155.lllIIIllIIIIlllIlIIllIIll() == class_0344.IlIllllllIIlIIllllIIlIIIl) {
                    String string2 = String.format("cmd.exe /C start \"Open file\" \"%s\"", string);
                    try {
                        Runtime.getRuntime().exec(string2);
                        return;
                    }
                    catch (IOException iOException) {
                        lllIIIllIIIIlllIlIIllIIll.error("Couldn't open file", (Throwable)iOException);
                    }
                }
                boolean bl = false;
                try {
                    Class<?> class_ = Class.forName("java.awt.Desktop");
                    Object object2 = class_.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
                    class_.getMethod("browse", URI.class).invoke(object2, ((File)object).toURI());
                }
                catch (Throwable throwable) {
                    lllIIIllIIIIlllIlIIllIIll.error("Couldn't open link", throwable);
                    bl = true;
                }
                if (bl) {
                    lllIIIllIIIIlllIlIIllIIll.info("Opening via system class!");
                    Sys.openURL((String)("file://" + string));
                }
            } else if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 1) {
                if (this.IllIIlllllllIIlIIlIIIIlIl()) {
                    object = Lists.newArrayList();
                    for (Object object3 : this.lIlllIlllIIIIlIIlllIllIII) {
                        if (!(object3 instanceof class_0718)) continue;
                        ((ArrayList)object).add(((class_0718)object3).IIIllIllIIlIlIlIlIllllIIl());
                    }
                    Collections.reverse(object);
                    this.lllllIlllIIllIlIIlIIIllII.IllllIIIIlIIlIIIIlllIIIIl().lllIIIllIIIIlllIlIIllIIll((List)object);
                    this.lllllIlllIIllIlIIlIIIllII.gameSettings.resourcePacks.clear();
                    Iterator iterator = ((ArrayList)object).iterator();
                    while (iterator.hasNext()) {
                        Object object3;
                        object3 = (class_0025)iterator.next();
                        this.lllllIlllIIllIlIIlIIIllII.gameSettings.resourcePacks.add(((class_0025)object3).lIlllIlllIIIIlIIlllIllIII());
                    }
                    this.lllllIlllIIllIlIIlIIIllII.gameSettings.IlIllllllIIlIIllllIIlIIIl();
                    this.lllllIlllIIllIlIIlIIIllII.IlIIIIIllllllIIlllIllllll();
                    this.lIllllIIlIIIlIllllllIIIll.clear();
                    this.lIllllIIlIIIlIllllllIIIll.addAll(this.lIlllIlllIIIIlIIlllIllIII);
                }
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl);
            }
        }
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3) {
        super.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        if (this.lllllIlllIIllIlIIlIIIllII.theWorld != null && ((Boolean) LunarClient.getInstance().getSettingsManager().rsTransparentBg.getValue()).booleanValue()) {
            this.llIIlIllIllllIlIIIIlIIlll();
        } else {
            this.IlIllllllIIlIIllllIIlIIIl(0);
        }
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
        if (this.IIIllIIlIIIIIIlIlIIllIIlI.lllIlIIlIIIlIlIIIllIlllIl.isEmpty()) {
            String string = this.IIIllIllIIlIlIlIlIllllIIl.lllIlIIlIIIlIlIIIllIlllIl().isEmpty() ? "Discovering resource packs..." : "No resource packs found.";
            this.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, (Object)((Object) EnumChatFormatting.GRAY) + "" + (Object)((Object) EnumChatFormatting.ITALIC) + string, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, 60, 0xFFFFFF);
        }
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
        this.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, class_0616.lllIIIllIIIIlllIlIIllIIll("resourcePack.title", new Object[0]), this.IlIlIIlllIIlIllIIIlllllIl / 2, 16, 0xFFFFFF);
        this.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, class_0616.lllIIIllIIIIlllIlIIllIIll("resourcePack.folderInfo", new Object[0]), this.IlIlIIlllIIlIllIIIlllllIl / 2 - 77, this.lIIlIIIIIlIlllIlIIlIlIlll - 26, 0x808080);
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
        this.IIIllIllIIlIlIlIlIllllIIl.lIllllIIlIIIlIllllllIIIll();
        if (this.IIIllIllIIlIlIlIlIllllIIl.lllIlIIlIIIlIlIIIllIlllIl().isEmpty() && !this.IIIllIllIIlIlIlIlIllllIIl.IllIIIllIIIIlIlIlIllIIlll()) {
            this.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIllIIlIIlIIlIIlIIlIIll, (Object)((Object) EnumChatFormatting.GRAY) + "" + (Object)((Object) EnumChatFormatting.ITALIC) + "Search...", this.IlIlIIlllIIlIllIIIlllllIl / 2 - 200, this.lIIlIIIIIlIlllIlIIlIlIlll - 65, 0xFFFFFF);
        }
    }

    static /* synthetic */ List lllIIIllIIIIlllIlIIllIIll(class_2018 class_20182) {
        return class_20182.IlIllllllIIlIIllllIIlIIIl;
    }

    static /* synthetic */ List lllIIIllIIIIlllIlIIllIIll(class_2018 class_20182, List list) {
        class_20182.IlIIIIIllllllIIlllIllllll = list;
        return class_20182.IlIIIIIllllllIIlllIllllll;
    }

    static /* synthetic */ List lllIlIIlIIIlIlIIIllIlllIl(class_2018 class_20182) {
        return class_20182.IlIIIIIllllllIIlllIllllll;
    }

    static /* synthetic */ List IlIllllllIIlIIllllIIlIIIl(class_2018 class_20182) {
        return class_20182.lIlllIlllIIIIlIIlllIllIII;
    }

    static /* synthetic */ List lllIlIIlIIIlIlIIIllIlllIl(class_2018 class_20182, List list) {
        class_20182.lIllllIIlIIIlIllllllIIIll = list;
        return class_20182.lIllllIIlIIIlIllllllIIIll;
    }

    static /* synthetic */ List lIlllIlllIIIIlIIlllIllIII(class_2018 class_20182) {
        return class_20182.lIllllIIlIIIlIllllllIIIll;
    }

    static /* synthetic */ class_1249 IlIIIIIllllllIIlllIllllll(class_2018 class_20182) {
        return class_20182.llIIlIlIlllIIllIlIlllIllI;
    }

    static /* synthetic */ boolean lllIIIllIIIIlllIlIIllIIll(class_2018 class_20182, boolean bl) {
        class_20182.IllIIIllIIIIlIlIlIllIIlll = bl;
        return class_20182.IllIIIllIIIIlIlIlIllIIlll;
    }
}

