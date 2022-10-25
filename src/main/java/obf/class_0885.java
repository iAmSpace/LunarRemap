package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.BiMap
 *  com.google.common.collect.HashBiMap
 *  com.google.common.collect.HashMultimap
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Multimap
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.apache.logging.log4j.Marker
 *  org.apache.logging.log4j.MarkerManager
 *  paulscode.sound.SoundSystemConfig
 *  paulscode.sound.SoundSystemException
 *  paulscode.sound.codecs.CodecJOrbis
 *  paulscode.sound.libraries.LibraryLWJGLOpenAL
 */
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.sound.sampled.AudioFormat;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.util.MathHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.SoundSystemException;
import paulscode.sound.codecs.CodecJOrbis;
import paulscode.sound.libraries.LibraryLWJGLOpenAL;

public class class_0885 {
    private static final Marker lllIlIIlIIIlIlIIIllIlllIl = MarkerManager.getMarker((String)"SOUNDS");
    private static final Logger IlIllllllIIlIIllllIIlIIIl = LogManager.getLogger();
    private final class_1300 lIlllIlllIIIIlIIlllIllIII;
    private final GameSettings IlIIIIIllllllIIlllIllllll;
    public class_2118 lllIIIllIIIIlllIlIIllIIll;
    private boolean lIllllIIlIIIlIllllllIIIll;
    private int IIIllIIlIIIIIIlIlIIllIIlI = 0;
    private final Map IllIIlllllllIIlIIlIIIIlIl = HashBiMap.create();
    private final Map IIIllIllIIlIlIlIlIllllIIl = ((BiMap)this.IllIIlllllllIIlIIlIIIIlIl).inverse();
    private Map IllIIIllIIIIlIlIlIllIIlll = Maps.newHashMap();
    private final Multimap lIIIIlIlIIlllllIIllIIlIII = HashMultimap.create();
    private final List llIIlllIllIllllIIIlIIIIII = Lists.newArrayList();
    private final Map llIIllIllIlIIlIIllIllllll = Maps.newHashMap();
    private final Map lllIIlIIIllllllIIIIlIlIlI = Maps.newHashMap();

