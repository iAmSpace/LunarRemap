package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ObjectUtils
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import net.minecraft.crash.CrashReport;
import net.minecraft.item.ItemStack;
import org.apache.commons.lang3.ObjectUtils;

public class class_0788 {
    private final class_1521 lllIIIllIIIIlllIlIIllIIll;
    private boolean lllIlIIlIIIlIlIIIllIlllIl = true;
    private static final HashMap IlIllllllIIlIIllllIIlIIIl = new HashMap();
    private final Map lIlllIlllIIIIlIIlllIllIII = new HashMap();
    private boolean IlIIIIIllllllIIlllIllllll;
    private ReadWriteLock lIllllIIlIIIlIllllllIIIll = new ReentrantReadWriteLock();

    public class_0788(class_1521 class_15212) {
        this.lllIIIllIIIIlllIlIIllIIll = class_15212;
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, Object object) {
        Integer n2 = (Integer)IlIllllllIIlIIllllIIlIIIl.get(object.getClass());
        if (n2 == null) {
            throw new IllegalArgumentException("Unknown data type: " + object.getClass());
        }
        if (n > 31) {
            throw new IllegalArgumentException("Data value id is too big with " + n + "! (Max is " + 31 + ")");
        }
        if (this.lIlllIlllIIIIlIIlllIllIII.containsKey(n)) {
            throw new IllegalArgumentException("Duplicate id value for " + n + "!");
        }
        class_0766 class_07662 = new class_0766(n2, n, object);
        this.lIllllIIlIIIlIllllllIIIll.writeLock().lock();
        this.lIlllIlllIIIIlIIlllIllIII.put(n, class_07662);
        this.lIllllIIlIIIlIllllllIIIll.writeLock().unlock();
        this.lllIlIIlIIIlIlIIIllIlllIl = false;
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        class_0766 class_07662 = new class_0766(n2, n, null);
        this.lIllllIIlIIIlIllllllIIIll.writeLock().lock();
        this.lIlllIlllIIIIlIIlllIllIII.put(n, class_07662);
        this.lIllllIIlIIIlIllllllIIIll.writeLock().unlock();
        this.lllIlIIlIIIlIlIIIllIlllIl = false;
    }

    public byte lllIIIllIIIIlllIlIIllIIll(int n) {
        return (Byte)this.IllIIlllllllIIlIIlIIIIlIl(n).lllIlIIlIIIlIlIIIllIlllIl();
    }

    public short lllIlIIlIIIlIlIIIllIlllIl(int n) {
        return (Short)this.IllIIlllllllIIlIIlIIIIlIl(n).lllIlIIlIIIlIlIIIllIlllIl();
    }

    public int IlIllllllIIlIIllllIIlIIIl(int n) {
        return (Integer)this.IllIIlllllllIIlIIlIIIIlIl(n).lllIlIIlIIIlIlIIIllIlllIl();
    }

    public float lIlllIlllIIIIlIIlllIllIII(int n) {
        return ((Float)this.IllIIlllllllIIlIIlIIIIlIl(n).lllIlIIlIIIlIlIIIllIlllIl()).floatValue();
    }

    public String IlIIIIIllllllIIlllIllllll(int n) {
        return (String)this.IllIIlllllllIIlIIlIIIIlIl(n).lllIlIIlIIIlIlIIIllIlllIl();
    }

    public ItemStack lIllllIIlIIIlIllllllIIIll(int n) {
        return (ItemStack)this.IllIIlllllllIIlIIlIIIIlIl(n).lllIlIIlIIIlIlIIIllIlllIl();
    }

