public enum Brand {
    APPLE("Apple"){
        @Override
        void country() {
            System.out.println("USA");
        }
    },
    SAMSUNG("Samsung"){
        @Override
        void country() {
            System.out.println("South Korea");
        }
    },
    XIAOMI("Xiaomi"){
        @Override
        void country() {
            System.out.println("China");
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
