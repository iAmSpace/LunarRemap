package net.minecraft.client.settings;

import net.minecraft.util.MathHelper;

public enum Options {
    INVERT_MOUSE("INVERT_MOUSE", 0, "INVERT_MOUSE", 0, "options.invertMouse", false, true),
    SENSITIVITY("SENSITIVITY", 1, "SENSITIVITY", 1, "options.sensitivity", true, false),
    FOV("FOV", 2, "FOV", 2, "options.fov", true, false, 30.0f, 110.0f, 1.0f),
    GAMMA("GAMMA", 3, "GAMMA", 3, "options.gamma", true, false),
    SATURATION("SATURATION", 4, "SATURATION", 4, "options.saturation", true, false),
    RENDER_DISTANCE("RENDER_DISTANCE", 5, "RENDER_DISTANCE", 5, "options.renderDistance", true, false, 2.0f, 16.0f, 1.0f),
    VIEW_BOBBING("VIEW_BOBBING", 6, "VIEW_BOBBING", 6, "options.viewBobbing", false, true),
    ANAGLYPH("ANAGLYPH", 7, "ANAGLYPH", 7, "options.anaglyph", false, true),
    ADVANCED_OPENGL("ADVANCED_OPENGL", 8, "ADVANCED_OPENGL", 8, "options.advancedOpengl", false, true),
    IllIIIllIIIIlIlIlIllIIlll("FRAMERATE_LIMIT", 9, "FRAMERATE_LIMIT", 9, "options.framerateLimit", true, false, 0.0f, 260.0f, 5.0f),
    lIIIIlIlIIlllllIIllIIlIII("FBO_ENABLE", 10, "FBO_ENABLE", 10, "options.fboEnable", false, true),
    llIIlllIllIllllIIIlIIIIII("DIFFICULTY", 11, "DIFFICULTY", 11, "options.difficulty", false, false),
    llIIllIllIlIIlIIllIllllll("GRAPHICS", 12, "GRAPHICS", 12, "options.graphics", false, false),
    lllIIlIIIllllllIIIIlIlIlI("AMBIENT_OCCLUSION", 13, "AMBIENT_OCCLUSION", 13, "options.ao", false, false),
    IlIlllIIIIIIlIIllIIllIlll("GUI_SCALE", 14, "GUI_SCALE", 14, "options.guiScale", false, false),
    IlIlIIlIlIllIIlIlIIllIIIl("RENDER_CLOUDS", 15, "RENDER_CLOUDS", 15, "options.renderClouds", false, true),
    lllllIlllIIllIlIIlIIIllII("PARTICLES", 16, "PARTICLES", 16, "options.particles", false, false),
    IlIlIIlllIIlIllIIIlllllIl("CHAT_VISIBILITY", 17, "CHAT_VISIBILITY", 17, "options.chat.visibility", false, false),
    lIIlIIIIIlIlllIlIIlIlIlll("CHAT_COLOR", 18, "CHAT_COLOR", 18, "options.chat.color", false, true),
    lIlIlIIlIIIIlIIIIIlllIIII("CHAT_LINKS", 19, "CHAT_LINKS", 19, "options.chat.links", false, true),
    IlIIIlIIIIllIIIllIIIIIIll("CHAT_OPACITY", 20, "CHAT_OPACITY", 20, "options.chat.opacity", true, false),
    CHAT_LINKS_PROMPT("CHAT_LINKS_PROMPT", 21, "CHAT_LINKS_PROMPT", 21, "options.chat.links.prompt", false, true),
    SNOOPER_ENABLED("SNOOPER_ENABLED", 22, "SNOOPER_ENABLED", 22, "options.snooper", false, true),
    USE_FULLSCREEN("USE_FULLSCREEN", 23, "USE_FULLSCREEN", 23, "options.fullscreen", false, true),
    ENABLE_VSYNC("ENABLE_VSYNC", 24, "ENABLE_VSYNC", 24, "options.vsync", false, true),
    SHOW_CAPE("SHOW_CAPE", 25, "SHOW_CAPE", 25, "options.showCape", false, true),
    TOUCHSCREEN("TOUCHSCREEN", 26, "TOUCHSCREEN", 26, "options.touchscreen", false, true),
    CHAT_SCALE("CHAT_SCALE", 27, "CHAT_SCALE", 27, "options.chat.scale", true, false),
    CHAT_WIDTH("CHAT_WIDTH", 28, "CHAT_WIDTH", 28, "options.chat.width", true, false),
    CHAT_HEIGHT_FOCUSED("CHAT_HEIGHT_FOCUSED", 29, "CHAT_HEIGHT_FOCUSED", 29, "options.chat.height.focused", true, false),
    CHAT_HEIGHT_UNFOCUSED("CHAT_HEIGHT_UNFOCUSED", 30, "CHAT_HEIGHT_UNFOCUSED", 30, "options.chat.height.unfocused", true, false),
    MIPMAP_LEVELS("MIPMAP_LEVELS", 31, "MIPMAP_LEVELS", 31, "options.mipmapLevels", true, false, 0.0f, 4.0f, 1.0f),
    ANISOTROPIC_FILTERING("ANISOTROPIC_FILTERING", 32, "ANISOTROPIC_FILTERING", 32, "options.anisotropicFiltering", true, false, 1.0F, 16.0F, 0.0F, null, null) { protected float snapToStep(float f) { return (float) MathHelper.roundUpToPowerOfTwo((int)f); } },
    IlIlIIlllIllllllllIIIlIlI("FORCE_UNICODE_FONT", 33, "FORCE_UNICODE_FONT", 33, "options.forceUnicodeFont", false, true),
    llllIIIIlIIIlIIIIIIlIllll("STREAM_BYTES_PER_PIXEL", 34, "STREAM_BYTES_PER_PIXEL", 34, "options.stream.bytesPerPixel", true, false),
    llIIIIllIIIIIIIlIIIlIIIIl("STREAM_VOLUME_MIC", 35, "STREAM_VOLUME_MIC", 35, "options.stream.micVolumne", true, false),
    IIllIllIIllIIlllIIIlIlllI("STREAM_VOLUME_SYSTEM", 36, "STREAM_VOLUME_SYSTEM", 36, "options.stream.systemVolume", true, false),
    llllllIlIllllIlIlIlIIIIlI("STREAM_KBPS", 37, "STREAM_KBPS", 37, "options.stream.kbps", true, false),
    lIlIIllllIlIIIIllIIIIlIIl("STREAM_FPS", 38, "STREAM_FPS", 38, "options.stream.fps", true, false),
    llIlllIIllIlllIlIlIlIIIll("STREAM_COMPRESSION", 39, "STREAM_COMPRESSION", 39, "options.stream.compression", false, false),
    IIIIlIIlIIIllIIIIllIIIlII("STREAM_SEND_METADATA", 40, "STREAM_SEND_METADATA", 40, "options.stream.sendMetadata", false, true),
    lllIIIIIIlIlllIIlIlIIIllI("STREAM_CHAT_ENABLED", 41, "STREAM_CHAT_ENABLED", 41, "options.stream.chat.enabled", false, false),
    llIIlIIllIIllIlIIllIIllII("STREAM_CHAT_USER_FILTER", 42, "STREAM_CHAT_USER_FILTER", 42, "options.stream.chat.userFilter", false, false),
    lIlIlIIIIIIlIIllllIlIIllI("STREAM_MIC_TOGGLE_BEHAVIOR", 43, "STREAM_MIC_TOGGLE_BEHAVIOR", 43, "options.stream.micToggleBehavior", false, false),
    IllllIIIIlIIlIIIIlllIIIIl("FOG_FANCY", 44, "FOG", 999, "Fog", false, false),
    llllIlIIIIIIIIIlllIIlIIIl("FOG_START", 45, "", 999, "Fog Start", false, false),
    IIIIlIlIIlIIIIlIlllIlIIII("MIPMAP_TYPE", 46, "", 999, "Mipmap Type", false, false),
    lllIIIIlIlIIlIIlllIIIIIIl("LOAD_FAR", 47, "", 999, "Load Far", false, false),
    llIlIIlllIIIIIllIIlIlIIII("PRELOADED_CHUNKS", 48, "", 999, "Preloaded Chunks", false, false),
    IllIIIlllllIlIlllIlllllII("SMOOTH_FPS", 49, "", 999, "Smooth FPS", false, false),
    llIlllIlIIllIlIIIIllIIlIl("CLOUDS", 50, "", 999, "Clouds", false, false),
    lIIIllIIIIIllllIlIlIllIll("CLOUD_HEIGHT", 51, "", 999, "Cloud Height", true, false),
    lIIIlIIIlIlllIllIIIlIIIlI("TREES", 52, "", 999, "Trees", false, false),
    lIIlIlllIllIlIlllIIIIIIII("GRASS", 53, "", 999, "Grass", false, false),
    IIlIllIIlllllIIlIIllllIIl("RAIN", 54, "", 999, "Rain & Snow", false, false),
    IllllIIlIIIllIlllIlllIllI("WATER", 55, "", 999, "Water", false, false),
    IllIlIlIIIlllIIllIIIIlIll("ANIMATED_WATER", 56, "", 999, "Water Animated", false, false),
    IlIIIlIllIIIllIIIIlIIlIll("ANIMATED_LAVA", 57, "", 999, "Lava Animated", false, false),
    llllIIllIlIlllllllIIlIIlI("ANIMATED_FIRE", 58, "", 999, "Fire Animated", false, false),
    IlllIIlllllllIIllIlIllllI("ANIMATED_PORTAL", 59, "", 999, "Portal Animated", false, false),
    IlllIIIllllIIllIllIlIIlIl("AO_LEVEL", 60, "", 999, "Smooth Lighting Level", true, false),
    lllIIIlIIlIlIllIIIIIlIIll("LAGOMETER", 61, "", 999, "Lagometer", false, false),
    IIIlIlIllIlllllIlIllllllI("SHOW_FPS", 62, "", 999, "Show FPS", false, false),
    IIIIlIllIlIIIIIllllIIlllI("AUTOSAVE_TICKS", 63, "", 999, "Autosave", false, false),
    llllIlIIllIIlllllIIllIIll("BETTER_GRASS", 64, "", 999, "Better Grass", false, false),
    IlIlIllIIlIIIIlllIlIllIlI("ANIMATED_REDSTONE", 65, "", 999, "Redstone Animated", false, false),
    IlIIllIlIlIllIIIlIIlIlIIl("ANIMATED_EXPLOSION", 66, "", 999, "Explosion Animated", false, false),
    lIlIIllIllIIIIIlIllllIIIl("ANIMATED_FLAME", 67, "", 999, "Flame Animated", false, false),
    lIlllIIllIIIIIIlIlIIlIllI("ANIMATED_SMOKE", 68, "", 999, "Smoke Animated", false, false),
    llIIIlIlIlIIlIllIIIllIlIl("WEATHER", 69, "", 999, "Weather", false, false),
    lIIlIIlIllIlIIlIlIIlIlIlI("SKY", 70, "", 999, "Sky", false, false),
    llIIIIIlIIlIIIIllIIIlIIII("STARS", 71, "", 999, "Stars", false, false),
    lIlIlIIllIIIlllIllIIlIllI("SUN_MOON", 72, "", 999, "Sun & Moon", false, false),
    IlIIIIIllIlllIIIIlIIIllIl("VIGNETTE", 73, "", 999, "Vignette", false, false),
    lIIlIlIIllIIIlIIlIlIIIlII("CHUNK_UPDATES", 74, "", 999, "Chunk Updates", false, false),
    lIIIlIIllIllIIlIIlIIIllII("CHUNK_UPDATES_DYNAMIC", 75, "", 999, "Dynamic Updates", false, false),
    lIlIllIIllIIIIlllIlIlllIl("TIME", 76, "", 999, "Time", false, false),
    IlIIIlIIlllllIIIllIlIlIll("CLEAR_WATER", 77, "", 999, "Clear Water", false, false),
    lIIllllllllIlIllllllllIlI("SMOOTH_WORLD", 78, "", 999, "Smooth World", false, false),
    lIIIIllIIllIIIlIIIllIllII("DEPTH_FOG", 79, "", 999, "Depth Fog", false, false),
    lIIllIIlIIIlllIlllIIlIIlI("VOID_PARTICLES", 80, "", 999, "Void Particles", false, false),
    IllIIllIlIlllIllIllIlIIIl("WATER_PARTICLES", 81, "", 999, "Water Particles", false, false),
    IIIlIllllIIIlllllIllIlIII("RAIN_SPLASH", 82, "", 999, "Rain Splash", false, false),
    IIIIIllIlIllIlIlIIlIllIIl("PORTAL_PARTICLES", 83, "", 999, "Portal Particles", false, false),
    lIIllIlIIlIIlllllIlIIllIl("POTION_PARTICLES", 84, "", 999, "Potion Particles", false, false),
    lIIlllIIlIlIlIIIlIlllIIll("PROFILER", 85, "", 999, "Debug Profiler", false, false),
    IlIIlIIlllllIlIIlIlIlIlIl("DRIPPING_WATER_LAVA", 86, "", 999, "Dripping Water/Lava", false, false),
    lIlIIIllIIllIIlIllllllIll("BETTER_SNOW", 87, "", 999, "Better Snow", false, false),
    lIlIIlllllIlllllIlIIIllll("FULLSCREEN_MODE", 88, "", 999, "Fullscreen Mode", false, false),
    lllllllIlIIlIlIIIlIlIIlll("ANIMATED_TERRAIN", 89, "", 999, "Terrain Animated", false, false),
    llIllllIIIIIlIIlIlllIIlll("ANIMATED_ITEMS", 90, "", 999, "net.minecraft.init.Items Animated", false, false),
    IIIIlllIIlIllllllIllIIlll("SWAMP_COLORS", 91, "", 999, "Swamp Colors", false, false),
    IIIIIIlIIIIIIIIIIlIlIlIlI("RANDOM_MOBS", 92, "", 999, "Random Mobs", false, false),
    IllIlllIIIlllllIllIIlIlIl("SMOOTH_BIOMES", 93, "", 999, "Smooth Biomes", false, false),
    IllIIIIlIIlllllllllIlIlII("CUSTOM_FONTS", 94, "", 999, "Custom Fonts", false, false),
    IIIlllIlIIllIIlIlIllIlIIl("CUSTOM_COLORS", 95, "", 999, "Custom Colors", false, false),
    llllIIIlIlIlIlIIlIIIIIlIl("SHOW_CAPES", 96, "", 999, "Show Capes", false, false),
    llIIIlIIllIIllIllIIlIlllI("CONNECTED_TEXTURES", 97, "", 999, "Connected Textures", false, false),
    lIIIIlIlIlIIIlIIllIIlIlIl("AA_LEVEL", 98, "", 999, "Antialiasing", false, false),
    lllllIllllIIIIllIIlIlIlII("ANIMATED_TEXTURES", 99, "", 999, "Textures Animated", false, false),
    lIIllIlIllIlIlIIlIlIIIIll("NATURAL_TEXTURES", 100, "", 999, "Natural Textures", false, false),
    lIIllllIllIlllllIIllIllIl("CHUNK_LOADING", 101, "", 999, "Chunk Loading", false, false),
    IIIIIlllIIllllIlllIlllIIl("HELD_ITEM_TOOLTIPS", 102, "", 999, "Held Item Tooltips", false, false),
    llllIIllllIllIlllllIIlIlI("DROPPED_ITEMS", 103, "", 999, "Dropped net.minecraft.init.Items", false, false),
    IllIlIlIIIlIllIlIlIIlllII("LAZY_CHUNK_LOADING", 104, "", 999, "Lazy Chunk Loading", false, false),
    lIIIllIlIlIlIIIllIlIlIllI("CUSTOM_SKY", 105, "", 999, "Custom Sky", false, false),
    IIIlIllIlllIlIIIlIlIIllII("FAST_MATH", 106, "", 999, "Fast Math", false, false),
    lIIlIlllIIlIIIIlIlIIIIlll("FAST_RENDER", 107, "", 999, "Fast Render", false, false),
    IIIlIIllIIlIlIIlIIllIIIIl("TRANSLUCENT_BLOCKS", 108, "", 999, "Translucent net.minecraft.init.Blocks", false, false),
    IIIIlIIIllIIIlIIlIIIIIlll("DYNAMIC_FOV", 109, "", 999, "Dynamic FOV", false, false),
    lIIIIIlIllIllIlIlIIllllll("DYNAMIC_LIGHTS", 110, "", 999, "Dynamic Lights", false, false);
    private final boolean enumFloat;
    private final boolean enumBoolean;
    private final String enumString;
    private final float valueStep;
    private float valueMin;
    private float valueMax;

