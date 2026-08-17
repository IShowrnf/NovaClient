package nova.platform;

/**
 * Boundary between version-independent NOVA code and the Minecraft/Eaglercraft
 * implementation. A 1.12 adapter will implement this interface when the
 * permitted game source is available.
 */
public interface GameBridge {
    int getFps();
    int getPing();
    boolean isWorldLoaded();
}
