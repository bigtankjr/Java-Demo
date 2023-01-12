public interface Chain {

    public abstract void process(Dimension dimension);
    public abstract void setNext(Chain c);
}
