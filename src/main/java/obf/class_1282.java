package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  org.apache.commons.io.IOUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL13
 */
import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;

import net.minecraft.client.renderer.OpenGlHelper;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;

public class class_1282 {
    private static final Logger lllIIIllIIIIlllIlIIllIIll = LogManager.getLogger();
    private static final class_1069 lllIlIIlIIIlIlIIIllIlllIl = new class_1069();
    private static class_1282 IlIllllllIIlIIllllIIlIIIl = null;
    private static int lIlllIlllIIIIlIIlllIllIII = -1;
    private static boolean IlIIIIIllllllIIlllIllllll = true;
    private final Map lIllllIIlIIIlIllllllIIIll = Maps.newHashMap();
    private final List IIIllIIlIIIIIIlIlIIllIIlI = Lists.newArrayList();
    private final List IllIIlllllllIIlIIlIIIIlIl = Lists.newArrayList();
    private final List IIIllIllIIlIlIlIlIllllIIl = Lists.newArrayList();
    private final List IllIIIllIIIIlIlIlIllIIlll = Lists.newArrayList();
    private final Map lIIIIlIlIIlllllIIllIIlIII = Maps.newHashMap();
    private final int llIIlllIllIllllIIIlIIIIII;
    private final String llIIllIllIlIIlIIllIllllll;
    private final boolean lllIIlIIIllllllIIIIlIlIlI;
    private boolean IlIlllIIIIIIlIIllIIllIlll;
    private final class_1599 IlIlIIlIlIllIIlIlIIllIIIl;
    private final List lllllIlllIIllIlIIlIIIllII;
    private final List IlIlIIlllIIlIllIIIlllllIl;
    private final class_1281 lIIlIIIIIlIlllIlIIlIlIlll;
    private final class_1281 lIlIlIIlIIIIlIIIIIlllIIII;

