package net.minecraft.client.settings;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.primitives.Ints
 *  com.google.gson.Gson
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.Display
 */
import com.google.common.collect.Maps;
import com.google.common.primitives.Ints;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.client.Minecraft;
import net.minecraft.util.MathHelper;
import obf.*;
import optifine.Config;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;

public class GameSettings {
    private static final Logger IIIIIlIIIIIllIIllIlIlIlIl = LogManager.getLogger();
    private static final Gson gson = new Gson();
    private static final ParameterizedType typeListString = new class_2073();
    private static final String[] IIIIlIIIIIIIllIlllIIlllII = new String[]{"options.guiScale.auto", "options.guiScale.small", "options.guiScale.normal", "options.guiScale.large"};
    private static final String[] IIllllllllIlllIIllllllllI = new String[]{"options.particles.all", "options.particles.decreased", "options.particles.minimal"};
    private static final String[] lIlIIlIIllIllllllIIIIlllI = new String[]{"options.ao.off", "options.ao.min", "options.ao.max"};
    private static final String[] lIllIllllIlIlIIlIllIlIIlI = new String[]{"options.stream.compression.low", "options.stream.compression.medium", "options.stream.compression.high"};
    private static final String[] lllIllllllIIlIIllllIIllIl = new String[]{"options.stream.chat.enabled.streaming", "options.stream.chat.enabled.always", "options.stream.chat.enabled.never"};
    private static final String[] IIIllllllIlIlllIlIlIIIIll = new String[]{"options.stream.chat.userFilter.all", "options.stream.chat.userFilter.subs", "options.stream.chat.userFilter.mods"};
    private static final String[] IIIIIIIllllllIIIIllIIIIII = new String[]{"options.stream.mic_toggle.mute", "options.stream.mic_toggle.talk"};
    public float lllIIIllIIIIlllIlIIllIIll = 0.5f;
    public boolean lllIlIIlIIIlIlIIIllIlllIl;
    public int IlIllllllIIlIIllllIIlIIIl = -1;
    public boolean lIlllIlllIIIIlIIlllIllIII = true;
    public boolean IlIIIIIllllllIIlllIllllll;
    public boolean lIllllIIlIIIlIllllllIIIll;
    public boolean IIIllIIlIIIIIIlIlIIllIIlI = true;
    public int IllIIlllllllIIlIIlIIIIlIl = 120;
    public boolean IIIllIllIIlIlIlIlIllllIIl = true;
    public int IllIIIllIIIIlIlIlIllIIlll = 2;
    public int lIIIIlIlIIlllllIIllIIlIII = 1;
    public float llIIlllIllIllllIIIlIIIIII = 0.8f;
    public int llIIllIllIlIIlIIllIllllll = 0;
    public boolean lllIIlIIIllllllIIIIlIlIlI = false;
    public int IlIlllIIIIIIlIIllIIllIlll = 0;
    public boolean IlIlIIlIlIllIIlIlIIllIIIl = false;
    public boolean lllllIlllIIllIlIIlIIIllII = false;
    public boolean IlIlIIlllIIlIllIIIlllllIl = Config.lIIllIlIllIlIlIIlIlIIIIll();
    public boolean lIIlIIIIIlIlllIlIIlIlIlll = Config.lIIllIlIllIlIlIIlIlIIIIll();
    public float lIlIlIIlIIIIlIIIIIlllIIII = 1.0f;
    public int IlIIIlIIIIllIIIllIIIIIIll = 0;
    public int IIlllIlIlllIllIIIlllIIlIl = 0;
    public float lIlIllIIlIIlIIlIIlIIlIIll = 0.0f;
    public int llIIlIllIllllIlIIIIlIIlll = 0;
    public int llIllllIlIllIIIlIllIIlIlI = 0;
    public int lIlllIlllIlIIIIlllIlIlIIl = 0;
    public int IlIIlllllIIlIlIlllllIllll = 0;
    public int llIIlIlIlllIIllIlIlllIllI = 0;
    public int IllIIIIllIIllIllIlllIlIIl = 3;
    public int IIIIIIIIlIllIIllIIlllIllI = 4000;
    public boolean IIlIIlIlIlIllIIlIlIIIIlll = false;
    public boolean llIIIlllIlllIlIllIIIIllIl = false;
    public boolean IIIIlIllIlIIlIIlIllIlIlll = false;
    public boolean IlIlIIlllIllllllllIIIlIlI = true;
    public boolean llllIIIIlIIIlIIIIIIlIllll = true;
    public boolean llIIIIllIIIIIIIlIIIlIIIIl = true;
    public boolean IIllIllIIllIIlllIIIlIlllI = true;
    public int llllllIlIllllIlIlIlIIIIlI = 0;
    public int lIlIIllllIlIIIIllIIIIlIIl = 1;
    public int llIlllIIllIlllIlIlIlIIIll = 0;
    public boolean IIIIlIIlIIIllIIIIllIIIlII = false;
    public int lllIIIIIIlIlllIIlIlIIIllI = 0;
    public boolean llIIlIIllIIllIlIIllIIllII = false;
    public boolean lIlIlIIIIIIlIIllllIlIIllI = true;
    public boolean IllllIIIIlIIlIIIIlllIIIIl = false;
    public String llllIlIIIIIIIIIlllIIlIIIl = "Default";
    public boolean IIIIlIlIIlIIIIlIlllIlIIII = true;
    public boolean lllIIIIlIlIIlIIlllIIIIIIl = true;
    public boolean llIlIIlllIIIIIllIIlIlIIII = true;
    public boolean IllIIIlllllIlIlllIlllllII = true;
    public boolean llIlllIlIIllIlIIIIllIIlIl = true;
    public boolean lIIIllIIIIIllllIlIlIllIll = true;
    public boolean lIIIlIIIlIlllIllIIIlIIIlI = true;
    public int lIIlIlllIllIlIlllIIIIIIII = 2;
    public boolean IIlIllIIlllllIIlIIllllIIl = false;
    public boolean IllllIIlIIIllIlllIlllIllI = false;
    public boolean IllIlIlIIIlllIIllIIIIlIll = false;
    public int IlIIIlIllIIIllIIIIlIIlIll = 2;
    public boolean llllIIllIlIlllllllIIlIIlI = true;
    public int IlllIIlllllllIIllIlIllllI = 3;
    public int IlllIIIllllIIllIllIlIIlIl = 0;
    public int lllIIIlIIlIlIllIIIIIlIIll = 0;
    public boolean IIIlIlIllIlllllIlIllllllI = true;
    public boolean IIIIlIllIlIIIIIllllIIlllI = true;
    public boolean llllIlIIllIIlllllIIllIIll = true;
    public boolean IlIlIllIIlIIIIlllIlIllIlI = true;
    public boolean IlIIllIlIlIllIIIlIIlIlIIl = true;
    public boolean lIlIIllIllIIIIIlIllllIIIl = true;
    public boolean lIlllIIllIIIIIIlIlIIlIllI = true;
    public boolean llIIIlIlIlIIlIllIIIllIlIl = true;
    public boolean lIIlIIlIllIlIIlIlIIlIlIlI = true;
    public boolean llIIIIIlIIlIIIIllIIIlIIII = true;
    public boolean lIlIlIIllIIIlllIllIIlIllI = true;
    public boolean IlIIIIIllIlllIIIIlIIIllIl = true;
    public boolean lIIlIlIIllIIIlIIlIlIIIlII = true;
    public boolean lIIIlIIllIllIIlIIlIIIllII = true;
    public boolean lIlIllIIllIIIIlllIlIlllIl = true;
    public static final int IlIIIlIIlllllIIIllIlIlIll = 0;
    public static final int lIIllllllllIlIllllllllIlI = 1;
    public static final int lIIIIllIIllIIIlIIIllIllII = 2;
    public static final int lIIllIIlIIIlllIlllIIlIIlI = 3;
    public static final int IllIIllIlIlllIllIllIlIIIl = 0;
    public static final int IIIlIllllIIIlllllIllIlIII = 1;
    public static final int IIIIIllIlIllIlIlIIlIllIIl = 2;
    public static final int lIIllIlIIlIIlllllIlIIllIl = 0;
    public static final int lIIlllIIlIlIlIIIlIlllIIll = 1;
    public static final int IlIIlIIlllllIlIIlIlIlIlIl = 2;
    public static final String lIlIIIllIIllIIlIllllllIll = "Default";
    public class_1335 lIlIIlllllIlllllIlIIIllll;
    public File lllllllIlIIlIlIIIlIlIIlll;
    public boolean llIllllIIIIIlIIlIlllIIlll = true;
    public List<String> resourcePacks = new ArrayList<>();
    public class_1210 IIIIIIlIIIIIIIIIIlIlIlIlI = class_1210.lllIIIllIIIIlllIlIIllIIll;
    public boolean IllIlllIIIlllllIllIIlIlIl = true;
    public boolean IllIIIIlIIlllllllllIlIlII = true;
    public boolean IIIlllIlIIllIIlIlIllIlIIl = true;
    public float llllIIIlIlIlIlIIlIIIIIlIl = 1.0f;
    public boolean llIIIlIIllIIllIllIIlIlllI = true;
    public boolean lIIIIlIlIlIIIlIIllIIlIlIl;
    public boolean lllllIllllIIIIllIIlIlIlII = true;
    public boolean lIIllIlIllIlIlIIlIlIIIIll;
    public boolean lIIllllIllIlllllIIllIllIl;
    public boolean IIIIIlllIIllllIlllIlllIIl = true;
    public boolean llllIIllllIllIlllllIIlIlI = true;
    public boolean IllIlIlIIIlIllIlIlIIlllII;
    public int overrideWidth;
    public int overrideHeight;
    public boolean lIIlIlllIIlIIIIlIlIIIIlll = true;
    public float IIIlIIllIIlIlIIlIIllIIIIl = 1.0f;
    public float IIIIlIIIllIIIlIIlIIIIIlll = 1.0f;
    public float lIIIIIlIllIllIlIlIIllllll = 0.44366196f;
    public float lIIIlllIlIIIlIllIIIlIllll = 1.0f;
    public boolean IlIIIIIIIIIIlIIlllIIIlIlI = true;
    public int llIllIllIllIlIlIllIlIIIIl = 4;
    public int anisotropicFiltering = 1;
    private Map lIIIIIIIlllIllIlIlIlIllII = Maps.newEnumMap(class_0617.class);
    public float llIllIlllIllIlIIIIlIIlIII = 0.5f;
    public float IlllIIIlIIlIIIIllllIllllI = 1.0f;
    public float llIlIIIlllIIIllIllllIIIll = 1.0f;
    public float lIIlllIIIlIIlIllIIIIIlIlI = 0.5412844f;
    public float lllIlIIllllIIllIIIIllIlIl = 0.31690142f;
    public int IllIIIIIllIlIIllIllllllIl = 1;
    public boolean IIIlllllIIIIIllIllIIIIllI = true;
    public String IlIIIIIIllIIlIllIIllIllIl = "";
    public int IlIIllIIIlIlIlIIlIlIllIIl = 0;
    public int IIllIIIlIIllllIIIIIIIIlll = 0;
    public int lIIIlIllllIlllIIIIIllIIIl = 0;
    public class_1335 lllIIIlllIlllIIlIllllIIlI = new class_1335("key.forward", 17, "key.categories.movement");
    public class_1335 lIIlIlllIIlllIIlllIIlIlII = new class_1335("key.left", 30, "key.categories.movement");
    public class_1335 lIIlIIIlIlIIlllIlIllIllIl = new class_1335("key.back", 31, "key.categories.movement");
    public class_1335 lIIlIlIIIIIllIIIIllIlIlII = new class_1335("key.right", 32, "key.categories.movement");
    public class_1335 lIIIIlIIIIllIlIIllllIlIII = new class_1335("key.jump", 57, "key.categories.movement");
    public class_1335 lIIIlllllllIlllIIllllllll = new class_1335("key.sneak", 42, "key.categories.movement");
    public class_1335 IIllllIIlIlIlIlllIIIllIIl = new class_1335("key.inventory", 18, "key.categories.inventory");
    public class_1335 IIIllIIIlIlllllllIIIlllll = new class_1335("key.use", -99, "key.categories.gameplay");
    public class_1335 lIlIlllIllllIIlllIlllIIIl = new class_1335("key.drop", 16, "key.categories.gameplay");
    public class_1335 lIlIllllIlIIIIIllIIIIlIlI = new class_1335("key.attack", -100, "key.categories.gameplay");
    public class_1335 IIlllllIIlIIlIlIIlIIlIlII = new class_1335("key.pickItem", -98, "key.categories.gameplay");
    public class_1335 IIlIlIIIIlIlllIlIlIIIIIlI = new class_1335("key.sprint", 29, "key.categories.gameplay");
    public class_1335 IlIlIIllIlIlIIIIIlIlllllI = new class_1335("key.chat", 20, "key.categories.multiplayer");
    public class_1335 lIlIIIlIlIllIlIlIIIlIlIII = new class_1335("key.playerlist", 15, "key.categories.multiplayer");
    public class_1335 lIllIIlIlllIllIlIlIlIllII = new class_1335("key.command", 53, "key.categories.multiplayer");
    public class_1335 IIIIIllIIlIlIlIIlIlIlIllI = new class_1335("key.screenshot", 60, "key.categories.misc");
    public class_1335 lIlIIlIIlIIIIllIIlIllIlll = new class_1335("key.togglePerspective", 63, "key.categories.misc");
    public class_1335 lIIlIlIlIlIllIIlIIllllIll = new class_1335("key.smoothCamera", 0, "key.categories.misc");
    public class_1335 lllIlllllIllIlIIlIlIIIlll = new class_1335("key.fullscreen", 87, "key.categories.misc");
    public class_1335[] llllIllIIIlIllIllllllIlIl = new class_1335[]{new class_1335("key.hotbar.1", 2, "key.categories.inventory"), new class_1335("key.hotbar.2", 3, "key.categories.inventory"), new class_1335("key.hotbar.3", 4, "key.categories.inventory"), new class_1335("key.hotbar.4", 5, "key.categories.inventory"), new class_1335("key.hotbar.5", 6, "key.categories.inventory"), new class_1335("key.hotbar.6", 7, "key.categories.inventory"), new class_1335("key.hotbar.7", 8, "key.categories.inventory"), new class_1335("key.hotbar.8", 9, "key.categories.inventory"), new class_1335("key.hotbar.9", 10, "key.categories.inventory")};
    public class_1335[] llIlllllIIlIIlIIllllIllll = (class_1335[])ArrayUtils.addAll((Object[])new class_1335[]{this.lIlIllllIlIIIIIllIIIIlIlI, this.IIIllIIIlIlllllllIIIlllll, this.lllIIIlllIlllIIlIllllIIlI, this.lIIlIlllIIlllIIlllIIlIlII, this.lIIlIIIlIlIIlllIlIllIllIl, this.lIIlIlIIIIIllIIIIllIlIlII, this.lIIIIlIIIIllIlIIllllIlIII, this.lIIIlllllllIlllIIllllllll, this.lIlIlllIllllIIlllIlllIIIl, this.IIllllIIlIlIlIlllIIIllIIl, this.IlIlIIllIlIlIIIIIlIlllllI, this.lIlIIIlIlIllIlIlIIIlIlIII, this.IIlllllIIlIIlIlIIlIIlIlII, this.lIllIIlIlllIllIlIlIlIllII, this.IIIIIllIIlIlIlIIlIlIlIllI, this.lIlIIlIIlIIIIllIIlIllIlll, this.lIIlIlIlIlIllIIlIIllllIll, this.IIlIlIIIIlIlllIlIlIIIIIlI, this.lllIlllllIllIlIIlIlIIIlll}, (Object[])this.llllIllIIIlIllIllllllIlIl);
    protected Minecraft lIllIlIlIIIIlIlIIlIlIlllI;
    public File lllIIIlIllIlllIlIIllIllIl;
    public class_1999 IIlIlIIIIlIlllIIlIIlIIIII = class_1999.IlIllllllIIlIIllllIIlIIIl;
    public boolean lIllIIlllIIIlIlIIIlllIlIl;
    public int IIlIlIlIIlllIIIlIIIIlIIIl;
    public boolean showDebugInfo;
    public boolean IlIllIIIIllllIIllIllIIIIl;
    public String lIlIlIIllIlIIIIIlIIlllIlI = "";
    public boolean llllIllllllIllIIIlIlIIllI;
    public boolean IIlIlIIIlIIllIlIlIlIlIIll;
    public boolean IIIIlllllIlllIIllIIIlIllI;
    public float IlIlIIlllIIlIlllllIlIIIIl = 1.0f;
    public float IIllllllIIllIlIllllIIIlll = 1.0f;
    public float llllIIIllIllIIIllIlIIIIIl = 70.0f;
    private float lIIIlIllIlIIlIIIllIIlIlll;
    public float lIlIllIIIlIlIlIlIIIllllll;
    public int IllIIIIIllIIlllIlIIIlIlll;
    public int IllIlIIllIIllIlIIlIllIlIl;
    public String IllIIlIIlIIIIlIlIlIIlIlIl = "en_US";
    public boolean lllIlIlIIIlIllllIlllIlIlI = false;

    public float lllIIIllIIIIlllIlIIllIIll() {
        return (Boolean) LunarClient.getInstance().getSettingsManager().IlIlIIlllIIlIllIIIlllllIl.lIlllIlllIIIIlIIlllIllIII() != false && (Boolean) LunarClient.getInstance().getSettingsManager().lIlIlIIlIIIIlIIIIIlllIIII.lIlllIlllIIIIlIIlllIllIII() != false ? 100.0f : this.lIIIlIllIlIIlIIIllIIlIlll;
    }

