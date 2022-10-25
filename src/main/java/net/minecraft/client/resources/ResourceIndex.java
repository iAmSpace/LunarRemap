package net.minecraft.client.resources;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.common.collect.Maps
 *  com.google.common.io.Files
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonParser
 *  org.apache.commons.io.IOUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.base.Charsets;
import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.Map;

import obf.class_0463;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ResourceIndex {
    private static final Logger lllIIIllIIIIlllIlIIllIIll = LogManager.getLogger();
    private final Map lllIlIIlIIIlIlIIIllIlllIl = Maps.newHashMap();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public ResourceIndex(File file, String string) {
        if (string != null) {
            File file2 = new File(file, "objects");
            File file3 = new File(file, "indexes/" + string + ".json");
            BufferedReader bufferedReader = null;
            try {
                bufferedReader = Files.newReader((File)file3, (Charset)Charsets.UTF_8);
                JsonObject jsonObject = new JsonParser().parse((Reader)bufferedReader).getAsJsonObject();
                JsonObject jsonObject2 = class_0463.lllIIIllIIIIlllIlIIllIIll(jsonObject, "objects", (JsonObject)null);
                if (jsonObject2 != null) {
                    for (Map.Entry entry : jsonObject2.entrySet()) {
                        JsonObject jsonObject3 = (JsonObject)entry.getValue();
                        String string2 = (String)entry.getKey();
                        String[] arrstring = string2.split("/", 2);
                        String string3 = arrstring.length == 1 ? arrstring[0] : arrstring[0] + ":" + arrstring[1];
                        String string4 = class_0463.IlIIIIIllllllIIlllIllllll(jsonObject3, "hash");
                        File file4 = new File(file2, string4.substring(0, 2) + "/" + string4);
                        this.lllIlIIlIIIlIlIIIllIlllIl.put(string3, file4);
                    }
                }
            }
            catch (JsonParseException jsonParseException) {
                lllIIIllIIIIlllIlIIllIIll.error("Unable to parse resource index file: " + file3);
            }
            catch (FileNotFoundException fileNotFoundException) {
                lllIIIllIIIIlllIlIIllIIll.error("Can't find the resource index file: " + file3);
            }
            finally {
                IOUtils.closeQuietly((Reader)bufferedReader);
            }
        }
    }

    public Map func_152782_a() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }
}