    public class_1282(class_0947 class_09472, String string) {
        JsonParser jsonParser = new JsonParser();
        ResourceLocation class_17732 = new ResourceLocation("shaders/program/" + string + ".json");
        this.llIIllIllIlIIlIIllIllllll = string;
        InputStream inputStream = null;
        try {
            JsonArray jsonArray;
            JsonArray jsonArray2;
            inputStream = class_09472.getResource(class_17732).getInputStream();
            JsonObject jsonObject = jsonParser.parse(IOUtils.toString((InputStream)inputStream, (Charset)Charsets.UTF_8)).getAsJsonObject();
            String string2 = class_0463.IlIIIIIllllllIIlllIllllll(jsonObject, "vertex");
            String string3 = class_0463.IlIIIIIllllllIIlllIllllll(jsonObject, "fragment");
            JsonArray jsonArray3 = class_0463.lllIIIllIIIIlllIlIIllIIll(jsonObject, "samplers", (JsonArray)null);
            if (jsonArray3 != null) {
                int n = 0;
                for (JsonElement jsonElement : jsonArray3) {
                    try {
                        this.lllIIIllIIIIlllIlIIllIIll(jsonElement);
                    }
                    catch (Exception exception) {
                        class_0051 class_00512 = class_0051.lllIIIllIIIIlllIlIIllIIll(exception);
                        class_00512.lllIIIllIIIIlllIlIIllIIll("samplers[" + n + "]");
                        throw class_00512;
                    }
                    ++n;
                }
            }
            if ((jsonArray2 = class_0463.lllIIIllIIIIlllIlIIllIIll(jsonObject, "attributes", (JsonArray)null)) != null) {
                int n = 0;
                this.lllllIlllIIllIlIIlIIIllII = Lists.newArrayListWithCapacity((int)jsonArray2.size());
                this.IlIlIIlllIIlIllIIIlllllIl = Lists.newArrayListWithCapacity((int)jsonArray2.size());
                for (JsonElement jsonElement : jsonArray2) {
                    try {
                        this.IlIlIIlllIIlIllIIIlllllIl.add(class_0463.lllIIIllIIIIlllIlIIllIIll(jsonElement, "attribute"));
                    }
                    catch (Exception exception) {
                        class_0051 class_00513 = class_0051.lllIIIllIIIIlllIlIIllIIll(exception);
                        class_00513.lllIIIllIIIIlllIlIIllIIll("attributes[" + n + "]");
                        throw class_00513;
                    }
                    ++n;
                }
            } else {
                this.lllllIlllIIllIlIIlIIIllII = null;
                this.IlIlIIlllIIlIllIIIlllllIl = null;
            }
            if ((jsonArray = class_0463.lllIIIllIIIIlllIlIIllIIll(jsonObject, "uniforms", (JsonArray)null)) != null) {
                int n = 0;
                for (JsonElement jsonElement : jsonArray) {
                    try {
                        this.lllIlIIlIIIlIlIIIllIlllIl(jsonElement);
                    }
                    catch (Exception exception) {
                        class_0051 class_00514 = class_0051.lllIIIllIIIIlllIlIIllIIll(exception);
                        class_00514.lllIIIllIIIIlllIlIIllIIll("uniforms[" + n + "]");
                        throw class_00514;
                    }
                    ++n;
                }
            }
            this.IlIlIIlIlIllIIlIlIIllIIIl = class_1599.lllIIIllIIIIlllIlIIllIIll(class_0463.lllIIIllIIIIlllIlIIllIIll(jsonObject, "blend", (JsonObject)null));
            this.lllIIlIIIllllllIIIIlIlIlI = class_0463.lllIIIllIIIIlllIlIIllIIll(jsonObject, "cull", true);
            this.lIIlIIIIIlIlllIlIIlIlIlll = class_1281.lllIIIllIIIIlllIlIIllIIll(class_09472, class_0674.lllIIIllIIIIlllIlIIllIIll, string2);
            this.lIlIlIIlIIIIlIIIIIlllIIII = class_1281.lllIIIllIIIIlllIlIIllIIll(class_09472, class_0674.lllIlIIlIIIlIlIIIllIlllIl, string3);
            this.llIIlllIllIllllIIIlIIIIII = class_2011.lllIlIIlIIIlIlIIIllIlllIl().IlIllllllIIlIIllllIIlIIIl();
            class_2011.lllIlIIlIIIlIlIIIllIlllIl().lllIlIIlIIIlIlIIIllIlllIl(this);
            this.IllIIlllllllIIlIIlIIIIlIl();
            if (this.IlIlIIlllIIlIllIIIlllllIl != null) {
                for (String string4 : this.IlIlIIlllIIlIllIIIlllllIl) {
                    int n = OpenGlHelper.lllIlIIlIIIlIlIIIllIlllIl(this.llIIlllIllIllllIIIlIIIIII, string4);
                    this.lllllIlllIIllIlIIlIIIllII.add(n);
                }
            }
        }
        catch (Exception exception) {
            try {
                class_0051 class_00515 = class_0051.lllIIIllIIIIlllIlIIllIIll(exception);
                class_00515.lllIlIIlIIIlIlIIIllIlllIl(class_17732.lllIIIllIIIIlllIlIIllIIll());
                throw class_00515;
            }
            catch (Throwable throwable) {
                IOUtils.closeQuietly(inputStream);
                throw throwable;
            }
        }
        IOUtils.closeQuietly((InputStream)inputStream);
        this.lIlllIlllIIIIlIIlllIllIII();
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        class_2011.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(this);
    }

    public void lllIlIIlIIIlIlIIIllIlllIl() {
        OpenGlHelper.lIlllIlllIIIIlIIlllIllIII(0);
        lIlllIlllIIIIlIIlllIllIII = -1;
        IlIllllllIIlIIllllIIlIIIl = null;
        IlIIIIIllllllIIlllIllllll = true;
        for (int i = 0; i < this.IllIIlllllllIIlIIlIIIIlIl.size(); ++i) {
            if (this.lIllllIIlIIIlIllllllIIIll.get(this.IIIllIIlIIIIIIlIlIIllIIlI.get(i)) == null) continue;
            GL13.glActiveTexture((int)(33984 + i));
            GL11.glBindTexture((int)3553, (int)0);
        }
    }

