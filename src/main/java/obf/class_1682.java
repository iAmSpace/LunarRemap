package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.opengl.GL11
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.minecraft.util.ResourceLocation;
import optifine.Config;
import net.minecraft.crash.CrashReport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

public class class_1682
implements class_2124,
class_0334 {
    private static final Logger lllIIIllIIIIlllIlIIllIIll = LogManager.getLogger();
    private final Map lllIlIIlIIIlIlIIIllIlllIl = Maps.newHashMap();
    private final Map IlIllllllIIlIIllllIIlIIIl = Maps.newHashMap();
    private final List lIlllIlllIIIIlIIlllIllIII = Lists.newArrayList();
    private final Map IlIIIIIllllllIIlllIllllll = Maps.newHashMap();
    private class_0947 lIllllIIlIIIlIllllllIIIll;

    public class_1682(class_0947 class_09472) {
        this.lIllllIIlIIIlIllllllIIIll = class_09472;
    }

    public void lllIIIllIIIIlllIlIIllIIll(ResourceLocation class_17732) {
        class_0211 class_02112;
        if (Config.lIIllIlIIlIIlllllIlIIllIl()) {
            class_17732 = class_1630.lllIIIllIIIIlllIlIIllIIll(class_17732);
        }
        if ((class_02112 = (class_0211)this.lllIlIIlIIIlIlIIIllIlllIl.get(class_17732)) == null) {
            class_02112 = new class_0995(class_17732);
            this.lllIIIllIIIIlllIlIIllIIll(class_17732, class_02112);
        }
        class_0231.lllIlIIlIIIlIlIIIllIlllIl(class_02112.lllIIIllIIIIlllIlIIllIIll());
    }

    public ResourceLocation lllIIIllIIIIlllIlIIllIIll(int n) {
        return (ResourceLocation)this.IlIllllllIIlIIllllIIlIIIl.get(n);
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(ResourceLocation class_17732, class_1511 class_15112) {
        if (this.lllIIIllIIIIlllIlIIllIIll(class_17732, (class_1420)class_15112)) {
            this.IlIllllllIIlIIllllIIlIIIl.put(class_15112.IlIIIIIllllllIIlllIllllll(), class_17732);
            return true;
        }
        return false;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(ResourceLocation class_17732, class_1420 class_14202) {
        if (this.lllIIIllIIIIlllIlIIllIIll(class_17732, (class_0211)class_14202)) {
            this.lIlllIlllIIIIlIIlllIllIII.add(class_14202);
            return true;
        }
        return false;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(ResourceLocation class_17732, class_0211 class_02112) {
        boolean bl = true;
        class_0211 class_02113 = class_02112;
        try {
            class_02112.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll);
        }
        catch (IOException iOException) {
            lllIIIllIIIIlllIlIIllIIll.warn("Failed to load texture: " + class_17732, (Throwable)iOException);
            class_02113 = class_0231.lllIIIllIIIIlllIlIIllIIll;
            this.lllIlIIlIIIlIlIIIllIlllIl.put(class_17732, class_02113);
            bl = false;
        }
        catch (Throwable throwable) {
            CrashReport class_02232 = CrashReport.lllIIIllIIIIlllIlIIllIIll(throwable, "Registering texture");
            class_0799 class_07992 = class_02232.lllIIIllIIIIlllIlIIllIIll("Resource location being registered");
            class_07992.lllIIIllIIIIlllIlIIllIIll("Resource location", class_17732);
            class_07992.addCrashSectionCallable("Texture object class", new class_1292(this, class_02112));
            throw new class_0892(class_02232);
        }
        this.lllIlIIlIIIlIlIIIllIlllIl.put(class_17732, class_02113);
        return bl;
    }

    public class_0211 lllIlIIlIIIlIlIIIllIlllIl(ResourceLocation class_17732) {
        return (class_0211)this.lllIlIIlIIIlIlIIIllIlllIl.get(class_17732);
    }

    public ResourceLocation lllIIIllIIIIlllIlIIllIIll(String string, class_2202 class_22022) {
        Integer n;
        if (string.equals("logo")) {
            class_22022 = Config.lllIIIllIIIIlllIlIIllIIll(class_22022);
        }
        n = (n = (Integer)this.IlIIIIIllllllIIlllIllllll.get(string)) == null ? Integer.valueOf(1) : Integer.valueOf(n + 1);
        this.IlIIIIIllllllIIlllIllllll.put(string, n);
        ResourceLocation class_17732 = new ResourceLocation(String.format("dynamic/%s_%d", string, n));
        this.lllIIIllIIIIlllIlIIllIIll(class_17732, (class_0211)class_22022);
        return class_17732;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl() {
        for (class_2124 class_21242 : this.lIlllIlllIIIIlIIlllIllIII) {
            class_21242.lllIlIIlIIIlIlIIIllIlllIl();
        }
    }

    public void IlIllllllIIlIIllllIIlIIIl(ResourceLocation class_17732) {
        class_0211 class_02112 = this.lllIlIIlIIIlIlIIIllIlllIl(class_17732);
        if (class_02112 != null) {
            class_0231.lllIIIllIIIIlllIlIIllIIll(class_02112.lllIIIllIIIIlllIlIIllIIll());
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0947 class_09472) {
        Object object;
        Object object2;
        Config.lllIIIllIIIIlllIlIIllIIll("*** Reloading textures ***");
        Config.lIlllIlllIIIIlIIlllIllIII("Resource packs: " + Config.IIlIllIIlllllIIlIIllllIIl());
        Iterator iterator = this.lllIlIIlIIIlIlIIIllIlllIl.keySet().iterator();
        while (iterator.hasNext()) {
            object2 = (ResourceLocation)iterator.next();
            if (!((ResourceLocation)object2).lllIIIllIIIIlllIlIIllIIll().startsWith("mcpatcher/")) continue;
            object = (class_0211)this.lllIlIIlIIIlIlIIIllIlllIl.get(object2);
            int n = object.lllIIIllIIIIlllIlIIllIIll();
            if (n > 0) {
                GL11.glDeleteTextures((int)n);
            }
            iterator.remove();
        }
        object2 = this.lllIlIIlIIIlIlIIIllIlllIl.entrySet().iterator();
        while (object2.hasNext()) {
            try {
                object = (Map.Entry)object2.next();
                this.lllIIIllIIIIlllIlIIllIIll((ResourceLocation)object.getKey(), (class_0211)object.getValue());
            }
            catch (Exception exception) {}
        }
    }
}