    public static Options getEnumOptions(int par0)
    {
        Options[] var1 = values();
        int var2 = var1.length;

        for (int var3 = 0; var3 < var2; ++var3) {
            Options var4 = var1[var3];
            if (var4.returnEnumOrdinal() == par0)
                return var4;
        }

        return null;
    }

    private Options(String p_i46401_1_, int p_i46401_2_, String par1Str, int par2, String par3Str, boolean par4, boolean par5) {
        this(p_i46401_1_, p_i46401_2_, par1Str, par2, par3Str, par4, par5, 0.0F, 1.0F, 0.0F);
    }

    private Options(String p_i46402_1_, int p_i46402_2_, String p_i45004_1_, int p_i45004_2_, String p_i45004_3_, boolean p_i45004_4_, boolean p_i45004_5_, float p_i45004_6_, float p_i45004_7_, float p_i45004_8_) {
        this.enumString = p_i45004_3_;
        this.enumFloat = p_i45004_4_;
        this.enumBoolean = p_i45004_5_;
        this.valueMin = p_i45004_6_;
        this.valueMax = p_i45004_7_;
        this.valueStep = p_i45004_8_;
    }

    public boolean getEnumFloat() {
        return this.enumFloat;
    }

    public boolean getEnumBoolean() {
        return this.enumBoolean;
    }

