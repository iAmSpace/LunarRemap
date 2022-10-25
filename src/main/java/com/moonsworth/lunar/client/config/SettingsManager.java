package com.moonsworth.lunar.client.config;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 */
import java.util.ArrayList;
import java.util.List;

import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.settings.KeyBinding;
import obf.class_1788;
import org.apache.commons.lang3.ArrayUtils;

public class SettingsManager {
    public KeyBinding keyOpenMenu;
    public KeyBinding keyOpenVoiceMenu;
    public KeyBinding keyEmoteWheel;
    public KeyBinding keyVoiceChat;
    public KeyBinding keyDragToLook;
    public KeyBinding keyHideNamePlates;
    public final List<Setting> settingsList = new ArrayList<>();
    private final List<String[]> pinnedServers;
    private final List<String> warnedServers;
    public boolean IllIIlllllllIIlIIlIIIIlIl = false;
    public String IIIllIllIIlIlIlIlIllllIIl = "https://status.mojang.com/check";
    public int IllIIIllIIIIlIlIlIllIIlll = 60;
    public boolean lIIIIlIlIIlllllIIllIIlIII = true;
    private Setting labelAudioSettings;
    public Setting asMicrophone;
    public Setting llIIllIllIlIIlIIllIllllll;
    public Setting lllIIlIIIllllllIIIIlIlIlI;
    public Setting IlIlllIIIIIIlIIllIIllIlll;
    public Setting IlIlIIlIlIllIIlIlIIllIIIl;
    public Setting asMuteLunarSounds;
    private Setting labelFpsBoost;
    public Setting fpsEnableFpsBoost;
    public Setting fpsSlowChunkLoadingPercentage;
    public Setting fpsFullBright;
    public Setting fpsEnchantmentGlint;
    private Setting labelTeamView;
    public Setting tvEnableTeamView;
    public Setting tvShowDistance;
    public Setting tvShowOffscreenMarker;
    private Setting labelGeneralSettings;
    public Setting gsGuiBlur;
    public Setting gsWorldTime;
    public Setting gsLookView;
    public Setting gsSnapModsToOthers;
    private Setting labelRenderSettings;
    public Setting rsShowHudInDbg;
    public Setting rsShowChatBg;
    public Setting rsShinyPots;
    public Setting rsShowPotsInfoInInv;
    public Setting rsClearGlass;
    public Setting rsRedString;
    public Setting rsTransparentBg;
    private Setting labelCrosshairSettings;
    public Setting csCustomCrosshair;
    public Setting csOutline;
    public Setting csColor;
    public Setting csThickness;
    public Setting csSize;
    public Setting csGap;
    private Setting labelColorOptions;
    public Setting coDefaultColor;
    public List<class_1788> llIIlIIllIIllIlIIllIIllII = new ArrayList<>();
    public List<class_1788> lIlIlIIIIIIlIIllllIlIIllI = new ArrayList();

