package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class class_1427
extends class_1183
implements Serializable,
Cloneable,
class_1131 {
    private static final long IlIIIlIIIIllIIIllIIIIIIll = 0L;
    private static final boolean IIlllIlIlllIllIIIlllIIlIl = false;
    protected transient Object[] IllIIIllIIIIlIlIlIllIIlll;
    protected transient Object[] lIIIIlIlIIlllllIIllIIlIII;
    protected transient int llIIlllIllIllllIIIlIIIIII;
    protected transient boolean llIIllIllIlIIlIIllIllllll;
    protected transient int lllIIlIIIllllllIIIIlIlIlI;
    protected transient int IlIlllIIIIIIlIIllIIllIlll;
    protected int IlIlIIlIlIllIIlIlIIllIIIl;
    protected final float lllllIlllIIllIlIIlIIIllII;
    protected transient class_0607 IlIlIIlllIIlIllIIIlllllIl;
    protected transient class_1729 lIIlIIIIIlIlllIlIIlIlIlll;
    protected transient class_1888 lIlIlIIlIIIIlIIIIIlllIIII;

    public class_1427(int n, float f) {
        if (f <= 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("Load factor must be greater than 0 and smaller than or equal to 1");
        }
        if (n < 0) {
            throw new IllegalArgumentException("The expected number of elements must be nonnegative");
        }
        this.lllllIlllIIllIlIIlIIIllII = f;
        this.lllIIlIIIllllllIIIIlIlIlI = class_1652.lllIlIIlIIIlIlIIIllIlllIl(n, f);
        this.llIIlllIllIllllIIIlIIIIII = this.lllIIlIIIllllllIIIIlIlIlI - 1;
        this.IlIlllIIIIIIlIIllIIllIlll = class_1652.lllIIIllIIIIlllIlIIllIIll(this.lllIIlIIIllllllIIIIlIlIlI, f);
        this.IllIIIllIIIIlIlIlIllIIlll = new Object[this.lllIIlIIIllllllIIIIlIlIlI + 1];
        this.lIIIIlIlIIlllllIIllIIlIII = new Object[this.lllIIlIIIllllllIIIIlIlIlI + 1];
    }

    public class_1427(int n) {
        this(n, 0.75f);
    }

    public class_1427() {
        this(16, 0.75f);
    }

    public class_1427(Map map, float f) {
        this(map.size(), f);
        this.putAll(map);
    }

    public class_1427(Map map) {
        this(map, 0.75f);
    }

    public class_1427(class_0580 class_05802, float f) {
        this(class_05802.size(), f);
        this.putAll((Map)class_05802);
    }

    public class_1427(class_0580 class_05802) {
        this(class_05802, 0.75f);
    }

    public class_1427(Object[] arrobject, Object[] arrobject2, float f) {
        this(arrobject.length, f);
        if (arrobject.length != arrobject2.length) {
            throw new IllegalArgumentException("The key array and the value array have different lengths (" + arrobject.length + " and " + arrobject2.length + ")");
        }
        for (int i = 0; i < arrobject.length; ++i) {
            this.put(arrobject[i], arrobject2[i]);
        }
    }

    public class_1427(Object[] arrobject, Object[] arrobject2) {
        this(arrobject, arrobject2, 0.75f);
    }

    private int lIIIIlIlIIlllllIIllIIlIII() {
        return this.llIIllIllIlIIlIIllIllllll ? this.IlIlIIlIlIllIIlIlIIllIIIl - 1 : this.IlIlIIlIlIllIIlIlIIllIIIl;
    }

    private void IlIIIIIllllllIIlllIllllll(int n) {
        int n2 = class_1652.lllIlIIlIIIlIlIIIllIlllIl(n, this.lllllIlllIIllIlIIlIIIllII);
        if (n2 > this.lllIIlIIIllllllIIIIlIlIlI) {
            this.lIlllIlllIIIIlIIlllIllIII(n2);
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(long l) {
        int n = (int)Math.min(0x40000000L, Math.max(2L, class_1652.IlIIIIIllllllIIlllIllllll((long)Math.ceil((float)l / this.lllllIlllIIllIlIIlIIIllII))));
        if (n > this.lllIIlIIIllllllIIIIlIlIlI) {
            this.lIlllIlllIIIIlIIlllIllIII(n);
        }
    }

    private Object lIllllIIlIIIlIllllllIIIll(int n) {
        Object object = this.lIIIIlIlIIlllllIIllIIlIII[n];
        this.lIIIIlIlIIlllllIIllIIlIII[n] = null;
        --this.IlIlIIlIlIllIIlIlIIllIIIl;
        this.lllIIIllIIIIlllIlIIllIIll(n);
        if (this.IlIlIIlIlIllIIlIlIIllIIIl < this.IlIlllIIIIIIlIIllIIllIlll / 4 && this.lllIIlIIIllllllIIIIlIlIlI > 16) {
            this.lIlllIlllIIIIlIIlllIllIII(this.lllIIlIIIllllllIIIIlIlIlI / 2);
        }
        return object;
    }

    private Object llIIlllIllIllllIIIlIIIIII() {
        this.llIIllIllIlIIlIIllIllllll = false;
        this.IllIIIllIIIIlIlIlIllIIlll[this.lllIIlIIIllllllIIIIlIlIlI] = null;
        Object object = this.lIIIIlIlIIlllllIIllIIlIII[this.lllIIlIIIllllllIIIIlIlIlI];
        this.lIIIIlIlIIlllllIIllIIlIII[this.lllIIlIIIllllllIIIIlIlIlI] = null;
        --this.IlIlIIlIlIllIIlIlIIllIIIl;
        if (this.IlIlIIlIlIllIIlIlIIllIIIl < this.IlIlllIIIIIIlIIllIIllIlll / 4 && this.lllIIlIIIllllllIIIIlIlIlI > 16) {
            this.lIlllIlllIIIIlIIlllIllIII(this.lllIIlIIIllllllIIIIlIlIlI / 2);
        }
        return object;
    }

    @Override
    public void putAll(Map map) {
        if ((double)this.lllllIlllIIllIlIIlIIIllII <= 0.5) {
            this.IlIIIIIllllllIIlllIllllll(map.size());
        } else {
            this.lllIIIllIIIIlllIlIIllIIll((long)(this.size() + map.size()));
        }
        super.putAll(map);
    }

    private int lllIIIllIIIIlllIlIIllIIll(Object object, Object object2) {
        int n;
        if (object == null) {
            if (this.llIIllIllIlIIlIIllIllllll) {
                return this.lllIIlIIIllllllIIIIlIlIlI;
            }
            this.llIIllIllIlIIlIIllIllllll = true;
            n = this.lllIIlIIIllllllIIIIlIlIlI;
        } else {
            Object[] arrobject = this.IllIIIllIIIIlIlIlIllIIlll;
            n = class_1652.lllIlIIlIIIlIlIIIllIlllIl(object.hashCode()) & this.llIIlllIllIllllIIIlIIIIII;
            Object object3 = arrobject[n];
            if (object3 != null) {
                if (object3.equals(object)) {
                    return n;
                }
                while ((object3 = arrobject[n = n + 1 & this.llIIlllIllIllllIIIlIIIIII]) != null) {
                    if (!object3.equals(object)) continue;
                    return n;
                }
            }
        }
        this.IllIIIllIIIIlIlIlIllIIlll[n] = object;
        this.lIIIIlIlIIlllllIIllIIlIII[n] = object2;
        if (this.IlIlIIlIlIllIIlIlIIllIIIl++ >= this.IlIlllIIIIIIlIIllIIllIlll) {
            this.lIlllIlllIIIIlIIlllIllIII(class_1652.lllIlIIlIIIlIlIIIllIlllIl(this.IlIlIIlIlIllIIlIlIIllIIIl + 1, this.lllllIlllIIllIlIIlIIIllII));
        }
        return -1;
    }

    @Override
    public Object put(Object object, Object object2) {
        int n = this.lllIIIllIIIIlllIlIIllIIll(object, object2);
        if (n < 0) {
            return this.a_;
        }
        Object object3 = this.lIIIIlIlIIlllllIIllIIlIII[n];
        this.lIIIIlIlIIlllllIIllIIlIII[n] = object2;
        return object3;
    }

    protected final void lllIIIllIIIIlllIlIIllIIll(int n) {
        Object[] arrobject = this.IllIIIllIIIIlIlIlIllIIlll;
        while (true) {
            Object object;
            int n2 = n;
            n = n2 + 1 & this.llIIlllIllIllllIIIlIIIIII;
            while (true) {
                if ((object = arrobject[n]) == null) {
                    arrobject[n2] = null;
                    this.lIIIIlIlIIlllllIIllIIlIII[n2] = null;
                    return;
                }
                int n3 = class_1652.lllIlIIlIIIlIlIIIllIlllIl(object.hashCode()) & this.llIIlllIllIllllIIIlIIIIII;
                if (n2 <= n ? n2 >= n3 || n3 > n : n2 >= n3 && n3 > n) break;
                n = n + 1 & this.llIIlllIllIllllIIIlIIIIII;
            }
            arrobject[n2] = object;
            this.lIIIIlIlIIlllllIIllIIlIII[n2] = this.lIIIIlIlIIlllllIIllIIlIII[n];
        }
    }

    @Override
    public Object remove(Object object) {
        if (object == null) {
            if (this.llIIllIllIlIIlIIllIllllll) {
                return this.llIIlllIllIllllIIIlIIIIII();
            }
            return this.a_;
        }
        Object[] arrobject = this.IllIIIllIIIIlIlIlIllIIlll;
        int n = class_1652.lllIlIIlIIIlIlIIIllIlllIl(object.hashCode()) & this.llIIlllIllIllllIIIlIIIIII;
        Object object2 = arrobject[n];
        if (object2 == null) {
            return this.a_;
        }
        if (object.equals(object2)) {
            return this.lIllllIIlIIIlIllllllIIIll(n);
        }
        do {
            if ((object2 = arrobject[n = n + 1 & this.llIIlllIllIllllIIIlIIIIII]) != null) continue;
            return this.a_;
        } while (!object.equals(object2));
        return this.lIllllIIlIIIlIllllllIIIll(n);
    }

    @Override
    public Object get(Object object) {
        if (object == null) {
            return this.llIIllIllIlIIlIIllIllllll ? this.lIIIIlIlIIlllllIIllIIlIII[this.lllIIlIIIllllllIIIIlIlIlI] : this.a_;
        }
        Object[] arrobject = this.IllIIIllIIIIlIlIlIllIIlll;
        int n = class_1652.lllIlIIlIIIlIlIIIllIlllIl(object.hashCode()) & this.llIIlllIllIllllIIIlIIIIII;
        Object object2 = arrobject[n];
        if (object2 == null) {
            return this.a_;
        }
        if (object.equals(object2)) {
            return this.lIIIIlIlIIlllllIIllIIlIII[n];
        }
        do {
            if ((object2 = arrobject[n = n + 1 & this.llIIlllIllIllllIIIlIIIIII]) != null) continue;
            return this.a_;
        } while (!object.equals(object2));
        return this.lIIIIlIlIIlllllIIllIIlIII[n];
    }

    @Override
    public boolean containsKey(Object object) {
        if (object == null) {
            return this.llIIllIllIlIIlIIllIllllll;
        }
        Object[] arrobject = this.IllIIIllIIIIlIlIlIllIIlll;
        int n = class_1652.lllIlIIlIIIlIlIIIllIlllIl(object.hashCode()) & this.llIIlllIllIllllIIIlIIIIII;
        Object object2 = arrobject[n];
        if (object2 == null) {
            return false;
        }
        if (object.equals(object2)) {
            return true;
        }
        do {
            if ((object2 = arrobject[n = n + 1 & this.llIIlllIllIllllIIIlIIIIII]) != null) continue;
            return false;
        } while (!object.equals(object2));
        return true;
    }

    @Override
    public boolean containsValue(Object object) {
        Object[] arrobject = this.lIIIIlIlIIlllllIIllIIlIII;
        Object[] arrobject2 = this.IllIIIllIIIIlIlIlIllIIlll;
        if (this.llIIllIllIlIIlIIllIllllll && (arrobject[this.lllIIlIIIllllllIIIIlIlIlI] == null ? object == null : arrobject[this.lllIIlIIIllllllIIIIlIlIlI].equals(object))) {
            return true;
        }
        int n = this.lllIIlIIIllllllIIIIlIlIlI;
        while (n-- != 0) {
            if (arrobject2[n] == null || !(arrobject[n] == null ? object == null : arrobject[n].equals(object))) continue;
            return true;
        }
        return false;
    }

    @Override
    public void clear() {
        if (this.IlIlIIlIlIllIIlIlIIllIIIl == 0) {
            return;
        }
        this.IlIlIIlIlIllIIlIlIIllIIIl = 0;
        this.llIIllIllIlIIlIIllIllllll = false;
        Arrays.fill(this.IllIIIllIIIIlIlIlIllIIlll, null);
        Arrays.fill(this.lIIIIlIlIIlllllIIllIIlIII, null);
    }

    @Override
    public int size() {
        return this.IlIlIIlIlIllIIlIlIIllIIIl;
    }

    @Override
    public boolean isEmpty() {
        return this.IlIlIIlIlIllIIlIlIIllIIIl == 0;
    }

    @Deprecated
    public void lllIlIIlIIIlIlIIIllIlllIl(int n) {
    }

    @Deprecated
    public int lIllllIIlIIIlIllllllIIIll() {
        return 16;
    }

    public class_0607 IIIllIIlIIIIIIlIlIIllIIlI() {
        if (this.IlIlIIlllIIlIllIIIlllllIl == null) {
            this.IlIlIIlllIIlIllIIIlllllIl = new class_0844(this, null);
        }
        return this.IlIlIIlllIIlIllIIIlllllIl;
    }

    @Override
    public class_1729 lllIlIIlIIIlIlIIIllIlllIl() {
        if (this.lIIlIIIIIlIlllIlIIlIlIlll == null) {
            this.lIIlIIIIIlIlllIlIIlIlIlll = new class_1450(this, null);
        }
        return this.lIIlIIIIIlIlllIlIIlIlIlll;
    }

    @Override
    public class_1888 IlIllllllIIlIIllllIIlIIIl() {
        if (this.lIlIlIIlIIIIlIIIIIlllIIII == null) {
            this.lIlIlIIlIIIIlIIIIIlllIIII = new class_1547(this);
        }
        return this.lIlIlIIlIIIIlIIIIIlllIIII;
    }

    @Deprecated
    public boolean IllIIlllllllIIlIIlIIIIlIl() {
        return true;
    }

    public boolean IIIllIllIIlIlIlIlIllllIIl() {
        int n = class_1652.lllIlIIlIIIlIlIIIllIlllIl(this.IlIlIIlIlIllIIlIlIIllIIIl, this.lllllIlllIIllIlIIlIIIllII);
        if (n >= this.lllIIlIIIllllllIIIIlIlIlI || this.IlIlIIlIlIllIIlIlIIllIIIl > class_1652.lllIIIllIIIIlllIlIIllIIll(n, this.lllllIlllIIllIlIIlIIIllII)) {
            return true;
        }
        try {
            this.lIlllIlllIIIIlIIlllIllIII(n);
        }
        catch (OutOfMemoryError outOfMemoryError) {
            return false;
        }
        return true;
    }

    public boolean IlIllllllIIlIIllllIIlIIIl(int n) {
        int n2 = class_1652.lIlllIlllIIIIlIIlllIllIII((int)Math.ceil((float)n / this.lllllIlllIIllIlIIlIIIllII));
        if (n2 >= n || this.IlIlIIlIlIllIIlIlIIllIIIl > class_1652.lllIIIllIIIIlllIlIIllIIll(n2, this.lllllIlllIIllIlIIlIIIllII)) {
            return true;
        }
        try {
            this.lIlllIlllIIIIlIIlllIllIII(n2);
        }
        catch (OutOfMemoryError outOfMemoryError) {
            return false;
        }
        return true;
    }

    protected void lIlllIlllIIIIlIIlllIllIII(int n) {
        Object[] arrobject = this.IllIIIllIIIIlIlIlIllIIlll;
        Object[] arrobject2 = this.lIIIIlIlIIlllllIIllIIlIII;
        int n2 = n - 1;
        Object[] arrobject3 = new Object[n + 1];
        Object[] arrobject4 = new Object[n + 1];
        int n3 = this.lllIIlIIIllllllIIIIlIlIlI;
        int n4 = this.lIIIIlIlIIlllllIIllIIlIII();
        while (n4-- != 0) {
            while (arrobject[--n3] == null) {
            }
            int n5 = class_1652.lllIlIIlIIIlIlIIIllIlllIl(arrobject[n3].hashCode()) & n2;
            if (arrobject3[n5] != null) {
                while (arrobject3[n5 = n5 + 1 & n2] != null) {
                }
            }
            arrobject3[n5] = arrobject[n3];
            arrobject4[n5] = arrobject2[n3];
        }
        arrobject4[n] = arrobject2[this.lllIIlIIIllllllIIIIlIlIlI];
        this.lllIIlIIIllllllIIIIlIlIlI = n;
        this.llIIlllIllIllllIIIlIIIIII = n2;
        this.IlIlllIIIIIIlIIllIIllIlll = class_1652.lllIIIllIIIIlllIlIIllIIll(this.lllIIlIIIllllllIIIIlIlIlI, this.lllllIlllIIllIlIIlIIIllII);
        this.IllIIIllIIIIlIlIlIllIIlll = arrobject3;
        this.lIIIIlIlIIlllllIIllIIlIII = arrobject4;
    }

    public class_1427 IllIIIllIIIIlIlIlIllIIlll() {
        class_1427 class_14272;
        try {
            class_14272 = (class_1427)super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new InternalError();
        }
        class_14272.lIIlIIIIIlIlllIlIIlIlIlll = null;
        class_14272.lIlIlIIlIIIIlIIIIIlllIIII = null;
        class_14272.IlIlIIlllIIlIllIIIlllllIl = null;
        class_14272.llIIllIllIlIIlIIllIllllll = this.llIIllIllIlIIlIIllIllllll;
        class_14272.IllIIIllIIIIlIlIlIllIIlll = (Object[])this.IllIIIllIIIIlIlIlIllIIlll.clone();
        class_14272.lIIIIlIlIIlllllIIllIIlIII = (Object[])this.lIIIIlIlIIlllllIIllIIlIII.clone();
        return class_14272;
    }

    @Override
    public int hashCode() {
        int n = 0;
        int n2 = this.lIIIIlIlIIlllllIIllIIlIII();
        int n3 = 0;
        int n4 = 0;
        while (n2-- != 0) {
            while (this.IllIIIllIIIIlIlIlIllIIlll[n3] == null) {
                ++n3;
            }
            if (this != this.IllIIIllIIIIlIlIlIllIIlll[n3]) {
                n4 = this.IllIIIllIIIIlIlIlIllIIlll[n3].hashCode();
            }
            if (this != this.lIIIIlIlIIlllllIIllIIlIII[n3]) {
                n4 ^= this.lIIIIlIlIIlllllIIllIIlIII[n3] == null ? 0 : this.lIIIIlIlIIlllllIIllIIlIII[n3].hashCode();
            }
            n += n4;
            ++n3;
        }
        if (this.llIIllIllIlIIlIIllIllllll) {
            n += this.lIIIIlIlIIlllllIIllIIlIII[this.lllIIlIIIllllllIIIIlIlIlI] == null ? 0 : this.lIIIIlIlIIlllllIIllIIlIII[this.lllIIlIIIllllllIIIIlIlIlI].hashCode();
        }
        return n;
    }

    private void lllIIIllIIIIlllIlIIllIIll(ObjectOutputStream objectOutputStream) {
        Object[] arrobject = this.IllIIIllIIIIlIlIlIllIIlll;
        Object[] arrobject2 = this.lIIIIlIlIIlllllIIllIIlIII;
        class_1725 class_17252 = new class_1725(this, null);
        objectOutputStream.defaultWriteObject();
        int n = this.IlIlIIlIlIllIIlIlIIllIIIl;
        while (n-- != 0) {
            int n2 = class_17252.lllIlIIlIIIlIlIIIllIlllIl();
            objectOutputStream.writeObject(arrobject[n2]);
            objectOutputStream.writeObject(arrobject2[n2]);
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.lllIIlIIIllllllIIIIlIlIlI = class_1652.lllIlIIlIIIlIlIIIllIlllIl(this.IlIlIIlIlIllIIlIlIIllIIIl, this.lllllIlllIIllIlIIlIIIllII);
        this.IlIlllIIIIIIlIIllIIllIlll = class_1652.lllIIIllIIIIlllIlIIllIIll(this.lllIIlIIIllllllIIIIlIlIlI, this.lllllIlllIIllIlIIlIIIllII);
        this.llIIlllIllIllllIIIlIIIIII = this.lllIIlIIIllllllIIIIlIlIlI - 1;
        this.IllIIIllIIIIlIlIlIllIIlll = new Object[this.lllIIlIIIllllllIIIIlIlIlI + 1];
        Object[] arrobject = this.IllIIIllIIIIlIlIlIllIIlll;
        this.lIIIIlIlIIlllllIIllIIlIII = new Object[this.lllIIlIIIllllllIIIIlIlIlI + 1];
        Object[] arrobject2 = this.lIIIIlIlIIlllllIIllIIlIII;
        int n = this.IlIlIIlIlIllIIlIlIIllIIIl;
        while (n-- != 0) {
            int n2;
            Object object = objectInputStream.readObject();
            Object object2 = objectInputStream.readObject();
            if (object == null) {
                n2 = this.lllIIlIIIllllllIIIIlIlIlI;
                this.llIIllIllIlIIlIIllIllllll = true;
            } else {
                n2 = class_1652.lllIlIIlIIIlIlIIIllIlllIl(object.hashCode()) & this.llIIlllIllIllllIIIlIIIIII;
                while (arrobject[n2] != null) {
                    n2 = n2 + 1 & this.llIIlllIllIllllIIIlIIIIII;
                }
            }
            arrobject[n2] = object;
            arrobject2[n2] = object2;
        }
    }

    private void llIIllIllIlIIlIIllIllllll() {
    }

    @Override
    public /* synthetic */ class_1729 IlIIIIIllllllIIlllIllllll() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI();
    }

    @Override
    public /* synthetic */ Collection values() {
        return this.IlIllllllIIlIIllllIIlIIIl();
    }

    @Override
    public /* synthetic */ Set keySet() {
        return this.lllIlIIlIIIlIlIIIllIlllIl();
    }

    public /* synthetic */ Object clone() {
        return this.IllIIIllIIIIlIlIlIllIIlll();
    }

    static /* synthetic */ Object lllIIIllIIIIlllIlIIllIIll(class_1427 class_14272) {
        return class_14272.llIIlllIllIllllIIIlIIIIII();
    }

    static /* synthetic */ Object lllIIIllIIIIlllIlIIllIIll(class_1427 class_14272, int n) {
        return class_14272.lIllllIIlIIIlIllllllIIIll(n);
    }
}

