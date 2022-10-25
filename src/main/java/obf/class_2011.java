package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import net.minecraft.client.renderer.OpenGlHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_2011 {
    private static final Logger lllIIIllIIIIlllIlIIllIIll = LogManager.getLogger();
    private static class_2011 lllIlIIlIIIlIlIIIllIlllIl;

    public static void lllIIIllIIIIlllIlIIllIIll() {
        lllIlIIlIIIlIlIIIllIlllIl = new class_2011();
    }

    public static class_2011 lllIlIIlIIIlIlIIIllIlllIl() {
        return lllIlIIlIIIlIlIIIllIlllIl;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1282 class_12822) {
        class_12822.lIllllIIlIIIlIllllllIIIll().lllIlIIlIIIlIlIIIllIlllIl(class_12822);
        class_12822.IlIIIIIllllllIIlllIllllll().lllIlIIlIIIlIlIIIllIlllIl(class_12822);
        OpenGlHelper.IlIIIIIllllllIIlllIllllll(class_12822.IIIllIIlIIIIIIlIlIIllIIlI());
    }

    public int IlIllllllIIlIIllllIIlIIIl() {
        int n = OpenGlHelper.lIlllIlllIIIIlIIlllIllIII();
        if (n <= 0) {
            throw new class_0051("Could not create shader program (returned program ID " + n + ")");
        }
        return n;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_1282 class_12822) {
        class_12822.lIllllIIlIIIlIllllllIIIll().lllIIIllIIIIlllIlIIllIIll(class_12822);
        class_12822.IlIIIIIllllllIIlllIllllll().lllIIIllIIIIlllIlIIllIIll(class_12822);
        OpenGlHelper.lIllllIIlIIIlIllllllIIIll(class_12822.IIIllIIlIIIIIIlIlIIllIIlI());
        int n = OpenGlHelper.lllIIIllIIIIlllIlIIllIIll(class_12822.IIIllIIlIIIIIIlIlIIllIIlI(), OpenGlHelper.IlIlllIIIIIIlIIllIIllIlll);
        if (n == 0) {
            lllIIIllIIIIlllIlIIllIIll.warn("Error encountered when linking program containing VS " + class_12822.IlIIIIIllllllIIlllIllllll().lllIIIllIIIIlllIlIIllIIll() + " and FS " + class_12822.lIllllIIlIIIlIllllllIIIll().lllIIIllIIIIlllIlIIllIIll() + ". Log output:");
            lllIIIllIIIIlllIlIIllIIll.warn(OpenGlHelper.IlIIIIIllllllIIlllIllllll(class_12822.IIIllIIlIIIIIIlIlIIllIIlI(), 32768));
        }
    }
}

