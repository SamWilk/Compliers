import org.antlr.v4.misc.Graph.Node;

class AST{

    class BuildAstVisitor extends LittleBaseVisitor<Node>
    {
        @Override public Node visitProgram(LittleParser.ProgramContext ctx)
        {
            IdNode top = new IdNode(ctx.id().getText());
            top.setRight(visit(ctx.pgm_body()));
            return top;
        }
        @Override public Node visitPgm_body(LittleParser.Pgm_bodyContext ctx)
        {
            Node node;
            Node current;
            if(!ctx.decl().isEmpty())
            {
                node = visit(ctx.decl());
                current = node;
                while(current.getRight() != null)
                {
                    current = current.getRight();
                }
                current.setRight(visit(ctx.func_declarations()));
            }
            else
            {
                node = visit(ctx.func_declarations());
            }
            return node;
        }
        @Override public Node visitDecl(LittleParser.DeclContext ctx)
        {
            if(ctx.isEmpty())
            {
                return null;
            }
            DeclNode node = new DeclNode("declare");
            if(!ctx.string_decl().isEmpty())
            {
                node.setLeft(visit(ctx.string_decl()));
            }
            else if (!ctx.var_decl().isEmpty())
            {
                node.setLeft(visit(ctx.var_decl()));
            }
            node.setRight(visit(ctx.decl()));
            return node;
        }
        @Override public Node visitString_decl(LittleParser.String_declContext ctx)
        {
            StringDeclNode node = new StringDeclNode(":=");
            node.setLeft(new IdNode(ctx.id().getText()));
            node.setRight(new StringLiteralNode(ctx.str().getText()));
            return node;
        }
        @Override public Node visitVar_decl(LittleParser.Var_declContext ctx)
        {
            VarDeclNode node = new VarDeclNode("variable");
            node.setLeft(visit(ctx.any_type()));
            node.setRight(visit(ctx.id_list()));
            return node;
        }
        @Override public Node visitId_list(LittleParser.Id_listContext ctx)
        {
            IdNode node = new IdNode(ctx.id().getText());
            node.setRight(visit(ctx.id_tail()));
            return node;
        }
        @Override public Node visitId_tail(LittleParser.Id_tailContext ctx)
        {
            if(ctx.isEmpty())
            {
                return null;
            }
            IdNode node = new IdNode(ctx.id().getText());
            node.setRight(visit(ctx.id_tail()));
            return node;
        }
        @Override public Node visitAny_type(LittleParser.Any_typeContext ctx)
        {
            return new TypeNode(ctx.getText());
        }
        
