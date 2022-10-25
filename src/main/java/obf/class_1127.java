package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.DisplayMode
 */
import java.util.Comparator;
import org.lwjgl.opengl.DisplayMode;

final class class_1127
implements Comparator {
    class_1127() {
    }

    public int compare(Object object, Object object2) {
        DisplayMode displayMode = (DisplayMode)object;
        DisplayMode displayMode2 = (DisplayMode)object2;
        return displayMode.getWidth() != displayMode2.getWidth() ? displayMode2.getWidth() - displayMode.getWidth() : (displayMode.getHeight() != displayMode2.getHeight() ? displayMode2.getHeight() - displayMode.getHeight() : 0);
    }
}

