
class FuncDeclNode extends InfixNode<String>
{
    public Node params;
    public FuncDeclNode(String value)
    {
        super(value);
    }
    public void setParams(Node node)
    {
        this.params = node;
    }
    public Node getParams()
    {
        return this.params;
    }
}