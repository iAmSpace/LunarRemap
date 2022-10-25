package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import net.minecraft.util.ResourceLocation;
import net.minecraft.client.settings.GameSettings;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_1300
implements class_1923,
class_0334 {
    private static final Logger IlIllllllIIlIIllllIIlIIIl = LogManager.getLogger();
    private static final Gson lIlllIlllIIIIlIIlllIllIII = new GsonBuilder().registerTypeAdapter(class_0871.class, (Object)new class_0004()).create();
    private static final ParameterizedType IlIIIIIllllllIIlllIllllll = new class_1253();
    public static final class_1883 lllIIIllIIIIlllIlIIllIIll = new class_1883(new ResourceLocation("meta:missing_sound"), 0.0, 0.0, false);
    private final class_2221 lIllllIIlIIIlIllllllIIIll = new class_2221();
    public final class_0885 lllIlIIlIIIlIlIIIllIlllIl;
    private final class_0947 IIIllIIlIIIIIIlIlIIllIIlI;

    public class_1300(class_0947 class_09472, GameSettings class_17512) {
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_09472;
        this.lllIlIIlIIIlIlIIIllIlllIl = new class_0885(this, class_17512);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0947 class_09472) {
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll();
        this.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl();
        for (String string : class_09472.lllIIIllIIIIlllIlIIllIIll()) {
            try {
                List list = class_09472.lllIlIIlIIIlIlIIIllIlllIl(new ResourceLocation(string, "sounds.json"));
                for (class_2234 class_22342 : list) {
                    try {
                        Map map = (Map)lIlllIlllIIIIlIIlllIllIII.fromJson((Reader)new InputStreamReader(class_22342.getInputStream()), (Type)IlIIIIIllllllIIlllIllllll);
                        for (Map.Entry entry : map.entrySet()) {
                            this.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation(string, (String)entry.getKey()), (class_0871)entry.getValue());
                        }
                    }
                    catch (RuntimeException runtimeException) {
                        IlIllllllIIlIIllllIIlIIIl.warn("Invalid sounds.json", (Throwable)runtimeException);
                    }
                }
            }
            catch (IOException iOException) {
            }
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(ResourceLocation class_17732, class_0871 class_08712) {
        class_1329 class_13292;
        if (this.lIllllIIlIIIlIllllllIIIll.lIlllIlllIIIIlIIlllIllIII(class_17732) && !class_08712.lllIlIIlIIIlIlIIIllIlllIl()) {
            class_13292 = (class_1329)this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(class_17732);
        } else {
            IlIllllllIIlIIllllIIlIIIl.debug("Registered/replaced new sound event location {}", new Object[]{class_17732});
            class_13292 = new class_1329(class_17732, 1.0, 1.0, class_08712.IlIllllllIIlIIllllIIlIIIl());
            this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(class_13292);
        }
        block7: for (class_2190 class_21902 : class_08712.lllIIIllIIIIlllIlIIllIIll()) {
            class_0951 class_09512;
            String string = class_21902.lllIIIllIIIIlllIlIIllIIll();
            ResourceLocation class_17733 = new ResourceLocation(string);
            String string2 = string.contains(":") ? class_17733.lllIlIIlIIIlIlIIIllIlllIl() : class_17732.lllIlIIlIIIlIlIIIllIlllIl();
            switch (class_0412.lllIIIllIIIIlllIlIIllIIll[class_21902.IlIIIIIllllllIIlllIllllll().ordinal()]) {
                case 1: {
                    ResourceLocation class_17734 = new ResourceLocation(string2, "sounds/" + class_17733.lllIIIllIIIIlllIlIIllIIll() + ".ogg");
                    try {
                        this.IIIllIIlIIIIIIlIlIIllIIlI.getResource(class_17734);
                    }
                    catch (FileNotFoundException fileNotFoundException) {
                        IlIllllllIIlIIllllIIlIIIl.warn("File {} does not exist, cannot add it to event {}", new Object[]{class_17734, class_17732});
                        continue block7;
                    }
                    catch (IOException iOException) {
                        IlIllllllIIlIIllllIIlIIIl.warn("Could not load sound file " + class_17734 + ", cannot add it to event " + class_17732, (Throwable)iOException);
                        continue block7;
                    }
                    class_09512 = new class_1275(new class_1883(class_17734, class_21902.IlIllllllIIlIIllllIIlIIIl(), class_21902.lllIlIIlIIIlIlIIIllIlllIl(), class_21902.lIllllIIlIIIlIllllllIIIll()), class_21902.lIlllIlllIIIIlIIlllIllIII());
                    break;
                }
                case 2: {
                    class_09512 = new class_0456(this, string2, class_21902);
                    break;
                }
                default: {
                    throw new IllegalStateException("IN YOU FACE");
                }
            }
            class_13292.lllIIIllIIIIlllIlIIllIIll(class_09512);
        }
    }

    public class_1329 lllIIIllIIIIlllIlIIllIIll(ResourceLocation class_17732) {
        return (class_1329)this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(class_17732);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0308 class_03082) {
        this.lllIlIIlIIIlIlIIIllIlllIl.IlIllllllIIlIIllllIIlIIIl(class_03082);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0308 class_03082, int n) {
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(class_03082, n);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142, float f) {
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(class_08142, f);
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        this.lllIlIIlIIIlIlIIIllIlllIl.IlIIIIIllllllIIlllIllllll();
    }

    public void lllIlIIlIIIlIlIIIllIlllIl() {
        this.lllIlIIlIIIlIlIIIllIlllIl.IlIllllllIIlIIllllIIlIIIl();
    }

    public void IlIllllllIIlIIllllIIlIIIl() {
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl();
    }

    @Override
    public void lIIIIlIlIIlllllIIllIIlIII() {
        this.lllIlIIlIIIlIlIIIllIlllIl.lIlllIlllIIIIlIIlllIllIII();
    }

    public void lIlllIlllIIIIlIIlllIllIII() {
        this.lllIlIIlIIIlIlIIIllIlllIl.lIllllIIlIIIlIllllllIIIll();
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0617 class_06172, float f) {
        if (class_06172 == class_0617.lllIIIllIIIIlllIlIIllIIll && f <= 0.0f) {
            this.lllIlIIlIIIlIlIIIllIlllIl();
        }
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(class_06172, f);
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_0308 class_03082) {
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl(class_03082);
    }

    public class_1329 lllIIIllIIIIlllIlIIllIIll(class_0617 ... arrclass_0617) {
        ArrayList arrayList = Lists.newArrayList();
        for (ResourceLocation class_17732 : this.lIllllIIlIIIlIllllllIIIll.IlIllllllIIlIIllllIIlIIIl()) {
            class_1329 class_13292 = (class_1329)this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(class_17732);
            if (!ArrayUtils.contains((Object[])arrclass_0617, (Object)((Object)class_13292.IlIIIIIllllllIIlllIllllll()))) continue;
            arrayList.add(class_13292);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (class_1329)arrayList.get(new Random().nextInt(arrayList.size()));
    }

    public boolean IlIllllllIIlIIllllIIlIIIl(class_0308 class_03082) {
        return this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(class_03082);
    }

    static /* synthetic */ class_2221 lllIIIllIIIIlllIlIIllIIll(class_1300 class_13002) {
        return class_13002.lIllllIIlIIIlIllllllIIIll;
    }
}

