package nova.module.combat;

import nova.module.Module;

/**
 * Client-side responsiveness hooks for crystal interactions.
 * Server-side validation and limits remain authoritative.
 */
public final class FastCrystal extends Module {
    public FastCrystal() {
        super("Fast Crystal", Category.COMBAT);
    }
}
