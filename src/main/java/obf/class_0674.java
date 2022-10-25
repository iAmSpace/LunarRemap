package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import net.minecraft.client.renderer.OpenGlHelper;

import java.util.Map;

public enum class_0674 {
    lllIIIllIIIIlllIlIIllIIll("VERTEX", 0, "vertex", ".vsh", OpenGlHelper.lllllIlllIIllIlIIlIIIllII),
    lllIlIIlIIIlIlIIIllIlllIl("FRAGMENT", 1, "fragment", ".fsh", OpenGlHelper.IlIlIIlllIIlIllIIIlllllIl);

    private final String IlIllllllIIlIIllllIIlIIIl;
    private final String lIlllIlllIIIIlIIlllIllIII;
    private final int IlIIIIIllllllIIlllIllllll;
    private final Map lIllllIIlIIIlIllllllIIIll = Maps.newHashMap();
    private static final class_0674[] IIIllIIlIIIIIIlIlIIllIIlI;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private class_0674(String string3, String string4, int n) {
        void var7_5;
        void var6_4;
        this.IlIllllllIIlIIllllIIlIIIl = (String)n;
        this.lIlllIlllIIIIlIIlllIllIII = var6_4;
        this.IlIIIIIllllllIIlllIllllll = var7_5;
    }

    public String lllIIIllIIIIlllIlIIllIIll() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    protected String lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    protected int IlIllllllIIlIIllllIIlIIIl() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    protected Map lIlllIlllIIIIlIIlllIllIII() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    static {
        IIIllIIlIIIIIIlIlIIllIIlI = new class_0674[]{lllIIIllIIIIlllIlIIllIIll, lllIlIIlIIIlIlIIIllIlllIl};
    }
}