    public GameSettings(Minecraft class_06672, File file) {
        this.lIllIlIlIIIIlIlIIlIlIlllI = class_06672;
        this.lllIIIlIllIlllIlIIllIllIl = new File(file, "options.txt");
        this.lllllllIlIIlIlIIIlIlIIlll = new File(file, "optionsof.txt");
        this.IllIIlllllllIIlIIlIIIIlIl = (int) Options.IllIIIllIIIIlIlIlIllIIlll.getValueMax();
        this.lIlIIlllllIlllllIlIIIllll = new class_1335("Zoom", 29, "key.categories.misc");
        this.llIlllllIIlIIlIIllllIllll = (class_1335[])ArrayUtils.add((Object[])this.llIlllllIIlIIlIIllllIllll, (Object)this.lIlIIlllllIlllllIlIIIllll);
        Options.RENDER_DISTANCE.setValueMax(32.0f);
        this.IlIllllllIIlIIllllIIlIIIl = class_06672.lllIIIIlIlIIlIIlllIIIIIIl() ? 12 : 8;
        this.lllIlIIlIIIlIlIIIllIlllIl();
        Config.lllIIIllIIIIlllIlIIllIIll(this);
    }

    public static String lllIIIllIIIIlllIlIIllIIll(int n) {
        return n < 0 ? class_0616.lllIIIllIIIIlllIlIIllIIll("key.mouseButton", n + 101) : (Objects.equals(Keyboard.getKeyName((int)n), "LMENU") ? "ALT" : Keyboard.getKeyName((int)n));
    }

    public static boolean lllIIIllIIIIlllIlIIllIIll(class_1335 class_13352) {
        return class_13352.IIIllIllIIlIlIlIlIllllIIl() == 0 ? false : (class_13352.IIIllIllIIlIlIlIlIllllIIl() < 0 ? Mouse.isButtonDown((int)(class_13352.IIIllIllIIlIlIlIlIllllIIl() + 100)) : Keyboard.isKeyDown((int)class_13352.IIIllIllIIlIlIlIlIllllIIl()));
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1335 class_13352, int n) {
        class_13352.lllIlIIlIIIlIlIIIllIlllIl(n);
        this.IlIllllllIIlIIllllIIlIIIl();
    }

