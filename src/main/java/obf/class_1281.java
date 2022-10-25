package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.commons.io.IOUtils
 *  org.apache.commons.lang3.StringUtils
 *  org.lwjgl.BufferUtils
 */
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

import net.minecraft.util.ResourceLocation;
import net.minecraft.client.renderer.OpenGlHelper;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.lwjgl.BufferUtils;

public class class_1281 {
    private final class_0674 lllIIIllIIIIlllIlIIllIIll;
    private final String lllIlIIlIIIlIlIIIllIlllIl;
    private int IlIllllllIIlIIllllIIlIIIl;
    private int lIlllIlllIIIIlIIlllIllIII = 0;

    private class_1281(class_0674 class_06742, int n, String string) {
        this.lllIIIllIIIIlllIlIIllIIll = class_06742;
        this.IlIllllllIIlIIllllIIlIIIl = n;
        this.lllIlIIlIIIlIlIIIllIlllIl = string;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1282 class_12822) {
        ++this.lIlllIlllIIIIlIIlllIllIII;
        OpenGlHelper.lllIlIIlIIIlIlIIIllIlllIl(class_12822.IIIllIIlIIIIIIlIlIIllIIlI(), this.IlIllllllIIlIIllllIIlIIIl);
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_1282 class_12822) {
        --this.lIlllIlllIIIIlIIlllIllIII;
        if (this.lIlllIlllIIIIlIIlllIllIII <= 0) {
            OpenGlHelper.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl);
            this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII().remove(this.lllIlIIlIIIlIlIIIllIlllIl);
        }
    }

    public String lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public static class_1281 lllIIIllIIIIlllIlIIllIIll(class_0947 class_09472, class_0674 class_06742, String string) {
        class_1281 class_12812 = (class_1281)class_06742.lIlllIlllIIIIlIIlllIllIII().get(string);
        if (class_12812 == null) {
            ResourceLocation class_17732 = new ResourceLocation("shaders/program/" + string + class_06742.lllIlIIlIIIlIlIIIllIlllIl());
            BufferedInputStream bufferedInputStream = new BufferedInputStream(class_09472.getResource(class_17732).getInputStream());
            byte[] arrby = IOUtils.toByteArray((InputStream)bufferedInputStream);
            ByteBuffer byteBuffer = BufferUtils.createByteBuffer((int)arrby.length);
            byteBuffer.put(arrby);
            byteBuffer.position(0);
            int n = OpenGlHelper.lllIlIIlIIIlIlIIIllIlllIl(class_06742.IlIllllllIIlIIllllIIlIIIl());
            OpenGlHelper.lllIIIllIIIIlllIlIIllIIll(n, byteBuffer);
            OpenGlHelper.IlIllllllIIlIIllllIIlIIIl(n);
            if (OpenGlHelper.IlIllllllIIlIIllllIIlIIIl(n, OpenGlHelper.IlIlIIlIlIllIIlIlIIllIIIl) == 0) {
                String string2 = StringUtils.trim((String) OpenGlHelper.lIlllIlllIIIIlIIlllIllIII(n, 32768));
                class_0051 class_00512 = new class_0051("Couldn't compile " + class_06742.lllIIIllIIIIlllIlIIllIIll() + " program: " + string2);
                class_00512.lllIlIIlIIIlIlIIIllIlllIl(class_17732.lllIIIllIIIIlllIlIIllIIll());
                throw class_00512;
            }
            class_12812 = new class_1281(class_06742, n, string);
            class_06742.lIlllIlllIIIIlIIlllIllIII().put(string, class_12812);
        }
        return class_12812;
    }
}