        @Override public Node visitFunc_declarations(LittleParser.Func_declarationsContext ctx)
        {
            if(ctx.isEmpty())
            {
                return null;
            }
            FuncListNode node = new FuncListNode("function declaration");
            node.setLeft(visit(ctx.func_decl()));
            node.setRight(visit(ctx.func_declarations()));
            return node;
        }
        @Override public Node visitFunc_decl(LittleParser.Func_declContext ctx)
        {
            FuncDeclNode node = new FuncDeclNode(ctx.id().getText());
            node.setParams(visit(ctx.param_decl_list()));
            node.setLeft(visit(ctx.any_type()));
            node.setRight(visit(ctx.func_body()));
            return node;
        }
        @Override public Node visitParam_decl_list(LittleParser.Param_decl_listContext ctx)
        {
            if(ctx.isEmpty())
            {
                return null;
            }
            Node node = visit(ctx.param_decl());
            node.setRight(visit(ctx.param_decl_tail()));
            return node;
        }
        @Override public Node visitParam_decl(LittleParser.Param_declContext ctx)
        {
            return new ParamsNode(ctx.id().getText(), ctx.var_type().getText());
        }
        @Override public Node visitParam_decl_tail(LittleParser.Param_decl_tailContext ctx)
        {
            if(ctx.isEmpty())
            {
                return null;
            }
            Node node = visit(ctx.param_decl());
            node.setRight(visit(ctx.param_decl_tail()));
            return node;
        }
        @Override public Node visitFunc_body(LittleParser.Func_bodyContext ctx)
        {
            FuncBodyNode node = new FuncBodyNode("body");
            node.setLeft(visit(ctx.decl()));
            node.setRight(visit(ctx.stmt_list()));
            return node;
        }
        @Override public Node visitStmt_list(LittleParser.Stmt_listContext ctx)
        {
            if(ctx.isEmpty())
            {
                return null;
            }
            StmtListNode node = new StmtListNode("stmt");
            node.setLeft(visit(ctx.stmt()));
            node.setRight(visit(ctx.stmt_list()));
            return node;
        }
        @Override public Node visitStmt(LittleParser.StmtContext ctx)
        {
            return visit(ctx.base_stmt());
        }
        @Override public Node visitBase_stmt(LittleParser.Base_stmtContext ctx)
        {
            if(!ctx.assign_stmt().isEmpty())
            {
                return visit(ctx.assign_stmt());
            }
            else if(!ctx.write_stmt().isEmpty())
            {
                return visit(ctx.write_stmt());
            }
            else if(!ctx.read_stmt().isEmpty())
            {
                return visit(ctx.read_stmt());
            }
            else
            {
                return visit(ctx.return_stmt());
            }
        }
        @Override public Node visitAssign_stmt(LittleParser.Assign_stmtContext ctx)
        {
            return visit(ctx.assign_expr());
        }
        @Override public Node visitAssign_expr(LittleParser.Assign_exprContext ctx)
        {
            AssignNode node = new AssignNode(":=");
            node.setLeft(new IdNode(ctx.id().getText()));
            node.setRight(visit(ctx.expr()));
            return node;
        }
        @Override public Node visitFloat(LittleParser.FloatContext ctx)
        {
            return new FloatLiteralNode(Double.parseDouble(ctx.getText()));
            
        }
        @Override public Node visitInt(LittleParser.IntContext ctx)
        {
            return new IntLiteralNode(Integer.parseInt(ctx.getText()));
        }
        @Override public Node visitId(LittleParser.IdContext ctx)
        {
            return new IdNode(ctx.getText());
        }
        @Override public Node visitPrimary(LittleParser.PrimaryContext ctx)
        {
            return visit(ctx);
        }
        @Override public Node visitExpr(LittleParser.ExprContext ctx)
        {
            Node node;
            if(!ctx.expr_prefix().isEmpty())
            {
                node = visit(ctx.expr_prefix());
                Node current = node;
                while(current.getRight() != null)
                {
                    current = current.getRight();
                }
                current.setRight(visit(ctx.factor()));
            }
            else
            {
                node = visit(ctx.factor());
            }
            return node;
        }
        @Override public Node visitExpr_prefix(LittleParser.Expr_prefixContext ctx)
        {
            if(ctx.isEmpty())
            {
                return null;
            }
            AddopNode node = new AddopNode(ctx.addop().getText());
            node.setLeft(visit(ctx.factor()));
            var parent = visit(ctx.expr_prefix());
            if(parent != null)
            {
                parent.setRight(node);
                return parent;
            }
            return node;
        }
        @Override public Node visitFactor(LittleParser.FactorContext ctx)
        {
            Node node;
            if(!ctx.factor_prefix().isEmpty())
            {
                node = visit(ctx.factor_prefix());
                Node current = node;
                while(current.getRight() != null)
                {
                    current = current.getRight();
                }
                current.setRight(visit(ctx.postfix_expr()));
            }
            else
            {
                node = visit(ctx.postfix_expr());
            }
            return node;
        }
        @Override public Node visitFactor_prefix(LittleParser.Factor_prefixContext ctx)
        {
            if(ctx.isEmpty())
            {
                return null;
            }
            
            MulopNode node = new MulopNode(ctx.mulop().getText());
            node.setLeft(visit(ctx.postfix_expr()));
            var parent = visit(ctx.factor_prefix());
            if(parent != null)
            {
                parent.setRight(node);
                return parent;
            }
            return node;
        }
        @Override public Node visitPostfix_expr(LittleParser.Postfix_exprContext ctx)
        {
            return visit(ctx);
        }
        @Override public Node visitCall_expr(LittleParser.Call_exprContext ctx)
        {
            CallExprNode node = new CallExprNode("call_expr");
            node.setLeft(new IdNode(ctx.id().getText()));
            node.setRight(visit(ctx.expr_list()));
            return node;
        }
        @Override public Node visitExpr_list(LittleParser.Expr_listContext ctx)
        {
            if(ctx.isEmpty())
            {
                return null;
            }
            ExprListNode node = new ExprListNode("list of expressions");
            node.setLeft(visit(ctx.expr()));
            node.setRight(visit(ctx.expr_list_tail()));
            return node;
        }
        @Override public Node visitExpr_list_tail(LittleParser.Expr_list_tailContext ctx)
        {
            if(ctx.isEmpty())
            {
                return null;
            }
            ExprListNode node = new ExprListNode("list of expressions");
            node.setLeft(visit(ctx.expr()));
            node.setRight(visit(ctx.expr_list_tail()));
            return node;
        }
    }
   
    abstract class Node 
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
    abstract class InfixNode<T> extends Node
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
    class AddopNode extends InfixNode<String>
    {
        public AddopNode(String s)
        {
            super(s);
        }
    }
    class MulopNode extends InfixNode<String>
    {
        public MulopNode(String s)
        {
            super(s);
        }   
    }
    class AssignNode extends InfixNode<String>
    {
        public AssignNode(String s)
        {
            super(s);
        }
    }
    class FloatLiteralNode extends InfixNode<Double>
    {
        public FloatLiteralNode(double value)
        {
            super(value);
        }
    }
    class IntLiteralNode extends InfixNode<Integer>
    {
        public IntLiteralNode(int value)
        {
            super(value);
        }
    }
    class StringLiteralNode extends InfixNode<String>
    {
        public StringLiteralNode(String value)
        {
            super(value);
        }
    }
    class IdNode extends InfixNode<String>
    {
        public IdNode(String name)
        {
            super(name);
        }
        
    }
    class ExprNode extends InfixNode<String>
    {
        public ExprNode(String s)
        {
            super(s);
        }
    }
    class StringDeclNode extends InfixNode<String>
    {
        public StringDeclNode(String s)
        {
            super(s);
        }
    }
    class DeclNode extends InfixNode<String>
    {
        public DeclNode(String s)
        {
            super(s);
        }
    }
    class VarDeclNode extends InfixNode<String>
    {
        public VarDeclNode(String value)
        {
            super(value);
        }
    }
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
    class FuncListNode extends InfixNode<String>
    {
        public FuncListNode (String value)
        {
            super(value);
        }   
    }
    class FuncBodyNode extends InfixNode<String>
    {
        public FuncBodyNode(String value)
        {
            super(value);
        }
    }
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
    class TypeNode extends InfixNode<String>
    {
        public TypeNode (String value)
        {
            super(value);
        }
    }
    class StmtListNode extends InfixNode<String>
    {
        public StmtListNode (String value)
        {
            super(value);
        }
    }
    class StmtNode extends InfixNode<String>
    {
        public StmtNode(String value)
        {
            super(value);
        }
    }
    class CallExprNode extends InfixNode<String>
    {
        public CallExprNode(String value)
        {
            super(value);
        }
    }
    class ExprListNode extends InfixNode<String>
    {
        public ExprListNode (String value)
        {
            super(value);
        }
    }
}