    public void lllIIIllIIIIlllIlIIllIIll(Options class_07282, float f) {
        int n;
        if (class_07282 == Options.lIIIllIIIIIllllIlIlIllIll) {
            this.lIlIllIIlIIlIIlIIlIIlIIll = f;
        }
        if (class_07282 == Options.IlllIIIllllIIllIllIlIIlIl) {
            this.lIlIlIIlIIIIlIIIIIlllIIII = f;
            this.lIllIlIlIIIIlIlIIlIlIlllI.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll();
        }
        if (class_07282 == Options.SENSITIVITY) {
            this.lllIIIllIIIIlllIlIIllIIll = f;
        }
        if (class_07282 == Options.FOV) {
            this.llllIIIllIllIIIllIlIIIIIl = f;
        }
        if (class_07282 == Options.GAMMA) {
            this.lIIIlIllIlIIlIIIllIIlIlll = f;
        }
        if (class_07282 == Options.IllIIIllIIIIlIlIlIllIIlll) {
            this.IllIIlllllllIIlIIlIIIIlIl = (int)f;
            this.lllllIllllIIIIllIIlIlIlII = false;
            if (this.IllIIlllllllIIlIIlIIIIlIl <= 0) {
                this.IllIIlllllllIIlIIlIIIIlIl = (int) Options.IllIIIllIIIIlIlIlIllIIlll.getValueMax();
                this.lllllIllllIIIIllIIlIlIlII = true;
            }
            this.IIIllIllIIlIlIlIlIllllIIl();
        }
        if (class_07282 == Options.IlIIIlIIIIllIIIllIIIIIIll) {
            this.llllIIIlIlIlIlIIlIIIIIlIl = f;
            this.lIllIlIlIIIIlIlIIlIlIlllI.IlIIIlIIIIllIIIllIIIIIIll.lllIlIIlIIIlIlIIIllIlllIl().lllIlIIlIIIlIlIIIllIlllIl();
        }
        if (class_07282 == Options.CHAT_HEIGHT_FOCUSED) {
            this.lIIIlllIlIIIlIllIIIlIllll = f;
            this.lIllIlIlIIIIlIlIIlIlIlllI.IlIIIlIIIIllIIIllIIIIIIll.lllIlIIlIIIlIlIIIllIlllIl().lllIlIIlIIIlIlIIIllIlllIl();
        }
        if (class_07282 == Options.CHAT_HEIGHT_UNFOCUSED) {
            this.lIIIIIlIllIllIlIlIIllllll = f;
            this.lIllIlIlIIIIlIlIIlIlIlllI.IlIIIlIIIIllIIIllIIIIIIll.lllIlIIlIIIlIlIIIllIlllIl().lllIlIIlIIIlIlIIIllIlllIl();
        }
        if (class_07282 == Options.CHAT_WIDTH) {
            this.IIIIlIIIllIIIlIIlIIIIIlll = f;
            this.lIllIlIlIIIIlIlIIlIlIlllI.IlIIIlIIIIllIIIllIIIIIIll.lllIlIIlIIIlIlIIIllIlllIl().lllIlIIlIIIlIlIIIllIlllIl();
        }
        if (class_07282 == Options.CHAT_SCALE) {
            this.IIIlIIllIIlIlIIlIIllIIIIl = f;
            this.lIllIlIlIIIIlIlIIlIlIlllI.IlIIIlIIIIllIIIllIIIIIIll.lllIlIIlIIIlIlIIIllIlllIl().lllIlIIlIIIlIlIIIllIlllIl();
        }
        if (class_07282 == Options.ANISOTROPIC_FILTERING) {
            n = this.anisotropicFiltering;
            this.anisotropicFiltering = (int)f;
            if ((float)n != f) {
                this.lIllIlIlIIIIlIlIIlIlIlllI.IIIIlIlIIlIIIIlIlllIlIIII().lllIlIIlIIIlIlIIIllIlllIl(this.anisotropicFiltering);
                this.lIllIlIlIIIIlIlIIlIlIlllI.IllIIIIllIIllIllIlllIlIIl();
            }
        }
        if (class_07282 == Options.MIPMAP_LEVELS) {
            n = this.llIllIllIllIlIlIllIlIIIIl;
            this.llIllIllIllIlIlIllIlIIIIl = (int)f;
            if ((float)n != f) {
                this.lIllIlIlIIIIlIlIIlIlIlllI.IIIIlIlIIlIIIIlIlllIlIIII().lllIIIllIIIIlllIlIIllIIll(this.llIllIllIllIlIlIllIlIIIIl);
                this.lIllIlIlIIIIlIlIIlIlIlllI.IllIIIIllIIllIllIlllIlIIl();
            }
        }
        if (class_07282 == Options.RENDER_DISTANCE) {
            this.IlIllllllIIlIIllllIIlIIIl = (int)f;
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(Options class_07282, int n) {
        int n2;
        Object object;
        if (class_07282 == Options.IllllIIIIlIIlIIIIlllIIIIl) {
            switch (this.lIIIIlIlIIlllllIIllIIlIII) {
                case 1: {
                    this.lIIIIlIlIIlllllIIllIIlIII = 2;
                    if (Config.IlIIIIIllllllIIlllIllllll()) break;
                    this.lIIIIlIlIIlllllIIllIIlIII = 3;
                    break;
                }
                case 2: {
                    this.lIIIIlIlIIlllllIIllIIlIII = 3;
                    break;
                }
                case 3: {
                    this.lIIIIlIlIIlllllIIllIIlIII = 1;
                    break;
                }
                default: {
                    this.lIIIIlIlIIlllllIIllIIlIII = 1;
                }
            }
        }
        if (class_07282 == Options.llllIlIIIIIIIIIlllIIlIIIl) {
            this.llIIlllIllIllllIIIlIIIIII += 0.2f;
            if (this.llIIlllIllIllllIIIlIIIIII > 0.81f) {
                this.llIIlllIllIllllIIIlIIIIII = 0.2f;
            }
        }
        if (class_07282 == Options.IIIIlIlIIlIIIIlIlllIlIIII) {
            ++this.llIIllIllIlIIlIIllIllllll;
            if (this.llIIllIllIlIIlIIllIllllll > 3) {
                this.llIIllIllIlIIlIIllIllllll = 0;
            }
            class_1384.lllIlIIlIIIlIlIIIllIlllIl();
        }
        if (class_07282 == Options.lllIIIIlIlIIlIIlllIIIIIIl) {
            this.lllIIlIIIllllllIIIIlIlIlI = !this.lllIIlIIIllllllIIIIlIlIlI;
            this.lIllIlIlIIIIlIlIIlIlIlllI.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll();
        }
        if (class_07282 == Options.llIlIIlllIIIIIllIIlIlIIII) {
            this.IlIlllIIIIIIlIIllIIllIlll += 2;
            if (this.IlIlllIIIIIIlIIllIIllIlll > 8) {
                this.IlIlllIIIIIIlIIllIIllIlll = 0;
            }
            this.lIllIlIlIIIIlIlIIlIlIlllI.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll();
        }
        if (class_07282 == Options.IllIIIlllllIlIlllIlllllII) {
            boolean bl = this.lllllIlllIIllIlIIlIIIllII = !this.lllllIlllIIllIlIIlIIIllII;
        }
        if (class_07282 == Options.lIIllllllllIlIllllllllIlI) {
            this.IlIlIIlllIIlIllIIIlllllIl = !this.IlIlIIlllIIlIllIIIlllllIl;
            Config.lllllIllllIIIIllIIlIlIlII();
            if (!Config.lIIllIlIllIlIlIIlIlIIIIll()) {
                this.IlIlIIlllIIlIllIIIlllllIl = false;
            }
            Config.IllIIlllllllIIlIIlIIIIlIl();
        }
        if (class_07282 == Options.llIlllIlIIllIlIIIIllIIlIl) {
            ++this.IIlllIlIlllIllIIIlllIIlIl;
            if (this.IIlllIlIlllIllIIIlllIIlIl > 3) {
                this.IIlllIlIlllIllIIIlllIIlIl = 0;
            }
        }
        if (class_07282 == Options.lIIIlIIIlIlllIllIIIlIIIlI) {
            ++this.llIIlIllIllllIlIIIIlIIlll;
            if (this.llIIlIllIllllIlIIIIlIIlll > 2) {
                this.llIIlIllIllllIlIIIIlIIlll = 0;
            }
            this.lIllIlIlIIIIlIlIIlIlIlllI.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll();
        }
        if (class_07282 == Options.lIIlIlllIllIlIlllIIIIIIII) {
            ++this.llIllllIlIllIIIlIllIIlIlI;
            if (this.llIllllIlIllIIIlIllIIlIlI > 2) {
                this.llIllllIlIllIIIlIllIIlIlI = 0;
            }
            class_1333.lIllllIIlIIIlIllllllIIIll = Config.llIIIlllIlllIlIllIIIIllIl();
            this.lIllIlIlIIIIlIlIIlIlIlllI.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll();
        }
        if (class_07282 == Options.llllIIllllIllIlllllIIlIlI) {
            ++this.llIIlIlIlllIIllIlIlllIllI;
            if (this.llIIlIlIlllIIllIlIlllIllI > 2) {
                this.llIIlIlIlllIIllIlIlllIllI = 0;
            }
        }
        if (class_07282 == Options.IIlIllIIlllllIIlIIllllIIl) {
            ++this.lIlllIlllIlIIIIlllIlIlIIl;
            if (this.lIlllIlllIlIIIIlllIlIlIIl > 3) {
                this.lIlllIlllIlIIIIlllIlIlIIl = 0;
            }
        }
        if (class_07282 == Options.IllllIIlIIIllIlllIlllIllI) {
            ++this.IlIIlllllIIlIlIlllllIllll;
            if (this.IlIIlllllIIlIlIlllllIllll > 2) {
                this.IlIIlllllIIlIlIlllllIllll = 0;
            }
        }
        if (class_07282 == Options.IllIlIlIIIlllIIllIIIIlIll) {
            ++this.IlllIIIllllIIllIllIlIIlIl;
            if (this.IlllIIIllllIIllIllIlIIlIl > 2) {
                this.IlllIIIllllIIllIllIlIIlIl = 0;
            }
        }
        if (class_07282 == Options.IlIIIlIllIIIllIIIIlIIlIll) {
            ++this.lllIIIlIIlIlIllIIIIIlIIll;
            if (this.lllIIIlIIlIlIllIIIIIlIIll > 2) {
                this.lllIIIlIIlIlIllIIIIIlIIll = 0;
            }
        }
        if (class_07282 == Options.llllIIllIlIlllllllIIlIIlI) {
            boolean bl = this.IIIlIlIllIlllllIlIllllllI = !this.IIIlIlIllIlllllIlIllllllI;
        }
        if (class_07282 == Options.IlllIIlllllllIIllIlIllllI) {
            boolean bl = this.IIIIlIllIlIIIIIllllIIlllI = !this.IIIIlIllIlIIIIIllllIIlllI;
        }
        if (class_07282 == Options.IlIlIllIIlIIIIlllIlIllIlI) {
            boolean bl = this.llllIlIIllIIlllllIIllIIll = !this.llllIlIIllIIlllllIIllIIll;
        }
        if (class_07282 == Options.IlIIllIlIlIllIIIlIIlIlIIl) {
            boolean bl = this.IlIlIllIIlIIIIlllIlIllIlI = !this.IlIlIllIIlIIIIlllIlIllIlI;
        }
        if (class_07282 == Options.lIlIIllIllIIIIIlIllllIIIl) {
            boolean bl = this.IlIIllIlIlIllIIIlIIlIlIIl = !this.IlIIllIlIlIllIIIlIIlIlIIl;
        }
        if (class_07282 == Options.lIlllIIllIIIIIIlIlIIlIllI) {
            boolean bl = this.lIlIIllIllIIIIIlIllllIIIl = !this.lIlIIllIllIIIIIlIllllIIIl;
        }
        if (class_07282 == Options.lIIllIIlIIIlllIlllIIlIIlI) {
            boolean bl = this.lIlllIIllIIIIIIlIlIIlIllI = !this.lIlllIIllIIIIIIlIlIIlIllI;
        }
        if (class_07282 == Options.IllIIllIlIlllIllIllIlIIIl) {
            boolean bl = this.llIIIlIlIlIIlIllIIIllIlIl = !this.llIIIlIlIlIIlIllIIIllIlIl;
        }
        if (class_07282 == Options.IIIIIllIlIllIlIlIIlIllIIl) {
            boolean bl = this.llIIIIIlIIlIIIIllIIIlIIII = !this.llIIIIIlIIlIIIIllIIIlIIII;
        }
        if (class_07282 == Options.lIIllIlIIlIIlllllIlIIllIl) {
            boolean bl = this.lIlIlIIllIIIlllIllIIlIllI = !this.lIlIlIIllIIIlllIllIIlIllI;
        }
        if (class_07282 == Options.IlIIlIIlllllIlIIlIlIlIlIl) {
            boolean bl = this.IlIIIIIllIlllIIIIlIIIllIl = !this.IlIIIIIllIlllIIIIlIIIllIl;
        }
        if (class_07282 == Options.lllllllIlIIlIlIIIlIlIIlll) {
            boolean bl = this.lIIlIlIIllIIIlIIlIlIIIlII = !this.lIIlIlIIllIIIlIIlIlIIIlII;
        }
        if (class_07282 == Options.lllllIllllIIIIllIIlIlIlII) {
            boolean bl = this.lIlIllIIllIIIIlllIlIlllIl = !this.lIlIllIIllIIIIlllIlIlllIl;
        }
        if (class_07282 == Options.llIllllIIIIIlIIlIlllIIlll) {
            boolean bl = this.lIIIlIIllIllIIlIIlIIIllII = !this.lIIIlIIllIllIIlIIlIIIllII;
        }
        if (class_07282 == Options.IIIlIllllIIIlllllIllIlIII) {
            boolean bl = this.lIIlIIlIllIlIIlIlIIlIlIlI = !this.lIIlIIlIllIlIIlIlIIlIlIlI;
        }
        if (class_07282 == Options.lllIIIlIIlIlIllIIIIIlIIll) {
            boolean bl = this.IIlIIlIlIlIllIIlIlIIIIlll = !this.IIlIIlIlIlIllIIlIlIIIIlll;
        }
        if (class_07282 == Options.IIIlIlIllIlllllIlIllllllI) {
            boolean bl = this.IIIIlIllIlIIlIIlIllIlIlll = !this.IIIIlIllIlIIlIIlIllIlIlll;
        }
        if (class_07282 == Options.IIIIlIllIlIIIIIllllIIlllI) {
            this.IIIIIIIIlIllIIllIIlllIllI *= 10;
            if (this.IIIIIIIIlIllIIllIIlllIllI > 40000) {
                this.IIIIIIIIlIllIIllIIlllIllI = 40;
            }
        }
        if (class_07282 == Options.llllIlIIllIIlllllIIllIIll) {
            ++this.IllIIIIllIIllIllIlllIlIIl;
            if (this.IllIIIIllIIllIllIlllIlIIl > 3) {
                this.IllIIIIllIIllIllIlllIlIIl = 1;
            }
            this.lIllIlIlIIIIlIlIIlIlIlllI.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll();
        }
        if (class_07282 == Options.llIIIlIIllIIllIllIIlIlllI) {
            ++this.lIIlIlllIllIlIlllIIIIIIII;
            if (this.lIIlIlllIllIlIlllIIIIIIII > 3) {
                this.lIIlIlllIllIlIlllIIIIIIII = 1;
            }
            this.lIllIlIlIIIIlIlIIlIlIlllI.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll();
        }
        if (class_07282 == Options.llIIIlIlIlIIlIllIIIllIlIl) {
            boolean bl = this.IlIlIIlllIllllllllIIIlIlI = !this.IlIlIIlllIllllllllIIIlIlI;
        }
        if (class_07282 == Options.lIIlIIlIllIlIIlIlIIlIlIlI) {
            boolean bl = this.llllIIIIlIIIlIIIIIIlIllll = !this.llllIIIIlIIIlIIIIIIlIllll;
        }
        if (class_07282 == Options.llIIIIIlIIlIIIIllIIIlIIII) {
            boolean bl = this.llIIIIllIIIIIIIlIIIlIIIIl = !this.llIIIIllIIIIIIIlIIIlIIIIl;
        }
        if (class_07282 == Options.lIlIlIIllIIIlllIllIIlIllI) {
            boolean bl = this.IIllIllIIllIIlllIIIlIlllI = !this.IIllIllIIllIIlllIIIlIlllI;
        }
        if (class_07282 == Options.IlIIIIIllIlllIIIIlIIIllIl) {
            ++this.llllllIlIllllIlIlIlIIIIlI;
            if (this.llllllIlIllllIlIlIlIIIIlI > 2) {
                this.llllllIlIllllIlIlIlIIIIlI = 0;
            }
        }
        if (class_07282 == Options.lIIlIlIIllIIIlIIlIlIIIlII) {
            ++this.lIlIIllllIlIIIIllIIIIlIIl;
            if (this.lIlIIllllIlIIIIllIIIIlIIl > 5) {
                this.lIlIIllllIlIIIIllIIIIlIIl = 1;
            }
        }
        if (class_07282 == Options.lIIllllIllIlllllIIllIllIl) {
            // empty if block
        }
        if (class_07282 == Options.lIIIlIIllIllIIlIIlIIIllII) {
            boolean bl = this.IIIIlIIlIIIllIIIIllIIIlII = !this.IIIIlIIlIIIllIIIIllIIIlII;
        }
        if (class_07282 == Options.lIlIllIIllIIIIlllIlIlllIl) {
            ++this.lllIIIIIIlIlllIIlIlIIIllI;
            if (this.lllIIIIIIlIlllIIlIlIIIllI > 3) {
                this.lllIIIIIIlIlllIIlIlIIIllI = 0;
            }
        }
        if (class_07282 == Options.IlIIIlIIlllllIIIllIlIlIll) {
            this.llIIlIIllIIllIlIIllIIllII = !this.llIIlIIllIIllIlIIllIIllII;
            this.lIIIIlIlIIlllllIIllIIlIII();
        }
        if (class_07282 == Options.lIIIIllIIllIIIlIIIllIllII) {
            boolean bl = this.lIlIlIIIIIIlIIllllIlIIllI = !this.lIlIlIIIIIIlIIllllIlIIllI;
        }
        if (class_07282 == Options.lIIIIlIlIlIIIlIIllIIlIlIl) {
            object = new int[]{0, 2, 4, 6, 8, 12, 16};
            n2 = this.IlIIIlIIIIllIIIllIIIIIIll;
            this.IlIIIlIIIIllIIIllIIIIIIll = n2 >= 16 ? 0 : object[Ints.indexOf((int[])object, (int)n2) + 1];
            this.IlIIIlIIIIllIIIllIIIIIIll = Config.lllIIIllIIIIlllIlIIllIIll(this.IlIIIlIIIIllIIIllIIIIIIll, 0, 16);
        }
        if (class_07282 == Options.lIIlllIIlIlIlIIIlIlllIIll) {
            boolean bl = this.llIIIlllIlllIlIllIIIIllIl = !this.llIIIlllIlllIlIllIIIIllIl;
        }
        if (class_07282 == Options.lIlIIIllIIllIIlIllllllIll) {
            this.IllllIIIIlIIlIIIIlllIIIIl = !this.IllllIIIIlIIlIIIIlllIIIIl;
            this.lIllIlIlIIIIlIlIIlIlIlllI.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll();
        }
        if (class_07282 == Options.IIIIlllIIlIllllllIllIIlll) {
            this.IIIIlIlIIlIIIIlIlllIlIIII = !this.IIIIlIlIIlIIIIlIlllIlIIII;
            class_1689.lllIlIIlIIIlIlIIIllIlllIl();
            this.lIllIlIlIIIIlIlIIlIlIlllI.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll();
        }
        if (class_07282 == Options.IIIIIIlIIIIIIIIIIlIlIlIlI) {
            this.lllIIIIlIlIIlIIlllIIIIIIl = !this.lllIIIIlIlIIlIIlllIIIIIIl;
            class_1630.lllIIIllIIIIlllIlIIllIIll();
        }
        if (class_07282 == Options.IllIlllIIIlllllIllIIlIlIl) {
            this.llIlIIlllIIIIIllIIlIlIIII = !this.llIlIIlllIIIIIllIIlIlIIII;
            class_1689.lllIlIIlIIIlIlIIIllIlllIl();
            this.lIllIlIlIIIIlIlIIlIlIlllI.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll();
        }
        if (class_07282 == Options.IllIIIIlIIlllllllllIlIlII) {
            this.IllIIIlllllIlIlllIlllllII = !this.IllIIIlllllIlIlllIlllllII;
            this.lIllIlIlIIIIlIlIIlIlIlllI.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(Config.lIIIlIIIlIlllIllIIIlIIIlI());
            this.lIllIlIlIIIIlIlIIlIlIlllI.IlIlIIlIlIllIIlIlIIllIIIl.lllIIIllIIIIlllIlIIllIIll(Config.lIIIlIIIlIlllIllIIIlIIIlI());
        }
        if (class_07282 == Options.IIIlllIlIIllIIlIlIllIlIIl) {
            this.llIlllIlIIllIlIIIIllIIlIl = !this.llIlllIlIIllIlIIIIllIIlIl;
            class_1689.lllIIIllIIIIlllIlIIllIIll();
            this.lIllIlIlIIIIlIlIIlIlIlllI.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll();
        }
        if (class_07282 == Options.lIIIllIlIlIlIIIllIlIlIllI) {
            this.lIIIllIIIIIllllIlIlIllIll = !this.lIIIllIIIIIllllIlIlIllIll;
            class_1065.lllIlIIlIIIlIlIIIllIlllIl();
        }
        if (class_07282 == Options.llllIIIlIlIlIlIIlIIIIIlIl) {
            this.lIIIlIIIlIlllIllIIIlIIIlI = !this.lIIIlIIIlIlllIllIIIlIIIlI;
            this.lIllIlIlIIIIlIlIIlIlIlllI.IllIIIllIIIIlIlIlIllIIlll.lIIIIlIlIIlllllIIllIIlIII();
        }
        if (class_07282 == Options.lIIllIlIllIlIlIIlIlIIIIll) {
            this.IIlIllIIlllllIIlIIllllIIl = !this.IIlIllIIlllllIIlIIllllIIl;
            class_1446.lllIIIllIIIIlllIlIIllIIll();
            this.lIllIlIlIIIIlIlIIlIlIlllI.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll();
        }
        if (class_07282 == Options.IIIlIllIlllIlIIIlIlIIllII) {
            MathHelper.IlIIIIIllllllIIlllIllllll = this.IllllIIlIIIllIlllIlllIllI = !this.IllllIIlIIIllIlllIlllIllI;
        }
        if (class_07282 == Options.lIIlIlllIIlIIIIlIlIIIIlll) {
            boolean bl = this.IllIlIlIIIlllIIllIIIIlIll = !this.IllIlIlIIIlllIIllIIIIlIll;
            if (this.IllIlIlIIIlllIIllIIIIlIll) {
                this.lIllIlIlIIIIlIlIIlIlIlllI.lIIlIIIIIlIlllIlIIlIlIlll.lllIlIIlIIIlIlIIIllIlllIl();
            }
            Config.IIIlIllIlllIlIIIlIlIIllII();
            this.lIllIlIlIIIIlIlIIlIlIlllI.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll();
        }
        if (class_07282 == Options.IIIlIIllIIlIlIIlIIllIIIIl) {
            this.IlIIIlIllIIIllIIIIlIIlIll = this.IlIIIlIllIIIllIIIIlIIlIll == 1 ? 2 : 1;
            this.lIllIlIlIIIIlIlIIlIlIlllI.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll();
        }
        if (class_07282 == Options.IllIlIlIIIlIllIlIlIIlllII) {
            this.lIIlIIIIIlIlllIlIIlIlIlll = !this.lIIlIIIIIlIlllIlIIlIlIlll;
            Config.lllllIllllIIIIllIIlIlIlII();
            if (!Config.lIIllIlIllIlIlIIlIlIIIIll()) {
                this.lIIlIIIIIlIlllIlIIlIlIlll = false;
            }
            this.lIllIlIlIIIIlIlIIlIlIlllI.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll();
        }
        if (class_07282 == Options.lIlIIlllllIlllllIlIIIllll) {
            List<String> obj2 = Arrays.asList(Config.lIIllllllllIlIllllllllIlI());
            if (this.llllIlIIIIIIIIIlllIIlIIIl.equals(lIlIIIllIIllIIlIllllllIll)) {
                String string = obj2.get(0);
                if (string != null) {
                    this.llllIlIIIIIIIIIlllIIlIIIl = string;
                }
            } else {
                n2 = obj2.indexOf(this.llllIlIIIIIIIIIlllIIlIIIl);
                this.llllIlIIIIIIIIIlllIIlIIIl = n2 < 0 ? lIlIIIllIIllIIlIllllllIll : (++n2 >= obj2.size() ? lIlIIIllIIllIIlIllllllIll : obj2.get(n2));
            }
        }
        if (class_07282 == Options.IIIIlIIIllIIIlIIlIIIIIlll) {
            boolean bl = this.llllIIllIlIlllllllIIlIIlI = !this.llllIIllIlIlllllllIIlIIlI;
        }
        if (class_07282 == Options.lIIIIIlIllIllIlIlIIllllll) {
            switch (this.IlllIIlllllllIIllIlIllllI) {
                case 1: {
                    this.IlllIIlllllllIIllIlIllllI = 2;
                    break;
                }
                case 3: {
                    this.IlllIIlllllllIIllIlIllllI = 1;
                    break;
                }
                default: {
                    this.IlllIIlllllllIIllIlIllllI = 3;
                }
            }
            class_1825.lllIlIIlIIIlIlIIIllIlllIl(this.lIllIlIlIIIIlIlIIlIlIlllI.IllIIIllIIIIlIlIlIllIIlll);
        }
        if (class_07282 == Options.IIIIIlllIIllllIlllIlllIIl) {
            boolean bl = this.lIIlIlllIIlIIIIlIlIIIIlll = !this.lIIlIlllIIlIIIIlIlIIIIlll;
        }
        if (class_07282 == Options.INVERT_MOUSE) {
            boolean bl = this.lllIlIIlIIIlIlIIIllIlllIl = !this.lllIlIIlIIIlIlIIIllIlllIl;
        }
        if (class_07282 == Options.IlIlllIIIIIIlIIllIIllIlll) {
            this.IllIIIIIllIIlllIlIIIlIlll = this.IllIIIIIllIIlllIlIIIlIlll + n & 3;
        }
        if (class_07282 == Options.lllllIlllIIllIlIIlIIIllII) {
            this.IllIlIIllIIllIlIIlIllIlIl = (this.IllIlIIllIIllIlIIlIllIlIl + n) % 3;
        }
        if (class_07282 == Options.VIEW_BOBBING) {
            boolean bl = this.lIlllIlllIIIIlIIlllIllIII = !this.lIlllIlllIIIIlIIlllIllIII;
        }
        if (class_07282 == Options.IlIlIIlIlIllIIlIlIIllIIIl) {
            boolean bl = this.llIllllIIIIIlIIlIlllIIlll = !this.llIllllIIIIIlIIlIlllIIlll;
        }
        if (class_07282 == Options.IlIlIIlllIllllllllIIIlIlI) {
            this.lllIlIlIIIlIllllIlllIlIlI = !this.lllIlIlIIIlIllllIlllIlIlI;
            this.lIllIlIlIIIIlIlIIlIlIlllI.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(this.lIllIlIlIIIIlIlIIlIlIlllI.llllIlIIIIIIIIIlllIIlIIIl().lllIIIllIIIIlllIlIIllIIll() || this.lllIlIlIIIlIllllIlllIlIlI);
        }
        if (class_07282 == Options.ADVANCED_OPENGL) {
            if (!Config.lIllllIIlIIIlIllllllIIIll()) {
                this.IlIlIIlIlIllIIlIlIIllIIIl = false;
                this.lIllllIIlIIIlIllllllIIIll = false;
            } else if (!this.lIllllIIlIIIlIllllllIIIll) {
                this.lIllllIIlIIIlIllllllIIIll = true;
                this.IlIlIIlIlIllIIlIlIIllIIIl = false;
            } else if (!this.IlIlIIlIlIllIIlIlIIllIIIl) {
                this.IlIlIIlIlIllIIlIlIIllIIIl = true;
            } else {
                this.IlIlIIlIlIllIIlIlIIllIIIl = false;
                this.lIllllIIlIIIlIllllllIIIll = false;
            }
            this.lIllIlIlIIIIlIlIIlIlIlllI.IllIIIllIIIIlIlIlIllIIlll.IllIIlllllllIIlIIlIIIIlIl();
        }
        if (class_07282 == Options.lIIIIlIlIIlllllIIllIIlIII) {
            boolean bl = this.IIIllIIlIIIIIIlIlIIllIIlI = !this.IIIllIIlIIIIIIlIlIIllIIlI;
        }
        if (class_07282 == Options.ANAGLYPH) {
            this.IlIIIIIllllllIIlllIllllll = !this.IlIIIIIllllllIIlllIllllll;
            this.lIllIlIlIIIIlIlIIlIlIlllI.IlIIIIIllllllIIlllIllllll();
        }
        if (class_07282 == Options.llIIlllIllIllllIIIlIIIIII) {
            this.IIlIlIIIIlIlllIIlIIlIIIII = class_1999.lllIIIllIIIIlllIlIIllIIll(this.IIlIlIIIIlIlllIIlIIlIIIII.lllIIIllIIIIlllIlIIllIIll() + n & 3);
        }
        if (class_07282 == Options.llIIllIllIlIIlIIllIllllll) {
            this.IIIllIllIIlIlIlIlIllllIIl = !this.IIIllIllIIlIlIlIlIllllIIl;
            this.lIllIlIlIIIIlIlIIlIlIlllI.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll();
        }
        if (class_07282 == Options.lllIIlIIIllllllIIIIlIlIlI) {
            this.IllIIIllIIIIlIlIlIllIIlll = (this.IllIIIllIIIIlIlIlIllIIlll + n) % 3;
            this.lIllIlIlIIIIlIlIIlIlIlllI.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll();
        }
        if (class_07282 == Options.IlIlIIlllIIlIllIIIlllllIl) {
            this.IIIIIIlIIIIIIIIIIlIlIlIlI = class_1210.lllIIIllIIIIlllIlIIllIIll((this.IIIIIIlIIIIIIIIIIlIlIlIlI.lllIIIllIIIIlllIlIIllIIll() + n) % 3);
        }
        if (class_07282 == Options.llIlllIIllIlllIlIlIlIIIll) {
            this.IllIIIIIllIlIIllIllllllIl = (this.IllIIIIIllIlIIllIllllllIl + n) % 3;
        }
        if (class_07282 == Options.IIIIlIIlIIIllIIIIllIIIlII) {
            boolean bl = this.IIIlllllIIIIIllIllIIIIllI = !this.IIIlllllIIIIIllIllIIIIllI;
        }
        if (class_07282 == Options.lllIIIIIIlIlllIIlIlIIIllI) {
            this.IlIIllIIIlIlIlIIlIlIllIIl = (this.IlIIllIIIlIlIlIIlIlIllIIl + n) % 3;
        }
        if (class_07282 == Options.llIIlIIllIIllIlIIllIIllII) {
            this.IIllIIIlIIllllIIIIIIIIlll = (this.IIllIIIlIIllllIIIIIIIIlll + n) % 3;
        }
        if (class_07282 == Options.lIlIlIIIIIIlIIllllIlIIllI) {
            this.lIIIlIllllIlllIIIIIllIIIl = (this.lIIIlIllllIlllIIIIIllIIIl + n) % 2;
        }
        if (class_07282 == Options.lIIlIIIIIlIlllIlIIlIlIlll) {
            boolean bl = this.IllIlllIIIlllllIllIIlIlIl = !this.IllIlllIIIlllllIllIIlIlIl;
        }
        if (class_07282 == Options.lIlIlIIlIIIIlIIIIIlllIIII) {
            boolean bl = this.IllIIIIlIIlllllllllIlIlII = !this.IllIIIIlIIlllllllllIlIlII;
        }
        if (class_07282 == Options.CHAT_LINKS_PROMPT) {
            boolean bl = this.IIIlllIlIIllIIlIlIllIlIIl = !this.IIIlllIlIIllIIlIlIllIlIIl;
        }
        if (class_07282 == Options.SNOOPER_ENABLED) {
            boolean bl = this.llIIIlIIllIIllIllIIlIlllI = !this.llIIIlIIllIIllIllIIlIlllI;
        }
        if (class_07282 == Options.SHOW_CAPE) {
            boolean bl = this.llllIIllllIllIlllllIIlIlI = !this.llllIIllllIllIlllllIIlIlI;
        }
        if (class_07282 == Options.TOUCHSCREEN) {
            boolean bl = this.IllIlIlIIIlIllIlIlIIlllII = !this.IllIlIlIIIlIllIlIlIIlllII;
        }
        if (class_07282 == Options.USE_FULLSCREEN) {
            boolean bl = this.lIIIIlIlIlIIIlIIllIIlIlIl = !this.lIIIIlIlIlIIIlIIllIIlIlIl;
            if (this.lIllIlIlIIIIlIlIIlIlIlllI.lIlIIllllIlIIIIllIIIIlIIl() != this.lIIIIlIlIlIIIlIIllIIlIlIl) {
                this.lIllIlIlIIIIlIlIIlIlIlllI.lllllIlllIIllIlIIlIIIllII();
            }
        }
        if (class_07282 == Options.ENABLE_VSYNC) {
            this.lllllIllllIIIIllIIlIlIlII = !this.lllllIllllIIIIllIIlIlIlII;
            Display.setVSyncEnabled((boolean)this.lllllIllllIIIIllIIlIlIlII);
        }
        this.IlIllllllIIlIIllllIIlIIIl();
    }

    public float lllIIIllIIIIlllIlIIllIIll(Options class_07282) {
        return class_07282 == Options.lIIIllIIIIIllllIlIlIllIll ? this.lIlIllIIlIIlIIlIIlIIlIIll : (class_07282 == Options.IlllIIIllllIIllIllIlIIlIl ? this.lIlIlIIlIIIIlIIIIIlllIIII : (class_07282 == Options.IllIIIllIIIIlIlIlIllIIlll ? ((float)this.IllIIlllllllIIlIIlIIIIlIl == Options.IllIIIllIIIIlIlIlIllIIlll.getValueMax() && this.lllllIllllIIIIllIIlIlIlII ? 0.0f : (float)this.IllIIlllllllIIlIIlIIIIlIl) : (class_07282 == Options.FOV ? this.llllIIIllIllIIIllIlIIIIIl : (class_07282 == Options.GAMMA ? this.lIIIlIllIlIIlIIIllIIlIlll : (class_07282 == Options.SATURATION ? this.lIlIllIIIlIlIlIlIIIllllll : (class_07282 == Options.SENSITIVITY ? this.lllIIIllIIIIlllIlIIllIIll : (class_07282 == Options.IlIIIlIIIIllIIIllIIIIIIll ? this.llllIIIlIlIlIlIIlIIIIIlIl : (class_07282 == Options.CHAT_HEIGHT_FOCUSED ? this.lIIIlllIlIIIlIllIIIlIllll : (class_07282 == Options.CHAT_HEIGHT_UNFOCUSED ? this.lIIIIIlIllIllIlIlIIllllll : (class_07282 == Options.CHAT_SCALE ? this.IIIlIIllIIlIlIIlIIllIIIIl : (class_07282 == Options.CHAT_WIDTH ? this.IIIIlIIIllIIIlIIlIIIIIlll : (class_07282 == Options.IllIIIllIIIIlIlIlIllIIlll ? (float)this.IllIIlllllllIIlIIlIIIIlIl : (class_07282 == Options.ANISOTROPIC_FILTERING ? (float)this.anisotropicFiltering : (class_07282 == Options.MIPMAP_LEVELS ? (float)this.llIllIllIllIlIlIllIlIIIIl : (class_07282 == Options.RENDER_DISTANCE ? (float)this.IlIllllllIIlIIllllIIlIIIl : (class_07282 == Options.llllIIIIlIIIlIIIIIIlIllll ? this.llIllIlllIllIlIIIIlIIlIII : (class_07282 == Options.llIIIIllIIIIIIIlIIIlIIIIl ? this.IlllIIIlIIlIIIIllllIllllI : (class_07282 == Options.IIllIllIIllIIlllIIIlIlllI ? this.llIlIIIlllIIIllIllllIIIll : (class_07282 == Options.llllllIlIllllIlIlIlIIIIlI ? this.lIIlllIIIlIIlIllIIIIIlIlI : (class_07282 == Options.lIlIIllllIlIIIIllIIIIlIIl ? this.lllIlIIllllIIllIIIIllIlIl : 0.0f))))))))))))))))))));
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl(Options class_07282) {
        switch (class_07282) {
            case INVERT_MOUSE: {
                return this.lllIlIIlIIIlIlIIIllIlllIl;
            }
            case VIEW_BOBBING: {
                return this.lIlllIlllIIIIlIIlllIllIII;
            }
            case ANAGLYPH: {
                return this.IlIIIIIllllllIIlllIllllll;
            }
            case ADVANCED_OPENGL: {
                return this.lIllllIIlIIIlIllllllIIIll;
            }
            case lIIIIlIlIIlllllIIllIIlIII: {
                return this.IIIllIIlIIIIIIlIlIIllIIlI;
            }
            case IlIlIIlIlIllIIlIlIIllIIIl: {
                return this.llIllllIIIIIlIIlIlllIIlll;
            }
            case lIIlIIIIIlIlllIlIIlIlIlll: {
                return this.IllIlllIIIlllllIllIIlIlIl;
            }
            case lIlIlIIlIIIIlIIIIIlllIIII: {
                return this.IllIIIIlIIlllllllllIlIlII;
            }
            case CHAT_LINKS_PROMPT: {
                return this.IIIlllIlIIllIIlIlIllIlIIl;
            }
            case SNOOPER_ENABLED: {
                return this.llIIIlIIllIIllIllIIlIlllI;
            }
            case USE_FULLSCREEN: {
                return this.lIIIIlIlIlIIIlIIllIIlIlIl;
            }
            case ENABLE_VSYNC: {
                return this.lllllIllllIIIIllIIlIlIlII;
            }
            case SHOW_CAPE: {
                return this.llllIIllllIllIlllllIIlIlI;
            }
            case TOUCHSCREEN: {
                return this.IllIlIlIIIlIllIlIlIIlllII;
            }
            case IIIIlIIlIIIllIIIIllIIIlII: {
                return this.IIIlllllIIIIIllIllIIIIllI;
            }
            case IlIlIIlllIllllllllIIIlIlI: {
                return this.lllIlIlIIIlIllllIlllIlIlI;
            }
        }
        return false;
    }

    private static String lllIIIllIIIIlllIlIIllIIll(String[] arrstring, int n) {
        if (n < 0 || n >= arrstring.length) {
            n = 0;
        }
        return class_0616.lllIIIllIIIIlllIlIIllIIll(arrstring[n], new Object[0]);
    }

    public String IlIllllllIIlIIllllIIlIIIl(Options class_07282) {
        String string = class_0616.lllIIIllIIIIlllIlIIllIIll(class_07282.getEnumString(), new Object[0]) + ": ";
        if (string == null) {
            string = class_07282.getEnumString();
        }
        if (class_07282 == Options.RENDER_DISTANCE) {
            int n = (int)this.lllIIIllIIIIlllIlIIllIIll(class_07282);
            String string2 = "Tiny";
            int n2 = 2;
            if (n >= 4) {
                string2 = "Short";
                n2 = 4;
            }
            if (n >= 8) {
                string2 = "Normal";
                n2 = 8;
            }
            if (n >= 16) {
                string2 = "Far";
                n2 = 16;
            }
            if (n >= 32) {
                string2 = "Extreme";
                n2 = 32;
            }
            int n3 = this.IlIllllllIIlIIllllIIlIIIl - n2;
            String string3 = string2;
            if (n3 > 0) {
                string3 = string2 + "+";
            }
            return string + n + " " + string3 + "";
        }
        if (class_07282 == Options.ADVANCED_OPENGL) {
            return !this.lIllllIIlIIIlIllllllIIIll ? string + "OFF" : (this.IlIlIIlIlIllIIlIlIIllIIIl ? string + "Fancy" : string + "Fast");
        }
        if (class_07282 == Options.IllllIIIIlIIlIIIIlllIIIIl) {
            switch (this.lIIIIlIlIIlllllIIllIIlIII) {
                case 1: {
                    return string + "Fast";
                }
                case 2: {
                    return string + "Fancy";
                }
                case 3: {
                    return string + "OFF";
                }
            }
            return string + "OFF";
        }
        if (class_07282 == Options.llllIlIIIIIIIIIlllIIlIIIl) {
            return string + this.llIIlllIllIllllIIIlIIIIII;
        }
        if (class_07282 == Options.IIIIlIlIIlIIIIlIlllIlIIII) {
            switch (this.llIIllIllIlIIlIIllIllllll) {
                case 0: {
                    return string + "Nearest";
                }
                case 1: {
                    return string + "Linear";
                }
                case 2: {
                    return string + "Bilinear";
                }
                case 3: {
                    return string + "Trilinear";
                }
            }
            return string + "Nearest";
        }
        if (class_07282 == Options.lllIIIIlIlIIlIIlllIIIIIIl) {
            return this.lllIIlIIIllllllIIIIlIlIlI ? string + "ON" : string + "OFF";
        }
        if (class_07282 == Options.llIlIIlllIIIIIllIIlIlIIII) {
            return this.IlIlllIIIIIIlIIllIIllIlll == 0 ? string + "OFF" : string + this.IlIlllIIIIIIlIIllIIllIlll;
        }
        if (class_07282 == Options.IllIIIlllllIlIlllIlllllII) {
            return this.lllllIlllIIllIlIIlIIIllII ? string + "ON" : string + "OFF";
        }
        if (class_07282 == Options.lIIllllllllIlIllllllllIlI) {
            return this.IlIlIIlllIIlIllIIIlllllIl ? string + "ON" : string + "OFF";
        }
        if (class_07282 == Options.llIlllIlIIllIlIIIIllIIlIl) {
            switch (this.IIlllIlIlllIllIIIlllIIlIl) {
                case 1: {
                    return string + "Fast";
                }
                case 2: {
                    return string + "Fancy";
                }
                case 3: {
                    return string + "OFF";
                }
            }
            return string + lIlIIIllIIllIIlIllllllIll;
        }
        if (class_07282 == Options.lIIIlIIIlIlllIllIIIlIIIlI) {
            switch (this.llIIlIllIllllIlIIIIlIIlll) {
                case 1: {
                    return string + "Fast";
                }
                case 2: {
                    return string + "Fancy";
                }
            }
            return string + lIlIIIllIIllIIlIllllllIll;
        }
        if (class_07282 == Options.lIIlIlllIllIlIlllIIIIIIII) {
            switch (this.llIllllIlIllIIIlIllIIlIlI) {
                case 1: {
                    return string + "Fast";
                }
                case 2: {
                    return string + "Fancy";
                }
            }
            return string + lIlIIIllIIllIIlIllllllIll;
        }
        if (class_07282 == Options.llllIIllllIllIlllllIIlIlI) {
            switch (this.llIIlIlIlllIIllIlIlllIllI) {
                case 1: {
                    return string + "Fast";
                }
                case 2: {
                    return string + "Fancy";
                }
            }
            return string + lIlIIIllIIllIIlIllllllIll;
        }
        if (class_07282 == Options.IIlIllIIlllllIIlIIllllIIl) {
            switch (this.lIlllIlllIlIIIIlllIlIlIIl) {
                case 1: {
                    return string + "Fast";
                }
                case 2: {
                    return string + "Fancy";
                }
                case 3: {
                    return string + "OFF";
                }
            }
            return string + lIlIIIllIIllIIlIllllllIll;
        }
        if (class_07282 == Options.IllllIIlIIIllIlllIlllIllI) {
            switch (this.IlIIlllllIIlIlIlllllIllll) {
                case 1: {
                    return string + "Fast";
                }
                case 2: {
                    return string + "Fancy";
                }
                case 3: {
                    return string + "OFF";
                }
            }
            return string + lIlIIIllIIllIIlIllllllIll;
        }
        if (class_07282 == Options.IllIlIlIIIlllIIllIIIIlIll) {
            switch (this.IlllIIIllllIIllIllIlIIlIl) {
                case 1: {
                    return string + "Dynamic";
                }
                case 2: {
                    return string + "OFF";
                }
            }
            return string + "ON";
        }
        if (class_07282 == Options.IlIIIlIllIIIllIIIIlIIlIll) {
            switch (this.lllIIIlIIlIlIllIIIIIlIIll) {
                case 1: {
                    return string + "Dynamic";
                }
                case 2: {
                    return string + "OFF";
                }
            }
            return string + "ON";
        }
        if (class_07282 == Options.llllIIllIlIlllllllIIlIIlI) {
            return this.IIIlIlIllIlllllIlIllllllI ? string + "ON" : string + "OFF";
        }
        if (class_07282 == Options.IlllIIlllllllIIllIlIllllI) {
            return this.IIIIlIllIlIIIIIllllIIlllI ? string + "ON" : string + "OFF";
        }
        if (class_07282 == Options.IlIlIllIIlIIIIlllIlIllIlI) {
            return this.llllIlIIllIIlllllIIllIIll ? string + "ON" : string + "OFF";
        }
        if (class_07282 == Options.IlIIllIlIlIllIIIlIIlIlIIl) {
            return this.IlIlIllIIlIIIIlllIlIllIlI ? string + "ON" : string + "OFF";
        }
        if (class_07282 == Options.lIlIIllIllIIIIIlIllllIIIl) {
            return this.IlIIllIlIlIllIIIlIIlIlIIl ? string + "ON" : string + "OFF";
        }
        if (class_07282 == Options.lIlllIIllIIIIIIlIlIIlIllI) {
            return this.lIlIIllIllIIIIIlIllllIIIl ? string + "ON" : string + "OFF";
        }
        if (class_07282 == Options.lIIllIIlIIIlllIlllIIlIIlI) {
            return this.lIlllIIllIIIIIIlIlIIlIllI ? string + "ON" : string + "OFF";
        }
        if (class_07282 == Options.IllIIllIlIlllIllIllIlIIIl) {
            return this.llIIIlIlIlIIlIllIIIllIlIl ? string + "ON" : string + "OFF";
        }
        if (class_07282 == Options.IIIIIllIlIllIlIlIIlIllIIl) {
            return this.llIIIIIlIIlIIIIllIIIlIIII ? string + "ON" : string + "OFF";
        }
        if (class_07282 == Options.lIIllIlIIlIIlllllIlIIllIl) {
            return this.lIlIlIIllIIIlllIllIIlIllI ? string + "ON" : string + "OFF";
        }
        if (class_07282 == Options.IlIIlIIlllllIlIIlIlIlIlIl) {
            return this.IlIIIIIllIlllIIIIlIIIllIl ? string + "ON" : string + "OFF";
        }
        if (class_07282 == Options.lllllllIlIIlIlIIIlIlIIlll) {
            return this.lIIlIlIIllIIIlIIlIlIIIlII ? string + "ON" : string + "OFF";
        }
        if (class_07282 == Options.lllllIllllIIIIllIIlIlIlII) {
            return this.lIlIllIIllIIIIlllIlIlllIl ? string + "ON" : string + "OFF";
        }
        if (class_07282 == Options.llIllllIIIIIlIIlIlllIIlll) {
            return this.lIIIlIIllIllIIlIIlIIIllII ? string + "ON" : string + "OFF";
        }
        if (class_07282 == Options.IIIlIllllIIIlllllIllIlIII) {
            return this.lIIlIIlIllIlIIlIlIIlIlIlI ? string + "ON" : string + "OFF";
        }
        if (class_07282 == Options.lllIIIlIIlIlIllIIIIIlIIll) {
            return this.IIlIIlIlIlIllIIlIlIIIIlll ? string + "ON" : string + "OFF";
        }
        if (class_07282 == Options.IIIlIlIllIlllllIlIllllllI) {
            return this.IIIIlIllIlIIlIIlIllIlIlll ? string + "ON" : string + "OFF";
        }
        if (class_07282 == Options.IIIIlIllIlIIIIIllllIIlllI) {
            return this.IIIIIIIIlIllIIllIIlllIllI <= 40 ? string + "Default (2s)" : (this.IIIIIIIIlIllIIllIIlllIllI <= 400 ? string + "20s" : (this.IIIIIIIIlIllIIllIIlllIllI <= 4000 ? string + "3min" : string + "30min"));
        }
        if (class_07282 == Options.llllIlIIllIIlllllIIllIIll) {
            switch (this.IllIIIIllIIllIllIlllIlIIl) {
                case 1: {
                    return string + "Fast";
                }
                case 2: {
                    return string + "Fancy";
                }
            }
            return string + "OFF";
        }
        if (class_07282 == Options.llIIIlIIllIIllIllIIlIlllI) {
            switch (this.lIIlIlllIllIlIlllIIIIIIII) {
                case 1: {
                    return string + "Fast";
                }
                case 2: {
                    return string + "Fancy";
                }
            }
            return string + "OFF";
        }
        if (class_07282 == Options.llIIIlIlIlIIlIllIIIllIlIl) {
            return this.IlIlIIlllIllllllllIIIlIlI ? string + "ON" : string + "OFF";
        }
        if (class_07282 == Options.lIIlIIlIllIlIIlIlIIlIlIlI) {
            return this.llllIIIIlIIIlIIIIIIlIllll ? string + "ON" : string + "OFF";
        }
        if (class_07282 == Options.llIIIIIlIIlIIIIllIIIlIIII) {
            return this.llIIIIllIIIIIIIlIIIlIIIIl ? string + "ON" : string + "OFF";
        }
        if (class_07282 == Options.lIlIlIIllIIIlllIllIIlIllI) {
            return this.IIllIllIIllIIlllIIIlIlllI ? string + "ON" : string + "OFF";
        }
        if (class_07282 == Options.IlIIIIIllIlllIIIIlIIIllIl) {
            switch (this.llllllIlIllllIlIlIlIIIIlI) {
                case 1: {
                    return string + "Fast";
                }
                case 2: {
                    return string + "Fancy";
                }
            }
            return string + lIlIIIllIIllIIlIllllllIll;
        }
        if (class_07282 == Options.lIIlIlIIllIIIlIIlIlIIIlII) {
            return string + this.lIlIIllllIlIIIIllIIIIlIIl;
        }
        if (class_07282 == Options.lIIllllIllIlllllIIllIllIl) {
            return this.llIlllIIllIlllIlIlIlIIIll == 1 ? string + "Smooth" : (this.llIlllIIllIlllIlIlIlIIIll == 2 ? string + "Multi-Core" : string + lIlIIIllIIllIIlIllllllIll);
        }
        if (class_07282 == Options.lIIIlIIllIllIIlIIlIIIllII) {
            return this.IIIIlIIlIIIllIIIIllIIIlII ? string + "ON" : string + "OFF";
        }
        if (class_07282 == Options.lIlIllIIllIIIIlllIlIlllIl) {
            return this.lllIIIIIIlIlllIIlIlIIIllI == 1 ? string + "Day Only" : (this.lllIIIIIIlIlllIIlIlIIIllI == 3 ? string + "Night Only" : string + lIlIIIllIIllIIlIllllllIll);
        }
        if (class_07282 == Options.IlIIIlIIlllllIIIllIlIlIll) {
            return this.llIIlIIllIIllIlIIllIIllII ? string + "ON" : string + "OFF";
        }
        if (class_07282 == Options.lIIIIllIIllIIIlIIIllIllII) {
            return this.lIlIlIIIIIIlIIllllIlIIllI ? string + "ON" : string + "OFF";
        }
        if (class_07282 == Options.lIIIIlIlIlIIIlIIllIIlIlIl) {
            return this.IlIIIlIIIIllIIIllIIIIIIll == 0 ? string + "OFF" : string + this.IlIIIlIIIIllIIIllIIIIIIll;
        }
        if (class_07282 == Options.lIIlllIIlIlIlIIIlIlllIIll) {
            return this.llIIIlllIlllIlIllIIIIllIl ? string + "ON" : string + "OFF";
        }
        if (class_07282 == Options.lIlIIIllIIllIIlIllllllIll) {
            return this.IllllIIIIlIIlIIIIlllIIIIl ? string + "ON" : string + "OFF";
        }
        if (class_07282 == Options.IIIIlllIIlIllllllIllIIlll) {
            return this.IIIIlIlIIlIIIIlIlllIlIIII ? string + "ON" : string + "OFF";
        }
        if (class_07282 == Options.IIIIIIlIIIIIIIIIIlIlIlIlI) {
            return this.lllIIIIlIlIIlIIlllIIIIIIl ? string + "ON" : string + "OFF";
        }
        if (class_07282 == Options.IllIlllIIIlllllIllIIlIlIl) {
            return this.llIlIIlllIIIIIllIIlIlIIII ? string + "ON" : string + "OFF";
        }
        if (class_07282 == Options.IllIIIIlIIlllllllllIlIlII) {
            return this.IllIIIlllllIlIlllIlllllII ? string + "ON" : string + "OFF";
        }
        if (class_07282 == Options.IIIlllIlIIllIIlIlIllIlIIl) {
            return this.llIlllIlIIllIlIIIIllIIlIl ? string + "ON" : string + "OFF";
        }
        if (class_07282 == Options.lIIIllIlIlIlIIIllIlIlIllI) {
            return this.lIIIllIIIIIllllIlIlIllIll ? string + "ON" : string + "OFF";
        }
        if (class_07282 == Options.llllIIIlIlIlIlIIlIIIIIlIl) {
            return this.lIIIlIIIlIlllIllIIIlIIIlI ? string + "ON" : string + "OFF";
        }
        if (class_07282 == Options.lIIllIlIllIlIlIIlIlIIIIll) {
            return this.IIlIllIIlllllIIlIIllllIIl ? string + "ON" : string + "OFF";
        }
        if (class_07282 == Options.IIIlIllIlllIlIIIlIlIIllII) {
            return this.IllllIIlIIIllIlllIlllIllI ? string + "ON" : string + "OFF";
        }
        if (class_07282 == Options.lIIlIlllIIlIIIIlIlIIIIlll) {
            return this.IllIlIlIIIlllIIllIIIIlIll ? string + "ON" : string + "OFF";
        }
        if (class_07282 == Options.IIIlIIllIIlIlIIlIIllIIIIl) {
            return this.IlIIIlIllIIIllIIIIlIIlIll == 1 ? string + "Fast" : string + "Fancy";
        }
        if (class_07282 == Options.IllIlIlIIIlIllIlIlIIlllII) {
            return this.lIIlIIIIIlIlllIlIIlIlIlll ? string + "ON" : string + "OFF";
        }
        if (class_07282 == Options.IIIIlIIIllIIIlIIlIIIIIlll) {
            return this.llllIIllIlIlllllllIIlIIlI ? string + "ON" : string + "OFF";
        }
        if (class_07282 == Options.lIIIIIlIllIllIlIlIIllllll) {
            return this.IlllIIlllllllIIllIlIllllI == 1 ? string + "Fast" : (this.IlllIIlllllllIIllIlIllllI == 2 ? string + "Fancy" : string + "OFF");
        }
        if (class_07282 == Options.lIlIIlllllIlllllIlIIIllll) {
            return string + this.llllIlIIIIIIIIIlllIIlIIIl;
        }
        if (class_07282 == Options.IIIIIlllIIllllIlllIlllIIl) {
            return this.lIIlIlllIIlIIIIlIlIIIIlll ? string + "ON" : string + "OFF";
        }
        if (class_07282 == Options.IllIIIllIIIIlIlIlIllIIlll) {
            float f = this.lllIIIllIIIIlllIlIIllIIll(class_07282);
            return f == 0.0f ? string + "VSync" : (f == class_07282.getValueMax() ? string + class_0616.lllIIIllIIIIlllIlIIllIIll("options.framerateLimit.max", new Object[0]) : string + (int)f + " fps");
        }
        if (class_07282.getEnumFloat()) {
            float f = this.lllIIIllIIIIlllIlIIllIIll(class_07282);
            float f2 = class_07282.normalizeValue(f);
            return class_07282 == Options.SENSITIVITY ? (f2 == 0.0f ? string + class_0616.lllIIIllIIIIlllIlIIllIIll("options.sensitivity.min", new Object[0]) : (f2 == 1.0f ? string + class_0616.lllIIIllIIIIlllIlIIllIIll("options.sensitivity.max", new Object[0]) : string + (int)(f2 * 200.0f) + "%")) : (class_07282 == Options.FOV ? (f == 70.0f ? string + class_0616.lllIIIllIIIIlllIlIIllIIll("options.fov.min", new Object[0]) : (f == 110.0f ? string + class_0616.lllIIIllIIIIlllIlIIllIIll("options.fov.max", new Object[0]) : string + (int)f)) : (class_07282 == Options.IllIIIllIIIIlIlIlIllIIlll ? (f == class_07282.getValueMax() ? string + class_0616.lllIIIllIIIIlllIlIIllIIll("options.framerateLimit.max", new Object[0]) : string + (int)f + " fps") : (class_07282 == Options.GAMMA ? (f2 == 0.0f ? string + class_0616.lllIIIllIIIIlllIlIIllIIll("options.gamma.min", new Object[0]) : (f2 == 1.0f ? string + class_0616.lllIIIllIIIIlllIlIIllIIll("options.gamma.max", new Object[0]) : string + "+" + (int)(f2 * 100.0f) + "%")) : (class_07282 == Options.SATURATION ? string + (int)(f2 * 400.0f) + "%" : (class_07282 == Options.IlIIIlIIIIllIIIllIIIIIIll ? string + (int)(f2 * 90.0f + 10.0f) + "%" : (class_07282 == Options.CHAT_HEIGHT_UNFOCUSED ? string + class_1063.lllIlIIlIIIlIlIIIllIlllIl(f2) + "px" : (class_07282 == Options.CHAT_HEIGHT_FOCUSED ? string + class_1063.lllIlIIlIIIlIlIIIllIlllIl(f2) + "px" : (class_07282 == Options.CHAT_WIDTH ? string + class_1063.lllIIIllIIIIlllIlIIllIIll(f2) + "px" : (class_07282 == Options.RENDER_DISTANCE ? string + (int)f + " chunks" : (class_07282 == Options.ANISOTROPIC_FILTERING ? (f == 1.0f ? string + class_0616.lllIIIllIIIIlllIlIIllIIll("options.off", new Object[0]) : string + (int)f) : (class_07282 == Options.MIPMAP_LEVELS ? (f == 0.0f ? string + class_0616.lllIIIllIIIIlllIlIIllIIll("options.off", new Object[0]) : string + (int)f) : (class_07282 == Options.lIlIIllllIlIIIIllIIIIlIIl ? string + " fps" : (class_07282 == Options.llllllIlIllllIlIlIlIIIIlI ? string + " Kbps" : (class_07282 == Options.llllIIIIlIIIlIIIIIIlIllll ? string : (f2 == 0.0f ? string + class_0616.lllIIIllIIIIlllIlIIllIIll("options.off", new Object[0]) : string + (int)(f2 * 100.0f) + "%")))))))))))))));
        }
        if (class_07282.getEnumBoolean()) {
            boolean bl = this.lllIlIIlIIIlIlIIIllIlllIl(class_07282);
            return bl ? string + class_0616.lllIIIllIIIIlllIlIIllIIll("options.on", new Object[0]) : string + class_0616.lllIIIllIIIIlllIlIIllIIll("options.off", new Object[0]);
        }
        if (class_07282 == Options.llIIlllIllIllllIIIlIIIIII) {
            return string + class_0616.lllIIIllIIIIlllIlIIllIIll(this.IIlIlIIIIlIlllIIlIIlIIIII.lllIlIIlIIIlIlIIIllIlllIl(), new Object[0]);
        }
        if (class_07282 == Options.IlIlllIIIIIIlIIllIIllIlll) {
            return string + GameSettings.lllIIIllIIIIlllIlIIllIIll(IIIIlIIIIIIIllIlllIIlllII, this.IllIIIIIllIIlllIlIIIlIlll);
        }
        if (class_07282 == Options.IlIlIIlllIIlIllIIIlllllIl) {
            return string + class_0616.lllIIIllIIIIlllIlIIllIIll(this.IIIIIIlIIIIIIIIIIlIlIlIlI.lllIlIIlIIIlIlIIIllIlllIl(), new Object[0]);
        }
        if (class_07282 == Options.lllllIlllIIllIlIIlIIIllII) {
            return string + GameSettings.lllIIIllIIIIlllIlIIllIIll(IIllllllllIlllIIllllllllI, this.IllIlIIllIIllIlIIlIllIlIl);
        }
        if (class_07282 == Options.lllIIlIIIllllllIIIIlIlIlI) {
            return string + GameSettings.lllIIIllIIIIlllIlIIllIIll(lIlIIlIIllIllllllIIIIlllI, this.IllIIIllIIIIlIlIlIllIIlll);
        }
        if (class_07282 == Options.llIlllIIllIlllIlIlIlIIIll) {
            return string + GameSettings.lllIIIllIIIIlllIlIIllIIll(lIllIllllIlIlIIlIllIlIIlI, this.IllIIIIIllIlIIllIllllllIl);
        }
        if (class_07282 == Options.lllIIIIIIlIlllIIlIlIIIllI) {
            return string + GameSettings.lllIIIllIIIIlllIlIIllIIll(lllIllllllIIlIIllllIIllIl, this.IlIIllIIIlIlIlIIlIlIllIIl);
        }
        if (class_07282 == Options.llIIlIIllIIllIlIIllIIllII) {
            return string + GameSettings.lllIIIllIIIIlllIlIIllIIll(IIIllllllIlIlllIlIlIIIIll, this.IIllIIIlIIllllIIIIIIIIlll);
        }
        if (class_07282 == Options.lIlIlIIIIIIlIIllllIlIIllI) {
            return string + GameSettings.lllIIIllIIIIlllIlIIllIIll(IIIIIIIllllllIIIIllIIIIII, this.lIIIlIllllIlllIIIIIllIIIl);
        }
        if (class_07282 == Options.llIIllIllIlIIlIIllIllllll) {
            if (this.IIIllIllIIlIlIlIlIllllIIl) {
                return string + class_0616.lllIIIllIIIIlllIlIIllIIll("options.graphics.fancy", new Object[0]);
            }
            String string4 = "options.graphics.fast";
            return string + class_0616.lllIIIllIIIIlllIlIIllIIll("options.graphics.fast", new Object[0]);
        }
        return string;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl() {
        try {
            if (!this.lllIIIlIllIlllIlIIllIllIl.exists()) {
                return;
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.lllIIIlIllIlllIlIIllIllIl));
            String s = "";
            this.lIIIIIIIlllIllIlIlIlIllII.clear();
            while ((s = bufferedReader.readLine()) != null) {
                try {
                    String[] arrstring = s.split(":");
                    if (arrstring[0].equals("mouseSensitivity")) {
                        this.lllIIIllIIIIlllIlIIllIIll = this.lllIIIllIIIIlllIlIIllIIll(arrstring[1]);
                    }
                    if (arrstring[0].equals("invertYMouse")) {
                        this.lllIlIIlIIIlIlIIIllIlllIl = arrstring[1].equals("true");
                    }
                    if (arrstring[0].equals("fov")) {
                        this.llllIIIllIllIIIllIlIIIIIl = this.lllIIIllIIIIlllIlIIllIIll(arrstring[1]);
                    }
                    if (arrstring[0].equals("gamma")) {
                        this.lIIIlIllIlIIlIIIllIIlIlll = this.lllIIIllIIIIlllIlIIllIIll(arrstring[1]);
                    }
                    if (arrstring[0].equals("saturation")) {
                        this.lIlIllIIIlIlIlIlIIIllllll = this.lllIIIllIIIIlllIlIIllIIll(arrstring[1]);
                    }
                    if (arrstring[0].equals("fov")) {
                        this.llllIIIllIllIIIllIlIIIIIl = this.lllIIIllIIIIlllIlIIllIIll(arrstring[1]) * 40.0f + 70.0f;
                    }
                    if (arrstring[0].equals("renderDistance")) {
                        this.IlIllllllIIlIIllllIIlIIIl = Integer.parseInt(arrstring[1]);
                    }
                    if (arrstring[0].equals("guiScale")) {
                        this.IllIIIIIllIIlllIlIIIlIlll = Integer.parseInt(arrstring[1]);
                    }
                    if (arrstring[0].equals("particles")) {
                        this.IllIlIIllIIllIlIIlIllIlIl = Integer.parseInt(arrstring[1]);
                    }
                    if (arrstring[0].equals("bobView")) {
                        this.lIlllIlllIIIIlIIlllIllIII = arrstring[1].equals("true");
                    }
                    if (arrstring[0].equals("anaglyph3d")) {
                        this.IlIIIIIllllllIIlllIllllll = arrstring[1].equals("true");
                    }
                    if (arrstring[0].equals("advancedOpengl")) {
                        this.lIllllIIlIIIlIllllllIIIll = arrstring[1].equals("true");
                    }
                    if (arrstring[0].equals("maxFps")) {
                        this.IllIIlllllllIIlIIlIIIIlIl = Integer.parseInt(arrstring[1]);
                        this.lllllIllllIIIIllIIlIlIlII = false;
                        if (this.IllIIlllllllIIlIIlIIIIlIl <= 0) {
                            this.IllIIlllllllIIlIIlIIIIlIl = (int) Options.IllIIIllIIIIlIlIlIllIIlll.getValueMax();
                            this.lllllIllllIIIIllIIlIlIlII = true;
                        }
                        this.IIIllIllIIlIlIlIlIllllIIl();
                    }
                    if (arrstring[0].equals("fboEnable")) {
                        this.IIIllIIlIIIIIIlIlIIllIIlI = arrstring[1].equals("true");
                    }
                    if (arrstring[0].equals("difficulty")) {
                        this.IIlIlIIIIlIlllIIlIIlIIIII = class_1999.lllIIIllIIIIlllIlIIllIIll(Integer.parseInt(arrstring[1]));
                    }
                    if (arrstring[0].equals("fancyGraphics")) {
                        this.IIIllIllIIlIlIlIlIllllIIl = arrstring[1].equals("true");
                    }
                    if (arrstring[0].equals("ao")) {
                        this.IllIIIllIIIIlIlIlIllIIlll = arrstring[1].equals("true") ? 2 : (arrstring[1].equals("false") ? 0 : Integer.parseInt(arrstring[1]));
                    }
                    if (arrstring[0].equals("clouds")) {
                        this.llIllllIIIIIlIIlIlllIIlll = arrstring[1].equals("true");
                    }
                    if (arrstring[0].equals("resourcePacks")) {
                        this.resourcePacks = gson.fromJson(s.substring(s.indexOf(58) + 1), typeListString);

                        if (this.resourcePacks == null) {
                            this.resourcePacks = new ArrayList<>();
                        }
                    }
                    if (arrstring[0].equals("lastServer") && arrstring.length >= 2) {
                        this.lIlIlIIllIlIIIIIlIIlllIlI = s.substring(s.indexOf(58) + 1);
                    }
                    if (arrstring[0].equals("lang") && arrstring.length >= 2) {
                        this.IllIIlIIlIIIIlIlIlIIlIlIl = arrstring[1];
                    }
                    if (arrstring[0].equals("chatVisibility")) {
                        this.IIIIIIlIIIIIIIIIIlIlIlIlI = class_1210.lllIIIllIIIIlllIlIIllIIll(Integer.parseInt(arrstring[1]));
                    }
                    if (arrstring[0].equals("chatColors")) {
                        this.IllIlllIIIlllllIllIIlIlIl = arrstring[1].equals("true");
                    }
                    if (arrstring[0].equals("chatLinks")) {
                        this.IllIIIIlIIlllllllllIlIlII = arrstring[1].equals("true");
                    }
                    if (arrstring[0].equals("chatLinksPrompt")) {
                        this.IIIlllIlIIllIIlIlIllIlIIl = arrstring[1].equals("true");
                    }
                    if (arrstring[0].equals("chatOpacity")) {
                        this.llllIIIlIlIlIlIIlIIIIIlIl = this.lllIIIllIIIIlllIlIIllIIll(arrstring[1]);
                    }
                    if (arrstring[0].equals("snooperEnabled")) {
                        this.llIIIlIIllIIllIllIIlIlllI = arrstring[1].equals("true");
                    }
                    if (arrstring[0].equals("fullscreen")) {
                        this.lIIIIlIlIlIIIlIIllIIlIlIl = arrstring[1].equals("true");
                    }
                    if (arrstring[0].equals("enableVsync")) {
                        this.lllllIllllIIIIllIIlIlIlII = arrstring[1].equals("true");
                        this.IIIllIllIIlIlIlIlIllllIIl();
                    }
                    if (arrstring[0].equals("hideServerAddress")) {
                        this.lIIllIlIllIlIlIIlIlIIIIll = arrstring[1].equals("true");
                    }
                    if (arrstring[0].equals("advancedItemTooltips")) {
                        this.lIIllllIllIlllllIIllIllIl = arrstring[1].equals("true");
                    }
                    if (arrstring[0].equals("pauseOnLostFocus")) {
                        this.IIIIIlllIIllllIlllIlllIIl = arrstring[1].equals("true");
                    }
                    if (arrstring[0].equals("showCape")) {
                        this.llllIIllllIllIlllllIIlIlI = arrstring[1].equals("true");
                    }
                    if (arrstring[0].equals("touchscreen")) {
                        this.IllIlIlIIIlIllIlIlIIlllII = arrstring[1].equals("true");
                    }
                    if (arrstring[0].equals("overrideHeight")) {
                        this.overrideHeight = Integer.parseInt(arrstring[1]);
                    }
                    if (arrstring[0].equals("overrideWidth")) {
                        this.overrideWidth = Integer.parseInt(arrstring[1]);
                    }
                    if (arrstring[0].equals("heldItemTooltips")) {
                        this.lIIlIlllIIlIIIIlIlIIIIlll = arrstring[1].equals("true");
                    }
                    if (arrstring[0].equals("chatHeightFocused")) {
                        this.lIIIlllIlIIIlIllIIIlIllll = this.lllIIIllIIIIlllIlIIllIIll(arrstring[1]);
                    }
                    if (arrstring[0].equals("chatHeightUnfocused")) {
                        this.lIIIIIlIllIllIlIlIIllllll = this.lllIIIllIIIIlllIlIIllIIll(arrstring[1]);
                    }
                    if (arrstring[0].equals("chatScale")) {
                        this.IIIlIIllIIlIlIIlIIllIIIIl = this.lllIIIllIIIIlllIlIIllIIll(arrstring[1]);
                    }
                    if (arrstring[0].equals("chatWidth")) {
                        this.IIIIlIIIllIIIlIIlIIIIIlll = this.lllIIIllIIIIlllIlIIllIIll(arrstring[1]);
                    }
                    if (arrstring[0].equals("showInventoryAchievementHint")) {
                        this.IlIIIIIIIIIIlIIlllIIIlIlI = arrstring[1].equals("true");
                    }
                    if (arrstring[0].equals("mipmapLevels")) {
                        this.llIllIllIllIlIlIllIlIIIIl = Integer.parseInt(arrstring[1]);
                    }
                    if (arrstring[0].equals("anisotropicFiltering")) {
                        this.anisotropicFiltering = Integer.parseInt(arrstring[1]);
                    }
                    if (arrstring[0].equals("streamBytesPerPixel")) {
                        this.llIllIlllIllIlIIIIlIIlIII = this.lllIIIllIIIIlllIlIIllIIll(arrstring[1]);
                    }
                    if (arrstring[0].equals("streamMicVolume")) {
                        this.IlllIIIlIIlIIIIllllIllllI = this.lllIIIllIIIIlllIlIIllIIll(arrstring[1]);
                    }
                    if (arrstring[0].equals("streamSystemVolume")) {
                        this.llIlIIIlllIIIllIllllIIIll = this.lllIIIllIIIIlllIlIIllIIll(arrstring[1]);
                    }
                    if (arrstring[0].equals("streamKbps")) {
                        this.lIIlllIIIlIIlIllIIIIIlIlI = this.lllIIIllIIIIlllIlIIllIIll(arrstring[1]);
                    }
                    if (arrstring[0].equals("streamFps")) {
                        this.lllIlIIllllIIllIIIIllIlIl = this.lllIIIllIIIIlllIlIIllIIll(arrstring[1]);
                    }
                    if (arrstring[0].equals("streamCompression")) {
                        this.IllIIIIIllIlIIllIllllllIl = Integer.parseInt(arrstring[1]);
                    }
                    if (arrstring[0].equals("streamSendMetadata")) {
                        this.IIIlllllIIIIIllIllIIIIllI = arrstring[1].equals("true");
                    }
                    if (arrstring[0].equals("streamPreferredServer") && arrstring.length >= 2) {
                        this.IlIIIIIIllIIlIllIIllIllIl = s.substring(s.indexOf(58) + 1);
                    }
                    if (arrstring[0].equals("streamChatEnabled")) {
                        this.IlIIllIIIlIlIlIIlIlIllIIl = Integer.parseInt(arrstring[1]);
                    }
                    if (arrstring[0].equals("streamChatUserFilter")) {
                        this.IIllIIIlIIllllIIIIIIIIlll = Integer.parseInt(arrstring[1]);
                    }
                    if (arrstring[0].equals("streamMicToggleBehavior")) {
                        this.lIIIlIllllIlllIIIIIllIIIl = Integer.parseInt(arrstring[1]);
                    }
                    if (arrstring[0].equals("forceUnicodeFont")) {
                        this.lllIlIlIIIlIllllIlllIlIlI = arrstring[1].equals("true");
                    }
                    for (class_1335 class_13352 : this.llIlllllIIlIIlIIllllIllll) {
                        if (class_13352.lllIIIllIIIIlllIlIIllIIll || !arrstring[0].equals("key_" + class_13352.IIIllIIlIIIIIIlIlIIllIIlI())) continue;
                        int n = Integer.parseInt(arrstring[1]);
                        if (class_13352 == this.lIlIllllIlIIIIIllIIIIlIlI && n != -100 && n != -99) continue;
                        class_13352.lllIlIIlIIIlIlIIIllIlllIl(n);
                    }
                    for (class_0617 class_06172 : class_0617.values()) {
                        if (!arrstring[0].equals("soundCategory_" + class_06172.lllIIIllIIIIlllIlIIllIIll())) continue;
                        this.lIIIIIIIlllIllIlIlIlIllII.put(class_06172, Float.valueOf(this.lllIIIllIIIIlllIlIIllIIll(arrstring[1])));
                    }
                }
                catch (Exception exception) {
                    IIIIIlIIIIIllIIllIlIlIlIl.warn("Skipping bad option: " + s);
                    exception.printStackTrace();
                }
            }
            class_1335.lllIlIIlIIIlIlIIIllIlllIl();
            bufferedReader.close();
        }
        catch (Exception exception) {
            IIIIIlIIIIIllIIllIlIlIlIl.error("Failed to load options", (Throwable)exception);
        }
        this.lIllllIIlIIIlIllllllIIIll();
    }

    private float lllIIIllIIIIlllIlIIllIIll(String string) {
        return string.equals("true") ? 1.0f : (string.equals("false") ? 0.0f : Float.parseFloat(string));
    }

    public void IlIllllllIIlIIllllIIlIIIl() {
        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter(this.lllIIIlIllIlllIlIIllIllIl));
            printWriter.println("invertYMouse:" + this.lllIlIIlIIIlIlIIIllIlllIl);
            printWriter.println("mouseSensitivity:" + this.lllIIIllIIIIlllIlIIllIIll);
            printWriter.println("fov:" + (this.llllIIIllIllIIIllIlIIIIIl - 70.0f) / 40.0f);
            printWriter.println("gamma:" + this.lIIIlIllIlIIlIIIllIIlIlll);
            printWriter.println("saturation:" + this.lIlIllIIIlIlIlIlIIIllllll);
            printWriter.println("renderDistance:" + Config.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl, 2, 16));
            printWriter.println("guiScale:" + this.IllIIIIIllIIlllIlIIIlIlll);
            printWriter.println("particles:" + this.IllIlIIllIIllIlIIlIllIlIl);
            printWriter.println("bobView:" + this.lIlllIlllIIIIlIIlllIllIII);
            printWriter.println("anaglyph3d:" + this.IlIIIIIllllllIIlllIllllll);
            printWriter.println("advancedOpengl:" + this.lIllllIIlIIIlIllllllIIIll);
            printWriter.println("maxFps:" + this.IllIIlllllllIIlIIlIIIIlIl);
            printWriter.println("fboEnable:" + this.IIIllIIlIIIIIIlIlIIllIIlI);
            printWriter.println("difficulty:" + this.IIlIlIIIIlIlllIIlIIlIIIII.lllIIIllIIIIlllIlIIllIIll());
            printWriter.println("fancyGraphics:" + this.IIIllIllIIlIlIlIlIllllIIl);
            printWriter.println("ao:" + this.IllIIIllIIIIlIlIlIllIIlll);
            printWriter.println("clouds:" + this.llIllllIIIIIlIIlIlllIIlll);
            printWriter.println("resourcePacks:" + gson.toJson((Object)this.resourcePacks));
            printWriter.println("lastServer:" + this.lIlIlIIllIlIIIIIlIIlllIlI);
            printWriter.println("lang:" + this.IllIIlIIlIIIIlIlIlIIlIlIl);
            printWriter.println("chatVisibility:" + this.IIIIIIlIIIIIIIIIIlIlIlIlI.lllIIIllIIIIlllIlIIllIIll());
            printWriter.println("chatColors:" + this.IllIlllIIIlllllIllIIlIlIl);
            printWriter.println("chatLinks:" + this.IllIIIIlIIlllllllllIlIlII);
            printWriter.println("chatLinksPrompt:" + this.IIIlllIlIIllIIlIlIllIlIIl);
            printWriter.println("chatOpacity:" + this.llllIIIlIlIlIlIIlIIIIIlIl);
            printWriter.println("snooperEnabled:" + this.llIIIlIIllIIllIllIIlIlllI);
            printWriter.println("fullscreen:" + this.lIIIIlIlIlIIIlIIllIIlIlIl);
            printWriter.println("enableVsync:" + this.lllllIllllIIIIllIIlIlIlII);
            printWriter.println("hideServerAddress:" + this.lIIllIlIllIlIlIIlIlIIIIll);
            printWriter.println("advancedItemTooltips:" + this.lIIllllIllIlllllIIllIllIl);
            printWriter.println("pauseOnLostFocus:" + this.IIIIIlllIIllllIlllIlllIIl);
            printWriter.println("showCape:" + this.llllIIllllIllIlllllIIlIlI);
            printWriter.println("touchscreen:" + this.IllIlIlIIIlIllIlIlIIlllII);
            printWriter.println("overrideWidth:" + this.overrideWidth);
            printWriter.println("overrideHeight:" + this.overrideHeight);
            printWriter.println("heldItemTooltips:" + this.lIIlIlllIIlIIIIlIlIIIIlll);
            printWriter.println("chatHeightFocused:" + this.lIIIlllIlIIIlIllIIIlIllll);
            printWriter.println("chatHeightUnfocused:" + this.lIIIIIlIllIllIlIlIIllllll);
            printWriter.println("chatScale:" + this.IIIlIIllIIlIlIIlIIllIIIIl);
            printWriter.println("chatWidth:" + this.IIIIlIIIllIIIlIIlIIIIIlll);
            printWriter.println("showInventoryAchievementHint:" + this.IlIIIIIIIIIIlIIlllIIIlIlI);
            printWriter.println("mipmapLevels:" + this.llIllIllIllIlIlIllIlIIIIl);
            printWriter.println("anisotropicFiltering:" + this.anisotropicFiltering);
            printWriter.println("streamBytesPerPixel:" + this.llIllIlllIllIlIIIIlIIlIII);
            printWriter.println("streamMicVolume:" + this.IlllIIIlIIlIIIIllllIllllI);
            printWriter.println("streamSystemVolume:" + this.llIlIIIlllIIIllIllllIIIll);
            printWriter.println("streamKbps:" + this.lIIlllIIIlIIlIllIIIIIlIlI);
            printWriter.println("streamFps:" + this.lllIlIIllllIIllIIIIllIlIl);
            printWriter.println("streamCompression:" + this.IllIIIIIllIlIIllIllllllIl);
            printWriter.println("streamSendMetadata:" + this.IIIlllllIIIIIllIllIIIIllI);
            printWriter.println("streamPreferredServer:" + this.IlIIIIIIllIIlIllIIllIllIl);
            printWriter.println("streamChatEnabled:" + this.IlIIllIIIlIlIlIIlIlIllIIl);
            printWriter.println("streamChatUserFilter:" + this.IIllIIIlIIllllIIIIIIIIlll);
            printWriter.println("streamMicToggleBehavior:" + this.lIIIlIllllIlllIIIIIllIIIl);
            printWriter.println("forceUnicodeFont:" + this.lllIlIlIIIlIllllIlllIlIlI);
            for (class_1335 class_13352 : this.llIlllllIIlIIlIIllllIllll) {
                if (class_13352.lllIIIllIIIIlllIlIIllIIll) continue;
                printWriter.println("key_" + class_13352.IIIllIIlIIIIIIlIlIIllIIlI() + ":" + class_13352.IIIllIllIIlIlIlIlIllllIIl());
            }
            for (class_0617 class_06172 : class_0617.values()) {
                printWriter.println("soundCategory_" + class_06172.lllIIIllIIIIlllIlIIllIIll() + ":" + this.lllIIIllIIIIlllIlIIllIIll(class_06172));
            }
            printWriter.close();
        }
        catch (Exception exception) {
            IIIIIlIIIIIllIIllIlIlIlIl.error("Failed to save options", (Throwable)exception);
        }
        this.IIIllIIlIIIIIIlIlIIllIIlI();
        this.lIlllIlllIIIIlIIlllIllIII();
    }

