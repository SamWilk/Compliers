public abstract class AstVisitor<T> 
{
    public abstract T Visit(ProgramNode node);
    public abstract T Visit(AddopNode node);
    public abstract T Visit(MulopNode node);
    public abstract T Visit(IdNode node);
    public abstract T Visit(FuncListNode node);
    public abstract T Visit(FuncDeclNode node);
    public abstract T Visit(FuncBodyNode node);
    public abstract T Visit(FloatLiteralNode node);
    public abstract T Visit(IntLiteralNode node);
    public abstract T Visit(StringLiteralNode node);
    public abstract T Visit(StringDeclNode node);
    public abstract T Visit(VarDeclNode node);
    public abstract T Visit(TypeNode node);
    public abstract T Visit(AssignNode node);
    public abstract T Visit(ExprListNode node);
    public abstract T Visit(CallExprNode node);
    public abstract T Visit(DeclNode node);
    public abstract T Visit(ExprNode node);
    public abstract T Visit(ParamsNode node);
    public abstract T Visit(ReadNode node);
    public abstract T Visit(ReturnNode node);
    public abstract T Visit(StmtListNode node);
    public abstract T Visit(StmtNode node);
    public abstract T Visit(WriteNode node);

    public T Visit(Node node)
    {
        if(node instanceof AddopNode)
        {
            return Visit((AddopNode) node);
        }
        else if (node instanceof ProgramNode)
        {
            return Visit((ProgramNode) node);
        }
        else if (node instanceof MulopNode)
        {
            return Visit((MulopNode) node);
        }
        else if (node instanceof IdNode)
        {
            return Visit((IdNode) node);
        }
        else if (node instanceof FuncListNode)
        {
            return Visit((FuncListNode) node);
        }
        else if (node instanceof FuncDeclNode)
        {
            return Visit((FuncDeclNode) node);
        }
        else if (node instanceof FuncBodyNode)
        {
            return Visit((FuncBodyNode) node);
        }
        else if (node instanceof FloatLiteralNode)
        {
            return Visit((FloatLiteralNode) node);
        }
        else if (node instanceof IntLiteralNode)
        {
            return Visit((IntLiteralNode) node);
        }
        else if (node instanceof StringLiteralNode)
        {
            return Visit((StringLiteralNode) node);
        }
        else if (node instanceof StringDeclNode)
        {
            return Visit((StringDeclNode) node);
        }
        else if (node instanceof VarDeclNode)
        {
            return Visit((VarDeclNode) node);
        }
        else if (node instanceof TypeNode)
        {
            return Visit((TypeNode) node);
        }
        else if (node instanceof AssignNode)
        {
            return Visit((AssignNode) node);
        }
        else if (node instanceof ExprListNode)
        {
            return Visit((ExprListNode) node);
        }
        else if (node instanceof CallExprNode)
        {
            return Visit((CallExprNode) node);
        }
        else if (node instanceof DeclNode)
        {
            return Visit((DeclNode) node);
        }
        else if (node instanceof ExprNode)
        {
            return Visit((ExprNode) node);
        }
        else if (node instanceof ParamsNode)
        {
            return Visit((ParamsNode) node);
        }
        else if (node instanceof ReadNode)
        {
            return Visit((ReadNode) node);
        }
        else if (node instanceof ReturnNode)
        {
            return Visit((ReturnNode) node);
        }
        else if (node instanceof StmtListNode)
        {
            return Visit((StmtListNode) node);
        }
        else if (node instanceof StmtNode)
        {
            return Visit((StmtNode) node);
        }
        else if (node instanceof WriteNode)
        {
            return Visit((WriteNode) node);
        }
        else
        {
            return null;
        }
    }
}
