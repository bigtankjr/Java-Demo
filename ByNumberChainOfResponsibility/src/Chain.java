public interface Chain {
    public abstract void process(Boat request);
    public abstract void setNext(Chain c);
}
