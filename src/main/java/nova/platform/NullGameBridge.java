package nova.platform;

/** Safe placeholder until a Minecraft 1.12 adapter is integrated. */
public final class NullGameBridge implements GameBridge {
    @Override
    public int getFps() { return 0; }

    @Override
    public int getPing() { return -1; }

    @Override
    public boolean isWorldLoaded() { return false; }
}
