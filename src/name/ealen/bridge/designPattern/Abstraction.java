package name.ealen.bridge.designPattern;

public abstract class Abstraction {

    private Implementor implementor;

    public Implementor getImplementor() {
        return implementor;
    }

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public void operation() {
        implementor.operation();
    }


    public abstract void ownOperation();
}