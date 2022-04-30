public abstract class InfixNode<T> extends Node
{
    public T Value;
    
    public InfixNode(T value)
    {
        this.Value = value;
    }
    public void setValue (T value)
    {
        this.Value = value;
    }
    public T getValue()
    {
        return this.Value;
    }
}
