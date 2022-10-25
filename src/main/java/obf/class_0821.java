package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonParser
 *  org.apache.commons.io.IOUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.base.Charsets;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import javax.imageio.ImageIO;

import net.minecraft.util.ResourceLocation;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class class_0821
implements class_0449 {
    private static final Logger lllIlIIlIIIlIlIIIllIlllIl = LogManager.getLogger();
    public final File lllIIIllIIIIlllIlIIllIIll;

    public class_0821(File file) {
        this.lllIIIllIIIIlllIlIIllIIll = file;
    }

    private static String IlIllllllIIlIIllllIIlIIIl(ResourceLocation class_17732) {
        return String.format("%s/%s/%s", "assets", class_17732.lllIlIIlIIIlIlIIIllIlllIl(), class_17732.lllIIIllIIIIlllIlIIllIIll());
    }

    protected static String lllIIIllIIIIlllIlIIllIIll(File file, File file2) {
        return file.toURI().relativize(file2.toURI()).getPath();
    }

    @Override
    public InputStream lllIIIllIIIIlllIlIIllIIll(ResourceLocation class_17732) {
        return this.lllIIIllIIIIlllIlIIllIIll(class_0821.IlIllllllIIlIIllllIIlIIIl(class_17732));
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl(ResourceLocation class_17732) {
        return this.lllIlIIlIIIlIlIIIllIlllIl(class_0821.IlIllllllIIlIIllllIIlIIIl(class_17732));
    }

    protected abstract InputStream lllIIIllIIIIlllIlIIllIIll(String var1);

    protected abstract boolean lllIlIIlIIIlIlIIIllIlllIl(String var1);

    protected void IlIllllllIIlIIllllIIlIIIl(String string) {
        lllIlIIlIIIlIlIIIllIlllIl.warn("ResourcePack: ignored non-lowercase namespace: %s in %s", new Object[]{string, this.lllIIIllIIIIlllIlIIllIIll});
    }

    @Override
    public class_1574 lllIIIllIIIIlllIlIIllIIll(class_0233 class_02332, String string) {
        return class_0821.lllIIIllIIIIlllIlIIllIIll(class_02332, this.lllIIIllIIIIlllIlIIllIIll("pack.mcmeta"), string);
    }

    public static class_1574 lllIIIllIIIIlllIlIIllIIll(class_0233 class_02332, InputStream inputStream, String string) {
        JsonObject jsonObject = null;
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8));
            jsonObject = new JsonParser().parse((Reader)bufferedReader).getAsJsonObject();
        }
        catch (RuntimeException runtimeException) {
            try {
                throw new JsonParseException((Throwable)runtimeException);
            }
            catch (Throwable throwable) {
                IOUtils.closeQuietly(bufferedReader);
                throw throwable;
            }
        }
        IOUtils.closeQuietly((Reader)bufferedReader);
        return class_02332.lllIIIllIIIIlllIlIIllIIll(string, jsonObject);
    }

    @Override
    public BufferedImage lllIlIIlIIIlIlIIIllIlllIl() {
        return ImageIO.read(this.lllIIIllIIIIlllIlIIllIIll("pack.png"));
    }

    @Override
    public String IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll.getName();
    }
}

