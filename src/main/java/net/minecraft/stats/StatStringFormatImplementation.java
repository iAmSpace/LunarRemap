package net.minecraft.stats;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.stats.IStatStringFormat;

/*
 * Decompiled with CFR 0.150.
 */
public class StatStringFormatImplementation implements IStatStringFormat {
    final /* synthetic */ Minecraft mc;

    public StatStringFormatImplementation(Minecraft mc) {
        this.mc = mc;
    }

    @Override
    public String formatString(String p_74535_1_) {
        try {
            return String.format(p_74535_1_, GameSettings.lllIIIllIIIIlllIlIIllIIll(this.mc.gameSettings.IIllllIIlIlIlIlllIIIllIIl.IIIllIllIIlIlIlIlIllllIIl()));
        }
        catch (Exception exception) {
            return "Error: " + exception.getLocalizedMessage();
        }
    }
}

