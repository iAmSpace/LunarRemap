package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.common.collect.Iterators
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.io.Files
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.mojang.authlib.Agent
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.ProfileLookupCallback
 *  org.apache.commons.io.IOUtils
 */
import com.google.common.base.Charsets;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mojang.authlib.Agent;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.apache.commons.io.IOUtils;

public class class_2119 {
    public static final SimpleDateFormat lllIIIllIIIIlllIlIIllIIll = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
    private final Map IlIllllllIIlIIllllIIlIIIl = Maps.newHashMap();
    private final Map lIlllIlllIIIIlIIlllIllIII = Maps.newHashMap();
    private final LinkedList IlIIIIIllllllIIlllIllllll = Lists.newLinkedList();
    private final class_0220 lIllllIIlIIIlIllllllIIIll;
    protected final Gson lllIlIIlIIIlIlIIIllIlllIl;
    private final File IIIllIIlIIIIIIlIlIIllIIlI;
    private static final ParameterizedType IllIIlllllllIIlIIlIIIIlIl = new class_0236();

    public class_2119(class_0220 class_02202, File file) {
        this.lIllllIIlIIIlIllllllIIIll = class_02202;
        this.IIIllIIlIIIIIIlIlIIllIIlI = file;
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeHierarchyAdapter(class_1435.class, (Object)new class_1533(this, null));
        this.lllIlIIlIIIlIlIIIllIlllIl = gsonBuilder.create();
        this.lllIlIIlIIIlIlIIIllIlllIl();
    }

    private static GameProfile lllIIIllIIIIlllIlIIllIIll(class_0220 class_02202, String string) {
        GameProfile[] arrgameProfile = new GameProfile[1];
        class_1243 class_12432 = new class_1243(arrgameProfile);
        class_02202.IlIlIllIIlIIIIlllIlIllIlI().findProfilesByNames(new String[]{string}, Agent.MINECRAFT, (ProfileLookupCallback)class_12432);
        if (!class_02202.lIlIlIIIIIIlIIllllIlIIllI() && arrgameProfile[0] == null) {
            UUID uUID = class_0814.lllIIIllIIIIlllIlIIllIIll(new GameProfile((UUID)null, string));
            GameProfile gameProfile = new GameProfile(uUID, string);
            class_12432.onProfileLookupSucceeded(gameProfile);
        }
        return arrgameProfile[0];
    }

