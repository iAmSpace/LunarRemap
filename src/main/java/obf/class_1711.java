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
 *  javax.vecmath.Matrix4f
 *  org.apache.commons.io.IOUtils
 *  org.lwjgl.opengl.GL11
 */
import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import javax.vecmath.Matrix4f;
import org.apache.commons.io.IOUtils;
import org.lwjgl.opengl.GL11;

public class class_1711 {
    private final class_0778 lllIIIllIIIIlllIlIIllIIll;
    private final class_0947 lllIlIIlIIIlIlIIIllIlllIl;
    private final String IlIllllllIIlIIllllIIlIIIl;
    private final List lIlllIlllIIIIlIIlllIllIII = Lists.newArrayList();
    private final Map IlIIIIIllllllIIlllIllllll = Maps.newHashMap();
    private final List lIllllIIlIIIlIllllllIIIll = Lists.newArrayList();
    private Matrix4f IIIllIIlIIIIIIlIlIIllIIlI;
    private int IllIIlllllllIIlIIlIIIIlIl;
    private int IIIllIllIIlIlIlIlIllllIIl;
    private float IllIIIllIIIIlIlIlIllIIlll;
    private float lIIIIlIlIIlllllIIllIIlIII;

    public class_1711(class_1682 class_16822, class_0947 class_09472, class_0778 class_07782, ResourceLocation class_17732) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_09472;
        this.lllIIIllIIIIlllIlIIllIIll = class_07782;
        this.IllIIIllIIIIlIlIlIllIIlll = 0.0f;
        this.lIIIIlIlIIlllllIIllIIlIII = 0.0f;
        this.IllIIlllllllIIlIIlIIIIlIl = class_07782.IlIllllllIIlIIllllIIlIIIl;
        this.IIIllIllIIlIlIlIlIllllIIl = class_07782.lIlllIlllIIIIlIIlllIllIII;
        this.IlIllllllIIlIIllllIIlIIIl = class_17732.toString();
        this.lIlllIlllIIIIlIIlllIllIII();
        this.lllIIIllIIIIlllIlIIllIIll(class_16822, class_17732);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1682 class_16822, ResourceLocation class_17732) {
        InputStream inputStream;
        block11: {
            JsonParser jsonParser = new JsonParser();
            inputStream = null;
            try {
                int n;
                JsonArray jsonArray;
                class_2234 class_22342 = this.lllIlIIlIIIlIlIIIllIlllIl.getResource(class_17732);
                inputStream = class_22342.getInputStream();
                JsonObject jsonObject = jsonParser.parse(IOUtils.toString((InputStream)inputStream, (Charset)Charsets.UTF_8)).getAsJsonObject();
                if (class_0463.lllIlIIlIIIlIlIIIllIlllIl(jsonObject, "targets")) {
                    jsonArray = jsonObject.getAsJsonArray("targets");
                    n = 0;
                    for (JsonElement jsonElement : jsonArray) {
                        try {
                            this.lllIIIllIIIIlllIlIIllIIll(jsonElement);
                        }
                        catch (Exception exception) {
                            class_0051 class_00512 = class_0051.lllIIIllIIIIlllIlIIllIIll(exception);
                            class_00512.lllIIIllIIIIlllIlIIllIIll("targets[" + n + "]");
                            throw class_00512;
                        }
                        ++n;
                    }
                }
                if (!class_0463.lllIlIIlIIIlIlIIIllIlllIl(jsonObject, "passes")) break block11;
                jsonArray = jsonObject.getAsJsonArray("passes");
                n = 0;
                for (JsonElement jsonElement : jsonArray) {
                    try {
                        this.lllIIIllIIIIlllIlIIllIIll(class_16822, jsonElement);
                    }
                    catch (Exception exception) {
                        class_0051 class_00513 = class_0051.lllIIIllIIIIlllIlIIllIIll(exception);
                        class_00513.lllIIIllIIIIlllIlIIllIIll("passes[" + n + "]");
                        throw class_00513;
                    }
                    ++n;
                }
            }
            catch (Exception exception) {
                try {
                    class_0051 class_00514 = class_0051.lllIIIllIIIIlllIlIIllIIll(exception);
                    class_00514.lllIlIIlIIIlIlIIIllIlllIl(class_17732.lllIIIllIIIIlllIlIIllIIll());
                    throw class_00514;
                }
                catch (Throwable throwable) {
                    IOUtils.closeQuietly(inputStream);
                    throw throwable;
                }
            }
        }
        IOUtils.closeQuietly((InputStream)inputStream);
    }

    private void lllIIIllIIIIlllIlIIllIIll(JsonElement jsonElement) {
        if (class_0463.lllIIIllIIIIlllIlIIllIIll(jsonElement)) {
            this.lllIIIllIIIIlllIlIIllIIll(jsonElement.getAsString(), this.IllIIlllllllIIlIIlIIIIlIl, this.IIIllIllIIlIlIlIlIllllIIl);
        } else {
            JsonObject jsonObject = class_0463.IlIIIIIllllllIIlllIllllll(jsonElement, "target");
            String string = class_0463.IlIIIIIllllllIIlllIllllll(jsonObject, "name");
            int n = class_0463.lllIIIllIIIIlllIlIIllIIll(jsonObject, "width", this.IllIIlllllllIIlIIlIIIIlIl);
            int n2 = class_0463.lllIIIllIIIIlllIlIIllIIll(jsonObject, "height", this.IIIllIllIIlIlIlIlIllllIIl);
            if (this.IlIIIIIllllllIIlllIllllll.containsKey(string)) {
                throw new class_0051(string + " is already defined");
            }
            this.lllIIIllIIIIlllIlIIllIIll(string, n, n2);
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_1682 class_16822, JsonElement jsonElement) {
        JsonArray jsonArray;
        Object object;
        JsonObject jsonObject = class_0463.IlIIIIIllllllIIlllIllllll(jsonElement, "pass");
        String string = class_0463.IlIIIIIllllllIIlllIllllll(jsonObject, "name");
        String string2 = class_0463.IlIIIIIllllllIIlllIllllll(jsonObject, "intarget");
        String string3 = class_0463.IlIIIIIllllllIIlllIllllll(jsonObject, "outtarget");
        class_0778 class_07782 = this.lllIIIllIIIIlllIlIIllIIll(string2);
        class_0778 class_07783 = this.lllIIIllIIIIlllIlIIllIIll(string3);
        if (class_07782 == null) {
            throw new class_0051("Input target '" + string2 + "' does not exist");
        }
        if (class_07783 == null) {
            throw new class_0051("Output target '" + string3 + "' does not exist");
        }
        class_1649 class_16492 = this.lllIIIllIIIIlllIlIIllIIll(string, class_07782, class_07783);
        JsonArray jsonArray2 = class_0463.lllIIIllIIIIlllIlIIllIIll(jsonObject, "auxtargets", (JsonArray)null);
        if (jsonArray2 != null) {
            int n = 0;
            for (Object object2 : jsonArray2) {
                block15: {
                    Object object3;
                    try {
                        JsonObject jsonObject2 = class_0463.IlIIIIIllllllIIlllIllllll((JsonElement)object2, "auxtarget");
                        object3 = class_0463.IlIIIIIllllllIIlllIllllll(jsonObject2, "name");
                        object = class_0463.IlIIIIIllllllIIlllIllllll(jsonObject2, "id");
                        class_0778 class_07784 = this.lllIIIllIIIIlllIlIIllIIll((String)object);
                        if (class_07784 == null) {
                            ResourceLocation class_17732 = new ResourceLocation("textures/effect/" + (String)object + ".png");
                            try {
                                this.lllIlIIlIIIlIlIIIllIlllIl.getResource(class_17732);
                            }
                            catch (FileNotFoundException fileNotFoundException) {
                                throw new class_0051("Render target or texture '" + (String)object + "' does not exist");
                            }
                            class_16822.lllIIIllIIIIlllIlIIllIIll(class_17732);
                            class_0211 class_02112 = class_16822.lllIlIIlIIIlIlIIIllIlllIl(class_17732);
                            int n2 = class_0463.IllIIlllllllIIlIIlIIIIlIl(jsonObject2, "width");
                            int n3 = class_0463.IllIIlllllllIIlIIlIIIIlIl(jsonObject2, "height");
                            boolean bl = class_0463.lIllllIIlIIIlIllllllIIIll(jsonObject2, "bilinear");
                            if (bl) {
                                GL11.glTexParameteri((int)3553, (int)10241, (int)9729);
                                GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
                            } else {
                                GL11.glTexParameteri((int)3553, (int)10241, (int)9728);
                                GL11.glTexParameteri((int)3553, (int)10240, (int)9728);
                            }
                            class_16492.lllIIIllIIIIlllIlIIllIIll((String)object3, class_02112.lllIIIllIIIIlllIlIIllIIll(), n2, n3);
                            break block15;
                        }
                        class_16492.lllIIIllIIIIlllIlIIllIIll((String)object3, class_07784, class_07784.lllIIIllIIIIlllIlIIllIIll, class_07784.lllIlIIlIIIlIlIIIllIlllIl);
                    }
                    catch (Exception exception) {
                        object3 = class_0051.lllIIIllIIIIlllIlIIllIIll(exception);
                        ((class_0051)object3).lllIIIllIIIIlllIlIIllIIll("auxtargets[" + n + "]");
                        throw object3;
                    }
                }
                ++n;
            }
        }
        if ((jsonArray = class_0463.lllIIIllIIIIlllIlIIllIIll(jsonObject, "uniforms", (JsonArray)null)) != null) {
            int n = 0;
            for (JsonObject jsonObject2 : jsonArray) {
                try {
                    this.lllIlIIlIIIlIlIIIllIlllIl((JsonElement)jsonObject2);
                }
                catch (Exception exception) {
                    object = class_0051.lllIIIllIIIIlllIlIIllIIll(exception);
                    ((class_0051)object).lllIIIllIIIIlllIlIIllIIll("uniforms[" + n + "]");
                    throw object;
                }
                ++n;
            }
        }
    }

    private void lllIlIIlIIIlIlIIIllIlllIl(JsonElement jsonElement) {
        JsonObject jsonObject = class_0463.IlIIIIIllllllIIlllIllllll(jsonElement, "uniform");
        String string = class_0463.IlIIIIIllllllIIlllIllllll(jsonObject, "name");
        class_0900 class_09002 = ((class_1649)this.lIlllIlllIIIIlIIlllIllIII.get(this.lIlllIlllIIIIlIIlllIllIII.size() - 1)).lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(string);
        if (class_09002 == null) {
            throw new class_0051("Uniform '" + string + "' does not exist");
        }
        float[] arrf = new float[4];
        int n = 0;
        JsonArray jsonArray = class_0463.IllIIIllIIIIlIlIlIllIIlll(jsonObject, "values");
        for (JsonElement jsonElement2 : jsonArray) {
            try {
                arrf[n] = class_0463.IlIllllllIIlIIllllIIlIIIl(jsonElement2, "value");
            }
            catch (Exception exception) {
                class_0051 class_00512 = class_0051.lllIIIllIIIIlllIlIIllIIll(exception);
                class_00512.lllIIIllIIIIlllIlIIllIIll("values[" + n + "]");
                throw class_00512;
            }
            ++n;
        }
        switch (n) {
            default: {
                break;
            }
            case 1: {
                class_09002.lllIIIllIIIIlllIlIIllIIll(arrf[0]);
                break;
            }
            case 2: {
                class_09002.lllIIIllIIIIlllIlIIllIIll(arrf[0], arrf[1]);
                break;
            }
            case 3: {
                class_09002.lllIIIllIIIIlllIlIIllIIll(arrf[0], arrf[1], arrf[2]);
                break;
            }
            case 4: {
                class_09002.lllIIIllIIIIlllIlIIllIIll(arrf[0], arrf[1], arrf[2], arrf[3]);
            }
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string, int n, int n2) {
        class_0778 class_07782 = new class_0778(n, n2, true);
        class_07782.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 0.0f);
        this.IlIIIIIllllllIIlllIllllll.put(string, class_07782);
        if (n == this.IllIIlllllllIIlIIlIIIIlIl && n2 == this.IIIllIllIIlIlIlIlIllllIIl) {
            this.lIllllIIlIIIlIllllllIIIll.add(class_07782);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        for (Object object : this.IlIIIIIllllllIIlllIllllll.values()) {
            ((class_0778)object).lllIIIllIIIIlllIlIIllIIll();
        }
        for (Object object : this.lIlllIlllIIIIlIIlllIllIII) {
            ((class_1649)object).lllIIIllIIIIlllIlIIllIIll();
        }
        this.lIlllIlllIIIIlIIlllIllIII.clear();
    }

    public class_1649 lllIIIllIIIIlllIlIIllIIll(String string, class_0778 class_07782, class_0778 class_07783) {
        class_1649 class_16492 = new class_1649(this.lllIlIIlIIIlIlIIIllIlllIl, string, class_07782, class_07783);
        this.lIlllIlllIIIIlIIlllIllIII.add(this.lIlllIlllIIIIlIIlllIllIII.size(), class_16492);
        return class_16492;
    }

    private void lIlllIlllIIIIlIIlllIllIII() {
        this.IIIllIIlIIIIIIlIlIIllIIlI = new Matrix4f();
        this.IIIllIIlIIIIIIlIlIIllIIlI.setIdentity();
        this.IIIllIIlIIIIIIlIlIIllIIlI.m00 = 2.0f / (float)this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll;
        this.IIIllIIlIIIIIIlIlIIllIIlI.m11 = 2.0f / (float)(-this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl);
        this.IIIllIIlIIIIIIlIlIIllIIlI.m22 = -0.0020001999f;
        this.IIIllIIlIIIIIIlIlIIllIIlI.m33 = 1.0f;
        this.IIIllIIlIIIIIIlIlIIllIIlI.m03 = -1.0f;
        this.IIIllIIlIIIIIIlIlIIllIIlI.m13 = 1.0f;
        this.IIIllIIlIIIIIIlIlIIllIIlI.m23 = -1.0001999f;
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        this.IllIIlllllllIIlIIlIIIIlIl = this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll;
        this.IIIllIllIIlIlIlIlIllllIIl = this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl;
        this.lIlllIlllIIIIlIIlllIllIII();
        for (Object object : this.lIlllIlllIIIIlIIlllIllIII) {
            ((class_1649)object).lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI);
        }
        for (Object object : this.lIllllIIlIIIlIllllllIIIll) {
            ((class_0778)object).lllIIIllIIIIlllIlIIllIIll(n, n2);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(float f) {
        if (f < this.lIIIIlIlIIlllllIIllIIlIII) {
            this.IllIIIllIIIIlIlIlIllIIlll += 1.0f - this.lIIIIlIlIIlllllIIllIIlIII;
            this.IllIIIllIIIIlIlIlIllIIlll += f;
        } else {
            this.IllIIIllIIIIlIlIlIllIIlll += f - this.lIIIIlIlIIlllllIIllIIlIII;
        }
        this.lIIIIlIlIIlllllIIllIIlIII = f;
        while (this.IllIIIllIIIIlIlIlIllIIlll > 20.0f) {
            this.IllIIIllIIIIlIlIlIllIIlll -= 20.0f;
        }
        for (class_1649 class_16492 : this.lIlllIlllIIIIlIIlllIllIII) {
            class_16492.lllIIIllIIIIlllIlIIllIIll(this.IllIIIllIIIIlIlIlIllIIlll / 20.0f);
        }
    }

    public final String lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    private class_0778 lllIIIllIIIIlllIlIIllIIll(String string) {
        return string == null ? null : (string.equals("minecraft:main") ? this.lllIIIllIIIIlllIlIIllIIll : (class_0778)this.IlIIIIIllllllIIlllIllllll.get(string));
    }

    public List IlIllllllIIlIIllllIIlIIIl() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }
}

