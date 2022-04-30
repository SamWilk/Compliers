public abstract class Node 
{
    public Node Left;
    public Node Right;
    public void setLeft(Node node)
    {
        this.Left = node;
    }
    public Node getLeft()
    {
        return this.Left;
    }
    public void setRight(Node node)
    {
        this.Right = node;
    }
    public Node getRight()
    {
        return this.Right;
    }
}