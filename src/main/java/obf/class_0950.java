package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.client.Minecraft;

import java.text.Collator;
import java.util.Locale;

public class class_0950 {
    public static String lllIIIllIIIIlllIlIIllIIll(String string) {
        return class_0616.lllIIIllIIIIlllIlIIllIIll(string, new Object[0]);
    }

    public static Collator lllIIIllIIIIlllIlIIllIIll() {
        String string = "en_US";
        try {
            string = Minecraft.getMinecraft().llllIlIIIIIIIIIlllIIlIIIl().IlIllllllIIlIIllllIIlIIIl().lllIIIllIIIIlllIlIIllIIll();
        }
        catch (NullPointerException nullPointerException) {
            // empty catch block
        }
        String[] arrstring = string.split("_");
        Locale locale = new Locale(arrstring[0], arrstring.length > 1 ? arrstring[1] : "");
        return Collator.getInstance(locale);
    }
}