    public void lllIIIllIIIIlllIlIIllIIll(GameProfile gameProfile) {
        this.lllIIIllIIIIlllIlIIllIIll(gameProfile, null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void lllIIIllIIIIlllIlIIllIIll(GameProfile gameProfile, Date date) {
        Object object;
        UUID uUID = gameProfile.getId();
        if (date == null) {
            object = Calendar.getInstance();
            ((Calendar)object).setTime(new Date());
            ((Calendar)object).add(2, 1);
            date = ((Calendar)object).getTime();
        }
        object = gameProfile.getName().toLowerCase(Locale.ROOT);
        class_1435 class_14352 = new class_1435(this, gameProfile, date, null);
        LinkedList linkedList = this.IlIIIIIllllllIIlllIllllll;
        LinkedList linkedList2 = this.IlIIIIIllllllIIlllIllllll;
        synchronized (linkedList2) {
            if (this.lIlllIlllIIIIlIIlllIllIII.containsKey(uUID)) {
                class_1435 class_14353 = (class_1435)this.lIlllIlllIIIIlIIlllIllIII.get(uUID);
                this.IlIllllllIIlIIllllIIlIIIl.remove(class_14353.lllIIIllIIIIlllIlIIllIIll().getName().toLowerCase(Locale.ROOT));
                this.IlIllllllIIlIIllllIIlIIIl.put(gameProfile.getName().toLowerCase(Locale.ROOT), class_14352);
                this.IlIIIIIllllllIIlllIllllll.remove((Object)gameProfile);
            } else {
                this.lIlllIlllIIIIlIIlllIllIII.put(uUID, class_14352);
                this.IlIllllllIIlIIllllIIlIIIl.put(object, class_14352);
            }
            this.IlIIIIIllllllIIlllIllllll.addFirst(gameProfile);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public GameProfile lllIIIllIIIIlllIlIIllIIll(String string) {
        LinkedList linkedList;
        Object object;
        String string2 = string.toLowerCase(Locale.ROOT);
        class_1435 class_14352 = (class_1435)this.IlIllllllIIlIIllllIIlIIIl.get(string2);
        if (class_14352 != null && new Date().getTime() >= class_1435.lllIIIllIIIIlllIlIIllIIll(class_14352).getTime()) {
            this.lIlllIlllIIIIlIIlllIllIII.remove(class_14352.lllIIIllIIIIlllIlIIllIIll().getId());
            this.IlIllllllIIlIIllllIIlIIIl.remove(class_14352.lllIIIllIIIIlllIlIIllIIll().getName().toLowerCase(Locale.ROOT));
            object = this.IlIIIIIllllllIIlllIllllll;
            linkedList = this.IlIIIIIllllllIIlllIllllll;
            synchronized (linkedList) {
                this.IlIIIIIllllllIIlllIllllll.remove((Object)class_14352.lllIIIllIIIIlllIlIIllIIll());
            }
            class_14352 = null;
        }
        if (class_14352 != null) {
            object = class_14352.lllIIIllIIIIlllIlIIllIIll();
            linkedList = this.IlIIIIIllllllIIlllIllllll;
            LinkedList linkedList2 = this.IlIIIIIllllllIIlllIllllll;
            synchronized (linkedList2) {
                this.IlIIIIIllllllIIlllIllllll.remove(object);
                this.IlIIIIIllllllIIlllIllllll.addFirst(object);
            }
        } else {
            object = class_2119.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll, string2);
            if (object != null) {
                this.lllIIIllIIIIlllIlIIllIIll((GameProfile)object);
                class_14352 = (class_1435)this.IlIllllllIIlIIllllIIlIIIl.get(string2);
            }
        }
        this.IlIllllllIIlIIllllIIlIIIl();
        return class_14352 == null ? null : class_14352.lllIIIllIIIIlllIlIIllIIll();
    }

    public String[] lllIIIllIIIIlllIlIIllIIll() {
        ArrayList arrayList = Lists.newArrayList(this.IlIllllllIIlIIllllIIlIIIl.keySet());
        return arrayList.toArray(new String[arrayList.size()]);
    }

    public GameProfile lllIIIllIIIIlllIlIIllIIll(UUID uUID) {
        class_1435 class_14352 = (class_1435)this.lIlllIlllIIIIlIIlllIllIII.get(uUID);
        return class_14352 == null ? null : class_14352.lllIIIllIIIIlllIlIIllIIll();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private class_1435 lllIlIIlIIIlIlIIIllIlllIl(UUID uUID) {
        class_1435 class_14352 = (class_1435)this.lIlllIlllIIIIlIIlllIllIII.get(uUID);
        if (class_14352 != null) {
            GameProfile gameProfile = class_14352.lllIIIllIIIIlllIlIIllIIll();
            LinkedList linkedList = this.IlIIIIIllllllIIlllIllllll;
            LinkedList linkedList2 = this.IlIIIIIllllllIIlllIllllll;
            synchronized (linkedList2) {
                this.IlIIIIIllllllIIlllIllllll.remove((Object)gameProfile);
                this.IlIIIIIllllllIIlllIllllll.addFirst(gameProfile);
            }
        }
        return class_14352;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void lllIlIIlIIIlIlIIIllIlllIl() {
        BufferedReader bufferedReader;
        List list;
        block8: {
            list = null;
            bufferedReader = null;
            try {
                bufferedReader = Files.newReader((File)this.IIIllIIlIIIIIIlIlIIllIIlI, (Charset)Charsets.UTF_8);
                list = (List)this.lllIlIIlIIIlIlIIIllIlllIl.fromJson((Reader)bufferedReader, (Type)IllIIlllllllIIlIIlIIIIlIl);
            }
            catch (FileNotFoundException fileNotFoundException) {
                IOUtils.closeQuietly(bufferedReader);
            }
            catch (Throwable throwable) {
                IOUtils.closeQuietly(bufferedReader);
                throw throwable;
            }
            break block8;
            return;
        }
        IOUtils.closeQuietly((Reader)bufferedReader);
        if (list != null) {
            this.IlIllllllIIlIIllllIIlIIIl.clear();
            this.lIlllIlllIIIIlIIlllIllIII.clear();
            LinkedList linkedList = this.IlIIIIIllllllIIlllIllllll;
            LinkedList linkedList2 = this.IlIIIIIllllllIIlllIllllll;
            synchronized (linkedList2) {
                this.IlIIIIIllllllIIlllIllllll.clear();
            }
            list = Lists.reverse((List)list);
            for (class_1435 class_14352 : list) {
                if (class_14352 == null) continue;
                this.lllIIIllIIIIlllIlIIllIIll(class_14352.lllIIIllIIIIlllIlIIllIIll(), class_14352.lllIlIIlIIIlIlIIIllIlllIl());
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void IlIllllllIIlIIllllIIlIIIl() {
        String string = this.lllIlIIlIIIlIlIIIllIlllIl.toJson((Object)this.lllIIIllIIIIlllIlIIllIIll(1000));
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = Files.newWriter((File)this.IIIllIIlIIIIIIlIlIIllIIlI, (Charset)Charsets.UTF_8);
            bufferedWriter.write(string);
        }
        catch (FileNotFoundException fileNotFoundException) {
            IOUtils.closeQuietly(bufferedWriter);
        }
        catch (IOException iOException) {
            IOUtils.closeQuietly(bufferedWriter);
            return;
        }
        catch (Throwable throwable) {
            IOUtils.closeQuietly(bufferedWriter);
            throw throwable;
        }
        IOUtils.closeQuietly((Writer)bufferedWriter);
        return;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private List lllIIIllIIIIlllIlIIllIIll(int n) {
        ArrayList arrayList;
        ArrayList arrayList2 = Lists.newArrayList();
        LinkedList linkedList = this.IlIIIIIllllllIIlllIllllll;
        LinkedList linkedList2 = this.IlIIIIIllllllIIlllIllllll;
        synchronized (linkedList2) {
            arrayList = Lists.newArrayList((Iterator)Iterators.limit(this.IlIIIIIllllllIIlllIllllll.iterator(), (int)n));
        }
        for (GameProfile gameProfile : arrayList) {
            class_1435 class_14352 = this.lllIlIIlIIIlIlIIIllIlllIl(gameProfile.getId());
            if (class_14352 == null) continue;
            arrayList2.add(class_14352);
        }
        return arrayList2;
    }
}

