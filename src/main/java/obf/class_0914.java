package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.minecraft.util.ResourceLocation;
import com.moonsworth.lunar.client.config.Setting;
import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;

public class class_0914
extends class_1194 {
    private final int lllllIlllIIllIlIIlIIIllII;
    protected final List lllIIIllIIIIlllIlIIllIIll;
    private boolean IlIlIIlllIIlIllIIIlllllIl = false;
    private class_1096 lIIlIIIIIlIlllIlIIlIlIlll;
    public class_1194 lllIIlIIIllllllIIIIlIlIlI;
    public boolean IlIlllIIIIIIlIIllIIllIlll = false;
    public AbstractModule IlIlIIlIlIllIIlIlIIllIIIl = null;
    private class_0527 lIlIlIIlIIIIlIIIIIlllIIII = null;
    private class_0527 IlIIIlIIIIllIIIllIIIIIIll = null;
    private Map IIlllIlIlllIllIIIlllIIlIl;
    private List lIlIllIIlIIlIIlIIlIIlIIll;

    public class_0914(List list, float f, int n, int n2, int n3, int n4) {
        super(f, n, n2, n3, n4);
        this.IlIlIIlllIIlIllIIIlllllIl = list == LunarClient.getInstance().getModuleManager().staffModules;
        this.lllllIlllIIllIlIIlIIIllII = -12418828;
        this.lIIlIIIIIlIlllIlIIlIlIlll = new class_1096(this, this.lllllIlllIIllIlIIlIIIllII, f);
        this.lllIIIllIIIIlllIlIIllIIll = new ArrayList();
        for (Object object : list) {
            if (((AbstractModule)object).lIlllIlllIIIIlIIlllIllIII() && !((AbstractModule)object).IlIIIIIllllllIIlllIllllll()) continue;
            this.lllIIIllIIIIlllIlIIllIIll.add(new class_0129(this, this.lllllIlllIIllIlIIlIIIllII, (AbstractModule)object, f));
        }
        this.lIlIlIIlIIIIlIIIIIlllIIII = new class_0527(null, "arrow-64.png", this.lIlllIlllIIIIlIIlllIllIII + 2, this.IlIIIIIllllllIIlllIllllll + 4, 28, 28, -12418828, f);
        this.IlIlIIlIlIllIIlIlIIllIIIl = null;
        this.IIlllIlIlllIllIIIlllIIlIl = new HashMap();
        for (Object object : list) {
            if (((AbstractModule)object).lIlllIlllIIIIlIIlllIllIII() && !((AbstractModule)object).IlIIIIIllllllIIlllIllllll() || object == LunarClient.getInstance().getModuleManager().lIlllIlllIIIIlIIlllIllIII) continue;
            Object object2 = new ArrayList();
            for (Setting class_16092 : ((AbstractModule)object).llIIlllIllIllllIIIlIIIIII()) {
                switch (class_16092.IllIIIllIIIIlIlIlIllIIlll()) {
                    case lIllllIIlIIIlIllllllIIIll: {
                        object2.add(new class_0990(class_16092, f));
                        break;
                    }
                    case IlIIIIIllllllIIlllIllllll: 
                    case lIlllIlllIIIIlIIlllIllIII: 
                    case IlIllllllIIlIIllllIIlIIIl: {
                        if (((AbstractModule)object).lIlllIlllIIIIlIIlllIllIII() && class_16092 == ((class_2256)object).lllIIIllIIIIlllIlIIllIIll() || ((AbstractModule)object).lIlllIlllIIIIlIIlllIllIII() && class_16092 == ((AbstractModule)object).llIIlIlIlllIIllIlIlllIllI) break;
                        if (class_16092.IllIIIllIIIIlIlIlIllIIlll().equals((Object)class_1318.lIlllIlllIIIIlIIlllIllIII) && class_16092.getName().toLowerCase().contains("color")) {
                            object2.add(new class_1699(class_16092, f));
                            break;
                        }
                        object2.add(new class_0401(class_16092, f));
                        break;
                    }
                    case lllIlIIlIIIlIlIIIllIlllIl: {
                        object2.add(new class_2141(class_16092, f));
                        break;
                    }
                    case lllIIIllIIIIlllIlIIllIIll: {
                        if (!class_16092.getName().equalsIgnoreCase("label")) break;
                        object2.add(new class_0325(class_16092, f));
                    }
                }
            }
            if (((AbstractModule)object).lIlllIlllIIIIlIIlllIllIII()) {
                object2.add(new class_1388(((class_2256)object).lllIIIllIIIIlllIlIIllIIll(), f));
                if (object == LunarClient.getInstance().getModuleManager().lllllIlllIIllIlIIlIIIllII) {
                    object2.add(new class_1113(LunarClient.getInstance().getModuleManager().lllllIlllIIllIlIIlIIIllII.llIIlIllIllllIlIIIIlIIlll(), "net.minecraft.init.Blocks", f));
                }
            }
            this.IIlllIlIlllIllIIIlllIIlIl.put(object, object2);
        }
        this.lIlIllIIlIIlIIlIIlIIlIIll = new ArrayList();
        block15: for (Object object : LunarClient.getInstance().getSettingsManager().settingsList) {
            switch (((Setting)object).IllIIIllIIIIlIlIlIllIIlll()) {
                case lIllllIIlIIIlIllllllIIIll: {
                    if (object == LunarClient.getInstance().getSettingsManager().rsClearGlass) continue block15;
                    this.lIlIllIIlIIlIIlIIlIIlIIll.add(new class_0990((Setting)object, f));
                    break;
                }
                case IlIIIIIllllllIIlllIllllll: 
                case lIlllIlllIIIIlIIlllIllIII: 
                case IlIllllllIIlIIllllIIlIIIl: {
                    if (((Setting)object).IllIIIllIIIIlIlIlIllIIlll().equals((Object)class_1318.lIlllIlllIIIIlIIlllIllIII) && ((Setting)object).getName().toLowerCase().contains("color")) {
                        this.lIlIllIIlIIlIIlIIlIIlIIll.add(new class_1699((Setting)object, f));
                        break;
                    }
                    if (((Setting)object).getName().equals("World Time")) {
                        this.lIlIllIIlIIlIIlIIlIIlIIll.add(new class_0195((Setting)object, f));
                        break;
                    }
                    this.lIlIllIIlIIlIIlIIlIIlIIll.add(new class_0401((Setting)object, f));
                    break;
                }
                case lllIlIIlIIIlIlIIIllIlllIl: {
                    if (object == LunarClient.getInstance().getSettingsManager().rsClearGlass) continue block15;
                    this.lIlIllIIlIIlIIlIIlIIlIIll.add(new class_2141((Setting)object, f));
                    break;
                }
                case lllIIIllIIIIlllIlIIllIIll: {
                    if (!((Setting)object).getName().equalsIgnoreCase("label")) break;
                    this.lIlIllIIlIIlIIlIIlIIlIIll.add(new class_0325((Setting)object, f));
                    if (!((String) LunarClient.getInstance().getSettingsManager().lIlllIlllIIIIlIIlllIllIII().getValue()).equals(((Setting)object).getValue())) break;
                    this.lIlIllIIlIIlIIlIIlIIlIIll.add(new class_1208(f));
                }
            }
        }
        int n5 = 25;
        for (Object object2 : this.lIlIllIIlIIlIIlIIlIIlIIll) {
            n5 += ((class_2117)object2).lllIIIllIIIIlllIlIIllIIll();
        }
        this.IlIIIlIIIIllIIIllIIIIIIll = new class_0527(LunarClient.getInstance().ubuntuMedium16px, null, "Apply to all text", this.lIlllIlllIIIIlIIlllIllIII + n3 - 120, this.IlIIIIIllllllIIlllIllllll + n5 + 4, 110, 28, -12418828, f);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        class_0857.lllIIIllIIIIlllIlIIllIIll((double)this.lIlllIlllIIIIlIIlllIllIII, (double)this.IlIIIIIllllllIIlllIllllll, (double)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll), (double)(this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI + 2), 8.0, 0x40000000);
        this.lllIlIIlIIIlIlIIIllIlllIl(n, n2);
        if (this.IlIlIIlIlIllIIlIlIIllIIIl == null && !this.IlIlllIIIIIIlIIllIIllIlll) {
            this.IllIIIllIIIIlIlIlIllIIlll = 52;
            if (!this.IlIlIIlllIIlIllIIIlllllIl) {
                this.lIIlIIIIIlIlllIlIIlIlIlll.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII + 4, this.IlIIIIIllllllIIlllIllllll + 4, this.lIllllIIlIIIlIllllllIIIll - 12, 18);
                this.lIIlIIIIIlIlllIlIIlIlIlll.IlIllllllIIlIIllllIIlIIIl = this.IIIllIllIIlIlIlIlIllllIIl;
                this.lIIlIIIIIlIlllIlIIlIlIlll.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
            }
            for (int i = 0; i < this.lllIIIllIIIIlllIlIIllIIll.size(); ++i) {
                class_0129 class_01292 = (class_0129)this.lllIIIllIIIIlllIlIIllIIll.get(i);
                class_01292.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII + 4, this.IlIIIIIllllllIIlllIllllll + (this.IlIlIIlllIIlIllIIIlllllIl ? 4 : 24) + i * 20, this.lIllllIIlIIIlIllllllIIIll - 12, 18);
                class_01292.IlIllllllIIlIIllllIIlIIIl = this.IIIllIllIIlIlIlIlIllllIIl;
                class_01292.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
                this.IllIIIllIIIIlIlIlIllIIlll += class_01292.lllIIIllIIIIlllIlIIllIIll();
            }
        } else if (this.IlIlllIIIIIIlIIllIIllIlll && !this.IlIlIIlllIIlIllIIIlllllIl) {
            class_0210.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII + 32, this.IlIIIIIllllllIIlllIllllll + 4, this.lIlllIlllIIIIlIIlllIllIII + 33, this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI - 4, 0x2F2F2F2F);
            this.IllIIIllIIIIlIlIlIllIIlll = 25;
            this.lIlIlIIlIIIIlIIIIIlllIIII.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII + 2, this.IlIIIIIllllllIIlllIllllll + 2, 28, 28);
            this.lIlIlIIlIIIIlIIIIIlllIIII.IlIllllllIIlIIllllIIlIIIl = this.IIIllIllIIlIlIlIlIllllIIl;
            this.lIlIlIIlIIIIlIIIIIlllIIII.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
            LunarClient.getInstance().ubuntuMedium16px.lllIIIllIIIIlllIlIIllIIll("Settings | Shout out @strokedketchup @NonoTv_ | Cucklord.pro".toUpperCase(), this.lIlllIlllIIIIlIIlllIllIII + 38, (float)(this.IlIIIIIllllllIIlllIllllll + 6), Color.WHITE.getRGB());
            class_0210.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII + 38, this.IlIIIIIllllllIIlllIllllll + 17, this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 6, this.IlIIIIIllllllIIlllIllllll + 18, 0x2F2F2F2F);
            int n3 = 0;
            for (class_2117 class_21172 : this.lIlIllIIlIIlIIlIIlIIlIIll) {
                class_21172.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII + 38, this.IlIIIIIllllllIIlllIllllll + 22 + n3, this.lIllllIIlIIIlIllllllIIIll - 40, class_21172.lllIIIllIIIIlllIlIIllIIll());
                class_21172.IlIllllllIIlIIllllIIlIIIl = this.IIIllIllIIlIlIlIlIllllIIl;
                class_21172.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
                n3 += 2 + class_21172.lllIIIllIIIIlllIlIIllIIll();
                this.IllIIIllIIIIlIlIlIllIIlll += 2 + class_21172.lllIIIllIIIIlllIlIIllIIll();
            }
            this.IlIIIlIIIIllIIIllIIIIIIll.IlIllllllIIlIIllllIIlIIIl = this.IIIllIllIIlIlIlIlIllllIIl;
            this.IlIIIlIIIIllIIIllIIIIIIll.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 118, this.IlIIIIIllllllIIlllIllllll + this.IllIIIllIIIIlIlIlIllIIlll, 100, 20);
            this.IlIIIlIIIIllIIIllIIIIIIll.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
            this.IllIIIllIIIIlIlIlIllIIlll += 24;
        } else {
            class_0210.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII + 32, this.IlIIIIIllllllIIlllIllllll + 4, this.lIlllIlllIIIIlIIlllIllIII + 33, this.IlIIIIIllllllIIlllIllllll + (this.IIIllIIlIIIIIIlIlIIllIIlI > this.IllIIIllIIIIlIlIlIllIIlll ? this.IIIllIIlIIIIIIlIlIIllIIlI : this.IllIIIllIIIIlIlIlIllIIlll) - 4, 0x2F2F2F2F);
            this.IllIIIllIIIIlIlIlIllIIlll = 37;
            this.lIlIlIIlIIIIlIIIIIlllIIII.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII + 2, this.IlIIIIIllllllIIlllIllllll + 2, 28, 28);
            this.lIlIlIIlIIIIlIIIIIlllIIII.IlIllllllIIlIIllllIIlIIIl = this.IIIllIllIIlIlIlIlIllllIIl;
            this.lIlIlIIlIIIIlIIIIIlllIIII.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
            LunarClient.getInstance().ubuntuMedium16px.lllIIIllIIIIlllIlIIllIIll((this.IlIlIIlIlIllIIlIlIIllIIIl.IIIllIIlIIIIIIlIlIIllIIlI() + " Settings").toUpperCase(), this.lIlllIlllIIIIlIIlllIllIII + 38, (float)(this.IlIIIIIllllllIIlllIllllll + 6), Color.WHITE.getRGB());
            class_0210.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII + 38, this.IlIIIIIllllllIIlllIllllll + 17, this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 12, this.IlIIIIIllllllIIlllIllllll + 18, 0x2F2F2F2F);
            if (this.IlIlIIlIlIllIIlIlIIllIIIl == LunarClient.getInstance().getModuleManager().lIlllIlllIIIIlIIlllIllIII) {
                try {
                    String string = Keyboard.getKeyName((int) LunarClient.getInstance().getModuleManager().lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll().lllIlIIlIIIlIlIIIllIlllIl().llllllIlIllllIlIlIlIIIIlI.IIIllIllIIlIlIlIlIllllIIl());
                    LunarClient.getInstance().ubuntuMedium16px.lllIIIllIIIIlllIlIIllIIll(("PRESS '" + string + "' INGAME FOR ZAN'S MINIMAP OPTIONS.").toUpperCase(), this.lIlllIlllIIIIlIIlllIllIII + 38, (float)(this.IlIIIIIllllllIIlllIllllll + 22), Color.LIGHT_GRAY.getRGB());
                }
                catch (Exception exception) {
                    LunarClient.getInstance().ubuntuMedium16px.lllIIIllIIIIlllIlIIllIIll("PRESS 'M' INGAME FOR ZAN'S MINIMAP OPTIONS.".toUpperCase(), this.lIlllIlllIIIIlIIlllIllIII + 38, (float)(this.IlIIIIIllllllIIlllIllllll + 22), Color.LIGHT_GRAY.getRGB());
                }
                this.IlIllllllIIlIIllllIIlIIIl(n, n2);
                return;
            }
            if (this.IlIlIIlIlIllIIlIlIIllIIIl.llIIlllIllIllllIIIlIIIIII().isEmpty()) {
                LunarClient.getInstance().ubuntuMedium16px.lllIIIllIIIIlllIlIIllIIll((this.IlIlIIlIlIllIIlIlIIllIIIl.IIIllIIlIIIIIIlIlIIllIIlI().toUpperCase() + " DOES NOT HAVE ANY OPTIONS.").toUpperCase(), this.lIlllIlllIIIIlIIlllIllIII + 38, (float)(this.IlIIIIIllllllIIlllIllllll + 22), Color.LIGHT_GRAY.getRGB());
            }
            int n4 = 0;
            for (class_2117 class_21173 : (List)this.IIlllIlIlllIllIIIlllIIlIl.get(this.IlIlIIlIlIllIIlIlIIllIIIl)) {
                class_21173.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII + 38, this.IlIIIIIllllllIIlllIllllll + 22 + n4, this.lIllllIIlIIIlIllllllIIIll - 40, class_21173.lllIIIllIIIIlllIlIIllIIll());
                class_21173.IlIllllllIIlIIllllIIlIIIl = this.IIIllIllIIlIlIlIlIllllIIl;
                class_21173.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
                n4 += 2 + class_21173.lllIIIllIIIIlllIlIIllIIll();
                this.IllIIIllIIIIlIlIlIllIIlll += 2 + class_21173.lllIIIllIIIIlllIlIIllIIll();
            }
        }
        this.IlIllllllIIlIIllllIIlIIIl(n, n2);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        block13: {
            block14: {
                block12: {
                    if (this.IlIlIIlIlIllIIlIlIIllIIIl != null || this.IlIlllIIIIIIlIIllIIllIlll) break block12;
                    if (this.lIIlIIIIIlIlllIlIIlIlIlll.lllIIIllIIIIlllIlIIllIIll(n, n2) && !this.IlIlIIlllIIlIllIIIlllllIl) {
                        Minecraft.getMinecraft().IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
                        this.IlIlllIIIIIIlIIllIIllIlll = true;
                        this.IIIllIllIIlIlIlIlIllllIIl = 0;
                        this.IllIIlllllllIIlIIlIIIIlIl = 0.0;
                        this.IlIllllllIIlIIllllIIlIIIl = 0;
                    } else {
                        for (class_0129 class_01292 : this.lllIIIllIIIIlllIlIIllIIll) {
                            if (!class_01292.lllIIIllIIIIlllIlIIllIIll(n, n2) || !this.lllIIIllIIIIlllIlIIllIIll(class_01292.lllIIIllIIIIlllIlIIllIIll)) continue;
                            class_01292.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
                        }
                    }
                    break block13;
                }
                if (!this.lIlIlIIlIIIIlIIIIIlllIIII.lllIIIllIIIIlllIlIIllIIll(n, n2)) break block14;
                Minecraft.getMinecraft().IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
                this.IlIlIIlIlIllIIlIlIIllIIIl = null;
                this.IlIlllIIIIIIlIIllIIllIlll = false;
                if (this.lllIIlIIIllllllIIIIlIlIlI == null) break block13;
                class_0822.lllIIIllIIIIlllIlIIllIIll.IllIIIllIIIIlIlIlIllIIlll = this.lllIIlIIIllllllIIIIlIlIlI;
                break block13;
            }
            if (this.IlIlIIlIlIllIIlIlIIllIIIl != null && this.IIlllIlIlllIllIIIlllIIlIl.containsKey(this.IlIlIIlIlIllIIlIlIIllIIIl)) {
                for (class_2117 class_21172 : (List)this.IIlllIlIlllIllIIIlllIIlIl.get(this.IlIlIIlIlIllIIlIlIIllIIIl)) {
                    if (!class_21172.lllIIIllIIIIlllIlIIllIIll(n, n2)) continue;
                    class_21172.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
                }
            } else if (this.IlIlllIIIIIIlIIllIIllIlll) {
                if (this.IlIIIlIIIIllIIIllIIIIIIll.lllIIIllIIIIlllIlIIllIIll(n, n2)) {
                    for (AbstractModule class_16652 : LunarClient.getInstance().getModuleManager().modules) {
                        for (Setting class_16092 : class_16652.llIIlllIllIllllIIIlIIIIII()) {
                            if (class_16092.IllIIIllIIIIlIlIlIllIIlll() != class_1318.lIlllIlllIIIIlIIlllIllIII || !class_16092.getName().toLowerCase().contains("color") || class_16092.getName().toLowerCase().contains("background")) continue;
                            Minecraft.getMinecraft().IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
                            class_16092.setValue(LunarClient.getInstance().getSettingsManager().coDefaultColor.getValue());
                        }
                    }
                } else {
                    for (class_2117 class_21173 : this.lIlIllIIlIIlIIlIIlIIlIIll) {
                        if (!class_21173.lllIIIllIIIIlllIlIIllIIll(n, n2)) continue;
                        class_21173.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
                    }
                }
            }
        }
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(AbstractModule class_16652) {
        return !class_16652.llIIlllIllIllllIIIlIIIIII().isEmpty() || class_16652.IIIllIIlIIIIIIlIlIIllIIlI().contains("Zans");
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(AbstractModule class_16652) {
        Minecraft.getMinecraft().IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
        this.IIIllIllIIlIlIlIlIllllIIl = 0;
        this.IllIIlllllllIIlIIlIIIIlIl = 0.0;
        this.IlIllllllIIlIIllllIIlIIIl = 0;
        this.IlIlIIlIlIllIIlIlIIllIIIl = class_16652;
        this.lllIIlIIIllllllIIIIlIlIlI = null;
    }
}

