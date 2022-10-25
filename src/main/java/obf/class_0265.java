package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Maps;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_0265
implements class_1737 {
    private static final Logger lllIIIllIIIIlllIlIIllIIll = LogManager.getLogger();
    protected final Map IlIllllllIIlIIllllIIlIIIl = this.lllIIIllIIIIlllIlIIllIIll();

    protected Map lllIIIllIIIIlllIlIIllIIll() {
        return Maps.newHashMap();
    }

    @Override
    public Object lllIIIllIIIIlllIlIIllIIll(Object object) {
        return this.IlIllllllIIlIIllllIIlIIIl.get(object);
    }

    @Override
    public void putObject(Object object, Object object2) {
        if (this.IlIllllllIIlIIllllIIlIIIl.containsKey(object)) {
            lllIIIllIIIIlllIlIIllIIll.debug("Adding duplicate key '" + object + "' to registry");
        }
        this.IlIllllllIIlIIllllIIlIIIl.put(object, object2);
    }

    public Set IlIllllllIIlIIllllIIlIIIl() {
        return Collections.unmodifiableSet(this.IlIllllllIIlIIllllIIlIIIl.keySet());
    }

    public boolean lIlllIlllIIIIlIIlllIllIII(Object object) {
        return this.IlIllllllIIlIIllllIIlIIIl.containsKey(object);
    }
}

