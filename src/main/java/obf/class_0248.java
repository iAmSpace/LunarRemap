package obf;

import com.google.common.collect.Maps;
import java.util.Map;

public enum class_0248 {
    SHOW_TEXT("show_text", true),
    SHOW_ACHIEVEMENT("show_achievement", true),
    SHOW_ITEM("show_item", true);

    private static final Map<String, class_0248> nameMapping = Maps.newHashMap();
    private final boolean allowedInChat;
    private final String canonicalName;

    class_0248(String p_i45157_3_, boolean p_i45157_4_) {
        this.canonicalName = p_i45157_3_;
        this.allowedInChat = p_i45157_4_;
    }

    public boolean shouldAllowInChat() {
        return this.allowedInChat;
    }

    public String getCanonicalName() {
        return this.canonicalName;
    }

    public static class_0248 getValueByCanonicalName(String p_150684_0_) {
        return nameMapping.get(p_150684_0_);
    }

    static {
        class_0248[] var0 = values();
        int var1 = var0.length;

        for (int var2 = 0; var2 < var1; ++var2) {
            class_0248 var3 = var0[var2];
            nameMapping.put(var3.getCanonicalName(), var3);
        }
    }
}

