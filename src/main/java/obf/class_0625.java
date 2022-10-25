package obf;/*
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
import org.apache.commons.lang3.ArrayUtils;

public class class_0625 {
    public class_1335 lllIIIllIIIIlllIlIIllIIll;
    public class_1335 lllIlIIlIIIlIlIIIllIlllIl;
    public class_1335 IlIllllllIIlIIllllIIlIIIl;
    public class_1335 lIlllIlllIIIIlIIlllIllIII;
    public class_1335 IlIIIIIllllllIIlllIllllll;
    public class_1335 lIllllIIlIIIlIllllllIIIll;
    public final List IIIllIIlIIIIIIlIlIIllIIlI = new ArrayList();
    private List IllllIIIIlIIlIIIIlllIIIIl;
    private List llllIlIIIIIIIIIlllIIlIIIl;
    public boolean IllIIlllllllIIlIIlIIIIlIl = false;
    public String IIIllIllIIlIlIlIlIllllIIl = "https://status.mojang.com/check";
    public int IllIIIllIIIIlIlIlIllIIlll = 60;
    public boolean lIIIIlIlIIlllllIIllIIlIII = true;
    private class_1609 IIIIlIlIIlIIIIlIlllIlIIII;
    public class_1609 llIIlllIllIllllIIIlIIIIII;
    public class_1609 llIIllIllIlIIlIIllIllllll;
    public class_1609 lllIIlIIIllllllIIIIlIlIlI;
    public class_1609 IlIlllIIIIIIlIIllIIllIlll;
    public class_1609 IlIlIIlIlIllIIlIlIIllIIIl;
    public class_1609 lllllIlllIIllIlIIlIIIllII;
    private class_1609 lllIIIIlIlIIlIIlllIIIIIIl;
    public class_1609 IlIlIIlllIIlIllIIIlllllIl;
    public class_1609 lIIlIIIIIlIlllIlIIlIlIlll;
    public class_1609 lIlIlIIlIIIIlIIIIIlllIIII;
    public class_1609 IlIIIlIIIIllIIIllIIIIIIll;
    private class_1609 llIlIIlllIIIIIllIIlIlIIII;
    public class_1609 IIlllIlIlllIllIIIlllIIlIl;
    public class_1609 lIlIllIIlIIlIIlIIlIIlIIll;
    public class_1609 llIIlIllIllllIlIIIIlIIlll;
    private class_1609 IllIIIlllllIlIlllIlllllII;
    public class_1609 llIllllIlIllIIIlIllIIlIlI;
    public class_1609 lIlllIlllIlIIIIlllIlIlIIl;
    public class_1609 IlIIlllllIIlIlIlllllIllll;
    public class_1609 llIIlIlIlllIIllIlIlllIllI;
    private class_1609 llIlllIlIIllIlIIIIllIIlIl;
    public class_1609 IllIIIIllIIllIllIlllIlIIl;
    public class_1609 IIIIIIIIlIllIIllIIlllIllI;
    public class_1609 IIlIIlIlIlIllIIlIlIIIIlll;
    public class_1609 llIIIlllIlllIlIllIIIIllIl;
    public class_1609 IIIIlIllIlIIlIIlIllIlIlll;
    public class_1609 IlIlIIlllIllllllllIIIlIlI;
    public class_1609 llllIIIIlIIIlIIIIIIlIllll;
    private class_1609 lIIIllIIIIIllllIlIlIllIll;
    public class_1609 llIIIIllIIIIIIIlIIIlIIIIl;
    public class_1609 IIllIllIIllIIlllIIIlIlllI;
    public class_1609 llllllIlIllllIlIlIlIIIIlI;
    public class_1609 lIlIIllllIlIIIIllIIIIlIIl;
    public class_1609 llIlllIIllIlllIlIlIlIIIll;
    public class_1609 IIIIlIIlIIIllIIIIllIIIlII;
    private class_1609 lIIIlIIIlIlllIllIIIlIIIlI;
    public class_1609 lllIIIIIIlIlllIIlIlIIIllI;
    public List llIIlIIllIIllIlIIllIIllII = new ArrayList();
    public List lIlIlIIIIIIlIIllllIlIIllI = new ArrayList();

    public class_0625() {
        Object[] arrobject = LunarClient.lIlIlIIlIIIIlIIIIIlllIIII();
        this.IIIIlIlIIlIIIIlIlllIlIIII = new class_1609(this.IIIllIIlIIIIIIlIlIIllIIlI, "label").lllIlIIlIIIlIlIIIllIlllIl("Audio Settings");
        this.llIIlllIllIllllIIIlIIIIII = arrobject.length > 0 ? new class_1609(this.IIIllIIlIIIIIIlIlIIllIIlI, "Microphone").lllIlIIlIIIlIlIIIllIlllIl(arrobject[0]).lllIIIllIIIIlllIlIIllIIll(arrobject).lllIIIllIIIIlllIlIIllIIll(string -> {
            try {
                System.out.println("[LC] Updated audio device!");
            }
            catch (UnsatisfiedLinkError unsatisfiedLinkError) {
                // empty catch block
            }
        }) : new class_1609(this.IIIllIIlIIIIIIlIlIIllIIlI, "Microphone").lllIlIIlIIIlIlIIIllIlllIl("Unknown").lllIIIllIIIIlllIlIIllIIll(new String[]{"Unknown"}).lllIIIllIIIIlllIlIIllIIll(string -> {
            try {
                System.out.println("[LC] Updated audio device!");
            }
            catch (UnsatisfiedLinkError unsatisfiedLinkError) {
                // empty catch block
            }
        });
        this.lllllIlllIIllIlIIlIIIllII = new class_1609(this.IIIllIIlIIIIIIlIlIIllIIlI, "Mute Lunar sounds").lllIlIIlIIIlIlIIIllIlllIl(false);
        this.lllIIlIIIllllllIIIIlIlIlI = new class_1609(this.IIIllIIlIIIIIIlIlIIllIIlI, "Microphone Volume").lllIIIllIIIIlllIlIIllIIll(n -> {}).lllIlIIlIIIlIlIIIllIlllIl(70).lllIIIllIIIIlllIlIIllIIll((Object)0, (Object)100);
        this.IlIlllIIIIIIlIIllIIllIlll = new class_1609(this.IIIllIIlIIIIIIlIlIIllIIlI, "Speaker Volume").lllIIIllIIIIlllIlIIllIIll(n -> {
            try {
                float f = 20000.0f / (float)(20000 - Math.max(0, Math.min(19500, n * 195)));
            }
            catch (UnsatisfiedLinkError unsatisfiedLinkError) {
                // empty catch block
            }
        }).lllIlIIlIIIlIlIIIllIlllIl(85).lllIIIllIIIIlllIlIIllIIll((Object)0, (Object)100);
        this.lllIIIIlIlIIlIIlllIIIIIIl = new class_1609(this.IIIllIIlIIIIIIlIlIIllIIlI, "label").lllIlIIlIIIlIlIIIllIlllIl("FPS Boost");
        this.IlIlIIlllIIlIllIIIlllllIl = new class_1609(this.IIIllIIlIIIIIIlIlIIllIIlI, "Enable FPS Boost").lllIlIIlIIIlIlIIIllIlllIl(true);
        this.lIIlIIIIIlIlllIlIIlIlIlll = new class_1609(this.IIIllIIlIIIIIIlIlIIllIIlI, "Slow chunk loading (%)").lllIIIllIIIIlllIlIIllIIll((Object)5, (Object)100).lllIlIIlIIIlIlIIIllIlllIl(30);
        this.lIlIlIIlIIIIlIIIIIlllIIII = new class_1609(this.IIIllIIlIIIIIIlIlIIllIIlI, "Fullbright").lllIlIIlIIIlIlIIIllIlllIl(true);
        this.IlIIIlIIIIllIIIllIIIIIIll = new class_1609(this.IIIllIIlIIIIIIlIlIIllIIlI, "Enchantment Glint").lllIlIIlIIIlIlIIIllIlllIl(true);
        this.llIlIIlllIIIIIllIIlIlIIII = new class_1609(this.IIIllIIlIIIIIIlIlIIllIIlI, "label").lllIlIIlIIIlIlIIIllIlllIl("Team View Settings");
        this.IIlllIlIlllIllIIIlllIIlIl = new class_1609(this.IIIllIIlIIIIIIlIlIIllIIlI, "Enable Team View").lllIlIIlIIIlIlIIIllIlllIl(true);
        this.llIIlIllIllllIlIIIIlIIlll = new class_1609(this.IIIllIIlIIIIIIlIlIIllIIlI, "Show off-screen marker").lllIlIIlIIIlIlIIIllIlllIl(true);
        this.lIlIllIIlIIlIIlIIlIIlIIll = new class_1609(this.IIIllIIlIIIIIIlIlIIllIIlI, "Show distance").lllIlIIlIIIlIlIIIllIlllIl(true);
        this.IllIIIlllllIlIlllIlllllII = new class_1609(this.IIIllIIlIIIIIIlIlIIllIIlI, "label").lllIlIIlIIIlIlIIIllIlllIl("General Settings");
        this.llIllllIlIllIIIlIllIIlIlI = new class_1609(this.IIIllIIlIIIIIIlIlIIllIIlI, "GUI Blur Larkyo best bard").lllIlIIlIIIlIlIIIllIlllIl(true);
        this.lIlllIlllIlIIIIlllIlIlIIl = new class_1609(this.IIIllIIlIIIIIIlIlIIllIIlI, "World Time").lllIlIIlIIIlIlIIIllIlllIl(-14490).lllIIIllIIIIlllIlIIllIIll((Object)-22880, (Object)-6100);
        this.IlIIlllllIIlIlIlllllIllll = new class_1609(this.IIIllIIlIIIIIIlIlIIllIIlI, "Look View").lllIlIIlIIIlIlIIIllIlllIl("Third").lllIIIllIIIIlllIlIIllIIll("Third", "Reverse", "First");
        this.llIIlIlIlllIIllIlIlllIllI = new class_1609(this.IIIllIIlIIIIIIlIlIIllIIlI, "Snap mods to other mods (GUI)").lllIlIIlIIIlIlIIIllIlllIl(true);
        this.llIlllIlIIllIlIIIIllIIlIl = new class_1609(this.IIIllIIlIIIIIIlIlIIllIIlI, "label").lllIlIIlIIIlIlIIIllIlllIl("Render Settings");
        this.llIIIlllIlllIlIllIIIIllIl = new class_1609(this.IIIllIIlIIIIIIlIlIIllIIlI, "Show Potion info in inventory").lllIlIIlIIIlIlIIIllIlllIl(true);
        this.IIIIIIIIlIllIIllIIlllIllI = new class_1609(this.IIIllIIlIIIIIIlIlIIllIIlI, "Show chat background").lllIlIIlIIIlIlIIIllIlllIl(true);
        this.IllIIIIllIIllIllIlllIlIIl = new class_1609(this.IIIllIIlIIIIIIlIlIIllIIlI, "Show HUD while in debug view").lllIlIIlIIIlIlIIIllIlllIl(false);
        this.IIlIIlIlIlIllIIlIlIIIIlll = new class_1609(this.IIIllIIlIIIIIIlIlIIllIIlI, "Shiny Pots").lllIlIIlIIIlIlIIIllIlllIl(false);
        this.IIIIlIllIlIIlIIlIllIlIlll = new class_1609(this.IIIllIIlIIIIIIlIlIIllIIlI, "Clear Glass").lllIlIIlIIIlIlIIIllIlllIl("OFF").lllIIIllIIIIlllIlIIllIIll("OFF", "REGULAR", "ALL");
        this.IlIlIIlllIllllllllIIIlIlI = new class_1609(this.IIIllIIlIIIIIIlIlIIllIIlI, "Red String").lllIlIIlIIIlIlIIIllIlllIl(false);
        this.llllIIIIlIIIlIIIIIIlIllll = new class_1609(this.IIIllIIlIIIIIIlIlIIllIIlI, "Transparent background").lllIlIIlIIIlIlIIIllIlllIl(false);
        this.lIIIllIIIIIllllIlIlIllIll = new class_1609(this.IIIllIIlIIIIIIlIlIIllIIlI, "label").lllIlIIlIIIlIlIIIllIlllIl("Crosshair Settings");
        this.llIIIIllIIIIIIIlIIIlIIIIl = new class_1609(this.IIIllIIlIIIIIIlIlIIllIIlI, "Custom crosshair").lllIlIIlIIIlIlIIIllIlllIl(false);
        this.IIllIllIIllIIlllIIIlIlllI = new class_1609(this.IIIllIIlIIIIIIlIlIIllIIlI, "Outline").lllIlIIlIIIlIlIIIllIlllIl(false);
        this.llllllIlIllllIlIlIlIIIIlI = new class_1609(this.IIIllIIlIIIIIIlIlIIllIIlI, "Color").lllIlIIlIIIlIlIIIllIlllIl(-1).lllIIIllIIIIlllIlIIllIIll((Object)Integer.MIN_VALUE, (Object)Integer.MAX_VALUE);
        this.lIlIIllllIlIIIIllIIIIlIIl = new class_1609(this.IIIllIIlIIIIIIlIlIIllIIlI, "Thickness").lllIlIIlIIIlIlIIIllIlllIl(Float.valueOf(2.0f)).lllIIIllIIIIlllIlIIllIIll((Object)Float.valueOf(1.0f), (Object)Float.valueOf(2.5f));
        this.llIlllIIllIlllIlIlIlIIIll = new class_1609(this.IIIllIIlIIIIIIlIlIIllIIlI, "Size").lllIlIIlIIIlIlIIIllIlllIl(Float.valueOf(4.0f)).lllIIIllIIIIlllIlIIllIIll((Object)Float.valueOf(1.0f), (Object)Float.valueOf(10.0f));
        this.IIIIlIIlIIIllIIIIllIIIlII = new class_1609(this.IIIllIIlIIIIIIlIlIIllIIlI, "Gap").lllIlIIlIIIlIlIIIllIlllIl(Float.valueOf(1.75f)).lllIIIllIIIIlllIlIIllIIll((Object)Float.valueOf(0.0f), (Object)Float.valueOf(7.5f));
        this.lIIIlIIIlIlllIllIIIlIIIlI = new class_1609(this.IIIllIIlIIIIIIlIlIIllIIlI, "label").lllIlIIlIIIlIlIIIllIlllIl("Color Options");
        this.lllIIIIIIlIlllIIlIlIIIllI = new class_1609(this.IIIllIIlIIIIIIlIlIIllIIlI, "Default color").lllIlIIlIIIlIlIIIllIlllIl(-1).lllIIIllIIIIlllIlIIllIIll((Object)Integer.MIN_VALUE, (Object)Integer.MAX_VALUE);
        this.IllllIIIIlIIlIIIIlllIIIIl = new ArrayList();
        this.IllllIIIIlIIlIIIIlllIIIIl.add(new String[]{"Lunar Network", "lunar.gg"});
        this.llllIlIIIIIIIIIlllIIlIIIl = new ArrayList();
        this.llllIlIIIIIIIIIlllIIlIIIl.add("xyz.com");
        GameSettings class_17512 = Minecraft.getMinecraft().gameSettings;
        this.lIlllIlllIIIIlIIlllIllIII = new class_1335("Voice Chat", 47, "Lunar Client", true);
        this.lllIIIllIIIIlllIlIIllIIll = new class_1335("Open Menu", 54, "Lunar Client", true);
        this.lllIlIIlIIIlIlIIIllIlllIl = new class_1335("Open Voice Menu", 25, "Lunar Client", true);
        this.IlIllllllIIlIIllllIIlIIIl = new class_1335("Emote", 48, "Lunar Client", true);
        this.IlIIIIIllllllIIlllIllllll = new class_1335("Drag to look", 56, "Lunar Client", true);
        this.lIllllIIlIIIlIllllllIIIll = new class_1335("Hide name plates", 0, "Lunar Client", true);
        class_17512.llIlllllIIlIIlIIllllIllll = (class_1335[])ArrayUtils.addAll((Object[])class_17512.llIlllllIIlIIlIIllllIllll, (Object[])new class_1335[]{this.lIlllIlllIIIIlIIlllIllIII, this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.IlIIIIIllllllIIlllIllllll, this.lIllllIIlIIIlIllllllIIIll});
    }

    public boolean lllIIIllIIIIlllIlIIllIIll() {
        return (Boolean)this.IlIlIIlllIIlIllIIIlllllIl.lIlllIlllIIIIlIIlllIllIII() == false || (Boolean)this.IlIIIlIIIIllIIIllIIIIIIll.lIlllIlllIIIIlIIlllIllIII() != false;
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

    public List lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IllllIIIIlIIlIIIIlllIIIIl;
    }

    public List IlIllllllIIlIIllllIIlIIIl() {
        return this.llllIlIIIIIIIIIlllIIlIIIl;
    }

    public class_1609 lIlllIlllIIIIlIIlllIllIII() {
        return this.lIIIllIIIIIllllIlIlIllIll;
    }
}

