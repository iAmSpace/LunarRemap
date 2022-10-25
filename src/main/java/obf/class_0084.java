package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonParser
 *  org.apache.commons.io.FileUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;
import net.minecraft.stats.StatBase;
import net.minecraft.stats.StatList;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.IJsonSerializable;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_0084
extends class_1707 {
    private static final Logger lllIlIIlIIIlIlIIIllIlllIl = LogManager.getLogger();
    private final class_0220 IlIllllllIIlIIllllIIlIIIl;
    private final File lIlllIlllIIIIlIIlllIllIII;
    private final Set IlIIIIIllllllIIlllIllllll = Sets.newHashSet();
    private int lIllllIIlIIIlIllllllIIIll = -300;
    private boolean IIIllIIlIIIIIIlIlIIllIIlI = false;

    public class_0084(class_0220 class_02202, File file) {
        this.IlIllllllIIlIIllllIIlIIIl = class_02202;
        this.lIlllIlllIIIIlIIlllIllIII = file;
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        if (this.lIlllIlllIIIIlIIlllIllIII.isFile()) {
            try {
                this.lllIIIllIIIIlllIlIIllIIll.clear();
                this.lllIIIllIIIIlllIlIIllIIll.putAll(this.lllIIIllIIIIlllIlIIllIIll(FileUtils.readFileToString((File)this.lIlllIlllIIIIlIIlllIllIII)));
            }
            catch (IOException iOException) {
                lllIlIIlIIIlIlIIIllIlllIl.error("Couldn't read statistics file " + this.lIlllIlllIIIIlIIlllIllIII, (Throwable)iOException);
            }
            catch (JsonParseException jsonParseException) {
                lllIlIIlIIIlIlIIIllIlllIl.error("Couldn't parse statistics file " + this.lIlllIlllIIIIlIIlllIllIII, (Throwable)jsonParseException);
            }
        }
    }

    public void lllIlIIlIIIlIlIIIllIlllIl() {
        try {
            FileUtils.writeStringToFile((File)this.lIlllIlllIIIIlIIlllIllIII, (String)class_0084.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll));
        }
        catch (IOException iOException) {
            lllIlIIlIIIlIlIIIllIlllIl.error("Couldn't save stats", (Throwable)iOException);
        }
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0814 class_08142, StatBase class_03192, int n) {
        int n2 = class_03192.lIlllIlllIIIIlIIlllIllIII() ? this.lllIIIllIIIIlllIlIIllIIll(class_03192) : 0;
        super.lllIlIIlIIIlIlIIIllIlllIl(class_08142, class_03192, n);
        this.IlIIIIIllllllIIlllIllllll.add(class_03192);
        if (class_03192.lIlllIlllIIIIlIIlllIllIII() && n2 == 0 && n > 0) {
            this.IIIllIIlIIIIIIlIlIIllIIlI = true;
            if (this.IlIllllllIIlIIllllIIlIIIl.IIIIlIllIlIIIIIllllIIlllI()) {
                this.IlIllllllIIlIIllllIIlIIIl.lIIIllIIIIIllllIlIlIllIll().lllIIIllIIIIlllIlIIllIIll(new ChatComponentTranslation("chat.type.achievement", class_08142.llIIIIllIIIIIIIlIIIlIIIIl(), class_03192.IllIIIllIIIIlIlIlIllIIlll()));
            }
        }
    }

    public Set IlIllllllIIlIIllllIIlIIIl() {
        HashSet hashSet = Sets.newHashSet((Iterable)this.IlIIIIIllllllIIlllIllllll);
        this.IlIIIIIllllllIIlllIllllll.clear();
        this.IIIllIIlIIIIIIlIlIIllIIlI = false;
        return hashSet;
    }

    public Map lllIIIllIIIIlllIlIIllIIll(String string) {
        JsonElement jsonElement = new JsonParser().parse(string);
        if (!jsonElement.isJsonObject()) {
            return Maps.newHashMap();
        }
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        HashMap hashMap = Maps.newHashMap();
        for (Map.Entry entry : jsonObject.entrySet()) {
            StatBase class_03192 = StatList.lllIIIllIIIIlllIlIIllIIll((String)entry.getKey());
            if (class_03192 != null) {
                class_1142 class_11422 = new class_1142();
                if (((JsonElement)entry.getValue()).isJsonPrimitive() && ((JsonElement)entry.getValue()).getAsJsonPrimitive().isNumber()) {
                    class_11422.lllIIIllIIIIlllIlIIllIIll(((JsonElement)entry.getValue()).getAsInt());
                } else if (((JsonElement)entry.getValue()).isJsonObject()) {
                    JsonObject jsonObject2 = ((JsonElement)entry.getValue()).getAsJsonObject();
                    if (jsonObject2.has("value") && jsonObject2.get("value").isJsonPrimitive() && jsonObject2.get("value").getAsJsonPrimitive().isNumber()) {
                        class_11422.lllIIIllIIIIlllIlIIllIIll(jsonObject2.getAsJsonPrimitive("value").getAsInt());
                    }
                    if (jsonObject2.has("progress") && class_03192.llIIlllIllIllllIIIlIIIIII() != null) {
                        try {
                            Constructor constructor = class_03192.llIIlllIllIllllIIIlIIIIII().getConstructor(new Class[0]);
                            IJsonSerializable class_04022 = (IJsonSerializable)constructor.newInstance(new Object[0]);
                            class_04022.func_152753_a(jsonObject2.get("progress"));
                            class_11422.lllIIIllIIIIlllIlIIllIIll(class_04022);
                        }
                        catch (Throwable throwable) {
                            lllIlIIlIIIlIlIIIllIlllIl.warn("Invalid statistic progress in " + this.lIlllIlllIIIIlIIlllIllIII, throwable);
                        }
                    }
                }
                hashMap.put(class_03192, class_11422);
                continue;
            }
            lllIlIIlIIIlIlIIIllIlllIl.warn("Invalid statistic in " + this.lIlllIlllIIIIlIIlllIllIII + ": Don't know what " + (String)entry.getKey() + " is");
        }
        return hashMap;
    }

    public static String lllIIIllIIIIlllIlIIllIIll(Map map) {
        JsonObject jsonObject = new JsonObject();
        for (Map.Entry entry : map.entrySet()) {
            if (((class_1142)entry.getValue()).lllIlIIlIIIlIlIIIllIlllIl() != null) {
                JsonObject jsonObject2 = new JsonObject();
                jsonObject2.addProperty("value", (Number)((class_1142)entry.getValue()).lllIIIllIIIIlllIlIIllIIll());
                try {
                    jsonObject2.add("progress", ((class_1142)entry.getValue()).lllIlIIlIIIlIlIIIllIlllIl().getSerializableElement());
                }
                catch (Throwable throwable) {
                    lllIlIIlIIIlIlIIIllIlllIl.warn("Couldn't save statistic " + ((StatBase)entry.getKey()).IlIIIIIllllllIIlllIllllll() + ": error serializing progress", throwable);
                }
                jsonObject.add(((StatBase)entry.getKey()).statId, (JsonElement)jsonObject2);
                continue;
            }
            jsonObject.addProperty(((StatBase)entry.getKey()).statId, (Number)((class_1142)entry.getValue()).lllIIIllIIIIlllIlIIllIIll());
        }
        return jsonObject.toString();
    }

    public void lIlllIlllIIIIlIIlllIllIII() {
        for (StatBase class_03192 : this.lllIIIllIIIIlllIlIIllIIll.keySet()) {
            this.IlIIIIIllllllIIlllIllllll.add(class_03192);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1822 class_18222) {
        int n = this.IlIllllllIIlIIllllIIlIIIl.IllllIIlIIIllIlllIlllIllI();
        HashMap hashMap = Maps.newHashMap();
        if (this.IIIllIIlIIIIIIlIlIIllIIlI || n - this.lIllllIIlIIIlIllllllIIIll > 300) {
            this.lIllllIIlIIIlIllllllIIIll = n;
            for (StatBase class_03192 : this.IlIllllllIIlIIllllIIlIIIl()) {
                hashMap.put(class_03192, this.lllIIIllIIIIlllIlIIllIIll(class_03192));
            }
        }
        class_18222.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_1095(hashMap));
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_1822 class_18222) {
        HashMap hashMap = Maps.newHashMap();
        for (Achievement class_07472 : AchievementList.achievementList) {
            if (!this.lllIIIllIIIIlllIlIIllIIll(class_07472)) continue;
            hashMap.put(class_07472, this.lllIIIllIIIIlllIlIIllIIll((StatBase)class_07472));
            this.IlIIIIIllllllIIlllIllllll.remove(class_07472);
        }
        class_18222.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_1095(hashMap));
    }

    public boolean IlIIIIIllllllIIlllIllllll() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }
}

