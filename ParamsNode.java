
class ParamsNode extends InfixNode<String>
{
    public String Type;
    public ParamsNode(String value, String type)
    {
        super(value);
        this.Type = type;
    }
    public void setType(String type)
    {
        this.Type = type;
    }
    public String getType()
    {
        return this.Type;
    }
}