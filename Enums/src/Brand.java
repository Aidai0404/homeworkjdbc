public enum Brand {
    APPLE("Apple"){
        @Override
        void country() {
            System.out.println("Бренд был основан в США");
        }
    },
    SAMSUNG("Samsung"){
        @Override
        void country() {
            System.out.println("Бренд был основан в Южной Корее");
        }
    },
    XIAOMI("Xiaomi"){
        @Override
        void country() {
            System.out.println("Бренд был основан в КНР");
        }
    };

    private String name;

    Brand(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void country();

    @Override
    public String toString() {
        return "Brand{" +
                "name='" + name + '\'' +
                '}';
    }
}
