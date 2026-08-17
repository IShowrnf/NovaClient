package nova.config;

/** Base typed setting used by NOVA modules and future GUI controls. */
public abstract class Setting<T> {
    private final String name;
    private T value;

    protected Setting(String name, T defaultValue) {
        this.name = name;
        this.value = defaultValue;
    }

    public final String getName() { return name; }
    public final T getValue() { return value; }

    public final void setValue(T value) {
        this.value = value;
    }
}