    public int returnEnumOrdinal() {
        return this.ordinal();
    }

    public String getEnumString() {
        return this.enumString;
    }

    public float getValueMax() {
        return this.valueMax;
    }

    public void setValueMax(float f) {
        this.valueMax = f;
    }

    public float normalizeValue(float f) {
        return MathHelper.clamp_float((this.snapToStepClamp(f) - this.valueMin) / (this.valueMax - this.valueMin), 0.0f, 1.0f);
    }

    public float denormalizeValue(float f) {
        return this.snapToStepClamp(this.valueMin + (this.valueMax - this.valueMin) * MathHelper.clamp_float(f, 0.0f, 1.0f));
    }

    public float snapToStepClamp(float f) {
        f = this.snapToStep(f);
        return MathHelper.clamp_float(f, this.valueMin, this.valueMax);
    }

    protected float snapToStep(float f) {
        if (this.valueStep > 0.0f) {
            f = this.valueStep * (float)Math.round(f / this.valueStep);
        }
        return f;
    }

    private Options(String p_i46403_1_, int p_i46403_2_, String p_i45005_1_, int p_i45005_2_, String p_i45005_3_, boolean p_i45005_4_, boolean p_i45005_5_, float p_i45005_6_, float p_i45005_7_, float p_i45005_8_, Object p_i45005_9_)
    {
        this(p_i46403_1_, p_i46403_2_, p_i45005_1_, p_i45005_2_, p_i45005_3_, p_i45005_4_, p_i45005_5_, p_i45005_6_, p_i45005_7_, p_i45005_8_);
    }

    Options(String x0, int x1, String x2, int x3, String x4, boolean x5, boolean x6, float x7, float x8, float x9, Object x10, Object x11)
    {
        this(x0, x1, x2, x3, x4, x5, x6, x7, x8, x9, x10);
    }
}