    public class_0885(class_1300 class_13002, GameSettings class_17512) {
        this.lIlllIlllIIIIlIIlllIllIII = class_13002;
        this.IlIIIIIllllllIIlllIllllll = class_17512;
        try {
            SoundSystemConfig.addLibrary(LibraryLWJGLOpenAL.class);
            SoundSystemConfig.setCodec((String)"ogg", CodecJOrbis.class);
        }
        catch (SoundSystemException soundSystemException) {
            IlIllllllIIlIIllllIIlIIIl.error(lllIlIIlIIIlIlIIIllIlllIl, "Error linking with the LibraryJavaSound plug-in", (Throwable)soundSystemException);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        this.lllIlIIlIIIlIlIIIllIlllIl();
        this.IIIllIllIIlIlIlIlIllllIIl();
    }

    private synchronized void IIIllIllIIlIlIlIlIllllIIl() {
        if (!this.lIllllIIlIIIlIllllllIIIll) {
            try {
                new Thread((Runnable)new class_0833(this), "Sound Library Loader").start();
            }
            catch (RuntimeException runtimeException) {
                IlIllllllIIlIIllllIIlIIIl.error(lllIlIIlIIIlIlIIIllIlllIl, "Error starting SoundSystem. Turning off sounds & music", (Throwable)runtimeException);
                this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(class_0617.lllIIIllIIIIlllIlIIllIIll, 0.0f);
                this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl();
            }
        }
    }

    private float lllIIIllIIIIlllIlIIllIIll(class_0617 class_06172) {
        return class_06172 != null && class_06172 != class_0617.lllIIIllIIIIlllIlIIllIIll ? this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(class_06172) : 1.0f;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0617 class_06172, float f) {
        if (this.lIllllIIlIIIlIllllllIIIll) {
            if (class_06172 == class_0617.lllIIIllIIIIlllIlIIllIIll) {
                this.lllIIIllIIIIlllIlIIllIIll.setMasterVolume(f);
            } else {
                for (String string : this.lIIIIlIlIIlllllIIllIIlIII.get((Object)class_06172)) {
                    class_0308 class_03082 = (class_0308)this.IllIIlllllllIIlIIlIIIIlIl.get(string);
                    float f2 = this.lllIIIllIIIIlllIlIIllIIll(class_03082, (class_1883)this.IllIIIllIIIIlIlIlIllIIlll.get(class_03082), class_06172);
                    if (f2 <= 0.0f) {
                        this.lllIlIIlIIIlIlIIIllIlllIl(class_03082);
                        continue;
                    }
                    this.lllIIIllIIIIlllIlIIllIIll.setVolume(string, f2);
                }
            }
        }
    }

    public void lllIlIIlIIIlIlIIIllIlllIl() {
        if (this.lIllllIIlIIIlIllllllIIIll) {
            this.IlIllllllIIlIIllllIIlIIIl();
            this.lllIIIllIIIIlllIlIIllIIll.cleanup();
            this.lIllllIIlIIIlIllllllIIIll = false;
        }
    }

    public void IlIllllllIIlIIllllIIlIIIl() {
        if (this.lIllllIIlIIIlIllllllIIIll) {
            for (String string : this.IllIIlllllllIIlIIlIIIIlIl.keySet()) {
                this.lllIIIllIIIIlllIlIIllIIll.stop(string);
            }
            this.IllIIlllllllIIlIIlIIIIlIl.clear();
            this.llIIllIllIlIIlIIllIllllll.clear();
            this.llIIlllIllIllllIIIlIIIIII.clear();
            this.lIIIIlIlIIlllllIIllIIlIII.clear();
            this.IllIIIllIIIIlIlIlIllIIlll.clear();
            this.lllIIlIIIllllllIIIIlIlIlI.clear();
        }
    }

    public void lIlllIlllIIIIlIIlllIllIII() {
        Object object;
        String string;
        class_0308 class_030822;
        ++this.IIIllIIlIIIIIIlIlIIllIIlI;
        for (class_0308 class_030822 : this.llIIlllIllIllllIIIlIIIIII) {
            class_030822.lIIIIlIlIIlllllIIllIIlIII();
            if (class_030822.IllIIIllIIIIlIlIlIllIIlll()) {
                this.lllIlIIlIIIlIlIIIllIlllIl(class_030822);
                continue;
            }
            string = (String)this.IIIllIllIIlIlIlIlIllllIIl.get(class_030822);
            this.lllIIIllIIIIlllIlIIllIIll.setVolume(string, this.lllIIIllIIIIlllIlIIllIIll(class_030822, (class_1883)this.IllIIIllIIIIlIlIlIllIIlll.get(class_030822), this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(class_030822.lllIIIllIIIIlllIlIIllIIll()).IlIIIIIllllllIIlllIllllll()));
            this.lllIIIllIIIIlllIlIIllIIll.setPitch(string, this.lllIIIllIIIIlllIlIIllIIll(class_030822, (class_1883)this.IllIIIllIIIIlIlIlIllIIlll.get(class_030822)));
            this.lllIIIllIIIIlllIlIIllIIll.setPosition(string, class_030822.lIllllIIlIIIlIllllllIIIll(), class_030822.IIIllIIlIIIIIIlIlIIllIIlI(), class_030822.IllIIlllllllIIlIIlIIIIlIl());
        }
        Iterator<Object> iterator = this.IllIIlllllllIIlIIlIIIIlIl.entrySet().iterator();
        while (iterator.hasNext()) {
            int n;
            object = (Map.Entry)iterator.next();
            string = (String)object.getKey();
            class_030822 = (class_0308)object.getValue();
            if (this.lllIIIllIIIIlllIlIIllIIll.playing(string) || (n = ((Integer)this.lllIIlIIIllllllIIIIlIlIlI.get(string)).intValue()) > this.IIIllIIlIIIIIIlIlIIllIIlI) continue;
            int n2 = class_030822.IlIllllllIIlIIllllIIlIIIl();
            if (class_030822.lllIlIIlIIIlIlIIIllIlllIl() && n2 > 0) {
                this.llIIllIllIlIIlIIllIllllll.put(class_030822, this.IIIllIIlIIIIIIlIlIIllIIlI + n2);
            }
            iterator.remove();
            IlIllllllIIlIIllllIIlIIIl.debug(lllIlIIlIIIlIlIIIllIlllIl, "Removed channel {} because it's not playing anymore", new Object[]{string});
            this.lllIIIllIIIIlllIlIIllIIll.removeSource(string);
            this.lllIIlIIIllllllIIIIlIlIlI.remove(string);
            this.IllIIIllIIIIlIlIlIllIIlll.remove(class_030822);
            try {
                this.lIIIIlIlIIlllllIIllIIlIII.remove((Object)this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(class_030822.lllIIIllIIIIlllIlIIllIIll()).IlIIIIIllllllIIlllIllllll(), (Object)string);
            }
            catch (RuntimeException runtimeException) {
                // empty catch block
            }
            if (!(class_030822 instanceof class_0221)) continue;
            this.llIIlllIllIllllIIIlIIIIII.remove(class_030822);
        }
        object = this.llIIllIllIlIIlIIllIllllll.entrySet().iterator();
        while (object.hasNext()) {
            Map.Entry entry = (Map.Entry)object.next();
            if (this.IIIllIIlIIIIIIlIlIIllIIlI < (Integer)entry.getValue()) continue;
            class_030822 = (class_0308)entry.getKey();
            if (class_030822 instanceof class_0221) {
                ((class_0221)class_030822).lIIIIlIlIIlllllIIllIIlIII();
            }
            this.IlIllllllIIlIIllllIIlIIIl(class_030822);
            object.remove();
        }
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_0308 class_03082) {
        if (!this.lIllllIIlIIIlIllllllIIIll) {
            return false;
        }
        String string = (String)this.IIIllIllIIlIlIlIlIllllIIl.get(class_03082);
        return string == null ? false : this.lllIIIllIIIIlllIlIIllIIll.playing(string) || this.lllIIlIIIllllllIIIIlIlIlI.containsKey(string) && (Integer)this.lllIIlIIIllllllIIIIlIlIlI.get(string) <= this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_0308 class_03082) {
        String string;
        if (this.lIllllIIlIIIlIllllllIIIll && (string = (String)this.IIIllIllIIlIlIlIlIllllIIl.get(class_03082)) != null) {
            this.lllIIIllIIIIlllIlIIllIIll.stop(string);
        }
    }

    public void IlIllllllIIlIIllllIIlIIIl(class_0308 class_03082) {
        if (this.lIllllIIlIIIlIllllllIIIll) {
            if (this.lllIIIllIIIIlllIlIIllIIll.getMasterVolume() <= 0.0f) {
                IlIllllllIIlIIllllIIlIIIl.debug(lllIlIIlIIIlIlIIIllIlllIl, "Skipped playing soundEvent: {}, master volume was zero", new Object[]{class_03082.lllIIIllIIIIlllIlIIllIIll()});
            } else {
                class_1329 class_13292 = this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(class_03082.lllIIIllIIIIlllIlIIllIIll());
                if (class_13292 == null) {
                    IlIllllllIIlIIllllIIlIIIl.warn(lllIlIIlIIIlIlIIIllIlllIl, "Unable to play unknown soundEvent: {}", new Object[]{class_03082.lllIIIllIIIIlllIlIIllIIll()});
                } else {
                    class_1883 class_18832 = class_13292.IlIllllllIIlIIllllIIlIIIl();
                    if (class_18832 == class_1300.lllIIIllIIIIlllIlIIllIIll) {
                        IlIllllllIIlIIllllIIlIIIl.warn(lllIlIIlIIIlIlIIIllIlllIl, "Unable to play empty soundEvent: {}", new Object[]{class_13292.lIlllIlllIIIIlIIlllIllIII()});
                    } else {
                        float f = class_03082.lIlllIlllIIIIlIIlllIllIII();
                        float f2 = 16.0f;
                        if (f > 1.0f) {
                            f2 *= f;
                        }
                        class_0617 class_06172 = class_13292.IlIIIIIllllllIIlllIllllll();
                        float f3 = this.lllIIIllIIIIlllIlIIllIIll(class_03082, class_18832, class_06172);
                        double d = this.lllIIIllIIIIlllIlIIllIIll(class_03082, class_18832);
                        ResourceLocation class_17732 = class_18832.lllIIIllIIIIlllIlIIllIIll();
                        if (f3 == 0.0f) {
                            IlIllllllIIlIIllllIIlIIIl.debug(lllIlIIlIIIlIlIIIllIlllIl, "Skipped playing sound {}, volume was zero.", new Object[]{class_17732});
                        } else {
                            boolean bl = class_03082.lllIlIIlIIIlIlIIIllIlllIl() && class_03082.IlIllllllIIlIIllllIIlIIIl() == 0;
                            String string = UUID.randomUUID().toString();
                            if (class_18832.lIlllIlllIIIIlIIlllIllIII()) {
                                this.lllIIIllIIIIlllIlIIllIIll.newStreamingSource(false, string, class_0885.lllIIIllIIIIlllIlIIllIIll(class_17732), class_17732.toString(), bl, class_03082.lIllllIIlIIIlIllllllIIIll(), class_03082.IIIllIIlIIIIIIlIlIIllIIlI(), class_03082.IllIIlllllllIIlIIlIIIIlIl(), class_03082.IIIllIllIIlIlIlIlIllllIIl().lllIIIllIIIIlllIlIIllIIll(), f2);
                            } else {
                                this.lllIIIllIIIIlllIlIIllIIll.newSource(false, string, class_0885.lllIIIllIIIIlllIlIIllIIll(class_17732), class_17732.toString(), bl, class_03082.lIllllIIlIIIlIllllllIIIll(), class_03082.IIIllIIlIIIIIIlIlIIllIIlI(), class_03082.IllIIlllllllIIlIIlIIIIlIl(), class_03082.IIIllIllIIlIlIlIlIllllIIl().lllIIIllIIIIlllIlIIllIIll(), f2);
                            }
                            IlIllllllIIlIIllllIIlIIIl.debug(lllIlIIlIIIlIlIIIllIlllIl, "Playing sound {} for event {} as channel {}", new Object[]{class_18832.lllIIIllIIIIlllIlIIllIIll(), class_13292.lIlllIlllIIIIlIIlllIllIII(), string});
                            this.lllIIIllIIIIlllIlIIllIIll.setPitch(string, (float)d);
                            this.lllIIIllIIIIlllIlIIllIIll.setVolume(string, f3);
                            this.lllIIIllIIIIlllIlIIllIIll.play(string);
                            this.lllIIlIIIllllllIIIIlIlIlI.put(string, this.IIIllIIlIIIIIIlIlIIllIIlI + 20);
                            this.IllIIlllllllIIlIIlIIIIlIl.put(string, class_03082);
                            this.IllIIIllIIIIlIlIlIllIIlll.put(class_03082, class_18832);
                            if (class_06172 != class_0617.lllIIIllIIIIlllIlIIllIIll) {
                                this.lIIIIlIlIIlllllIIllIIlIII.put((Object)class_06172, (Object)string);
                            }
                            if (class_03082 instanceof class_0221) {
                                this.llIIlllIllIllllIIIlIIIIII.add((class_0221)class_03082);
                            }
                        }
                    }
                }
            }
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string, float f) {
        if (this.lIllllIIlIIIlIllllllIIIll) {
            ResourceLocation class_17732 = new ResourceLocation("client/sound/" + string + ".ogg");
            String string2 = UUID.randomUUID().toString();
            this.lllIIIllIIIIlllIlIIllIIll.newStreamingSource(false, string2, class_0885.lllIIIllIIIIlllIlIIllIIll(class_17732), class_17732.toString(), false, 0.0f, 0.0f, 0.0f, 0, SoundSystemConfig.getDefaultRolloff());
            this.lllIIIllIIIIlllIlIIllIIll.setPitch(string2, 1.0f);
            this.lllIIIllIIIIlllIlIIllIIll.setVolume(string2, 1.0f * f);
            this.lllIIIllIIIIlllIlIIllIIll.play(string2);
        }
    }

    private float lllIIIllIIIIlllIlIIllIIll(class_0308 class_03082, class_1883 class_18832) {
        return (float) MathHelper.lllIIIllIIIIlllIlIIllIIll((double)class_03082.IlIIIIIllllllIIlllIllllll() * class_18832.lllIlIIlIIIlIlIIIllIlllIl(), 0.5, 2.0);
    }

    private float lllIIIllIIIIlllIlIIllIIll(class_0308 class_03082, class_1883 class_18832, class_0617 class_06172) {
        return (float) MathHelper.lllIIIllIIIIlllIlIIllIIll((double)class_03082.lIlllIlllIIIIlIIlllIllIII() * class_18832.IlIllllllIIlIIllllIIlIIIl() * (double)this.lllIIIllIIIIlllIlIIllIIll(class_06172), 0.0, 1.0);
    }

    public void IlIIIIIllllllIIlllIllllll() {
        for (String string : this.IllIIlllllllIIlIIlIIIIlIl.keySet()) {
            IlIllllllIIlIIllllIIlIIIl.debug(lllIlIIlIIIlIlIIIllIlllIl, "Pausing channel {}", new Object[]{string});
            this.lllIIIllIIIIlllIlIIllIIll.pause(string);
        }
    }

    public void lIllllIIlIIIlIllllllIIIll() {
        for (String string : this.IllIIlllllllIIlIIlIIIIlIl.keySet()) {
            IlIllllllIIlIIllllIIlIIIl.debug(lllIlIIlIIIlIlIIIllIlllIl, "Resuming channel {}", new Object[]{string});
            this.lllIIIllIIIIlllIlIIllIIll.play(string);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(byte[] arrby, AudioFormat audioFormat) {
        String string = UUID.randomUUID().toString();
        this.lllIIIllIIIIlllIlIIllIIll.rawDataStream(audioFormat, true, string, (float) Minecraft.getMinecraft().lIIIIlIlIIlllllIIllIIlIII.IlIIlllllIIlIlIlllllIllll, (float) Minecraft.getMinecraft().lIIIIlIlIIlllllIIllIIlIII.llIIlIlIlllIIllIlIlllIllI, (float) Minecraft.getMinecraft().lIIIIlIlIIlllllIIllIIlIII.IllIIIIllIIllIllIlllIlIIl, 1, SoundSystemConfig.getDefaultRolloff());
        this.lllIIIllIIIIlllIlIIllIIll.play(string);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0308 class_03082, int n) {
        this.llIIllIllIlIIlIIllIllllll.put(class_03082, this.IIIllIIlIIIIIIlIlIIllIIlI + n);
    }

    private static URL lllIIIllIIIIlllIlIIllIIll(ResourceLocation class_17732) {
        String string = String.format("%s:%s:%s", "mcsounddomain", class_17732.lllIlIIlIIIlIlIIIllIlllIl(), class_17732.lllIIIllIIIIlllIlIIllIIll());
        class_1466 class_14662 = new class_1466(class_17732);
        try {
            return new URL((URL)null, string, class_14662);
        }
        catch (MalformedURLException malformedURLException) {
            throw new Error("TODO: Sanely handle url exception! :D");
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142, float f) {
        if (this.lIllllIIlIIIlIllllllIIIll && class_08142 != null) {
            float f2 = class_08142.llIIIIllIIIIIIIlIIIlIIIIl + (class_08142.IlIlIIlllIllllllllIIIlIlI - class_08142.llIIIIllIIIIIIIlIIIlIIIIl) * f;
            float f3 = class_08142.llllIIIIlIIIlIIIIIIlIllll + (class_08142.IIIIlIllIlIIlIIlIllIlIlll - class_08142.llllIIIIlIIIlIIIIIIlIllll) * f;
            double d = class_08142.llIIlIllIllllIlIIIIlIIlll + (class_08142.IlIIlllllIIlIlIlllllIllll - class_08142.llIIlIllIllllIlIIIIlIIlll) * (double)f;
            double d2 = class_08142.llIllllIlIllIIIlIllIIlIlI + (class_08142.llIIlIlIlllIIllIlIlllIllI - class_08142.llIllllIlIllIIIlIllIIlIlI) * (double)f;
            double d3 = class_08142.lIlllIlllIlIIIIlllIlIlIIl + (class_08142.IllIIIIllIIllIllIlllIlIIl - class_08142.lIlllIlllIlIIIIlllIlIlIIl) * (double)f;
            float f4 = MathHelper.lllIlIIlIIIlIlIIIllIlllIl((f3 + 90.0f) * ((float)Math.PI / 180));
            float f5 = MathHelper.lllIIIllIIIIlllIlIIllIIll((f3 + 90.0f) * ((float)Math.PI / 180));
            float f6 = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(-f2 * ((float)Math.PI / 180));
            float f7 = MathHelper.lllIIIllIIIIlllIlIIllIIll(-f2 * ((float)Math.PI / 180));
            float f8 = MathHelper.lllIlIIlIIIlIlIIIllIlllIl((-f2 + 90.0f) * ((float)Math.PI / 180));
            float f9 = MathHelper.lllIIIllIIIIlllIlIIllIIll((-f2 + 90.0f) * ((float)Math.PI / 180));
            float f10 = f4 * f6;
            float f11 = f5 * f6;
            float f12 = f4 * f8;
            float f13 = f5 * f8;
            this.lllIIIllIIIIlllIlIIllIIll.setListenerPosition((float)d, (float)d2, (float)d3);
            this.lllIIIllIIIIlllIlIIllIIll.setListenerOrientation(f10, f7, f11, f12, f9, f13);
        }
    }

    static /* synthetic */ boolean lllIIIllIIIIlllIlIIllIIll(class_0885 class_08852, boolean bl) {
        class_08852.lIllllIIlIIIlIllllllIIIll = bl;
        return class_08852.lIllllIIlIIIlIllllllIIIll;
    }

    static /* synthetic */ GameSettings lllIIIllIIIIlllIlIIllIIll(class_0885 class_08852) {
        return class_08852.IlIIIIIllllllIIlllIllllll;
    }

    static /* synthetic */ Marker IIIllIIlIIIIIIlIlIIllIIlI() {
        return lllIlIIlIIIlIlIIIllIlllIl;
    }

    static /* synthetic */ Logger IllIIlllllllIIlIIlIIIIlIl() {
        return IlIllllllIIlIIllllIIlIIIl;
    }
}

