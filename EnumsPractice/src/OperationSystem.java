public enum OperationSystem {
    IOS("OC для телефонов бренда Apple"),
    ANDROID("OC для телефонов бренда Samsung, Xiaomi");

    private String use;

    OperationSystem(String use) {
        this.use = use;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public String getUse() {
        return use;
    }

    @Override
    public String toString() {
        return "OperationSystem{" +
                "use='" + use + '\'' +
                '}';
    }
}
