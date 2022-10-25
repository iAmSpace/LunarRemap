package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_0187
implements class_2055 {
    private static final Logger lllIlIIlIIIlIlIIIllIlllIl = LogManager.getLogger();
    protected final File lllIIIllIIIIlllIlIIllIIll;

    public class_0187(File file) {
        if (!file.exists()) {
            file.mkdirs();
        }
        this.lllIIIllIIIIlllIlIIllIIll = file;
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "Old Format";
    }

    @Override
    public List lllIlIIlIIIlIlIIIllIlllIl() {
        ArrayList<class_0748> arrayList = new ArrayList<class_0748>();
        for (int i = 0; i < 5; ++i) {
            String string = "World" + (i + 1);
            class_0770 class_07702 = this.IlIllllllIIlIIllllIIlIIIl(string);
            if (class_07702 == null) continue;
            arrayList.add(new class_0748(string, "", class_07702.llIIllIllIlIIlIIllIllllll(), class_07702.IllIIlllllllIIlIIlIIIIlIl(), class_07702.IlIlIIlllIIlIllIIIlllllIl(), false, class_07702.lIlIlIIlIIIIlIIIIIlllIIII(), class_07702.IIlllIlIlllIllIIIlllIIlIl()));
        }
        return arrayList;
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII() {
    }

    @Override
    public class_0770 IlIllllllIIlIIllllIIlIIIl(String string) {
        File file = new File(this.lllIIIllIIIIlllIlIIllIIll, string);
        if (!file.exists()) {
            return null;
        }
        File file2 = new File(file, "level.dat");
        if (file2.exists()) {
            try {
                class_0775 class_07752 = class_0893.lllIIIllIIIIlllIlIIllIIll(new FileInputStream(file2));
                class_0775 class_07753 = class_07752.llIIllIllIlIIlIIllIllllll("Data");
                return new class_0770(class_07753);
            }
            catch (Exception exception) {
                lllIlIIlIIIlIlIIIllIlllIl.error("Exception reading " + file2, (Throwable)exception);
            }
        }
        if ((file2 = new File(file, "level.dat_old")).exists()) {
            try {
                class_0775 class_07754 = class_0893.lllIIIllIIIIlllIlIIllIIll(new FileInputStream(file2));
                class_0775 class_07755 = class_07754.llIIllIllIlIIlIIllIllllll("Data");
                return new class_0770(class_07755);
            }
            catch (Exception exception) {
                lllIlIIlIIIlIlIIIllIlllIl.error("Exception reading " + file2, (Throwable)exception);
            }
        }
        return null;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(String string, String string2) {
        File file;
        File file2 = new File(this.lllIIIllIIIIlllIlIIllIIll, string);
        if (file2.exists() && (file = new File(file2, "level.dat")).exists()) {
            try {
                class_0775 class_07752 = class_0893.lllIIIllIIIIlllIlIIllIIll(new FileInputStream(file));
                class_0775 class_07753 = class_07752.llIIllIllIlIIlIIllIllllll("Data");
                class_07753.lllIIIllIIIIlllIlIIllIIll("LevelName", string2);
                class_0893.lllIIIllIIIIlllIlIIllIIll(class_07752, new FileOutputStream(file));
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    @Override
    public boolean lIlllIlllIIIIlIIlllIllIII(String string) {
        File file = new File(this.lllIIIllIIIIlllIlIIllIIll, string);
        if (file.exists()) {
            return false;
        }
        try {
            file.mkdir();
            file.delete();
            return true;
        }
        catch (Throwable throwable) {
            lllIlIIlIIIlIlIIIllIlllIl.warn("Couldn't make new level", throwable);
            return false;
        }
    }

    @Override
    public boolean IlIIIIIllllllIIlllIllllll(String string) {
        File file = new File(this.lllIIIllIIIIlllIlIIllIIll, string);
        if (!file.exists()) {
            return true;
        }
        lllIlIIlIIIlIlIIIllIlllIl.info("Deleting level " + string);
        for (int i = 1; i <= 5; ++i) {
            lllIlIIlIIIlIlIIIllIlllIl.info("Attempt " + i + "...");
            if (class_0187.lllIIIllIIIIlllIlIIllIIll(file.listFiles())) break;
            lllIlIIlIIIlIlIIIllIlllIl.warn("Unsuccessful in deleting contents.");
            if (i >= 5) continue;
            try {
                Thread.sleep(500L);
                continue;
            }
            catch (InterruptedException interruptedException) {
                // empty catch block
            }
        }
        return file.delete();
    }

    protected static boolean lllIIIllIIIIlllIlIIllIIll(File[] arrfile) {
        for (int i = 0; i < arrfile.length; ++i) {
            File file = arrfile[i];
            lllIlIIlIIIlIlIIIllIlllIl.debug("Deleting " + file);
            if (file.isDirectory() && !class_0187.lllIIIllIIIIlllIlIIllIIll(file.listFiles())) {
                lllIlIIlIIIlIlIIIllIlllIl.warn("Couldn't delete directory " + file);
                return false;
            }
            if (file.delete()) continue;
            lllIlIIlIIIlIlIIIllIlllIl.warn("Couldn't delete file " + file);
            return false;
        }
        return true;
    }

    @Override
    public class_0028 lllIIIllIIIIlllIlIIllIIll(String string, boolean bl) {
        return new class_0365(this.lllIIIllIIIIlllIlIIllIIll, string, bl);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(String string) {
        return false;
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl(String string) {
        return false;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(String string, class_1832 class_18322) {
        return false;
    }

    @Override
    public boolean lIllllIIlIIIlIllllllIIIll(String string) {
        File file = new File(this.lllIIIllIIIIlllIlIIllIIll, string);
        return file.isDirectory();
    }
}

