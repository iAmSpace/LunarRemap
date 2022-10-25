package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import net.minecraft.crash.CrashReport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_0775
extends class_2037 {
    private static final Logger lllIlIIlIIIlIlIIIllIlllIl = LogManager.getLogger();
    private Map IlIllllllIIlIIllllIIlIIIl = new HashMap();

    @Override
    void lllIIIllIIIIlllIlIIllIIll(DataOutput dataOutput) {
        for (String string : this.IlIllllllIIlIIllllIIlIIIl.keySet()) {
            class_2037 class_20372 = (class_2037)this.IlIllllllIIlIIllllIIlIIIl.get(string);
            class_0775.lllIIIllIIIIlllIlIIllIIll(string, class_20372, dataOutput);
        }
        dataOutput.writeByte(0);
    }

    @Override
    void lllIIIllIIIIlllIlIIllIIll(DataInput dataInput, int n, class_1633 class_16332) {
        byte by;
        if (n > 512) {
            throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
        }
        this.IlIllllllIIlIIllllIIlIIIl.clear();
        while ((by = class_0775.lllIIIllIIIIlllIlIIllIIll(dataInput, class_16332)) != 0) {
            String string = class_0775.lllIlIIlIIIlIlIIIllIlllIl(dataInput, class_16332);
            class_16332.lllIIIllIIIIlllIlIIllIIll(16 * string.length());
            class_2037 class_20372 = class_0775.lllIIIllIIIIlllIlIIllIIll(by, string, dataInput, n + 1, class_16332);
            this.IlIllllllIIlIIllllIIlIIIl.put(string, class_20372);
        }
    }

    public Set lIlllIlllIIIIlIIlllIllIII() {
        return this.IlIllllllIIlIIllllIIlIIIl.keySet();
    }

    @Override
    public byte lllIIIllIIIIlllIlIIllIIll() {
        return 10;
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string, class_2037 class_20372) {
        this.IlIllllllIIlIIllllIIlIIIl.put(string, class_20372);
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string, byte by) {
        this.IlIllllllIIlIIllllIIlIIIl.put(string, new class_0106(by));
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string, short s) {
        this.IlIllllllIIlIIllllIIlIIIl.put(string, new class_0791(s));
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string, int n) {
        this.IlIllllllIIlIIllllIIlIIIl.put(string, new class_1598(n));
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string, long l) {
        this.IlIllllllIIlIIllllIIlIIIl.put(string, new class_1461(l));
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string, float f) {
        this.IlIllllllIIlIIllllIIlIIIl.put(string, new class_0112(f));
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string, double d) {
        this.IlIllllllIIlIIllllIIlIIIl.put(string, new class_2049(d));
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string, String string2) {
        this.IlIllllllIIlIIllllIIlIIIl.put(string, new class_0928(string2));
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string, byte[] arrby) {
        this.IlIllllllIIlIIllllIIlIIIl.put(string, new class_1231(arrby));
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string, int[] arrn) {
        this.IlIllllllIIlIIllllIIlIIIl.put(string, new class_1794(arrn));
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string, boolean bl) {
        this.lllIIIllIIIIlllIlIIllIIll(string, (byte)(bl ? 1 : 0));
    }

    public class_2037 lllIIIllIIIIlllIlIIllIIll(String string) {
        return (class_2037)this.IlIllllllIIlIIllllIIlIIIl.get(string);
    }

    public byte lllIlIIlIIIlIlIIIllIlllIl(String string) {
        class_2037 class_20372 = (class_2037)this.IlIllllllIIlIIllllIIlIIIl.get(string);
        return class_20372 != null ? class_20372.lllIIIllIIIIlllIlIIllIIll() : (byte)0;
    }

    public boolean IlIllllllIIlIIllllIIlIIIl(String string) {
        return this.IlIllllllIIlIIllllIIlIIIl.containsKey(string);
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl(String string, int n) {
        byte by = this.lllIlIIlIIIlIlIIIllIlllIl(string);
        return by == n ? true : (n != 99 ? false : by == 1 || by == 2 || by == 3 || by == 4 || by == 5 || by == 6);
    }

    public byte lIlllIlllIIIIlIIlllIllIII(String string) {
        try {
            return !this.IlIllllllIIlIIllllIIlIIIl.containsKey(string) ? (byte)0 : ((class_1447)this.IlIllllllIIlIIllllIIlIIIl.get(string)).IIIllIIlIIIIIIlIlIIllIIlI();
        }
        catch (ClassCastException classCastException) {
            return 0;
        }
    }

    public short IlIIIIIllllllIIlllIllllll(String string) {
        try {
            return !this.IlIllllllIIlIIllllIIlIIIl.containsKey(string) ? (short)0 : ((class_1447)this.IlIllllllIIlIIllllIIlIIIl.get(string)).lIllllIIlIIIlIllllllIIIll();
        }
        catch (ClassCastException classCastException) {
            return 0;
        }
    }

    public int lIllllIIlIIIlIllllllIIIll(String string) {
        try {
            return !this.IlIllllllIIlIIllllIIlIIIl.containsKey(string) ? 0 : ((class_1447)this.IlIllllllIIlIIllllIIlIIIl.get(string)).IlIIIIIllllllIIlllIllllll();
        }
        catch (ClassCastException classCastException) {
            return 0;
        }
    }

    public long IIIllIIlIIIIIIlIlIIllIIlI(String string) {
        try {
            return !this.IlIllllllIIlIIllllIIlIIIl.containsKey(string) ? 0L : ((class_1447)this.IlIllllllIIlIIllllIIlIIIl.get(string)).lIlllIlllIIIIlIIlllIllIII();
        }
        catch (ClassCastException classCastException) {
            return 0L;
        }
    }

    public float IllIIlllllllIIlIIlIIIIlIl(String string) {
        try {
            return !this.IlIllllllIIlIIllllIIlIIIl.containsKey(string) ? 0.0f : ((class_1447)this.IlIllllllIIlIIllllIIlIIIl.get(string)).IIIllIllIIlIlIlIlIllllIIl();
        }
        catch (ClassCastException classCastException) {
            return 0.0f;
        }
    }

    public double IIIllIllIIlIlIlIlIllllIIl(String string) {
        try {
            return !this.IlIllllllIIlIIllllIIlIIIl.containsKey(string) ? 0.0 : ((class_1447)this.IlIllllllIIlIIllllIIlIIIl.get(string)).IllIIlllllllIIlIIlIIIIlIl();
        }
        catch (ClassCastException classCastException) {
            return 0.0;
        }
    }

    public String IllIIIllIIIIlIlIlIllIIlll(String string) {
        try {
            return !this.IlIllllllIIlIIllllIIlIIIl.containsKey(string) ? "" : ((class_2037)this.IlIllllllIIlIIllllIIlIIIl.get(string)).IlIllllllIIlIIllllIIlIIIl();
        }
        catch (ClassCastException classCastException) {
            return "";
        }
    }

    public byte[] lIIIIlIlIIlllllIIllIIlIII(String string) {
        try {
            return !this.IlIllllllIIlIIllllIIlIIIl.containsKey(string) ? new byte[0] : ((class_1231)this.IlIllllllIIlIIllllIIlIIIl.get(string)).lIlllIlllIIIIlIIlllIllIII();
        }
        catch (ClassCastException classCastException) {
            throw new class_0892(this.lllIIIllIIIIlllIlIIllIIll(string, 7, classCastException));
        }
    }

    public int[] llIIlllIllIllllIIIlIIIIII(String string) {
        try {
            return !this.IlIllllllIIlIIllllIIlIIIl.containsKey(string) ? new int[0] : ((class_1794)this.IlIllllllIIlIIllllIIlIIIl.get(string)).lIlllIlllIIIIlIIlllIllIII();
        }
        catch (ClassCastException classCastException) {
            throw new class_0892(this.lllIIIllIIIIlllIlIIllIIll(string, 11, classCastException));
        }
    }

    public class_0775 llIIllIllIlIIlIIllIllllll(String string) {
        try {
            return !this.IlIllllllIIlIIllllIIlIIIl.containsKey(string) ? new class_0775() : (class_0775)this.IlIllllllIIlIIllllIIlIIIl.get(string);
        }
        catch (ClassCastException classCastException) {
            throw new class_0892(this.lllIIIllIIIIlllIlIIllIIll(string, 10, classCastException));
        }
    }

    public class_2145 IlIllllllIIlIIllllIIlIIIl(String string, int n) {
        try {
            if (this.lllIlIIlIIIlIlIIIllIlllIl(string) != 9) {
                return new class_2145();
            }
            class_2145 class_21452 = (class_2145)this.IlIllllllIIlIIllllIIlIIIl.get(string);
            return class_21452.lIlllIlllIIIIlIIlllIllIII() > 0 && class_21452.IlIIIIIllllllIIlllIllllll() != n ? new class_2145() : class_21452;
        }
        catch (ClassCastException classCastException) {
            throw new class_0892(this.lllIIIllIIIIlllIlIIllIIll(string, 9, classCastException));
        }
    }

    public boolean lllIIlIIIllllllIIIIlIlIlI(String string) {
        return this.lIlllIlllIIIIlIIlllIllIII(string) != 0;
    }

    public void IlIlllIIIIIIlIIllIIllIlll(String string) {
        this.IlIllllllIIlIIllllIIlIIIl.remove(string);
    }

    @Override
    public String toString() {
        String string = "{";
        for (String string2 : this.IlIllllllIIlIIllllIIlIIIl.keySet()) {
            string = string + string2 + ':' + this.IlIllllllIIlIIllllIIlIIIl.get(string2) + ',';
        }
        return string + "}";
    }

    public boolean IlIIIIIllllllIIlllIllllll() {
        return this.IlIllllllIIlIIllllIIlIIIl.isEmpty();
    }

    private CrashReport lllIIIllIIIIlllIlIIllIIll(String string, int n, ClassCastException classCastException) {
        CrashReport class_02232 = CrashReport.lllIIIllIIIIlllIlIIllIIll(classCastException, "Reading NBT data");
        class_0799 class_07992 = class_02232.lllIIIllIIIIlllIlIIllIIll("Corrupt NBT tag", 1);
        class_07992.addCrashSectionCallable("Tag type found", new class_0802(this, string));
        class_07992.addCrashSectionCallable("Tag type expected", new class_1166(this, n));
        class_07992.lllIIIllIIIIlllIlIIllIIll("Tag name", string);
        return class_02232;
    }

    @Override
    public class_2037 lllIlIIlIIIlIlIIIllIlllIl() {
        class_0775 class_07752 = new class_0775();
        for (String string : this.IlIllllllIIlIIllllIIlIIIl.keySet()) {
            class_07752.lllIIIllIIIIlllIlIIllIIll(string, ((class_2037)this.IlIllllllIIlIIllllIIlIIIl.get(string)).lllIlIIlIIIlIlIIIllIlllIl());
        }
        return class_07752;
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            class_0775 class_07752 = (class_0775)object;
            return this.IlIllllllIIlIIllllIIlIIIl.entrySet().equals(class_07752.IlIllllllIIlIIllllIIlIIIl.entrySet());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.IlIllllllIIlIIllllIIlIIIl.hashCode();
    }

    private static void lllIIIllIIIIlllIlIIllIIll(String string, class_2037 class_20372, DataOutput dataOutput) {
        dataOutput.writeByte(class_20372.lllIIIllIIIIlllIlIIllIIll());
        if (class_20372.lllIIIllIIIIlllIlIIllIIll() != 0) {
            dataOutput.writeUTF(string);
            class_20372.lllIIIllIIIIlllIlIIllIIll(dataOutput);
        }
    }

    private static byte lllIIIllIIIIlllIlIIllIIll(DataInput dataInput, class_1633 class_16332) {
        return dataInput.readByte();
    }

    private static String lllIlIIlIIIlIlIIIllIlllIl(DataInput dataInput, class_1633 class_16332) {
        return dataInput.readUTF();
    }

    static class_2037 lllIIIllIIIIlllIlIIllIIll(byte by, String string, DataInput dataInput, int n, class_1633 class_16332) {
        class_2037 class_20372 = class_2037.lllIIIllIIIIlllIlIIllIIll(by);
        try {
            class_20372.lllIIIllIIIIlllIlIIllIIll(dataInput, n, class_16332);
            return class_20372;
        }
        catch (IOException iOException) {
            CrashReport class_02232 = CrashReport.lllIIIllIIIIlllIlIIllIIll(iOException, "Loading NBT data");
            class_0799 class_07992 = class_02232.lllIIIllIIIIlllIlIIllIIll("NBT Tag");
            class_07992.lllIIIllIIIIlllIlIIllIIll("Tag name", string);
            class_07992.lllIIIllIIIIlllIlIIllIIll("Tag type", by);
            throw new class_0892(class_02232);
        }
    }

    static /* synthetic */ Map lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        return class_07752.IlIllllllIIlIIllllIIlIIIl;
    }
}