    private class_0766 IllIIlllllllIIlIIlIIIIlIl(int n) {
        class_0766 class_07662;
        this.lIllllIIlIIIlIllllllIIIll.readLock().lock();
        try {
            class_07662 = (class_0766)this.lIlllIlllIIIIlIIlllIllIII.get(n);
        }
        catch (Throwable throwable) {
            CrashReport class_02232 = CrashReport.lllIIIllIIIIlllIlIIllIIll(throwable, "Getting synched entity data");
            class_0799 class_07992 = class_02232.lllIIIllIIIIlllIlIIllIIll("Synched entity data");
            class_07992.lllIIIllIIIIlllIlIIllIIll("Data ID", n);
            throw new class_0892(class_02232);
        }
        this.lIllllIIlIIIlIllllllIIIll.readLock().unlock();
        return class_07662;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(int n, Object object) {
        class_0766 class_07662 = this.IllIIlllllllIIlIIlIIIIlIl(n);
        if (ObjectUtils.notEqual((Object)object, (Object)class_07662.lllIlIIlIIIlIlIIIllIlllIl())) {
            class_07662.lllIIIllIIIIlllIlIIllIIll(object);
            this.lllIIIllIIIIlllIlIIllIIll.IllIIIllIIIIlIlIlIllIIlll(n);
            class_07662.lllIIIllIIIIlllIlIIllIIll(true);
            this.IlIIIIIllllllIIlllIllllll = true;
        }
    }

    public void IIIllIIlIIIIIIlIlIIllIIlI(int n) {
        class_0766.lllIIIllIIIIlllIlIIllIIll(this.IllIIlllllllIIlIIlIIIIlIl(n), true);
        this.IlIIIIIllllllIIlllIllllll = true;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public static void lllIIIllIIIIlllIlIIllIIll(List list, PacketBuffer class_01812) {
        if (list != null) {
            for (class_0766 class_07662 : list) {
                class_0788.lllIIIllIIIIlllIlIIllIIll(class_01812, class_07662);
            }
        }
        class_01812.writeByte(127);
    }

    public List lllIlIIlIIIlIlIIIllIlllIl() {
        ArrayList<class_0766> arrayList = null;
        if (this.IlIIIIIllllllIIlllIllllll) {
            this.lIllllIIlIIIlIllllllIIIll.readLock().lock();
            for (class_0766 class_07662 : this.lIlllIlllIIIIlIIlllIllIII.values()) {
                if (!class_07662.lIlllIlllIIIIlIIlllIllIII()) continue;
                class_07662.lllIIIllIIIIlllIlIIllIIll(false);
                if (arrayList == null) {
                    arrayList = new ArrayList<class_0766>();
                }
                arrayList.add(class_07662);
            }
            this.lIllllIIlIIIlIllllllIIIll.readLock().unlock();
        }
        this.IlIIIIIllllllIIlllIllllll = false;
        return arrayList;
    }

    public void lllIIIllIIIIlllIlIIllIIll(PacketBuffer class_01812) {
        this.lIllllIIlIIIlIllllllIIIll.readLock().lock();
        for (class_0766 class_07662 : this.lIlllIlllIIIIlIIlllIllIII.values()) {
            class_0788.lllIIIllIIIIlllIlIIllIIll(class_01812, class_07662);
        }
        this.lIllllIIlIIIlIllllllIIIll.readLock().unlock();
        class_01812.writeByte(127);
    }

    public List IlIllllllIIlIIllllIIlIIIl() {
        ArrayList<class_0766> arrayList = null;
        this.lIllllIIlIIIlIllllllIIIll.readLock().lock();
        for (class_0766 class_07662 : this.lIlllIlllIIIIlIIlllIllIII.values()) {
            if (arrayList == null) {
                arrayList = new ArrayList<class_0766>();
            }
            arrayList.add(class_07662);
        }
        this.lIllllIIlIIIlIllllllIIIll.readLock().unlock();
        return arrayList;
    }

    private static void lllIIIllIIIIlllIlIIllIIll(PacketBuffer class_01812, class_0766 class_07662) {
        int n = (class_07662.IlIllllllIIlIIllllIIlIIIl() << 5 | class_07662.lllIIIllIIIIlllIlIIllIIll() & 0x1F) & 0xFF;
        class_01812.writeByte(n);
        switch (class_07662.IlIllllllIIlIIllllIIlIIIl()) {
            case 0: {
                class_01812.writeByte(((Byte)class_07662.lllIlIIlIIIlIlIIIllIlllIl()).byteValue());
                break;
            }
            case 1: {
                class_01812.writeShort(((Short)class_07662.lllIlIIlIIIlIlIIIllIlllIl()).shortValue());
                break;
            }
            case 2: {
                class_01812.writeInt((Integer)class_07662.lllIlIIlIIIlIlIIIllIlllIl());
                break;
            }
            case 3: {
                class_01812.writeFloat(((Float)class_07662.lllIlIIlIIIlIlIIIllIlllIl()).floatValue());
                break;
            }
            case 4: {
                class_01812.writeStringToBuffer((String)class_07662.lllIlIIlIIIlIlIIIllIlllIl());
                break;
            }
            case 5: {
                ItemStack class_08972 = (ItemStack)class_07662.lllIlIIlIIIlIlIIIllIlllIl();
                class_01812.lllIIIllIIIIlllIlIIllIIll(class_08972);
                break;
            }
            case 6: {
                class_2208 class_22082 = (class_2208)class_07662.lllIlIIlIIIlIlIIIllIlllIl();
                class_01812.writeInt(class_22082.lllIIIllIIIIlllIlIIllIIll);
                class_01812.writeInt(class_22082.lllIlIIlIIIlIlIIIllIlllIl);
                class_01812.writeInt(class_22082.IlIllllllIIlIIllllIIlIIIl);
            }
        }
    }

    public static List lllIlIIlIIIlIlIIIllIlllIl(PacketBuffer class_01812) {
        ArrayList<class_0766> arrayList = null;
        byte by = class_01812.readByte();
        while (by != 127) {
            if (arrayList == null) {
                arrayList = new ArrayList<class_0766>();
            }
            int n = (by & 0xE0) >> 5;
            int n2 = by & 0x1F;
            class_0766 class_07662 = null;
            switch (n) {
                case 0: {
                    class_07662 = new class_0766(n, n2, class_01812.readByte());
                    break;
                }
                case 1: {
                    class_07662 = new class_0766(n, n2, class_01812.readShort());
                    break;
                }
                case 2: {
                    class_07662 = new class_0766(n, n2, class_01812.readInt());
                    break;
                }
                case 3: {
                    class_07662 = new class_0766(n, n2, Float.valueOf(class_01812.readFloat()));
                    break;
                }
                case 4: {
                    class_07662 = new class_0766(n, n2, class_01812.readStringFromBuffer(32767));
                    break;
                }
                case 5: {
                    class_07662 = new class_0766(n, n2, class_01812.IlIllllllIIlIIllllIIlIIIl());
                    break;
                }
                case 6: {
                    int n3 = class_01812.readInt();
                    int n4 = class_01812.readInt();
                    int n5 = class_01812.readInt();
                    class_07662 = new class_0766(n, n2, new class_2208(n3, n4, n5));
                }
            }
            arrayList.add(class_07662);
            by = class_01812.readByte();
        }
        return arrayList;
    }

    public void lllIIIllIIIIlllIlIIllIIll(List list) {
        this.lIllllIIlIIIlIllllllIIIll.writeLock().lock();
        for (class_0766 class_07662 : list) {
            class_0766 class_07663 = (class_0766)this.lIlllIlllIIIIlIIlllIllIII.get(class_07662.lllIIIllIIIIlllIlIIllIIll());
            if (class_07663 == null) continue;
            class_07663.lllIIIllIIIIlllIlIIllIIll(class_07662.lllIlIIlIIIlIlIIIllIlllIl());
            this.lllIIIllIIIIlllIlIIllIIll.IllIIIllIIIIlIlIlIllIIlll(class_07662.lllIIIllIIIIlllIlIIllIIll());
        }
        this.lIllllIIlIIIlIllllllIIIll.writeLock().unlock();
        this.IlIIIIIllllllIIlllIllllll = true;
    }

    public boolean lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public void IlIIIIIllllllIIlllIllllll() {
        this.IlIIIIIllllllIIlllIllllll = false;
    }

    static {
        IlIllllllIIlIIllllIIlIIIl.put(Byte.class, 0);
        IlIllllllIIlIIllllIIlIIIl.put(Short.class, 1);
        IlIllllllIIlIIllllIIlIIIl.put(Integer.class, 2);
        IlIllllllIIlIIllllIIlIIIl.put(Float.class, 3);
        IlIllllllIIlIIllllIIlIIIl.put(String.class, 4);
        IlIllllllIIlIIllllIIlIIIl.put(ItemStack.class, 5);
        IlIllllllIIlIIllllIIlIIIl.put(class_2208.class, 6);
    }
}