    public float lllIIIllIIIIlllIlIIllIIll(class_0617 class_06172) {
        return this.lIIIIIIIlllIllIlIlIlIllII.containsKey((Object)class_06172) ? ((Float)this.lIIIIIIIlllIllIlIlIlIllII.get((Object)class_06172)).floatValue() : 1.0f;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0617 class_06172, float f) {
        this.lIllIlIlIIIIlIlIIlIlIlllI.IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_06172, f);
        this.lIIIIIIIlllIllIlIlIlIllII.put(class_06172, Float.valueOf(f));
    }

    public void lIlllIlllIIIIlIIlllIllIII() {
        if (this.lIllIlIlIIIIlIlIIlIlIlllI.lIIIIlIlIIlllllIIllIIlIII != null) {
            this.lIllIlIlIIIIlIlIIlIlIlllI.lIIIIlIlIIlllllIIllIIlIII.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new class_0681(this.IllIIlIIlIIIIlIlIlIIlIlIl, this.IlIllllllIIlIIllllIIlIIIl, this.IIIIIIlIIIIIIIIIIlIlIlIlI, this.IllIlllIIIlllllIllIIlIlIl, this.IIlIlIIIIlIlllIIlIIlIIIII, this.llllIIllllIllIlllllIIlIlI));
        }
    }

    public boolean IlIIIIIllllllIIlllIllllll() {
        return this.IlIllllllIIlIIllllIIlIIIl >= 4 && this.llIllllIIIIIlIIlIlllIIlll;
    }

    public void lIllllIIlIIIlIllllllIIIll() {
        try {
            File file = this.lllllllIlIIlIlIIIlIlIIlll;
            if (!file.exists()) {
                file = this.lllIIIlIllIlllIlIIllIllIl;
            }
            if (!file.exists()) {
                return;
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String string = "";
            while ((string = bufferedReader.readLine()) != null) {
                try {
                    String[] arrstring = string.split(":");
                    if (arrstring[0].equals("ofRenderDistanceChunks") && arrstring.length >= 2) {
                        this.IlIllllllIIlIIllllIIlIIIl = Integer.valueOf(arrstring[1]);
                        this.IlIllllllIIlIIllllIIlIIIl = Config.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl, 2, 32);
                    }
                    if (arrstring[0].equals("ofFogType") && arrstring.length >= 2) {
                        this.lIIIIlIlIIlllllIIllIIlIII = Integer.valueOf(arrstring[1]);
                        this.lIIIIlIlIIlllllIIllIIlIII = Config.lllIIIllIIIIlllIlIIllIIll(this.lIIIIlIlIIlllllIIllIIlIII, 1, 3);
                    }
                    if (arrstring[0].equals("ofFogStart") && arrstring.length >= 2) {
                        this.llIIlllIllIllllIIIlIIIIII = Float.valueOf(arrstring[1]).floatValue();
                        if (this.llIIlllIllIllllIIIlIIIIII < 0.2f) {
                            this.llIIlllIllIllllIIIlIIIIII = 0.2f;
                        }
                        if (this.llIIlllIllIllllIIIlIIIIII > 0.81f) {
                            this.llIIlllIllIllllIIIlIIIIII = 0.8f;
                        }
                    }
                    if (arrstring[0].equals("ofMipmapType") && arrstring.length >= 2) {
                        this.llIIllIllIlIIlIIllIllllll = Integer.valueOf(arrstring[1]);
                        this.llIIllIllIlIIlIIllIllllll = Config.lllIIIllIIIIlllIlIIllIIll(this.llIIllIllIlIIlIIllIllllll, 0, 3);
                    }
                    if (arrstring[0].equals("ofLoadFar") && arrstring.length >= 2) {
                        this.lllIIlIIIllllllIIIIlIlIlI = Boolean.valueOf(arrstring[1]);
                    }
                    if (arrstring[0].equals("ofPreloadedChunks") && arrstring.length >= 2) {
                        this.IlIlllIIIIIIlIIllIIllIlll = Integer.valueOf(arrstring[1]);
                        if (this.IlIlllIIIIIIlIIllIIllIlll < 0) {
                            this.IlIlllIIIIIIlIIllIIllIlll = 0;
                        }
                        if (this.IlIlllIIIIIIlIIllIIllIlll > 8) {
                            this.IlIlllIIIIIIlIIllIIllIlll = 8;
                        }
                    }
                    if (arrstring[0].equals("ofOcclusionFancy") && arrstring.length >= 2) {
                        this.IlIlIIlIlIllIIlIlIIllIIIl = Boolean.valueOf(arrstring[1]);
                    }
                    if (arrstring[0].equals("ofSmoothFps") && arrstring.length >= 2) {
                        this.lllllIlllIIllIlIIlIIIllII = Boolean.valueOf(arrstring[1]);
                    }
                    if (arrstring[0].equals("ofSmoothWorld") && arrstring.length >= 2) {
                        this.IlIlIIlllIIlIllIIIlllllIl = Boolean.valueOf(arrstring[1]);
                    }
                    if (arrstring[0].equals("ofAoLevel") && arrstring.length >= 2) {
                        this.lIlIlIIlIIIIlIIIIIlllIIII = Float.valueOf(arrstring[1]).floatValue();
                        this.lIlIlIIlIIIIlIIIIIlllIIII = Config.lllIIIllIIIIlllIlIIllIIll(this.lIlIlIIlIIIIlIIIIIlllIIII, 0.0f, 1.0f);
                    }
                    if (arrstring[0].equals("ofClouds") && arrstring.length >= 2) {
                        this.IIlllIlIlllIllIIIlllIIlIl = Integer.valueOf(arrstring[1]);
                        this.IIlllIlIlllIllIIIlllIIlIl = Config.lllIIIllIIIIlllIlIIllIIll(this.IIlllIlIlllIllIIIlllIIlIl, 0, 3);
                    }
                    if (arrstring[0].equals("ofCloudsHeight") && arrstring.length >= 2) {
                        this.lIlIllIIlIIlIIlIIlIIlIIll = Float.valueOf(arrstring[1]).floatValue();
                        this.lIlIllIIlIIlIIlIIlIIlIIll = Config.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, 0.0f, 1.0f);
                    }
                    if (arrstring[0].equals("ofTrees") && arrstring.length >= 2) {
                        this.llIIlIllIllllIlIIIIlIIlll = Integer.valueOf(arrstring[1]);
                        this.llIIlIllIllllIlIIIIlIIlll = Config.lllIIIllIIIIlllIlIIllIIll(this.llIIlIllIllllIlIIIIlIIlll, 0, 2);
                    }
                    if (arrstring[0].equals("ofGrass") && arrstring.length >= 2) {
                        this.llIllllIlIllIIIlIllIIlIlI = Integer.valueOf(arrstring[1]);
                        this.llIllllIlIllIIIlIllIIlIlI = Config.lllIIIllIIIIlllIlIIllIIll(this.llIllllIlIllIIIlIllIIlIlI, 0, 2);
                    }
                    if (arrstring[0].equals("ofDroppedItems") && arrstring.length >= 2) {
                        this.llIIlIlIlllIIllIlIlllIllI = Integer.valueOf(arrstring[1]);
                        this.llIIlIlIlllIIllIlIlllIllI = Config.lllIIIllIIIIlllIlIIllIIll(this.llIIlIlIlllIIllIlIlllIllI, 0, 2);
                    }
                    if (arrstring[0].equals("ofRain") && arrstring.length >= 2) {
                        this.lIlllIlllIlIIIIlllIlIlIIl = Integer.valueOf(arrstring[1]);
                        this.lIlllIlllIlIIIIlllIlIlIIl = Config.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIlIIIIlllIlIlIIl, 0, 3);
                    }
                    if (arrstring[0].equals("ofWater") && arrstring.length >= 2) {
                        this.IlIIlllllIIlIlIlllllIllll = Integer.valueOf(arrstring[1]);
                        this.IlIIlllllIIlIlIlllllIllll = Config.lllIIIllIIIIlllIlIIllIIll(this.IlIIlllllIIlIlIlllllIllll, 0, 3);
                    }
                    if (arrstring[0].equals("ofAnimatedWater") && arrstring.length >= 2) {
                        this.IlllIIIllllIIllIllIlIIlIl = Integer.valueOf(arrstring[1]);
                        this.IlllIIIllllIIllIllIlIIlIl = Config.lllIIIllIIIIlllIlIIllIIll(this.IlllIIIllllIIllIllIlIIlIl, 0, 2);
                    }
                    if (arrstring[0].equals("ofAnimatedLava") && arrstring.length >= 2) {
                        this.lllIIIlIIlIlIllIIIIIlIIll = Integer.valueOf(arrstring[1]);
                        this.lllIIIlIIlIlIllIIIIIlIIll = Config.lllIIIllIIIIlllIlIIllIIll(this.lllIIIlIIlIlIllIIIIIlIIll, 0, 2);
                    }
                    if (arrstring[0].equals("ofAnimatedFire") && arrstring.length >= 2) {
                        this.IIIlIlIllIlllllIlIllllllI = Boolean.valueOf(arrstring[1]);
                    }
                    if (arrstring[0].equals("ofAnimatedPortal") && arrstring.length >= 2) {
                        this.IIIIlIllIlIIIIIllllIIlllI = Boolean.valueOf(arrstring[1]);
                    }
                    if (arrstring[0].equals("ofAnimatedRedstone") && arrstring.length >= 2) {
                        this.llllIlIIllIIlllllIIllIIll = Boolean.valueOf(arrstring[1]);
                    }
                    if (arrstring[0].equals("ofAnimatedExplosion") && arrstring.length >= 2) {
                        this.IlIlIllIIlIIIIlllIlIllIlI = Boolean.valueOf(arrstring[1]);
                    }
                    if (arrstring[0].equals("ofAnimatedFlame") && arrstring.length >= 2) {
                        this.IlIIllIlIlIllIIIlIIlIlIIl = Boolean.valueOf(arrstring[1]);
                    }
                    if (arrstring[0].equals("ofAnimatedSmoke") && arrstring.length >= 2) {
                        this.lIlIIllIllIIIIIlIllllIIIl = Boolean.valueOf(arrstring[1]);
                    }
                    if (arrstring[0].equals("ofVoidParticles") && arrstring.length >= 2) {
                        this.lIlllIIllIIIIIIlIlIIlIllI = Boolean.valueOf(arrstring[1]);
                    }
                    if (arrstring[0].equals("ofWaterParticles") && arrstring.length >= 2) {
                        this.llIIIlIlIlIIlIllIIIllIlIl = Boolean.valueOf(arrstring[1]);
                    }
                    if (arrstring[0].equals("ofPortalParticles") && arrstring.length >= 2) {
                        this.llIIIIIlIIlIIIIllIIIlIIII = Boolean.valueOf(arrstring[1]);
                    }
                    if (arrstring[0].equals("ofPotionParticles") && arrstring.length >= 2) {
                        this.lIlIlIIllIIIlllIllIIlIllI = Boolean.valueOf(arrstring[1]);
                    }
                    if (arrstring[0].equals("ofDrippingWaterLava") && arrstring.length >= 2) {
                        this.IlIIIIIllIlllIIIIlIIIllIl = Boolean.valueOf(arrstring[1]);
                    }
                    if (arrstring[0].equals("ofAnimatedTerrain") && arrstring.length >= 2) {
                        this.lIIlIlIIllIIIlIIlIlIIIlII = Boolean.valueOf(arrstring[1]);
                    }
                    if (arrstring[0].equals("ofAnimatedTextures") && arrstring.length >= 2) {
                        this.lIlIllIIllIIIIlllIlIlllIl = Boolean.valueOf(arrstring[1]);
                    }
                    if (arrstring[0].equals("ofAnimatedItems") && arrstring.length >= 2) {
                        this.lIIIlIIllIllIIlIIlIIIllII = Boolean.valueOf(arrstring[1]);
                    }
                    if (arrstring[0].equals("ofRainSplash") && arrstring.length >= 2) {
                        this.lIIlIIlIllIlIIlIlIIlIlIlI = Boolean.valueOf(arrstring[1]);
                    }
                    if (arrstring[0].equals("ofLagometer") && arrstring.length >= 2) {
                        this.IIlIIlIlIlIllIIlIlIIIIlll = Boolean.valueOf(arrstring[1]);
                    }
                    if (arrstring[0].equals("ofShowFps") && arrstring.length >= 2) {
                        this.IIIIlIllIlIIlIIlIllIlIlll = Boolean.valueOf(arrstring[1]);
                    }
                    if (arrstring[0].equals("ofAutoSaveTicks") && arrstring.length >= 2) {
                        this.IIIIIIIIlIllIIllIIlllIllI = Integer.valueOf(arrstring[1]);
                        this.IIIIIIIIlIllIIllIIlllIllI = Config.lllIIIllIIIIlllIlIIllIIll(this.IIIIIIIIlIllIIllIIlllIllI, 40, 40000);
                    }
                    if (arrstring[0].equals("ofBetterGrass") && arrstring.length >= 2) {
                        this.IllIIIIllIIllIllIlllIlIIl = Integer.valueOf(arrstring[1]);
                        this.IllIIIIllIIllIllIlllIlIIl = Config.lllIIIllIIIIlllIlIIllIIll(this.IllIIIIllIIllIllIlllIlIIl, 1, 3);
                    }
                    if (arrstring[0].equals("ofConnectedTextures") && arrstring.length >= 2) {
                        this.lIIlIlllIllIlIlllIIIIIIII = Integer.valueOf(arrstring[1]);
                        this.lIIlIlllIllIlIlllIIIIIIII = Config.lllIIIllIIIIlllIlIIllIIll(this.lIIlIlllIllIlIlllIIIIIIII, 1, 3);
                    }
                    if (arrstring[0].equals("ofWeather") && arrstring.length >= 2) {
                        this.IlIlIIlllIllllllllIIIlIlI = Boolean.valueOf(arrstring[1]);
                    }
                    if (arrstring[0].equals("ofSky") && arrstring.length >= 2) {
                        this.llllIIIIlIIIlIIIIIIlIllll = Boolean.valueOf(arrstring[1]);
                    }
                    if (arrstring[0].equals("ofStars") && arrstring.length >= 2) {
                        this.llIIIIllIIIIIIIlIIIlIIIIl = Boolean.valueOf(arrstring[1]);
                    }
                    if (arrstring[0].equals("ofSunMoon") && arrstring.length >= 2) {
                        this.IIllIllIIllIIlllIIIlIlllI = Boolean.valueOf(arrstring[1]);
                    }
                    if (arrstring[0].equals("ofVignette") && arrstring.length >= 2) {
                        this.llllllIlIllllIlIlIlIIIIlI = Integer.valueOf(arrstring[1]);
                        this.llllllIlIllllIlIlIlIIIIlI = Config.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI, 0, 2);
                    }
                    if (arrstring[0].equals("ofChunkUpdates") && arrstring.length >= 2) {
                        this.lIlIIllllIlIIIIllIIIIlIIl = Integer.valueOf(arrstring[1]);
                        this.lIlIIllllIlIIIIllIIIIlIIl = Config.lllIIIllIIIIlllIlIIllIIll(this.lIlIIllllIlIIIIllIIIIlIIl, 1, 5);
                    }
                    if (!arrstring[0].equals("ofChunkLoading") || arrstring.length >= 2) {
                        // empty if block
                    }
                    if (arrstring[0].equals("ofChunkUpdatesDynamic") && arrstring.length >= 2) {
                        this.IIIIlIIlIIIllIIIIllIIIlII = Boolean.valueOf(arrstring[1]);
                    }
                    if (arrstring[0].equals("ofTime") && arrstring.length >= 2) {
                        this.lllIIIIIIlIlllIIlIlIIIllI = Integer.valueOf(arrstring[1]);
                        this.lllIIIIIIlIlllIIlIlIIIllI = Config.lllIIIllIIIIlllIlIIllIIll(this.lllIIIIIIlIlllIIlIlIIIllI, 0, 3);
                    }
                    if (arrstring[0].equals("ofClearWater") && arrstring.length >= 2) {
                        this.llIIlIIllIIllIlIIllIIllII = Boolean.valueOf(arrstring[1]);
                        this.lIIIIlIlIIlllllIIllIIlIII();
                    }
                    if (arrstring[0].equals("ofDepthFog") && arrstring.length >= 2) {
                        this.lIlIlIIIIIIlIIllllIlIIllI = Boolean.valueOf(arrstring[1]);
                    }
                    if (arrstring[0].equals("ofAaLevel") && arrstring.length >= 2) {
                        this.IlIIIlIIIIllIIIllIIIIIIll = Integer.valueOf(arrstring[1]);
                        this.IlIIIlIIIIllIIIllIIIIIIll = Config.lllIIIllIIIIlllIlIIllIIll(this.IlIIIlIIIIllIIIllIIIIIIll, 0, 16);
                    }
                    if (arrstring[0].equals("ofProfiler") && arrstring.length >= 2) {
                        this.llIIIlllIlllIlIllIIIIllIl = Boolean.valueOf(arrstring[1]);
                    }
                    if (arrstring[0].equals("ofBetterSnow") && arrstring.length >= 2) {
                        this.IllllIIIIlIIlIIIIlllIIIIl = Boolean.valueOf(arrstring[1]);
                    }
                    if (arrstring[0].equals("ofSwampColors") && arrstring.length >= 2) {
                        this.IIIIlIlIIlIIIIlIlllIlIIII = Boolean.valueOf(arrstring[1]);
                    }
                    if (arrstring[0].equals("ofRandomMobs") && arrstring.length >= 2) {
                        this.lllIIIIlIlIIlIIlllIIIIIIl = Boolean.valueOf(arrstring[1]);
                    }
                    if (arrstring[0].equals("ofSmoothBiomes") && arrstring.length >= 2) {
                        this.llIlIIlllIIIIIllIIlIlIIII = Boolean.valueOf(arrstring[1]);
                    }
                    if (arrstring[0].equals("ofCustomFonts") && arrstring.length >= 2) {
                        this.IllIIIlllllIlIlllIlllllII = Boolean.valueOf(arrstring[1]);
                    }
                    if (arrstring[0].equals("ofCustomColors") && arrstring.length >= 2) {
                        this.llIlllIlIIllIlIIIIllIIlIl = Boolean.valueOf(arrstring[1]);
                    }
                    if (arrstring[0].equals("ofCustomSky") && arrstring.length >= 2) {
                        this.lIIIllIIIIIllllIlIlIllIll = Boolean.valueOf(arrstring[1]);
                    }
                    if (arrstring[0].equals("ofShowCapes") && arrstring.length >= 2) {
                        this.lIIIlIIIlIlllIllIIIlIIIlI = Boolean.valueOf(arrstring[1]);
                    }
                    if (arrstring[0].equals("ofNaturalTextures") && arrstring.length >= 2) {
                        this.IIlIllIIlllllIIlIIllllIIl = Boolean.valueOf(arrstring[1]);
                    }
                    if (arrstring[0].equals("ofLazyChunkLoading") && arrstring.length >= 2) {
                        this.lIIlIIIIIlIlllIlIIlIlIlll = Boolean.valueOf(arrstring[1]);
                    }
                    if (arrstring[0].equals("ofDynamicFov") && arrstring.length >= 2) {
                        this.llllIIllIlIlllllllIIlIIlI = Boolean.valueOf(arrstring[1]);
                    }
                    if (arrstring[0].equals("ofDynamicLights") && arrstring.length >= 2) {
                        this.IlllIIlllllllIIllIlIllllI = Integer.valueOf(arrstring[1]);
                        this.IlllIIlllllllIIllIlIllllI = Config.lllIIIllIIIIlllIlIIllIIll(this.IlllIIlllllllIIllIlIllllI, 1, 3);
                    }
                    if (arrstring[0].equals("ofFullscreenMode") && arrstring.length >= 2) {
                        this.llllIlIIIIIIIIIlllIIlIIIl = arrstring[1];
                    }
                    if (arrstring[0].equals("ofFastMath") && arrstring.length >= 2) {
                        MathHelper.IlIIIIIllllllIIlllIllllll = this.IllllIIlIIIllIlllIlllIllI = Boolean.valueOf(arrstring[1]).booleanValue();
                    }
                    if (arrstring[0].equals("ofFastRender") && arrstring.length >= 2) {
                        this.IllIlIlIIIlllIIllIIIIlIll = Boolean.valueOf(arrstring[1]);
                    }
                    if (!arrstring[0].equals("ofTranslucentBlocks") || arrstring.length < 2) continue;
                    this.IlIIIlIllIIIllIIIIlIIlIll = Integer.valueOf(arrstring[1]);
                    this.IlIIIlIllIIIllIIIIlIIlIll = Config.lllIIIllIIIIlllIlIIllIIll(this.IlIIIlIllIIIllIIIIlIIlIll, 1, 2);
                }
                catch (Exception exception) {
                    Config.lllIIIllIIIIlllIlIIllIIll("Skipping bad option: " + string);
                    exception.printStackTrace();
                }
            }
            class_1335.lllIlIIlIIIlIlIIIllIlllIl();
            bufferedReader.close();
        }
        catch (Exception exception) {
            Config.lllIlIIlIIIlIlIIIllIlllIl("Failed to load options");
            exception.printStackTrace();
        }
    }

    public void IIIllIIlIIIIIIlIlIIllIIlI() {
        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter(this.lllllllIlIIlIlIIIlIlIIlll));
            printWriter.println("ofRenderDistanceChunks:" + this.IlIllllllIIlIIllllIIlIIIl);
            printWriter.println("ofFogType:" + this.lIIIIlIlIIlllllIIllIIlIII);
            printWriter.println("ofFogStart:" + this.llIIlllIllIllllIIIlIIIIII);
            printWriter.println("ofMipmapType:" + this.llIIllIllIlIIlIIllIllllll);
            printWriter.println("ofLoadFar:" + this.lllIIlIIIllllllIIIIlIlIlI);
            printWriter.println("ofPreloadedChunks:" + this.IlIlllIIIIIIlIIllIIllIlll);
            printWriter.println("ofOcclusionFancy:" + this.IlIlIIlIlIllIIlIlIIllIIIl);
            printWriter.println("ofSmoothFps:" + this.lllllIlllIIllIlIIlIIIllII);
            printWriter.println("ofSmoothWorld:" + this.IlIlIIlllIIlIllIIIlllllIl);
            printWriter.println("ofAoLevel:" + this.lIlIlIIlIIIIlIIIIIlllIIII);
            printWriter.println("ofClouds:" + this.IIlllIlIlllIllIIIlllIIlIl);
            printWriter.println("ofCloudsHeight:" + this.lIlIllIIlIIlIIlIIlIIlIIll);
            printWriter.println("ofTrees:" + this.llIIlIllIllllIlIIIIlIIlll);
            printWriter.println("ofGrass:" + this.llIllllIlIllIIIlIllIIlIlI);
            printWriter.println("ofDroppedItems:" + this.llIIlIlIlllIIllIlIlllIllI);
            printWriter.println("ofRain:" + this.lIlllIlllIlIIIIlllIlIlIIl);
            printWriter.println("ofWater:" + this.IlIIlllllIIlIlIlllllIllll);
            printWriter.println("ofAnimatedWater:" + this.IlllIIIllllIIllIllIlIIlIl);
            printWriter.println("ofAnimatedLava:" + this.lllIIIlIIlIlIllIIIIIlIIll);
            printWriter.println("ofAnimatedFire:" + this.IIIlIlIllIlllllIlIllllllI);
            printWriter.println("ofAnimatedPortal:" + this.IIIIlIllIlIIIIIllllIIlllI);
            printWriter.println("ofAnimatedRedstone:" + this.llllIlIIllIIlllllIIllIIll);
            printWriter.println("ofAnimatedExplosion:" + this.IlIlIllIIlIIIIlllIlIllIlI);
            printWriter.println("ofAnimatedFlame:" + this.IlIIllIlIlIllIIIlIIlIlIIl);
            printWriter.println("ofAnimatedSmoke:" + this.lIlIIllIllIIIIIlIllllIIIl);
            printWriter.println("ofVoidParticles:" + this.lIlllIIllIIIIIIlIlIIlIllI);
            printWriter.println("ofWaterParticles:" + this.llIIIlIlIlIIlIllIIIllIlIl);
            printWriter.println("ofPortalParticles:" + this.llIIIIIlIIlIIIIllIIIlIIII);
            printWriter.println("ofPotionParticles:" + this.lIlIlIIllIIIlllIllIIlIllI);
            printWriter.println("ofDrippingWaterLava:" + this.IlIIIIIllIlllIIIIlIIIllIl);
            printWriter.println("ofAnimatedTerrain:" + this.lIIlIlIIllIIIlIIlIlIIIlII);
            printWriter.println("ofAnimatedTextures:" + this.lIlIllIIllIIIIlllIlIlllIl);
            printWriter.println("ofAnimatedItems:" + this.lIIIlIIllIllIIlIIlIIIllII);
            printWriter.println("ofRainSplash:" + this.lIIlIIlIllIlIIlIlIIlIlIlI);
            printWriter.println("ofLagometer:" + this.IIlIIlIlIlIllIIlIlIIIIlll);
            printWriter.println("ofShowFps:" + this.IIIIlIllIlIIlIIlIllIlIlll);
            printWriter.println("ofAutoSaveTicks:" + this.IIIIIIIIlIllIIllIIlllIllI);
            printWriter.println("ofBetterGrass:" + this.IllIIIIllIIllIllIlllIlIIl);
            printWriter.println("ofConnectedTextures:" + this.lIIlIlllIllIlIlllIIIIIIII);
            printWriter.println("ofWeather:" + this.IlIlIIlllIllllllllIIIlIlI);
            printWriter.println("ofSky:" + this.llllIIIIlIIIlIIIIIIlIllll);
            printWriter.println("ofStars:" + this.llIIIIllIIIIIIIlIIIlIIIIl);
            printWriter.println("ofSunMoon:" + this.IIllIllIIllIIlllIIIlIlllI);
            printWriter.println("ofVignette:" + this.llllllIlIllllIlIlIlIIIIlI);
            printWriter.println("ofChunkUpdates:" + this.lIlIIllllIlIIIIllIIIIlIIl);
            printWriter.println("ofChunkLoading:" + this.llIlllIIllIlllIlIlIlIIIll);
            printWriter.println("ofChunkUpdatesDynamic:" + this.IIIIlIIlIIIllIIIIllIIIlII);
            printWriter.println("ofTime:" + this.lllIIIIIIlIlllIIlIlIIIllI);
            printWriter.println("ofClearWater:" + this.llIIlIIllIIllIlIIllIIllII);
            printWriter.println("ofDepthFog:" + this.lIlIlIIIIIIlIIllllIlIIllI);
            printWriter.println("ofAaLevel:" + this.IlIIIlIIIIllIIIllIIIIIIll);
            printWriter.println("ofProfiler:" + this.llIIIlllIlllIlIllIIIIllIl);
            printWriter.println("ofBetterSnow:" + this.IllllIIIIlIIlIIIIlllIIIIl);
            printWriter.println("ofSwampColors:" + this.IIIIlIlIIlIIIIlIlllIlIIII);
            printWriter.println("ofRandomMobs:" + this.lllIIIIlIlIIlIIlllIIIIIIl);
            printWriter.println("ofSmoothBiomes:" + this.llIlIIlllIIIIIllIIlIlIIII);
            printWriter.println("ofCustomFonts:" + this.IllIIIlllllIlIlllIlllllII);
            printWriter.println("ofCustomColors:" + this.llIlllIlIIllIlIIIIllIIlIl);
            printWriter.println("ofCustomSky:" + this.lIIIllIIIIIllllIlIlIllIll);
            printWriter.println("ofShowCapes:" + this.lIIIlIIIlIlllIllIIIlIIIlI);
            printWriter.println("ofNaturalTextures:" + this.IIlIllIIlllllIIlIIllllIIl);
            printWriter.println("ofLazyChunkLoading:" + this.lIIlIIIIIlIlllIlIIlIlIlll);
            printWriter.println("ofDynamicFov:" + this.llllIIllIlIlllllllIIlIIlI);
            printWriter.println("ofDynamicLights:" + this.IlllIIlllllllIIllIlIllllI);
            printWriter.println("ofFullscreenMode:" + this.llllIlIIIIIIIIIlllIIlIIIl);
            printWriter.println("ofFastMath:" + this.IllllIIlIIIllIlllIlllIllI);
            printWriter.println("ofFastRender:" + this.IllIlIlIIIlllIIllIIIIlIll);
            printWriter.println("ofTranslucentBlocks:" + this.IlIIIlIllIIIllIIIIlIIlIll);
            printWriter.close();
        }
        catch (Exception exception) {
            Config.lllIlIIlIIIlIlIIIllIlllIl("Failed to save options");
            exception.printStackTrace();
        }
    }

    public void IllIIlllllllIIlIIlIIIIlIl() {
        this.IlIllllllIIlIIllllIIlIIIl = 8;
        this.lIlllIlllIIIIlIIlllIllIII = true;
        this.IlIIIIIllllllIIlllIllllll = false;
        this.lIllllIIlIIIlIllllllIIIll = false;
        this.IllIIlllllllIIlIIlIIIIlIl = (int) Options.IllIIIllIIIIlIlIlIllIIlll.getValueMax();
        this.lllllIllllIIIIllIIlIlIlII = false;
        this.IIIllIllIIlIlIlIlIllllIIl();
        this.llIllIllIllIlIlIllIlIIIIl = 4;
        this.anisotropicFiltering = 1;
        this.IIIllIllIIlIlIlIlIllllIIl = true;
        this.IllIIIllIIIIlIlIlIllIIlll = 2;
        this.llIllllIIIIIlIIlIlllIIlll = true;
        this.llllIIIllIllIIIllIlIIIIIl = 70.0f;
        this.lIIIlIllIlIIlIIIllIIlIlll = 0.0f;
        this.IllIIIIIllIIlllIlIIIlIlll = 0;
        this.IllIlIIllIIllIlIIlIllIlIl = 0;
        this.lIIlIlllIIlIIIIlIlIIIIlll = true;
        this.lIIIIlIlIIlllllIIllIIlIII = 1;
        this.llIIlllIllIllllIIIlIIIIII = 0.8f;
        this.llIIllIllIlIIlIIllIllllll = 0;
        this.lllIIlIIIllllllIIIIlIlIlI = false;
        this.IlIlllIIIIIIlIIllIIllIlll = 0;
        this.IlIlIIlIlIllIIlIlIIllIIIl = false;
        this.lllllIlllIIllIlIIlIIIllII = false;
        Config.lllllIllllIIIIllIIlIlIlII();
        this.IlIlIIlllIIlIllIIIlllllIl = Config.lIIllIlIllIlIlIIlIlIIIIll();
        this.lIIlIIIIIlIlllIlIIlIlIlll = Config.lIIllIlIllIlIlIIlIlIIIIll();
        this.IllllIIlIIIllIlllIlllIllI = false;
        this.IllIlIlIIIlllIIllIIIIlIll = false;
        this.IlIIIlIllIIIllIIIIlIIlIll = 2;
        this.llllIIllIlIlllllllIIlIIlI = true;
        this.IlllIIlllllllIIllIlIllllI = 3;
        this.lIlIlIIlIIIIlIIIIIlllIIII = 1.0f;
        this.IlIIIlIIIIllIIIllIIIIIIll = 0;
        this.IIlllIlIlllIllIIIlllIIlIl = 0;
        this.lIlIllIIlIIlIIlIIlIIlIIll = 0.0f;
        this.llIIlIllIllllIlIIIIlIIlll = 0;
        this.llIllllIlIllIIIlIllIIlIlI = 0;
        this.lIlllIlllIlIIIIlllIlIlIIl = 0;
        this.IlIIlllllIIlIlIlllllIllll = 0;
        this.IllIIIIllIIllIllIlllIlIIl = 3;
        this.IIIIIIIIlIllIIllIIlllIllI = 4000;
        this.IIlIIlIlIlIllIIlIlIIIIlll = false;
        this.IIIIlIllIlIIlIIlIllIlIlll = false;
        this.llIIIlllIlllIlIllIIIIllIl = false;
        this.IlIlIIlllIllllllllIIIlIlI = true;
        this.llllIIIIlIIIlIIIIIIlIllll = true;
        this.llIIIIllIIIIIIIlIIIlIIIIl = true;
        this.IIllIllIIllIIlllIIIlIlllI = true;
        this.llllllIlIllllIlIlIlIIIIlI = 0;
        this.lIlIIllllIlIIIIllIIIIlIIl = 1;
        this.llIlllIIllIlllIlIlIlIIIll = 0;
        this.IIIIlIIlIIIllIIIIllIIIlII = false;
        this.lllIIIIIIlIlllIIlIlIIIllI = 0;
        this.llIIlIIllIIllIlIIllIIllII = false;
        this.lIlIlIIIIIIlIIllllIlIIllI = true;
        this.IllllIIIIlIIlIIIIlllIIIIl = false;
        this.llllIlIIIIIIIIIlllIIlIIIl = lIlIIIllIIllIIlIllllllIll;
        this.IIIIlIlIIlIIIIlIlllIlIIII = true;
        this.lllIIIIlIlIIlIIlllIIIIIIl = true;
        this.llIlIIlllIIIIIllIIlIlIIII = true;
        this.IllIIIlllllIlIlllIlllllII = true;
        this.llIlllIlIIllIlIIIIllIIlIl = true;
        this.lIIIllIIIIIllllIlIlIllIll = true;
        this.lIIIlIIIlIlllIllIIIlIIIlI = true;
        this.lIIlIlllIllIlIlllIIIIIIII = 2;
        this.IIlIllIIlllllIIlIIllllIIl = false;
        this.IlllIIIllllIIllIllIlIIlIl = 0;
        this.lllIIIlIIlIlIllIIIIIlIIll = 0;
        this.IIIlIlIllIlllllIlIllllllI = true;
        this.IIIIlIllIlIIIIIllllIIlllI = true;
        this.llllIlIIllIIlllllIIllIIll = true;
        this.IlIlIllIIlIIIIlllIlIllIlI = true;
        this.IlIIllIlIlIllIIIlIIlIlIIl = true;
        this.lIlIIllIllIIIIIlIllllIIIl = true;
        this.lIlllIIllIIIIIIlIlIIlIllI = true;
        this.llIIIlIlIlIIlIllIIIllIlIl = true;
        this.lIIlIIlIllIlIIlIlIIlIlIlI = true;
        this.llIIIIIlIIlIIIIllIIIlIIII = true;
        this.lIlIlIIllIIIlllIllIIlIllI = true;
        this.IlIIIIIllIlllIIIIlIIIllIl = true;
        this.lIIlIlIIllIIIlIIlIlIIIlII = true;
        this.lIIIlIIllIllIIlIIlIIIllII = true;
        this.lIlIllIIllIIIIlllIlIlllIl = true;
        this.lIllIlIlIIIIlIlIIlIlIlllI.IllIIIllIIIIlIlIlIllIIlll.lIIIIlIlIIlllllIIllIIlIII();
        this.lIIIIlIlIIlllllIIllIIlIII();
        this.lIllIlIlIIIIlIlIIlIlIlllI.IllIIIllIIIIlIlIlIllIIlll.IllIIlllllllIIlIIlIIIIlIl();
        this.lIllIlIlIIIIlIlIIlIlIlllI.IlIIIIIllllllIIlllIllllll();
        this.IlIllllllIIlIIllllIIlIIIl();
    }

    public void IIIllIllIIlIlIlIlIllllIIl() {
        Display.setVSyncEnabled((boolean)this.lllllIllllIIIIllIIlIlIlII);
    }

    private void lIIIIlIlIIlllllIIllIIlIII() {
        if (this.lIllIlIlIIIIlIlIIlIlIlllI.IIIIlIllIlIIlIIlIllIlIlll() && this.lIllIlIlIIIIlIlIIlIlIlllI.llllIIIIlIIIlIIIIIIlIllll() != null) {
            Config.IllIIIllIIIIlIlIlIllIIlll = true;
        }
        class_2164.lllIIIllIIIIlllIlIIllIIll(this, this.lIllIlIlIIIIlIlIIlIlIlllI.theWorld);
    }

    public void IllIIIllIIIIlIlIlIllIIlll() {
        if (this.lIllIlIlIIIIlIlIIlIlIlllI.IllIIIllIIIIlIlIlIllIIlll != null) {
            this.lIllIlIlIIIIlIlIIlIlIlllI.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll();
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        int n;
        this.IlllIIIllllIIllIllIlIIlIl = n = bl ? 0 : 2;
        this.lllIIIlIIlIlIllIIIIIlIIll = n;
        this.IIIlIlIllIlllllIlIllllllI = bl;
        this.IIIIlIllIlIIIIIllllIIlllI = bl;
        this.llllIlIIllIIlllllIIllIIll = bl;
        this.IlIlIllIIlIIIIlllIlIllIlI = bl;
        this.IlIIllIlIlIllIIIlIIlIlIIl = bl;
        this.lIlIIllIllIIIIIlIllllIIIl = bl;
        this.lIlllIIllIIIIIIlIlIIlIllI = bl;
        this.llIIIlIlIlIIlIllIIIllIlIl = bl;
        this.lIIlIIlIllIlIIlIlIIlIlIlI = bl;
        this.llIIIIIlIIlIIIIllIIIlIIII = bl;
        this.lIlIlIIllIIIlllIllIIlIllI = bl;
        this.IllIlIIllIIllIlIIlIllIlIl = bl ? 0 : 2;
        this.IlIIIIIllIlllIIIIlIIIllIl = bl;
        this.lIIlIlIIllIIIlIIlIlIIIlII = bl;
        this.lIIIlIIllIllIIlIIlIIIllII = bl;
        this.lIlIllIIllIIIIlllIlIlllIl = bl;
    }
}

