public interface Chain {
    public abstract void setNext(Chain c);
    public abstract void process(Dimension request);

}