    public void IlIllllllIIlIIllllIIlIIIl() {
        this.IlIlllIIIIIIlIIllIIllIlll = false;
        IlIllllllIIlIIllllIIlIIIl = this;
        this.IlIlIIlIlIllIIlIlIIllIIIl.lllIIIllIIIIlllIlIIllIIll();
        if (this.llIIlllIllIllllIIIlIIIIII != lIlllIlllIIIIlIIlllIllIII) {
            OpenGlHelper.lIlllIlllIIIIlIIlllIllIII(this.llIIlllIllIllllIIIlIIIIII);
            lIlllIlllIIIIlIIlllIllIII = this.llIIlllIllIllllIIIlIIIIII;
        }
        if (IlIIIIIllllllIIlllIllllll != this.lllIIlIIIllllllIIIIlIlIlI) {
            IlIIIIIllllllIIlllIllllll = this.lllIIlIIIllllllIIIIlIlIlI;
            if (this.lllIIlIIIllllllIIIIlIlIlI) {
                GL11.glEnable((int)2884);
            } else {
                GL11.glDisable((int)2884);
            }
        }
        for (int i = 0; i < this.IllIIlllllllIIlIIlIIIIlIl.size(); ++i) {
            if (this.lIllllIIlIIIlIllllllIIIll.get(this.IIIllIIlIIIIIIlIlIIllIIlI.get(i)) == null) continue;
            GL13.glActiveTexture((int)(33984 + i));
            GL11.glEnable((int)3553);
            class_0900 class_09002 = this.lIllllIIlIIIlIllllllIIIll.get(this.IIIllIIlIIIIIIlIlIIllIIlI.get(i));
            int n = -1;
            if (class_09002 instanceof class_0778) {
                n = ((class_0778)class_09002).IIIllIIlIIIIIIlIlIIllIIlI;
            } else if (class_09002 instanceof class_0211) {
                n = ((class_0211)((Object)class_09002)).lllIIIllIIIIlllIlIIllIIll();
            } else if (class_09002 instanceof Integer) {
                n = (Integer)((Object)class_09002);
            }
            if (n == -1) continue;
            GL11.glBindTexture((int)3553, (int)n);
            OpenGlHelper.lIllllIIlIIIlIllllllIIIll(OpenGlHelper.lllIIIllIIIIlllIlIIllIIll(this.llIIlllIllIllllIIIlIIIIII, (CharSequence)this.IIIllIIlIIIIIIlIlIIllIIlI.get(i)), i);
        }
        for (class_0900 class_09002 : this.IIIllIllIIlIlIlIlIllllIIl) {
            class_09002.lllIlIIlIIIlIlIIIllIlllIl();
        }
    }

    public void lIlllIlllIIIIlIIlllIllIII() {
        this.IlIlllIIIIIIlIIllIIllIlll = true;
    }

    public class_0900 lllIIIllIIIIlllIlIIllIIll(String string) {
        return this.lIIIIlIlIIlllllIIllIIlIII.containsKey(string) ? (class_0900)this.lIIIIlIlIIlllllIIllIIlIII.get(string) : null;
    }

    public class_0900 lllIlIIlIIIlIlIIIllIlllIl(String string) {
        return this.lIIIIlIlIIlllllIIllIIlIII.containsKey(string) ? (class_0900)this.lIIIIlIlIIlllllIIllIIlIII.get(string) : lllIlIIlIIIlIlIIIllIlllIl;
    }

