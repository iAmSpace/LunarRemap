package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.util.Collection;

import net.minecraft.scoreboard.IScoreObjectiveCriteria;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_0390
extends class_0469 {
    private static final Logger lllIlIIlIIIlIlIIIllIlllIl = LogManager.getLogger();
    private class_0141 IlIllllllIIlIIllllIIlIIIl;
    private class_0775 lIlllIlllIIIIlIIlllIllIII;

    public class_0390() {
        this("scoreboard");
    }

    public class_0390(String string) {
        super(string);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0141 class_01412) {
        this.IlIllllllIIlIIllllIIlIIIl = class_01412;
        if (this.lIlllIlllIIIIlIIlllIllIII != null) {
            this.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        if (this.IlIllllllIIlIIllllIIlIIIl == null) {
            this.lIlllIlllIIIIlIIlllIllIII = class_07752;
        } else {
            this.lllIlIIlIIIlIlIIIllIlllIl(class_07752.IlIllllllIIlIIllllIIlIIIl("Objectives", 10));
            this.IlIllllllIIlIIllllIIlIIIl(class_07752.IlIllllllIIlIIllllIIlIIIl("PlayerScores", 10));
            if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("DisplaySlots", 10)) {
                this.lllIlIIlIIIlIlIIIllIlllIl(class_07752.llIIllIllIlIIlIIllIllllll("DisplaySlots"));
            }
            if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("Teams", 9)) {
                this.lllIIIllIIIIlllIlIIllIIll(class_07752.IlIllllllIIlIIllllIIlIIIl("Teams", 10));
            }
        }
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_2145 class_21452) {
        for (int i = 0; i < class_21452.lIlllIlllIIIIlIIlllIllIII(); ++i) {
            class_0775 class_07752 = class_21452.lllIlIIlIIIlIlIIIllIlllIl(i);
            class_0531 class_05312 = this.IlIllllllIIlIIllllIIlIIIl.IlIIIIIllllllIIlllIllllll(class_07752.IllIIIllIIIIlIlIlIllIIlll("Name"));
            class_05312.lllIIIllIIIIlllIlIIllIIll(class_07752.IllIIIllIIIIlIlIlIllIIlll("DisplayName"));
            class_05312.lllIlIIlIIIlIlIIIllIlllIl(class_07752.IllIIIllIIIIlIlIlIllIIlll("Prefix"));
            class_05312.IlIllllllIIlIIllllIIlIIIl(class_07752.IllIIIllIIIIlIlIlIllIIlll("Suffix"));
            if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("AllowFriendlyFire", 99)) {
                class_05312.lllIIIllIIIIlllIlIIllIIll(class_07752.lllIIlIIIllllllIIIIlIlIlI("AllowFriendlyFire"));
            }
            if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("SeeFriendlyInvisibles", 99)) {
                class_05312.lllIlIIlIIIlIlIIIllIlllIl(class_07752.lllIIlIIIllllllIIIIlIlIlI("SeeFriendlyInvisibles"));
            }
            this.lllIIIllIIIIlllIlIIllIIll(class_05312, class_07752.IlIllllllIIlIIllllIIlIIIl("Players", 8));
        }
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_0531 class_05312, class_2145 class_21452) {
        for (int i = 0; i < class_21452.lIlllIlllIIIIlIIlllIllIII(); ++i) {
            this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(class_21452.lIllllIIlIIIlIllllllIIIll(i), class_05312.lllIIIllIIIIlllIlIIllIIll());
        }
    }

    protected void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        for (int i = 0; i < 3; ++i) {
            if (!class_07752.lllIlIIlIIIlIlIIIllIlllIl("slot_" + i, 8)) continue;
            String string = class_07752.IllIIIllIIIIlIlIlIllIIlll("slot_" + i);
            class_0693 class_06932 = this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(string);
            this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(i, class_06932);
        }
    }

    protected void lllIlIIlIIIlIlIIIllIlllIl(class_2145 class_21452) {
        for (int i = 0; i < class_21452.lIlllIlllIIIIlIIlllIllIII(); ++i) {
            class_0775 class_07752 = class_21452.lllIlIIlIIIlIlIIIllIlllIl(i);
            IScoreObjectiveCriteria class_01172 = (IScoreObjectiveCriteria) IScoreObjectiveCriteria.field_96643_a.get(class_07752.IllIIIllIIIIlIlIlIllIIlll("CriteriaName"));
            class_0693 class_06932 = this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(class_07752.IllIIIllIIIIlIlIlIllIIlll("Name"), class_01172);
            class_06932.lllIIIllIIIIlllIlIIllIIll(class_07752.IllIIIllIIIIlIlIlIllIIlll("DisplayName"));
        }
    }

    protected void IlIllllllIIlIIllllIIlIIIl(class_2145 class_21452) {
        for (int i = 0; i < class_21452.lIlllIlllIIIIlIIlllIllIII(); ++i) {
            class_0775 class_07752 = class_21452.lllIlIIlIIIlIlIIIllIlllIl(i);
            class_0693 class_06932 = this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(class_07752.IllIIIllIIIIlIlIlIllIIlll("Objective"));
            class_0678 class_06782 = this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(class_07752.IllIIIllIIIIlIlIlIllIIlll("Name"), class_06932);
            class_06782.IlIllllllIIlIIllllIIlIIIl(class_07752.lIllllIIlIIIlIllllllIIIll("Score"));
        }
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl(class_0775 class_07752) {
        if (this.IlIllllllIIlIIllllIIlIIIl == null) {
            lllIlIIlIIIlIlIIIllIlllIl.warn("Tried to save scoreboard without having a scoreboard...");
        } else {
            class_07752.lllIIIllIIIIlllIlIIllIIll("Objectives", this.lllIlIIlIIIlIlIIIllIlllIl());
            class_07752.lllIIIllIIIIlllIlIIllIIll("PlayerScores", this.IlIllllllIIlIIllllIIlIIIl());
            class_07752.lllIIIllIIIIlllIlIIllIIll("Teams", this.lllIIIllIIIIlllIlIIllIIll());
            this.lIlllIlllIIIIlIIlllIllIII(class_07752);
        }
    }

    protected class_2145 lllIIIllIIIIlllIlIIllIIll() {
        class_2145 class_21452 = new class_2145();
        Collection collection = this.IlIllllllIIlIIllllIIlIIIl.IlIIIIIllllllIIlllIllllll();
        for (class_0531 class_05312 : collection) {
            class_0775 class_07752 = new class_0775();
            class_07752.lllIIIllIIIIlllIlIIllIIll("Name", class_05312.lllIIIllIIIIlllIlIIllIIll());
            class_07752.lllIIIllIIIIlllIlIIllIIll("DisplayName", class_05312.lllIlIIlIIIlIlIIIllIlllIl());
            class_07752.lllIIIllIIIIlllIlIIllIIll("Prefix", class_05312.lIlllIlllIIIIlIIlllIllIII());
            class_07752.lllIIIllIIIIlllIlIIllIIll("Suffix", class_05312.IlIIIIIllllllIIlllIllllll());
            class_07752.lllIIIllIIIIlllIlIIllIIll("AllowFriendlyFire", class_05312.lIllllIIlIIIlIllllllIIIll());
            class_07752.lllIIIllIIIIlllIlIIllIIll("SeeFriendlyInvisibles", class_05312.IIIllIIlIIIIIIlIlIIllIIlI());
            class_2145 class_21453 = new class_2145();
            for (String string : class_05312.IlIllllllIIlIIllllIIlIIIl()) {
                class_21453.lllIIIllIIIIlllIlIIllIIll(new class_0928(string));
            }
            class_07752.lllIIIllIIIIlllIlIIllIIll("Players", class_21453);
            class_21452.lllIIIllIIIIlllIlIIllIIll(class_07752);
        }
        return class_21452;
    }

    protected void lIlllIlllIIIIlIIlllIllIII(class_0775 class_07752) {
        class_0775 class_07753 = new class_0775();
        boolean bl = false;
        for (int i = 0; i < 3; ++i) {
            class_0693 class_06932 = this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(i);
            if (class_06932 == null) continue;
            class_07753.lllIIIllIIIIlllIlIIllIIll("slot_" + i, class_06932.lllIlIIlIIIlIlIIIllIlllIl());
            bl = true;
        }
        if (bl) {
            class_07752.lllIIIllIIIIlllIlIIllIIll("DisplaySlots", class_07753);
        }
    }

    protected class_2145 lllIlIIlIIIlIlIIIllIlllIl() {
        class_2145 class_21452 = new class_2145();
        Collection collection = this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll();
        for (class_0693 class_06932 : collection) {
            class_0775 class_07752 = new class_0775();
            class_07752.lllIIIllIIIIlllIlIIllIIll("Name", class_06932.lllIlIIlIIIlIlIIIllIlllIl());
            class_07752.lllIIIllIIIIlllIlIIllIIll("CriteriaName", class_06932.IlIllllllIIlIIllllIIlIIIl().func_96636_a());
            class_07752.lllIIIllIIIIlllIlIIllIIll("DisplayName", class_06932.lIlllIlllIIIIlIIlllIllIII());
            class_21452.lllIIIllIIIIlllIlIIllIIll(class_07752);
        }
        return class_21452;
    }

    protected class_2145 IlIllllllIIlIIllllIIlIIIl() {
        class_2145 class_21452 = new class_2145();
        Collection collection = this.IlIllllllIIlIIllllIIlIIIl.IlIllllllIIlIIllllIIlIIIl();
        for (class_0678 class_06782 : collection) {
            class_0775 class_07752 = new class_0775();
            class_07752.lllIIIllIIIIlllIlIIllIIll("Name", class_06782.lIlllIlllIIIIlIIlllIllIII());
            class_07752.lllIIIllIIIIlllIlIIllIIll("Objective", class_06782.IlIllllllIIlIIllllIIlIIIl().lllIlIIlIIIlIlIIIllIlllIl());
            class_07752.lllIIIllIIIIlllIlIIllIIll("Score", class_06782.lllIlIIlIIIlIlIIIllIlllIl());
            class_21452.lllIIIllIIIIlllIlIIllIIll(class_07752);
        }
        return class_21452;
    }
}

