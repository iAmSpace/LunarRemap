package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import net.minecraft.util.MathHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_0720
extends class_0187 {
    private static final Logger lllIlIIlIIIlIlIIIllIlllIl = LogManager.getLogger();

    public class_0720(File file) {
        super(file);
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "Anvil";
    }

    @Override
    public List lllIlIIlIIIlIlIIIllIlllIl() {
        if (this.lllIIIllIIIIlllIlIIllIIll != null && this.lllIIIllIIIIlllIlIIllIIll.exists() && this.lllIIIllIIIIlllIlIIllIIll.isDirectory()) {
            File[] arrfile;
            ArrayList<class_0748> arrayList = new ArrayList<class_0748>();
            File[] arrfile2 = arrfile = this.lllIIIllIIIIlllIlIIllIIll.listFiles();
            int n = arrfile.length;
            for (int i = 0; i < n; ++i) {
                String string;
                class_0770 class_07702;
                File file = arrfile2[i];
                if (!file.isDirectory() || (class_07702 = this.IlIllllllIIlIIllllIIlIIIl(string = file.getName())) == null || class_07702.llIIlllIllIllllIIIlIIIIII() != 19132 && class_07702.llIIlllIllIllllIIIlIIIIII() != 19133) continue;
                boolean bl = class_07702.llIIlllIllIllllIIIlIIIIII() != this.IlIllllllIIlIIllllIIlIIIl();
                String string2 = class_07702.lIIIIlIlIIlllllIIllIIlIII();
                if (string2 == null || MathHelper.lllIIIllIIIIlllIlIIllIIll(string2)) {
                    string2 = string;
                }
                long l = 0L;
                arrayList.add(new class_0748(string, string2, class_07702.llIIllIllIlIIlIIllIllllll(), l, class_07702.IlIlIIlllIIlIllIIIlllllIl(), bl, class_07702.lIlIlIIlIIIIlIIIIIlllIIII(), class_07702.IIlllIlIlllIllIIIlllIIlIl()));
            }
            return arrayList;
        }
        throw new class_0324("Unable to read or access folder where game worlds are saved!");
    }

    protected int IlIllllllIIlIIllllIIlIIIl() {
        return 19133;
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII() {
        class_1266.lllIIIllIIIIlllIlIIllIIll();
    }

    @Override
    public class_0028 lllIIIllIIIIlllIlIIllIIll(String string, boolean bl) {
        return new class_1927(this.lllIIIllIIIIlllIlIIllIIll, string, bl);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(String string) {
        class_0770 class_07702 = this.IlIllllllIIlIIllllIIlIIIl(string);
        return class_07702 != null && class_07702.llIIlllIllIllllIIIlIIIIII() == 19132;
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl(String string) {
        class_0770 class_07702 = this.IlIllllllIIlIIllllIIlIIIl(string);
        return class_07702 != null && class_07702.llIIlllIllIllllIIIlIIIIII() != this.IlIllllllIIlIIllllIIlIIIl();
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(String string, class_1832 class_18322) {
        class_18322.lllIIIllIIIIlllIlIIllIIll(0);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        File file = new File(this.lllIIIllIIIIlllIlIIllIIll, string);
        File file2 = new File(file, "DIM-1");
        File file3 = new File(file, "DIM1");
        lllIlIIlIIIlIlIIIllIlllIl.info("Scanning folders...");
        this.lllIIIllIIIIlllIlIIllIIll(file, arrayList);
        if (file2.exists()) {
            this.lllIIIllIIIIlllIlIIllIIll(file2, arrayList2);
        }
        if (file3.exists()) {
            this.lllIIIllIIIIlllIlIIllIIll(file3, arrayList3);
        }
        int n = arrayList.size() + arrayList2.size() + arrayList3.size();
        lllIlIIlIIIlIlIIIllIlllIl.info("Total conversion count is " + n);
        class_0770 class_07702 = this.IlIllllllIIlIIllllIIlIIIl(string);
        class_1076 class_10762 = null;
        class_10762 = class_07702.IlIIIlIIIIllIIIllIIIIIIll() == class_1074.IlIllllllIIlIIllllIIlIIIl ? new class_2231(class_0672.IlIlIIlIlIllIIlIlIIllIIIl, 0.5f) : new class_1076(class_07702.lllIlIIlIIIlIlIIIllIlllIl(), class_07702.IlIIIlIIIIllIIIllIIIIIIll());
        this.lllIIIllIIIIlllIlIIllIIll(new File(file, "region"), arrayList, class_10762, 0, n, class_18322);
        this.lllIIIllIIIIlllIlIIllIIll(new File(file2, "region"), arrayList2, (class_1076)new class_2231(class_0672.lIlIllIIlIIlIIlIIlIIlIIll, 0.0f), arrayList.size(), n, class_18322);
        this.lllIIIllIIIIlllIlIIllIIll(new File(file3, "region"), arrayList3, (class_1076)new class_2231(class_0672.llIIlIllIllllIlIIIIlIIlll, 0.0f), arrayList.size() + arrayList2.size(), n, class_18322);
        class_07702.lIlllIlllIIIIlIIlllIllIII(19133);
        if (class_07702.IlIIIlIIIIllIIIllIIIIIIll() == class_1074.lIllllIIlIIIlIllllllIIIll) {
            class_07702.lllIIIllIIIIlllIlIIllIIll(class_1074.lllIlIIlIIIlIlIIIllIlllIl);
        }
        this.IIIllIIlIIIIIIlIlIIllIIlI(string);
        class_0028 class_00282 = this.lllIIIllIIIIlllIlIIllIIll(string, false);
        class_00282.lllIIIllIIIIlllIlIIllIIll(class_07702);
        return true;
    }

    private void IIIllIIlIIIIIIlIlIIllIIlI(String string) {
        File file = new File(this.lllIIIllIIIIlllIlIIllIIll, string);
        if (!file.exists()) {
            lllIlIIlIIIlIlIIIllIlllIl.warn("Unable to create level.dat_mcr backup");
        } else {
            File file2 = new File(file, "level.dat");
            if (!file2.exists()) {
                lllIlIIlIIIlIlIIIllIlllIl.warn("Unable to create level.dat_mcr backup");
            } else {
                File file3 = new File(file, "level.dat_mcr");
                if (!file2.renameTo(file3)) {
                    lllIlIIlIIIlIlIIIllIlllIl.warn("Unable to create level.dat_mcr backup");
                }
            }
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(File file, Iterable iterable, class_1076 class_10762, int n, int n2, class_1832 class_18322) {
        for (File file2 : iterable) {
            this.lllIIIllIIIIlllIlIIllIIll(file, file2, class_10762, n, n2, class_18322);
            int n3 = (int)Math.round(100.0 * (double)(++n) / (double)n2);
            class_18322.lllIIIllIIIIlllIlIIllIIll(n3);
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(File file, File file2, class_1076 class_10762, int n, int n2, class_1832 class_18322) {
        try {
            String string = file2.getName();
            class_1938 class_19382 = new class_1938(file2);
            class_1938 class_19383 = new class_1938(new File(file, string.substring(0, string.length() - ".mcr".length()) + ".mca"));
            for (int i = 0; i < 32; ++i) {
                int n3;
                for (n3 = 0; n3 < 32; ++n3) {
                    if (!class_19382.IlIllllllIIlIIllllIIlIIIl(i, n3) || class_19383.IlIllllllIIlIIllllIIlIIIl(i, n3)) continue;
                    DataInputStream dataInputStream = class_19382.lllIIIllIIIIlllIlIIllIIll(i, n3);
                    if (dataInputStream == null) {
                        lllIlIIlIIIlIlIIIllIlllIl.warn("Failed to fetch input stream");
                        continue;
                    }
                    class_0775 class_07752 = class_0893.lllIIIllIIIIlllIlIIllIIll(dataInputStream);
                    dataInputStream.close();
                    class_0775 class_07753 = class_07752.llIIllIllIlIIlIIllIllllll("Level");
                    class_0443 class_04432 = class_1780.lllIIIllIIIIlllIlIIllIIll(class_07753);
                    class_0775 class_07754 = new class_0775();
                    class_0775 class_07755 = new class_0775();
                    class_07754.lllIIIllIIIIlllIlIIllIIll("Level", class_07755);
                    class_1780.lllIIIllIIIIlllIlIIllIIll(class_04432, class_07755, class_10762);
                    DataOutputStream dataOutputStream = class_19383.lllIlIIlIIIlIlIIIllIlllIl(i, n3);
                    class_0893.lllIIIllIIIIlllIlIIllIIll(class_07754, (DataOutput)dataOutputStream);
                    dataOutputStream.close();
                }
                n3 = (int)Math.round(100.0 * (double)(n * 1024) / (double)(n2 * 1024));
                int n4 = (int)Math.round(100.0 * (double)((i + 1) * 32 + n * 1024) / (double)(n2 * 1024));
                if (n4 <= n3) continue;
                class_18322.lllIIIllIIIIlllIlIIllIIll(n4);
            }
            class_19382.lllIIIllIIIIlllIlIIllIIll();
            class_19383.lllIIIllIIIIlllIlIIllIIll();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(File file, Collection collection) {
        File file2 = new File(file, "region");
        File[] arrfile = file2.listFiles(new class_2180(this));
        if (arrfile != null) {
            Collections.addAll(collection, arrfile);
        }
    }
}