    private void IllIIlllllllIIlIIlIIIIlIl() {
        int n;
        String string;
        int n2 = 0;
        int n3 = 0;
        while (n2 < this.IIIllIIlIIIIIIlIlIIllIIlI.size()) {
            string = (String)this.IIIllIIlIIIIIIlIlIIllIIlI.get(n2);
            n = OpenGlHelper.lllIIIllIIIIlllIlIIllIIll(this.llIIlllIllIllllIIIlIIIIII, string);
            if (n == -1) {
                lllIIIllIIIIlllIlIIllIIll.warn("Shader " + this.llIIllIllIlIIlIIllIllllll + "could not find sampler named " + string + " in the specified shader program.");
                this.lIllllIIlIIIlIllllllIIIll.remove(string);
                this.IIIllIIlIIIIIIlIlIIllIIlI.remove(n3);
                --n3;
            } else {
                this.IllIIlllllllIIlIIlIIIIlIl.add(n);
            }
            ++n2;
            ++n3;
        }
        for (class_0900 class_09002 : this.IIIllIllIIlIlIlIlIllllIIl) {
            string = class_09002.lllIIIllIIIIlllIlIIllIIll();
            n = OpenGlHelper.lllIIIllIIIIlllIlIIllIIll(this.llIIlllIllIllllIIIlIIIIII, string);
            if (n == -1) {
                lllIIIllIIIIlllIlIIllIIll.warn("Could not find uniform named " + string + " in the specified shader program.");
                continue;
            }
            this.IllIIIllIIIIlIlIlIllIIlll.add(n);
            class_09002.lllIIIllIIIIlllIlIIllIIll(n);
            this.lIIIIlIlIIlllllIIllIIlIII.put(string, class_09002);
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(JsonElement jsonElement) {
        JsonObject jsonObject = class_0463.IlIIIIIllllllIIlllIllllll(jsonElement, "sampler");
        String string = class_0463.IlIIIIIllllllIIlllIllllll(jsonObject, "name");
        if (!class_0463.lllIIIllIIIIlllIlIIllIIll(jsonObject, "file")) {
            this.lIllllIIlIIIlIllllllIIIll.put(string, null);
            this.IIIllIIlIIIIIIlIlIIllIIlI.add(string);
        } else {
            this.IIIllIIlIIIIIIlIlIIllIIlI.add(string);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string, Object object) {
        if (this.lIllllIIlIIIlIllllllIIIll.containsKey(string)) {
            this.lIllllIIlIIIlIllllllIIIll.remove(string);
        }
        this.lIllllIIlIIIlIllllllIIIll.put(string, object);
        this.lIlllIlllIIIIlIIlllIllIII();
    }

    private void lllIlIIlIIIlIlIIIllIlllIl(JsonElement jsonElement) {
        Object object2;
        JsonObject jsonObject = class_0463.IlIIIIIllllllIIlllIllllll(jsonElement, "uniform");
        String string = class_0463.IlIIIIIllllllIIlllIllllll(jsonObject, "name");
        int n = class_0900.lllIIIllIIIIlllIlIIllIIll(class_0463.IlIIIIIllllllIIlllIllllll(jsonObject, "type"));
        int n2 = class_0463.IllIIlllllllIIlIIlIIIIlIl(jsonObject, "count");
        float[] arrf = new float[Math.max(n2, 16)];
        JsonArray jsonArray = class_0463.IllIIIllIIIIlIlIlIllIIlll(jsonObject, "values");
        if (jsonArray.size() != n2 && jsonArray.size() > 1) {
            throw new class_0051("Invalid amount of values specified (expected " + n2 + ", found " + jsonArray.size() + ")");
        }
        int n3 = 0;
        for (Object object2 : jsonArray) {
            try {
                arrf[n3] = class_0463.IlIllllllIIlIIllllIIlIIIl((JsonElement)object2, "value");
            }
            catch (Exception exception) {
                class_0051 class_00512 = class_0051.lllIIIllIIIIlllIlIIllIIll(exception);
                class_00512.lllIIIllIIIIlllIlIIllIIll("values[" + n3 + "]");
                throw class_00512;
            }
            ++n3;
        }
        if (n2 > 1 && jsonArray.size() == 1) {
            while (n3 < n2) {
                arrf[n3] = arrf[0];
                ++n3;
            }
        }
        int n4 = n2 > 1 && n2 <= 4 && n < 8 ? n2 - 1 : 0;
        object2 = new class_0900(string, n + n4, n2, this);
        if (n <= 3) {
            ((class_0900)object2).lllIIIllIIIIlllIlIIllIIll((int)arrf[0], (int)arrf[1], (int)arrf[2], (int)arrf[3]);
        } else if (n <= 7) {
            ((class_0900)object2).lllIlIIlIIIlIlIIIllIlllIl(arrf[0], arrf[1], arrf[2], arrf[3]);
        } else {
            ((class_0900)object2).lllIIIllIIIIlllIlIIllIIll(arrf);
        }
        this.IIIllIllIIlIlIlIlIllllIIl.add(object2);
    }

    public class_1281 IlIIIIIllllllIIlllIllllll() {
        return this.lIIlIIIIIlIlllIlIIlIlIlll;
    }

    public class_1281 lIllllIIlIIIlIllllllIIIll() {
        return this.lIlIlIIlIIIIlIIIIIlllIIII;
    }

    public int IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.llIIlllIllIllllIIIlIIIIII;
    }
}

