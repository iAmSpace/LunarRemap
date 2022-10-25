package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class class_1641 {
    private class_0028 lllIIIllIIIIlllIlIIllIIll;
    private Map lllIlIIlIIIlIlIIIllIlllIl = new HashMap();
    private List IlIllllllIIlIIllllIIlIIIl = new ArrayList();
    private Map lIlllIlllIIIIlIIlllIllIII = new HashMap();

    public class_1641(class_0028 class_00282) {
        this.lllIIIllIIIIlllIlIIllIIll = class_00282;
        this.lllIlIIlIIIlIlIIIllIlllIl();
    }

    public class_0469 lllIIIllIIIIlllIlIIllIIll(Class class_, String string) {
        class_0469 class_04692;
        block7: {
            class_04692 = (class_0469)this.lllIlIIlIIIlIlIIIllIlllIl.get(string);
            if (class_04692 != null) {
                return class_04692;
            }
            if (this.lllIIIllIIIIlllIlIIllIIll != null) {
                try {
                    File file = this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(string);
                    if (file == null || !file.exists()) break block7;
                    try {
                        class_04692 = (class_0469)class_.getConstructor(String.class).newInstance(string);
                    }
                    catch (Exception exception) {
                        throw new RuntimeException("Failed to instantiate " + class_.toString(), exception);
                    }
                    FileInputStream fileInputStream = new FileInputStream(file);
                    class_0775 class_07752 = class_0893.lllIIIllIIIIlllIlIIllIIll(fileInputStream);
                    fileInputStream.close();
                    class_04692.lllIIIllIIIIlllIlIIllIIll(class_07752.llIIllIllIlIIlIIllIllllll("data"));
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }
        if (class_04692 != null) {
            this.lllIlIIlIIIlIlIIIllIlllIl.put(string, class_04692);
            this.IlIllllllIIlIIllllIIlIIIl.add(class_04692);
        }
        return class_04692;
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string, class_0469 class_04692) {
        if (class_04692 == null) {
            throw new RuntimeException("Can't set null data");
        }
        if (this.lllIlIIlIIIlIlIIIllIlllIl.containsKey(string)) {
            this.IlIllllllIIlIIllllIIlIIIl.remove(this.lllIlIIlIIIlIlIIIllIlllIl.remove(string));
        }
        this.lllIlIIlIIIlIlIIIllIlllIl.put(string, class_04692);
        this.IlIllllllIIlIIllllIIlIIIl.add(class_04692);
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        for (int i = 0; i < this.IlIllllllIIlIIllllIIlIIIl.size(); ++i) {
            class_0469 class_04692 = (class_0469)this.IlIllllllIIlIIllllIIlIIIl.get(i);
            if (!class_04692.IlIIIIIllllllIIlllIllllll()) continue;
            this.lllIIIllIIIIlllIlIIllIIll(class_04692);
            class_04692.lllIIIllIIIIlllIlIIllIIll(false);
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_0469 class_04692) {
        if (this.lllIIIllIIIIlllIlIIllIIll != null) {
            try {
                File file = this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_04692.lllIIIllIIIIlllIlIIllIIll);
                if (file != null) {
                    class_0775 class_07752 = new class_0775();
                    class_04692.IlIllllllIIlIIllllIIlIIIl(class_07752);
                    class_0775 class_07753 = new class_0775();
                    class_07753.lllIIIllIIIIlllIlIIllIIll("data", class_07752);
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    class_0893.lllIIIllIIIIlllIlIIllIIll(class_07753, fileOutputStream);
                    fileOutputStream.close();
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    private void lllIlIIlIIIlIlIIIllIlllIl() {
        try {
            this.lIlllIlllIIIIlIIlllIllIII.clear();
            if (this.lllIIIllIIIIlllIlIIllIIll == null) {
                return;
            }
            File file = this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll("idcounts");
            if (file != null && file.exists()) {
                DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                class_0775 class_07752 = class_0893.lllIIIllIIIIlllIlIIllIIll(dataInputStream);
                dataInputStream.close();
                for (String string : class_07752.lIlllIlllIIIIlIIlllIllIII()) {
                    class_2037 class_20372 = class_07752.lllIIIllIIIIlllIlIIllIIll(string);
                    if (!(class_20372 instanceof class_0791)) continue;
                    class_0791 class_07912 = (class_0791)class_20372;
                    short s = class_07912.lIllllIIlIIIlIllllllIIIll();
                    this.lIlllIlllIIIIlIIlllIllIII.put(string, s);
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public int lllIIIllIIIIlllIlIIllIIll(String string) {
        Short s = (Short)this.lIlllIlllIIIIlIIlllIllIII.get(string);
        s = s == null ? Short.valueOf((short)0) : Short.valueOf((short)(s + 1));
        this.lIlllIlllIIIIlIIlllIllIII.put(string, s);
        if (this.lllIIIllIIIIlllIlIIllIIll == null) {
            return s.shortValue();
        }
        try {
            File file = this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll("idcounts");
            if (file != null) {
                Object object2;
                class_0775 class_07752 = new class_0775();
                for (Object object2 : this.lIlllIlllIIIIlIIlllIllIII.keySet()) {
                    short s2 = (Short)this.lIlllIlllIIIIlIIlllIllIII.get(object2);
                    class_07752.lllIIIllIIIIlllIlIIllIIll((String)object2, s2);
                }
                object2 = new DataOutputStream(new FileOutputStream(file));
                class_0893.lllIIIllIIIIlllIlIIllIIll(class_07752, (DataOutput)object2);
                ((FilterOutputStream)object2).close();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return s.shortValue();
    }
}

