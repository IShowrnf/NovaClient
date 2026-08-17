package nova.module.performance;

import nova.module.Module;

/**
 * Performance module. Integration hooks for Eaglercraft rendering will be
 * added here; this class deliberately does not alter server behavior.
 */
public final class FPSBooster extends Module {
    public FPSBooster() {
        super("FPS Booster", Category.PERFORMANCE);
    }
}