    public SettingsManager() {
        Object[] inputDevices = LunarClient.getInputDevices();
        this.labelAudioSettings = new Setting(this.settingsList, "label").setValue("Audio Settings");
        this.asMicrophone = inputDevices.length > 0 ?
                new Setting(this.settingsList, "Microphone").setValue(inputDevices[0]).setAcceptedValues(inputDevices).onChange(string -> System.out.println("[LC] Updated audio device!")) :
                new Setting(this.settingsList, "Microphone (None detected)").setValue("(Not connected)").setAcceptedValues("(Not connected)").onChange(string -> System.out.println("[LC] Updated audio device!"));
        this.asMuteLunarSounds = new Setting(this.settingsList, "Mute Lunar sounds").setValue(false);
        this.lllIIlIIIllllllIIIIlIlIlI = new Setting(this.settingsList, "Microphone Volume").onChange(n -> {}).setValue(70).setMinMax((Object)0, (Object)100);
        this.IlIlllIIIIIIlIIllIIllIlll = new Setting(this.settingsList, "Speaker Volume").onChange(n -> {
            try {
                float f = 20000.0f / (float)(20000 - Math.max(0, Math.min(19500, (int) n * 195)));
            }
            catch (UnsatisfiedLinkError unsatisfiedLinkError) {
                // empty catch block
            }
        }).setValue(85).setMinMax((Object)0, (Object)100);

        this.labelFpsBoost = new Setting(this.settingsList, "label").setValue("FPS Boost");
        this.fpsEnableFpsBoost = new Setting(this.settingsList, "Enable FPS Boost").setValue(true);
        this.fpsSlowChunkLoadingPercentage = new Setting(this.settingsList, "Slow chunk loading (%)").setMinMax(5, 100).setValue(30);
        this.fpsFullBright = new Setting(this.settingsList, "Fullbright").setValue(true);
        this.fpsEnchantmentGlint = new Setting(this.settingsList, "Enchantment Glint").setValue(true);

        this.labelTeamView = new Setting(this.settingsList, "label").setValue("Team View Settings");
        this.tvEnableTeamView = new Setting(this.settingsList, "Enable Team View").setValue(true);
        this.tvShowOffscreenMarker = new Setting(this.settingsList, "Show off-screen marker").setValue(true);
        this.tvShowDistance = new Setting(this.settingsList, "Show distance").setValue(true);

        this.labelGeneralSettings = new Setting(this.settingsList, "label").setValue("General Settings");
        this.gsGuiBlur = new Setting(this.settingsList, "GUI Blur Larkyo best bard").setValue(true);
        this.gsWorldTime = new Setting(this.settingsList, "World Time").setValue(-14490).setMinMax(-22880, -6100);
        this.gsLookView = new Setting(this.settingsList, "Look View").setValue("Third").setAcceptedValues("Third", "Reverse", "First");
        this.gsSnapModsToOthers = new Setting(this.settingsList, "Snap mods to other mods (GUI)").setValue(true);

        this.labelRenderSettings = new Setting(this.settingsList, "label").setValue("Render Settings");
        this.rsShowPotsInfoInInv = new Setting(this.settingsList, "Show Potion info in inventory").setValue(true);
        this.rsShowChatBg = new Setting(this.settingsList, "Show chat background").setValue(true);
        this.rsShowHudInDbg = new Setting(this.settingsList, "Show HUD while in debug view").setValue(false);
        this.rsShinyPots = new Setting(this.settingsList, "Shiny Pots").setValue(false);
        this.rsClearGlass = new Setting(this.settingsList, "Clear Glass").setValue("OFF").setAcceptedValues("OFF", "REGULAR", "ALL");
        this.rsRedString = new Setting(this.settingsList, "Red String").setValue(false);
        this.rsTransparentBg = new Setting(this.settingsList, "Transparent background").setValue(false);

        this.labelCrosshairSettings = new Setting(this.settingsList, "label").setValue("Crosshair Settings");
        this.csCustomCrosshair = new Setting(this.settingsList, "Custom crosshair").setValue(false);
        this.csOutline = new Setting(this.settingsList, "Outline").setValue(false);
        this.csColor = new Setting(this.settingsList, "Color").setValue(-1).setMinMax(Integer.MIN_VALUE, Integer.MAX_VALUE);
        this.csThickness = new Setting(this.settingsList, "Thickness").setValue(2.0f).setMinMax(1.0f, 2.5f);
        this.csSize = new Setting(this.settingsList, "Size").setValue(4.0f).setMinMax(1.0f, 10.0f);
        this.csGap = new Setting(this.settingsList, "Gap").setValue(1.75f).setMinMax(0.0f, 7.5f);

        this.labelColorOptions = new Setting(this.settingsList, "label").setValue("Color Options");
        this.coDefaultColor = new Setting(this.settingsList, "Default color").setValue(-1).setMinMax(Integer.MIN_VALUE, Integer.MAX_VALUE);

        // Register pinned servers
        this.pinnedServers = new ArrayList<>();
        // I'm sorry to Tion, M24, and Burner, for trying to line you lot up at the video- I spoke to my big brother, he told me wrong, and I understand that. I'm sincerely sorry.
        this.pinnedServers.add(new String[] { "Better than everything below", "bedwarspractice.club" });
        this.pinnedServers.add(new String[] { "Lunar Network", "lunar.gg" });

        // Register warned servers
        this.warnedServers = new ArrayList<>();
        this.warnedServers.add("xyz.com");

        // Register bindings
        GameSettings gameSettings = Minecraft.getMinecraft().gameSettings;
        this.keyVoiceChat = new KeyBinding("Voice Chat", 47, "Lunar Client", true);
        this.keyOpenMenu = new KeyBinding("Open Menu", 54, "Lunar Client", true);
        this.keyOpenVoiceMenu = new KeyBinding("Open Voice Menu", 25, "Lunar Client", true);
        this.keyEmoteWheel = new KeyBinding("Emote", 48, "Lunar Client", true);
        this.keyDragToLook = new KeyBinding("Drag to look", 56, "Lunar Client", true);
        this.keyHideNamePlates = new KeyBinding("Hide name plates", 0, "Lunar Client", true);
        gameSettings.keyBindings = ArrayUtils.addAll(gameSettings.keyBindings,
                this.keyVoiceChat, this.keyOpenMenu, this.keyOpenVoiceMenu, this.keyEmoteWheel, this.keyDragToLook, this.keyHideNamePlates
        );
    }

    public boolean lllIIIllIIIIlllIlIIllIIll() {
        return !((Boolean) this.fpsEnableFpsBoost.getValue()) || (Boolean) this.fpsEnchantmentGlint.getValue();
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(int n) {
        for (class_1788 class_17882 : this.llIIlIIllIIllIlIIllIIllII) {
            if (class_17882.lllIIIllIIIIlllIlIIllIIll != n) continue;
            return true;
        }
        return false;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(int n) {
        this.llIIlIIllIIllIlIIllIIllII.removeIf(class_17882 -> class_17882.lllIIIllIIIIlllIlIIllIIll == n);
    }

    public List<String[]> lllIlIIlIIIlIlIIIllIlllIl() {
        return this.pinnedServers;
    }

    public List<String> IlIllllllIIlIIllllIIlIIIl() {
        return this.warnedServers;
    }

    public Setting lIlllIlllIIIIlIIlllIllIII() {
        return this.labelCrosshairSettings;
    }
}

