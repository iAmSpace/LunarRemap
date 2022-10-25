package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.scoreboard.IScoreObjectiveCriteria;
import net.minecraft.util.ChatComponentTranslation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class class_1981
extends class_1246 {
    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "scoreboard";
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return 2;
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692) {
        return "commands.scoreboard.usage";
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, String[] arrstring) {
        if (arrstring.length >= 1) {
            if (arrstring[0].equalsIgnoreCase("objectives")) {
                if (arrstring.length == 1) {
                    throw new class_0932("commands.scoreboard.objectives.usage", new Object[0]);
                }
                if (arrstring[1].equalsIgnoreCase("list")) {
                    this.lIlllIlllIIIIlIIlllIllIII(class_19692);
                } else if (arrstring[1].equalsIgnoreCase("add")) {
                    if (arrstring.length < 4) {
                        throw new class_0932("commands.scoreboard.objectives.add.usage", new Object[0]);
                    }
                    this.IlIllllllIIlIIllllIIlIIIl(class_19692, arrstring, 2);
                } else if (arrstring[1].equalsIgnoreCase("remove")) {
                    if (arrstring.length != 3) {
                        throw new class_0932("commands.scoreboard.objectives.remove.usage", new Object[0]);
                    }
                    this.IllIIlllllllIIlIIlIIIIlIl(class_19692, arrstring[2]);
                } else {
                    if (!arrstring[1].equalsIgnoreCase("setdisplay")) {
                        throw new class_0932("commands.scoreboard.objectives.usage", new Object[0]);
                    }
                    if (arrstring.length != 3 && arrstring.length != 4) {
                        throw new class_0932("commands.scoreboard.objectives.setdisplay.usage", new Object[0]);
                    }
                    this.lIIIIlIlIIlllllIIllIIlIII(class_19692, arrstring, 2);
                }
                return;
            }
            if (arrstring[0].equalsIgnoreCase("players")) {
                if (arrstring.length == 1) {
                    throw new class_0932("commands.scoreboard.players.usage", new Object[0]);
                }
                if (arrstring[1].equalsIgnoreCase("list")) {
                    if (arrstring.length > 3) {
                        throw new class_0932("commands.scoreboard.players.list.usage", new Object[0]);
                    }
                    this.llIIlllIllIllllIIIlIIIIII(class_19692, arrstring, 2);
                } else if (arrstring[1].equalsIgnoreCase("add")) {
                    if (arrstring.length != 5) {
                        throw new class_0932("commands.scoreboard.players.add.usage", new Object[0]);
                    }
                    this.llIIllIllIlIIlIIllIllllll(class_19692, arrstring, 2);
                } else if (arrstring[1].equalsIgnoreCase("remove")) {
                    if (arrstring.length != 5) {
                        throw new class_0932("commands.scoreboard.players.remove.usage", new Object[0]);
                    }
                    this.llIIllIllIlIIlIIllIllllll(class_19692, arrstring, 2);
                } else if (arrstring[1].equalsIgnoreCase("set")) {
                    if (arrstring.length != 5) {
                        throw new class_0932("commands.scoreboard.players.set.usage", new Object[0]);
                    }
                    this.llIIllIllIlIIlIIllIllllll(class_19692, arrstring, 2);
                } else {
                    if (!arrstring[1].equalsIgnoreCase("reset")) {
                        throw new class_0932("commands.scoreboard.players.usage", new Object[0]);
                    }
                    if (arrstring.length != 3) {
                        throw new class_0932("commands.scoreboard.players.reset.usage", new Object[0]);
                    }
                    this.lllIIlIIIllllllIIIIlIlIlI(class_19692, arrstring, 2);
                }
                return;
            }
            if (arrstring[0].equalsIgnoreCase("teams")) {
                if (arrstring.length == 1) {
                    throw new class_0932("commands.scoreboard.teams.usage", new Object[0]);
                }
                if (arrstring[1].equalsIgnoreCase("list")) {
                    if (arrstring.length > 3) {
                        throw new class_0932("commands.scoreboard.teams.list.usage", new Object[0]);
                    }
                    this.IIIllIIlIIIIIIlIlIIllIIlI(class_19692, arrstring, 2);
                } else if (arrstring[1].equalsIgnoreCase("add")) {
                    if (arrstring.length < 3) {
                        throw new class_0932("commands.scoreboard.teams.add.usage", new Object[0]);
                    }
                    this.lIlllIlllIIIIlIIlllIllIII(class_19692, arrstring, 2);
                } else if (arrstring[1].equalsIgnoreCase("remove")) {
                    if (arrstring.length != 3) {
                        throw new class_0932("commands.scoreboard.teams.remove.usage", new Object[0]);
                    }
                    this.lIllllIIlIIIlIllllllIIIll(class_19692, arrstring, 2);
                } else if (arrstring[1].equalsIgnoreCase("empty")) {
                    if (arrstring.length != 3) {
                        throw new class_0932("commands.scoreboard.teams.empty.usage", new Object[0]);
                    }
                    this.IllIIIllIIIIlIlIlIllIIlll(class_19692, arrstring, 2);
                } else if (arrstring[1].equalsIgnoreCase("join")) {
                    if (!(arrstring.length >= 4 || arrstring.length == 3 && class_19692 instanceof class_0814)) {
                        throw new class_0932("commands.scoreboard.teams.join.usage", new Object[0]);
                    }
                    this.IllIIlllllllIIlIIlIIIIlIl(class_19692, arrstring, 2);
                } else if (arrstring[1].equalsIgnoreCase("leave")) {
                    if (arrstring.length < 3 && !(class_19692 instanceof class_0814)) {
                        throw new class_0932("commands.scoreboard.teams.leave.usage", new Object[0]);
                    }
                    this.IIIllIllIIlIlIlIlIllllIIl(class_19692, arrstring, 2);
                } else {
                    if (!arrstring[1].equalsIgnoreCase("option")) {
                        throw new class_0932("commands.scoreboard.teams.usage", new Object[0]);
                    }
                    if (arrstring.length != 4 && arrstring.length != 5) {
                        throw new class_0932("commands.scoreboard.teams.option.usage", new Object[0]);
                    }
                    this.IlIIIIIllllllIIlllIllllll(class_19692, arrstring, 2);
                }
                return;
            }
        }
        throw new class_0932("commands.scoreboard.usage", new Object[0]);
    }

    protected class_0141 lIlllIlllIIIIlIIlllIllIII() {
        return class_0220.IlIIlllllIIlIlIlllllIllll().lllIIIllIIIIlllIlIIllIIll(0).IlIlIIlllIllllllllIIIlIlI();
    }

    protected class_0693 lllIIIllIIIIlllIlIIllIIll(String string, boolean bl) {
        class_0141 class_01412 = this.lIlllIlllIIIIlIIlllIllIII();
        class_0693 class_06932 = class_01412.lllIIIllIIIIlllIlIIllIIll(string);
        if (class_06932 == null) {
            throw new class_1953("commands.scoreboard.objectiveNotFound", string);
        }
        if (bl && class_06932.IlIllllllIIlIIllllIIlIIIl().lllIlIIlIIIlIlIIIllIlllIl()) {
            throw new class_1953("commands.scoreboard.objectiveReadOnly", string);
        }
        return class_06932;
    }

    protected class_0531 lllIIIllIIIIlllIlIIllIIll(String string) {
        class_0141 class_01412 = this.lIlllIlllIIIIlIIlllIllIII();
        class_0531 class_05312 = class_01412.lIlllIlllIIIIlIIlllIllIII(string);
        if (class_05312 == null) {
            throw new class_1953("commands.scoreboard.teamNotFound", string);
        }
        return class_05312;
    }

    protected void IlIllllllIIlIIllllIIlIIIl(class_1969 class_19692, String[] arrstring, int n) {
        String string = arrstring[n++];
        String string2 = arrstring[n++];
        class_0141 class_01412 = this.lIlllIlllIIIIlIIlllIllIII();
        IScoreObjectiveCriteria class_01172 = (IScoreObjectiveCriteria) IScoreObjectiveCriteria.field_96643_a.get(string2);
        if (class_01172 == null) {
            throw new class_0932("commands.scoreboard.objectives.add.wrongType", string2);
        }
        if (class_01412.lllIIIllIIIIlllIlIIllIIll(string) != null) {
            throw new class_1953("commands.scoreboard.objectives.add.alreadyExists", string);
        }
        if (string.length() > 16) {
            throw new class_1648("commands.scoreboard.objectives.add.tooLong", string, 16);
        }
        if (string.length() == 0) {
            throw new class_0932("commands.scoreboard.objectives.add.usage", new Object[0]);
        }
        if (arrstring.length > n) {
            String string3 = class_1981.lllIIIllIIIIlllIlIIllIIll(class_19692, arrstring, n).IlIllllllIIlIIllllIIlIIIl();
            if (string3.length() > 32) {
                throw new class_1648("commands.scoreboard.objectives.add.displayTooLong", string3, 32);
            }
            if (string3.length() > 0) {
                class_01412.lllIIIllIIIIlllIlIIllIIll(string, class_01172).lllIIIllIIIIlllIlIIllIIll(string3);
            } else {
                class_01412.lllIIIllIIIIlllIlIIllIIll(string, class_01172);
            }
        } else {
            class_01412.lllIIIllIIIIlllIlIIllIIll(string, class_01172);
        }
        class_1981.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.scoreboard.objectives.add.success", string);
    }

    protected void lIlllIlllIIIIlIIlllIllIII(class_1969 class_19692, String[] arrstring, int n) {
        String string = arrstring[n++];
        class_0141 class_01412 = this.lIlllIlllIIIIlIIlllIllIII();
        if (class_01412.lIlllIlllIIIIlIIlllIllIII(string) != null) {
            throw new class_1953("commands.scoreboard.teams.add.alreadyExists", string);
        }
        if (string.length() > 16) {
            throw new class_1648("commands.scoreboard.teams.add.tooLong", string, 16);
        }
        if (string.length() == 0) {
            throw new class_0932("commands.scoreboard.teams.add.usage", new Object[0]);
        }
        if (arrstring.length > n) {
            String string2 = class_1981.lllIIIllIIIIlllIlIIllIIll(class_19692, arrstring, n).IlIllllllIIlIIllllIIlIIIl();
            if (string2.length() > 32) {
                throw new class_1648("commands.scoreboard.teams.add.displayTooLong", string2, 32);
            }
            if (string2.length() > 0) {
                class_01412.IlIIIIIllllllIIlllIllllll(string).lllIIIllIIIIlllIlIIllIIll(string2);
            } else {
                class_01412.IlIIIIIllllllIIlllIllllll(string);
            }
        } else {
            class_01412.IlIIIIIllllllIIlllIllllll(string);
        }
        class_1981.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.scoreboard.teams.add.success", string);
    }

    protected void IlIIIIIllllllIIlllIllllll(class_1969 class_19692, String[] arrstring, int n) {
        class_0531 class_05312;
        if ((class_05312 = this.lllIIIllIIIIlllIlIIllIIll(arrstring[n++])) != null) {
            String string;
            if (!((string = arrstring[n++].toLowerCase()).equalsIgnoreCase("color") || string.equalsIgnoreCase("friendlyfire") || string.equalsIgnoreCase("seeFriendlyInvisibles"))) {
                throw new class_0932("commands.scoreboard.teams.option.usage", new Object[0]);
            }
            if (arrstring.length == 4) {
                if (string.equalsIgnoreCase("color")) {
                    throw new class_0932("commands.scoreboard.teams.option.noValue", string, class_1981.lllIIIllIIIIlllIlIIllIIll(EnumChatFormatting.getValidValues(true, false)));
                }
                if (!string.equalsIgnoreCase("friendlyfire") && !string.equalsIgnoreCase("seeFriendlyInvisibles")) {
                    throw new class_0932("commands.scoreboard.teams.option.usage", new Object[0]);
                }
                throw new class_0932("commands.scoreboard.teams.option.noValue", string, class_1981.lllIIIllIIIIlllIlIIllIIll(Arrays.asList("true", "false")));
            }
            String string2 = arrstring[n++];
            if (string.equalsIgnoreCase("color")) {
                EnumChatFormatting class_12272 = EnumChatFormatting.getValueByName(string2);
                if (class_12272 == null || class_12272.isFancyStyling()) {
                    throw new class_0932("commands.scoreboard.teams.option.noValue", string, class_1981.lllIIIllIIIIlllIlIIllIIll(EnumChatFormatting.getValidValues(true, false)));
                }
                class_05312.lllIlIIlIIIlIlIIIllIlllIl(class_12272.toString());
                class_05312.IlIllllllIIlIIllllIIlIIIl(EnumChatFormatting.RESET.toString());
            } else if (string.equalsIgnoreCase("friendlyfire")) {
                if (!string2.equalsIgnoreCase("true") && !string2.equalsIgnoreCase("false")) {
                    throw new class_0932("commands.scoreboard.teams.option.noValue", string, class_1981.lllIIIllIIIIlllIlIIllIIll(Arrays.asList("true", "false")));
                }
                class_05312.lllIIIllIIIIlllIlIIllIIll(string2.equalsIgnoreCase("true"));
            } else if (string.equalsIgnoreCase("seeFriendlyInvisibles")) {
                if (!string2.equalsIgnoreCase("true") && !string2.equalsIgnoreCase("false")) {
                    throw new class_0932("commands.scoreboard.teams.option.noValue", string, class_1981.lllIIIllIIIIlllIlIIllIIll(Arrays.asList("true", "false")));
                }
                class_05312.lllIlIIlIIIlIlIIIllIlllIl(string2.equalsIgnoreCase("true"));
            }
            class_1981.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.scoreboard.teams.option.success", string, class_05312.lllIIIllIIIIlllIlIIllIIll(), string2);
        }
    }

    protected void lIllllIIlIIIlIllllllIIIll(class_1969 class_19692, String[] arrstring, int n) {
        class_0531 class_05312;
        class_0141 class_01412 = this.lIlllIlllIIIIlIIlllIllIII();
        if ((class_05312 = this.lllIIIllIIIIlllIlIIllIIll(arrstring[n++])) != null) {
            class_01412.lllIIIllIIIIlllIlIIllIIll(class_05312);
            class_1981.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.scoreboard.teams.remove.success", class_05312.lllIIIllIIIIlllIlIIllIIll());
        }
    }

    protected void IIIllIIlIIIIIIlIlIIllIIlI(class_1969 class_19692, String[] arrstring, int n) {
        class_0141 class_01412 = this.lIlllIlllIIIIlIIlllIllIII();
        if (arrstring.length > n) {
            class_0531 class_05312;
            if ((class_05312 = this.lllIIIllIIIIlllIlIIllIIll(arrstring[n++])) == null) {
                return;
            }
            Collection collection = class_05312.IlIllllllIIlIIllllIIlIIIl();
            if (collection.size() <= 0) {
                throw new class_1953("commands.scoreboard.teams.list.player.empty", class_05312.lllIIIllIIIIlllIlIIllIIll());
            }
            ChatComponentTranslation class_17902 = new ChatComponentTranslation("commands.scoreboard.teams.list.player.count", collection.size(), class_05312.lllIIIllIIIIlllIlIIllIIll());
            class_17902.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(EnumChatFormatting.DARK_GREEN);
            class_19692.lllIIIllIIIIlllIlIIllIIll(class_17902);
            class_19692.lllIIIllIIIIlllIlIIllIIll(new class_0722(class_1981.lllIIIllIIIIlllIlIIllIIll(collection.toArray())));
        } else {
            Collection collection = class_01412.IlIIIIIllllllIIlllIllllll();
            if (collection.size() <= 0) {
                throw new class_1953("commands.scoreboard.teams.list.empty", new Object[0]);
            }
            ChatComponentTranslation class_17903 = new ChatComponentTranslation("commands.scoreboard.teams.list.count", collection.size());
            class_17903.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(EnumChatFormatting.DARK_GREEN);
            class_19692.lllIIIllIIIIlllIlIIllIIll(class_17903);
            for (class_0531 class_05313 : collection) {
                class_19692.lllIIIllIIIIlllIlIIllIIll(new ChatComponentTranslation("commands.scoreboard.teams.list.entry", class_05313.lllIIIllIIIIlllIlIIllIIll(), class_05313.lllIlIIlIIIlIlIIIllIlllIl(), class_05313.IlIllllllIIlIIllllIIlIIIl().size()));
            }
        }
    }

    protected void IllIIlllllllIIlIIlIIIIlIl(class_1969 class_19692, String[] arrstring, int n) {
        class_0141 class_01412 = this.lIlllIlllIIIIlIIlllIllIII();
        String string = arrstring[n++];
        HashSet<String> hashSet = new HashSet<String>();
        HashSet<String> hashSet2 = new HashSet<String>();
        if (class_19692 instanceof class_0814 && n == arrstring.length) {
            String string2 = class_1981.IlIllllllIIlIIllllIIlIIIl(class_19692).llllIIIIlIIIlIIIIIIlIllll();
            if (class_01412.lllIIIllIIIIlllIlIIllIIll(string2, string)) {
                hashSet.add(string2);
            } else {
                hashSet2.add(string2);
            }
        } else {
            while (n < arrstring.length) {
                String string3;
                if (class_01412.lllIIIllIIIIlllIlIIllIIll(string3 = class_1981.IlIIIIIllllllIIlllIllllll(class_19692, arrstring[n++]), string)) {
                    hashSet.add(string3);
                    continue;
                }
                hashSet2.add(string3);
            }
        }
        if (!hashSet.isEmpty()) {
            class_1981.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.scoreboard.teams.join.success", hashSet.size(), string, class_1981.lllIIIllIIIIlllIlIIllIIll(hashSet.toArray(new String[0])));
        }
        if (!hashSet2.isEmpty()) {
            throw new class_1953("commands.scoreboard.teams.join.failure", hashSet2.size(), string, class_1981.lllIIIllIIIIlllIlIIllIIll(hashSet2.toArray(new String[0])));
        }
    }

    protected void IIIllIllIIlIlIlIlIllllIIl(class_1969 class_19692, String[] arrstring, int n) {
        class_0141 class_01412 = this.lIlllIlllIIIIlIIlllIllIII();
        HashSet<String> hashSet = new HashSet<String>();
        HashSet<String> hashSet2 = new HashSet<String>();
        if (class_19692 instanceof class_0814 && n == arrstring.length) {
            String string = class_1981.IlIllllllIIlIIllllIIlIIIl(class_19692).llllIIIIlIIIlIIIIIIlIllll();
            if (class_01412.lIllllIIlIIIlIllllllIIIll(string)) {
                hashSet.add(string);
            } else {
                hashSet2.add(string);
            }
        } else {
            while (n < arrstring.length) {
                String string;
                if (class_01412.lIllllIIlIIIlIllllllIIIll(string = class_1981.IlIIIIIllllllIIlllIllllll(class_19692, arrstring[n++]))) {
                    hashSet.add(string);
                    continue;
                }
                hashSet2.add(string);
            }
        }
        if (!hashSet.isEmpty()) {
            class_1981.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.scoreboard.teams.leave.success", hashSet.size(), class_1981.lllIIIllIIIIlllIlIIllIIll(hashSet.toArray(new String[0])));
        }
        if (!hashSet2.isEmpty()) {
            throw new class_1953("commands.scoreboard.teams.leave.failure", hashSet2.size(), class_1981.lllIIIllIIIIlllIlIIllIIll(hashSet2.toArray(new String[0])));
        }
    }

    protected void IllIIIllIIIIlIlIlIllIIlll(class_1969 class_19692, String[] arrstring, int n) {
        class_0531 class_05312;
        class_0141 class_01412 = this.lIlllIlllIIIIlIIlllIllIII();
        if ((class_05312 = this.lllIIIllIIIIlllIlIIllIIll(arrstring[n++])) != null) {
            ArrayList arrayList = new ArrayList(class_05312.IlIllllllIIlIIllllIIlIIIl());
            if (arrayList.isEmpty()) {
                throw new class_1953("commands.scoreboard.teams.empty.alreadyEmpty", class_05312.lllIIIllIIIIlllIlIIllIIll());
            }
            for (String string : arrayList) {
                class_01412.lllIIIllIIIIlllIlIIllIIll(string, class_05312);
            }
            class_1981.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.scoreboard.teams.empty.success", arrayList.size(), class_05312.lllIIIllIIIIlllIlIIllIIll());
        }
    }

    protected void IllIIlllllllIIlIIlIIIIlIl(class_1969 class_19692, String string) {
        class_0141 class_01412 = this.lIlllIlllIIIIlIIlllIllIII();
        class_0693 class_06932 = this.lllIIIllIIIIlllIlIIllIIll(string, false);
        class_01412.lllIlIIlIIIlIlIIIllIlllIl(class_06932);
        class_1981.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.scoreboard.objectives.remove.success", string);
    }

    protected void lIlllIlllIIIIlIIlllIllIII(class_1969 class_19692) {
        class_0141 class_01412 = this.lIlllIlllIIIIlIIlllIllIII();
        Collection collection = class_01412.lllIIIllIIIIlllIlIIllIIll();
        if (collection.size() <= 0) {
            throw new class_1953("commands.scoreboard.objectives.list.empty", new Object[0]);
        }
        ChatComponentTranslation class_17902 = new ChatComponentTranslation("commands.scoreboard.objectives.list.count", collection.size());
        class_17902.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(EnumChatFormatting.DARK_GREEN);
        class_19692.lllIIIllIIIIlllIlIIllIIll(class_17902);
        for (class_0693 class_06932 : collection) {
            class_19692.lllIIIllIIIIlllIlIIllIIll(new ChatComponentTranslation("commands.scoreboard.objectives.list.entry", class_06932.lllIlIIlIIIlIlIIIllIlllIl(), class_06932.lIlllIlllIIIIlIIlllIllIII(), class_06932.IlIllllllIIlIIllllIIlIIIl().func_96636_a()));
        }
    }

    protected void lIIIIlIlIIlllllIIllIIlIII(class_1969 class_19692, String[] arrstring, int n) {
        class_0141 class_01412 = this.lIlllIlllIIIIlIIlllIllIII();
        String string = arrstring[n++];
        int n2 = class_0141.IIIllIllIIlIlIlIlIllllIIl(string);
        class_0693 class_06932 = null;
        if (arrstring.length == 4) {
            class_06932 = this.lllIIIllIIIIlllIlIIllIIll(arrstring[n++], false);
        }
        if (n2 < 0) {
            throw new class_1953("commands.scoreboard.objectives.setdisplay.invalidSlot", string);
        }
        class_01412.lllIIIllIIIIlllIlIIllIIll(n2, class_06932);
        if (class_06932 != null) {
            class_1981.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.scoreboard.objectives.setdisplay.successSet", class_0141.lllIlIIlIIIlIlIIIllIlllIl(n2), class_06932.lllIlIIlIIIlIlIIIllIlllIl());
        } else {
            class_1981.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.scoreboard.objectives.setdisplay.successCleared", class_0141.lllIlIIlIIIlIlIIIllIlllIl(n2));
        }
    }

    protected void llIIlllIllIllllIIIlIIIIII(class_1969 class_19692, String[] arrstring, int n) {
        class_0141 class_01412 = this.lIlllIlllIIIIlIIlllIllIII();
        if (arrstring.length > n) {
            String string;
            Map map;
            if ((map = class_01412.IlIllllllIIlIIllllIIlIIIl(string = class_1981.IlIIIIIllllllIIlllIllllll(class_19692, arrstring[n++]))).size() <= 0) {
                throw new class_1953("commands.scoreboard.players.list.player.empty", string);
            }
            ChatComponentTranslation class_17902 = new ChatComponentTranslation("commands.scoreboard.players.list.player.count", map.size(), string);
            class_17902.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(EnumChatFormatting.DARK_GREEN);
            class_19692.lllIIIllIIIIlllIlIIllIIll(class_17902);
            for (class_0678 class_06782 : map.values()) {
                class_19692.lllIIIllIIIIlllIlIIllIIll(new ChatComponentTranslation("commands.scoreboard.players.list.player.entry", class_06782.lllIlIIlIIIlIlIIIllIlllIl(), class_06782.IlIllllllIIlIIllllIIlIIIl().lIlllIlllIIIIlIIlllIllIII(), class_06782.IlIllllllIIlIIllllIIlIIIl().lllIlIIlIIIlIlIIIllIlllIl()));
            }
        } else {
            Collection collection = class_01412.lllIlIIlIIIlIlIIIllIlllIl();
            if (collection.size() <= 0) {
                throw new class_1953("commands.scoreboard.players.list.empty", new Object[0]);
            }
            ChatComponentTranslation class_17903 = new ChatComponentTranslation("commands.scoreboard.players.list.count", collection.size());
            class_17903.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(EnumChatFormatting.DARK_GREEN);
            class_19692.lllIIIllIIIIlllIlIIllIIll(class_17903);
            class_19692.lllIIIllIIIIlllIlIIllIIll(new class_0722(class_1981.lllIIIllIIIIlllIlIIllIIll(collection.toArray())));
        }
    }

    protected void llIIllIllIlIIlIIllIllllll(class_1969 class_19692, String[] arrstring, int n) {
        String string = arrstring[n - 1];
        String string2 = class_1981.IlIIIIIllllllIIlllIllllll(class_19692, arrstring[n++]);
        class_0693 class_06932 = this.lllIIIllIIIIlllIlIIllIIll(arrstring[n++], true);
        int n2 = string.equalsIgnoreCase("set") ? class_1981.lllIIIllIIIIlllIlIIllIIll(class_19692, arrstring[n++]) : class_1981.lllIIIllIIIIlllIlIIllIIll(class_19692, arrstring[n++], 1);
        class_0141 class_01412 = this.lIlllIlllIIIIlIIlllIllIII();
        class_0678 class_06782 = class_01412.lllIIIllIIIIlllIlIIllIIll(string2, class_06932);
        if (string.equalsIgnoreCase("set")) {
            class_06782.IlIllllllIIlIIllllIIlIIIl(n2);
        } else if (string.equalsIgnoreCase("add")) {
            class_06782.lllIIIllIIIIlllIlIIllIIll(n2);
        } else {
            class_06782.lllIlIIlIIIlIlIIIllIlllIl(n2);
        }
        class_1981.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.scoreboard.players.set.success", class_06932.lllIlIIlIIIlIlIIIllIlllIl(), string2, class_06782.lllIlIIlIIIlIlIIIllIlllIl());
    }

    protected void lllIIlIIIllllllIIIIlIlIlI(class_1969 class_19692, String[] arrstring, int n) {
        class_0141 class_01412 = this.lIlllIlllIIIIlIIlllIllIII();
        String string = class_1981.IlIIIIIllllllIIlllIllllll(class_19692, arrstring[n++]);
        class_01412.lllIlIIlIIIlIlIIIllIlllIl(string);
        class_1981.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.scoreboard.players.reset.success", string);
    }

    @Override
    public List lllIlIIlIIIlIlIIIllIlllIl(class_1969 class_19692, String[] arrstring) {
        if (arrstring.length == 1) {
            return class_1981.lllIIIllIIIIlllIlIIllIIll(arrstring, "objectives", "players", "teams");
        }
        if (arrstring[0].equalsIgnoreCase("objectives")) {
            if (arrstring.length == 2) {
                return class_1981.lllIIIllIIIIlllIlIIllIIll(arrstring, "list", "add", "remove", "setdisplay");
            }
            if (arrstring[1].equalsIgnoreCase("add")) {
                if (arrstring.length == 4) {
                    Set set = IScoreObjectiveCriteria.field_96643_a.keySet();
                    return class_1981.lllIIIllIIIIlllIlIIllIIll(arrstring, set);
                }
            } else if (arrstring[1].equalsIgnoreCase("remove")) {
                if (arrstring.length == 3) {
                    return class_1981.lllIIIllIIIIlllIlIIllIIll(arrstring, this.lllIIIllIIIIlllIlIIllIIll(false));
                }
            } else if (arrstring[1].equalsIgnoreCase("setdisplay")) {
                if (arrstring.length == 3) {
                    return class_1981.lllIIIllIIIIlllIlIIllIIll(arrstring, "list", "sidebar", "belowName");
                }
                if (arrstring.length == 4) {
                    return class_1981.lllIIIllIIIIlllIlIIllIIll(arrstring, this.lllIIIllIIIIlllIlIIllIIll(false));
                }
            }
        } else if (arrstring[0].equalsIgnoreCase("players")) {
            if (arrstring.length == 2) {
                return class_1981.lllIIIllIIIIlllIlIIllIIll(arrstring, "set", "add", "remove", "reset", "list");
            }
            if (!(arrstring[1].equalsIgnoreCase("set") || arrstring[1].equalsIgnoreCase("add") || arrstring[1].equalsIgnoreCase("remove"))) {
                if ((arrstring[1].equalsIgnoreCase("reset") || arrstring[1].equalsIgnoreCase("list")) && arrstring.length == 3) {
                    return class_1981.lllIIIllIIIIlllIlIIllIIll(arrstring, this.lIlllIlllIIIIlIIlllIllIII().lllIlIIlIIIlIlIIIllIlllIl());
                }
            } else {
                if (arrstring.length == 3) {
                    return class_1981.lllIIIllIIIIlllIlIIllIIll(arrstring, class_0220.IlIIlllllIIlIlIlllllIllll().llIIlIllIllllIlIIIIlIIlll());
                }
                if (arrstring.length == 4) {
                    return class_1981.lllIIIllIIIIlllIlIIllIIll(arrstring, this.lllIIIllIIIIlllIlIIllIIll(true));
                }
            }
        } else if (arrstring[0].equalsIgnoreCase("teams")) {
            if (arrstring.length == 2) {
                return class_1981.lllIIIllIIIIlllIlIIllIIll(arrstring, "add", "remove", "join", "leave", "empty", "list", "option");
            }
            if (arrstring[1].equalsIgnoreCase("join")) {
                if (arrstring.length == 3) {
                    return class_1981.lllIIIllIIIIlllIlIIllIIll(arrstring, this.lIlllIlllIIIIlIIlllIllIII().lIlllIlllIIIIlIIlllIllIII());
                }
                if (arrstring.length >= 4) {
                    return class_1981.lllIIIllIIIIlllIlIIllIIll(arrstring, class_0220.IlIIlllllIIlIlIlllllIllll().llIIlIllIllllIlIIIIlIIlll());
                }
            } else {
                if (arrstring[1].equalsIgnoreCase("leave")) {
                    return class_1981.lllIIIllIIIIlllIlIIllIIll(arrstring, class_0220.IlIIlllllIIlIlIlllllIllll().llIIlIllIllllIlIIIIlIIlll());
                }
                if (!(arrstring[1].equalsIgnoreCase("empty") || arrstring[1].equalsIgnoreCase("list") || arrstring[1].equalsIgnoreCase("remove"))) {
                    if (arrstring[1].equalsIgnoreCase("option")) {
                        if (arrstring.length == 3) {
                            return class_1981.lllIIIllIIIIlllIlIIllIIll(arrstring, this.lIlllIlllIIIIlIIlllIllIII().lIlllIlllIIIIlIIlllIllIII());
                        }
                        if (arrstring.length == 4) {
                            return class_1981.lllIIIllIIIIlllIlIIllIIll(arrstring, "color", "friendlyfire", "seeFriendlyInvisibles");
                        }
                        if (arrstring.length == 5) {
                            if (arrstring[3].equalsIgnoreCase("color")) {
                                return class_1981.lllIIIllIIIIlllIlIIllIIll(arrstring, EnumChatFormatting.getValidValues(true, false));
                            }
                            if (arrstring[3].equalsIgnoreCase("friendlyfire") || arrstring[3].equalsIgnoreCase("seeFriendlyInvisibles")) {
                                return class_1981.lllIIIllIIIIlllIlIIllIIll(arrstring, "true", "false");
                            }
                        }
                    }
                } else if (arrstring.length == 3) {
                    return class_1981.lllIIIllIIIIlllIlIIllIIll(arrstring, this.lIlllIlllIIIIlIIlllIllIII().lIlllIlllIIIIlIIlllIllIII());
                }
            }
        }
        return null;
    }

    protected List lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        Collection collection = this.lIlllIlllIIIIlIIlllIllIII().lllIIIllIIIIlllIlIIllIIll();
        ArrayList<String> arrayList = new ArrayList<String>();
        for (class_0693 class_06932 : collection) {
            if (bl && class_06932.IlIllllllIIlIIllllIIlIIIl().lllIlIIlIIIlIlIIIllIlllIl()) continue;
            arrayList.add(class_06932.lllIlIIlIIIlIlIIIllIlllIl());
        }
        return arrayList;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(String[] arrstring, int n) {
        return arrstring[0].equalsIgnoreCase("players") ? n == 2 : (!arrstring[0].equalsIgnoreCase("teams") ? false : n == 2 || n == 3);
    }
}

