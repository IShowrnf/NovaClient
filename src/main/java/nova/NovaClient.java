package nova;

import nova.module.ModuleManager;

/**
 * NOVA Client entry point.
 *
 * This core is intentionally independent from Minecraft classes so the
 * client architecture can be integrated into the Eaglercraft source cleanly.
 */
public final class NovaClient {
    public static final String NAME = "NOVA";
    public static final String VERSION = "0.1.0-dev";

    private static final NovaClient INSTANCE = new NovaClient();

    private final ModuleManager moduleManager = new ModuleManager();
    private boolean initialized;

    private NovaClient() {
    }

    public static NovaClient getInstance() {
        return INSTANCE;
    }

    public void initialize() {
        if (initialized) {
            return;
        }

        moduleManager.registerDefaults();
        initialized = true;
    }

    public ModuleManager getModuleManager() {
        return moduleManager;
    }

    public boolean isInitialized() {
        return initialized;
    }
}
