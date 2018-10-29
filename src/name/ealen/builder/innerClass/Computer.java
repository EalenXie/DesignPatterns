package name.ealen.builder.innerClass;

/**
 * 内部类 builder模式
 * 替换掉getter/setter方法 初始化实例对象
 */
public class Computer {
    //显示器
    private String display;
    //CPU
    private String cpu;
    //内存条
    private String memory;
    //硬盘
    private String disk;
    //主板
    private String mainboard;
    //键盘
    private String keyboard;
    //鼠标
    private String mouse;
    //机箱
    private String crate;

    private Computer(Builder builder) {
        this.display = builder.display;
        this.cpu = builder.cpu;
        this.memory = builder.memory;
        this.disk = builder.disk;
        this.mainboard = builder.mainboard;
        this.keyboard = builder.keyboard;
        this.mouse = builder.mouse;
        this.crate = builder.crate;

    }

    public static class Builder {
        private String display;
        private String cpu;
        private String memory;
        private String disk;
        private String mainboard;
        private String keyboard;
        private String mouse;
        private String crate;


        public Builder withDisplay(String display) {
            this.display = display;
            return this;
        }

        public Builder withCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder withMemory(String memory) {
            this.memory = memory;
            return this;
        }

        public Builder withDisk(String disk) {
            this.disk = disk;
            return this;
        }

        public Builder withMainboard(String mainboard) {
            this.mainboard = mainboard;
            return this;
        }

        public Builder withKeyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }

        public Builder withMouse(String mouse) {
            this.mouse = mouse;
            return this;
        }

        public Builder withCrate(String crate) {
            this.crate = crate;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "display='" + display + '\'' +
                ", cpu='" + cpu + '\'' +
                ", memory='" + memory + '\'' +
                ", disk='" + disk + '\'' +
                ", mainboard='" + mainboard + '\'' +
                ", keyboard='" + keyboard + '\'' +
                ", mouse='" + mouse + '\'' +
                ", crate='" + crate + '\'' +
                '}';
    }
}

