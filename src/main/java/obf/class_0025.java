package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.commons.io.IOUtils
 */
import java.awt.image.BufferedImage;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.IOUtils;

public class class_0025 {
    private final File lllIlIIlIIIlIlIIIllIlllIl;
    private class_0449 IlIllllllIIlIIllllIIlIIIl;
    private class_1866 lIlllIlllIIIIlIIlllIllIII;
    private BufferedImage IlIIIIIllllllIIlllIllllll;
    private ResourceLocation lIllllIIlIIIlIllllllIIIll;
    final /* synthetic */ class_1605 lllIIIllIIIIlllIlIIllIIll;

    private class_0025(class_1605 class_16052, File file) {
        this.lllIIIllIIIIlllIlIIllIIll = class_16052;
        this.lllIlIIlIIIlIlIIIllIlllIl = file;
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        this.IlIllllllIIlIIllllIIlIIIl = this.lllIlIIlIIIlIlIIIllIlllIl.isDirectory() ? new class_1429(this.lllIlIIlIIIlIlIIIllIlllIl) : new class_0513(this.lllIlIIlIIIlIlIIIllIlllIl);
        this.lIlllIlllIIIIlIIlllIllIII = (class_1866)this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl, "pack");
        try {
            this.IlIIIIIllllllIIlllIllllll = this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl();
        }
        catch (IOException iOException) {
            // empty catch block
        }
        if (this.IlIIIIIllllllIIlllIllllll == null) {
            this.IlIIIIIllllllIIlllIllllll = this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl();
        }
        this.lllIlIIlIIIlIlIIIllIlllIl();
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1682 class_16822) {
        if (this.lIllllIIlIIIlIllllllIIIll == null) {
            this.lIllllIIlIIIlIllllllIIIll = class_16822.lllIIIllIIIIlllIlIIllIIll("texturepackicon", new class_2202(this.IlIIIIIllllllIIlllIllllll));
        }
        class_16822.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll);
    }

    public void lllIlIIlIIIlIlIIIllIlllIl() {
        if (this.IlIllllllIIlIIllllIIlIIIl instanceof Closeable) {
            IOUtils.closeQuietly((Closeable)((Closeable)((Object)this.IlIllllllIIlIIllllIIlIIIl)));
        }
    }

    public class_0449 IlIllllllIIlIIllllIIlIIIl() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public String lIlllIlllIIIIlIIlllIllIII() {
        return this.IlIllllllIIlIIllllIIlIIIl.IlIllllllIIlIIllllIIlIIIl();
    }

    public String IlIIIIIllllllIIlllIllllll() {
        return this.lIlllIlllIIIIlIIlllIllIII == null ? (Object)((Object)class_1227.llIIllIllIlIIlIIllIllllll) + "Invalid pack.mcmeta (or missing 'pack' section)" : this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll().lIlllIlllIIIIlIIlllIllIII();
    }

    public boolean equals(Object object) {
        return this == object ? true : (object instanceof class_0025 ? this.toString().equals(object.toString()) : false);
    }

    public int hashCode() {
        return this.toString().hashCode();
    }

    public String toString() {
        return String.format("%s:%s:%d", this.lllIlIIlIIIlIlIIIllIlllIl.getName(), this.lllIlIIlIIIlIlIIIllIlllIl.isDirectory() ? "folder" : "zip", this.lllIlIIlIIIlIlIIIllIlllIl.lastModified());
    }

    class_0025(class_1605 class_16052, File file, Object object) {
        this(class_16052, file);
    }
}

