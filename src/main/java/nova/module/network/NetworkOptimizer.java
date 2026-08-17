package nova.module.network;

import nova.module.Module;

/** Client-side networking efficiency hooks and latency telemetry. */
public final class NetworkOptimizer extends Module {
    public NetworkOptimizer() {
        super("Network Optimizer", Category.NETWORK);
    }
}
