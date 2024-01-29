public enum OperationSystem {
    IOS("операционная система только для бренда Apple."),
    ANDROID("операционная система для Samsung, Xiaomi, Meizu и т.п.");

    private String use;

    OperationSystem(String use) {
        this.use = use;
    }

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

    @Override
    public String toString() {
        return  use;
    }
}
