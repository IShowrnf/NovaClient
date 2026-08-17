package nova.module;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import nova.module.combat.FastCrystal;
import nova.module.network.NetworkOptimizer;
import nova.module.performance.CrystalOptimizer;
import nova.module.performance.FPSBooster;

/** Registry and lifecycle manager for NOVA modules. */
public final class ModuleManager {
    private final List<Module> modules = new ArrayList<>();
    private boolean defaultsRegistered;

    public void register(Module module) {
        if (module == null) {
            throw new IllegalArgumentException("module cannot be null");
        }
        modules.add(module);
    }

    public void registerDefaults() {
        if (defaultsRegistered) {
            return;
        }

        register(new FPSBooster());
        register(new CrystalOptimizer());
        register(new FastCrystal());
        register(new NetworkOptimizer());
        defaultsRegistered = true;
    }

    public Module get(String name) {
        for (Module module : modules) {
            if (module.getName().equalsIgnoreCase(name)) {
                return module;
            }
        }
        return null;
    }

    public List<Module> getModules() {
        return Collections.unmodifiableList(modules);
    }
}
