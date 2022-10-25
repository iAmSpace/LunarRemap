package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_0365
implements class_0735,
class_0028 {
    private static final Logger lllIIIllIIIIlllIlIIllIIll = LogManager.getLogger();
    private final File lllIlIIlIIIlIlIIIllIlllIl;
    private final File IlIllllllIIlIIllllIIlIIIl;
    private final File lIlllIlllIIIIlIIlllIllIII;
    private final long IlIIIIIllllllIIlllIllllll = class_0220.lllIIIlIIlIlIllIIIIIlIIll();
    private final String lIllllIIlIIIlIllllllIIIll;

    public class_0365(File file, String string, boolean bl) {
        this.lllIlIIlIIIlIlIIIllIlllIl = new File(file, string);
        this.lllIlIIlIIIlIlIIIllIlllIl.mkdirs();
        this.IlIllllllIIlIIllllIIlIIIl = new File(this.lllIlIIlIIIlIlIIIllIlllIl, "playerdata");
        this.lIlllIlllIIIIlIIlllIllIII = new File(this.lllIlIIlIIIlIlIIIllIlllIl, "data");
        this.lIlllIlllIIIIlIIlllIllIII.mkdirs();
        this.lIllllIIlIIIlIllllllIIIll = string;
        if (bl) {
            this.IlIllllllIIlIIllllIIlIIIl.mkdirs();
        }
        this.IllIIlllllllIIlIIlIIIIlIl();
    }

    private void IllIIlllllllIIlIIlIIIIlIl() {
        try {
            File file = new File(this.lllIlIIlIIIlIlIIIllIlllIl, "session.lock");
            try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));){
                dataOutputStream.writeLong(this.IlIIIIIllllllIIlllIllllll);
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            throw new RuntimeException("Failed to check session lock, aborting");
        }
    }

    @Override
    public File lIllllIIlIIIlIllllllIIIll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII() {
        try {
            File file = new File(this.lllIlIIlIIIlIlIIIllIlllIl, "session.lock");
            try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));){
                if (dataInputStream.readLong() != this.IlIIIIIllllllIIlllIllllll) {
                    throw new class_1038("The save is being accessed from another location, aborting");
                }
            }
        }
        catch (IOException iOException) {
            throw new class_1038("Failed to check session lock, aborting");
        }
    }

    @Override
    public class_1831 lllIIIllIIIIlllIlIIllIIll(class_1163 class_11632) {
        throw new RuntimeException("Old Chunk Storage is no longer supported.");
    }

    @Override
    public class_0770 IlIllllllIIlIIllllIIlIIIl() {
        File file = new File(this.lllIlIIlIIIlIlIIIllIlllIl, "level.dat");
        if (file.exists()) {
            try {
                class_0775 class_07752 = class_0893.lllIIIllIIIIlllIlIIllIIll(new FileInputStream(file));
                class_0775 class_07753 = class_07752.llIIllIllIlIIlIIllIllllll("Data");
                return new class_0770(class_07753);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        if ((file = new File(this.lllIlIIlIIIlIlIIIllIlllIl, "level.dat_old")).exists()) {
            try {
                class_0775 class_07754 = class_0893.lllIIIllIIIIlllIlIIllIIll(new FileInputStream(file));
                class_0775 class_07755 = class_07754.llIIllIllIlIIlIIllIllllll("Data");
                return new class_0770(class_07755);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0770 class_07702, class_0775 class_07752) {
        class_0775 class_07753 = class_07702.lllIIIllIIIIlllIlIIllIIll(class_07752);
        class_0775 class_07754 = new class_0775();
        class_07754.lllIIIllIIIIlllIlIIllIIll("Data", class_07753);
        try {
            File file = new File(this.lllIlIIlIIIlIlIIIllIlllIl, "level.dat_new");
            File file2 = new File(this.lllIlIIlIIIlIlIIIllIlllIl, "level.dat_old");
            File file3 = new File(this.lllIlIIlIIIlIlIIIllIlllIl, "level.dat");
            class_0893.lllIIIllIIIIlllIlIIllIIll(class_07754, new FileOutputStream(file));
            if (file2.exists()) {
                file2.delete();
            }
            file3.renameTo(file2);
            if (file3.exists()) {
                file3.delete();
            }
            file.renameTo(file3);
            if (file.exists()) {
                file.delete();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0770 class_07702) {
        class_0775 class_07752 = class_07702.lllIIIllIIIIlllIlIIllIIll();
        class_0775 class_07753 = new class_0775();
        class_07753.lllIIIllIIIIlllIlIIllIIll("Data", class_07752);
        try {
            File file = new File(this.lllIlIIlIIIlIlIIIllIlllIl, "level.dat_new");
            File file2 = new File(this.lllIlIIlIIIlIlIIIllIlllIl, "level.dat_old");
            File file3 = new File(this.lllIlIIlIIIlIlIIIllIlllIl, "level.dat");
            class_0893.lllIIIllIIIIlllIlIIllIIll(class_07753, new FileOutputStream(file));
            if (file2.exists()) {
                file2.delete();
            }
            file3.renameTo(file2);
            if (file3.exists()) {
                file3.delete();
            }
            file.renameTo(file3);
            if (file.exists()) {
                file.delete();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142) {
        try {
            class_0775 class_07752 = new class_0775();
            class_08142.IlIIIIIllllllIIlllIllllll(class_07752);
            File file = new File(this.IlIllllllIIlIIllllIIlIIIl, class_08142.lIIlllIIlIlIlIIIlIlllIIll().toString() + ".dat.tmp");
            File file2 = new File(this.IlIllllllIIlIIllllIIlIIIl, class_08142.lIIlllIIlIlIlIIIlIlllIIll().toString() + ".dat");
            class_0893.lllIIIllIIIIlllIlIIllIIll(class_07752, new FileOutputStream(file));
            if (file2.exists()) {
                file2.delete();
            }
            file.renameTo(file2);
        }
        catch (Exception exception) {
            lllIIIllIIIIlllIlIIllIIll.warn("Failed to save player data for " + class_08142.llllIIIIlIIIlIIIIIIlIllll());
        }
    }

    @Override
    public class_0775 lllIlIIlIIIlIlIIIllIlllIl(class_0814 class_08142) {
        class_0775 class_07752 = null;
        try {
            File file = new File(this.IlIllllllIIlIIllllIIlIIIl, class_08142.lIIlllIIlIlIlIIIlIlllIIll().toString() + ".dat");
            if (file.exists() && file.isFile()) {
                class_07752 = class_0893.lllIIIllIIIIlllIlIIllIIll(new FileInputStream(file));
            }
        }
        catch (Exception exception) {
            lllIIIllIIIIlllIlIIllIIll.warn("Failed to load player data for " + class_08142.llllIIIIlIIIlIIIIIIlIllll());
        }
        if (class_07752 != null) {
            class_08142.lIllllIIlIIIlIllllllIIIll(class_07752);
        }
        return class_07752;
    }

    @Override
    public class_0735 IlIIIIIllllllIIlllIllllll() {
        return this;
    }

    @Override
    public String[] lllIlIIlIIIlIlIIIllIlllIl() {
        String[] arrstring = this.IlIllllllIIlIIllllIIlIIIl.list();
        for (int i = 0; i < arrstring.length; ++i) {
            if (!arrstring[i].endsWith(".dat")) continue;
            arrstring[i] = arrstring[i].substring(0, arrstring[i].length() - 4);
        }
        return arrstring;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll() {
    }

    @Override
    public File lllIIIllIIIIlllIlIIllIIll(String string) {
        return new File(this.lIlllIlllIIIIlIIlllIllIII, string + ".dat");
    }

    @Override
    public String IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }
}

