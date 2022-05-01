import java.lang.invoke.WrongMethodTypeException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class GenerateAssemblyVisitor extends AstVisitor<String>
{
    public SymbolTable symbol_table = new SymbolTable("Global");
    public LinkedHashMap<String, Boolean> registers = new LinkedHashMap<>();
    @Override public String Visit(ProgramNode node)
    {
        registers.put("r0", false);
        registers.put("r1", false);
        registers.put("r2", false);
        registers.put("r3", false);
        return Visit(node.getRight()) + "\nsys halt\nend";
    }
    @Override public String Visit(AddopNode node)
    {
        String final_str = "";

        String reg1 = "";
        String reg2 = "";
        String reg_top = "";
        for (int i = 0; i < 4; i++)
        {
            if(reg_top == "")
            {
                String key = "r" + i;
                reg_top = registers.get(key) ? key : "";
                
            }
        }
        
        
        for (int i = 0; i < 4; i++)
        {
            if(reg1 == "")
            {
                String key = "r" + i;
                reg1 = !registers.get(key) ? key : "";
                if(reg1.equals(key))
                {
                    registers.replace(key, true);
                } 
            }
            else if (reg2 == "")
            {
                String key = "r" + i;
                reg2 = !registers.get(key) ? key : "";
                if(reg2.equals(key))
                {
                    registers.replace(key, true);
                } 
            }
            else
            {
                break;
            }
        }
        final_str += "move " + Visit(node.getLeft()) + " " + reg1 + "\n";
        final_str += "move " + Visit(node.getRight()) + " " + reg2 + "\n";
        if(node.Value.equals("+"))
        {
            final_str += "add";
        }
        else
        {
            final_str += "sub";
        }
        if(node.getLeft() instanceof IntLiteralNode || node.getRight() instanceof IntLiteralNode)
        {
            final_str += "i ";
        }
        else if (node.getLeft() instanceof FloatLiteralNode || node.getRight() instanceof FloatLiteralNode)
        {
            final_str += "r ";
        }
        else if (symbol_table.symbolTable.get(Visit(node.getLeft())).type.equals("INT") 
            || symbol_table.symbolTable.get(Visit(node.getRight())).type.equals("INT"))
        {
            final_str += "i ";
        }
        else if (symbol_table.symbolTable.get(Visit(node.getLeft())).type.equals("FLOAT") 
            || symbol_table.symbolTable.get(Visit(node.getRight())).type.equals("FLOAT"))
        {
            final_str += "r ";
        }
        final_str += reg1 + " " + reg2 + "\n";
        final_str += "move " + reg2 + " " + reg_top + "\n";
        registers.replace(reg1, false);
        registers.replace(reg2, false);
        return final_str;
        
    }
    @Override public String Visit(MulopNode node)
    {
        String final_str = "";

        String reg1 = "";
        String reg2 = "";
        String reg_top = "";
        for (int i = 0; i < 4; i++)
        {
            if(reg_top == "")
            {
                String key = "r" + i;
                reg_top = registers.get(key) ? key : "";
            }
        }
        
        
        for (int i = 0; i < 4; i++)
        {
            if(reg1 == "")
            {
                String key = "r" + i;
                reg1 = !registers.get(key) ? key : "";
                if(reg1.equals(key))
                {
                    registers.replace(key, true);
                } 
            }
            else if (reg2 == "")
            {
                String key = "r" + i;
                reg2 = !registers.get(key) ? key : "";
                if(reg2.equals(key))
                {
                    registers.replace(key, true);
                } 
            }
            else
            {
                break;
            }
        }
        final_str += "move " + Visit(node.getLeft()) + " " + reg1 + "\n";
        final_str += "move " + Visit(node.getRight()) + " " + reg2 + "\n";

        if(node.Value.equals("*"))
        {
            final_str += "mul";
        }
        else
        {
            final_str += "div";
        }
        if(node.getLeft() instanceof IntLiteralNode || node.getRight() instanceof IntLiteralNode)
        {
            final_str += "i ";
        }
        else if (node.getLeft() instanceof FloatLiteralNode || node.getRight() instanceof FloatLiteralNode)
        {
            final_str += "r ";
        }
        else if (symbol_table.symbolTable.get(Visit(node.getLeft())).type.equals("INT") 
            || symbol_table.symbolTable.get(Visit(node.getRight())).type.equals("INT"))
        {
            final_str += "i ";
        }
        else if (symbol_table.symbolTable.get(Visit(node.getLeft())).type.equals("FLOAT") 
            || symbol_table.symbolTable.get(Visit(node.getRight())).type.equals("FLOAT"))
        {
            final_str += "r ";
        }
        final_str += reg1 + " " + reg2 + "\n";
        final_str += "move " + reg2 + " " + reg_top + "\n";
        registers.replace(reg1, false);
        registers.replace(reg2, false);
        return final_str;
    }
    @Override public String Visit(IdNode node)
    {
        return node.Value;
    }
    @Override public String Visit(FuncListNode node)
    {
        String final_str = Visit(node.getLeft());
        final_str += Visit(node.getRight());
        return final_str;
    }
    @Override public String Visit(FuncDeclNode node)
    {
        String final_str = "\nlabel " + node.Value + "\n";
        final_str += Visit(node.getRight());
        return final_str;

    }
    @Override public String Visit(FuncBodyNode node)
    {
        if (node.getLeft() == null)
        {
            return Visit(node.getRight());
        }
        return Visit(node.getLeft()) + Visit(node.getRight());
    }
    @Override public String Visit(FloatLiteralNode node)
    {
        return node.Value.toString();
    }
    @Override public String Visit(IntLiteralNode node)
    {
        return node.Value.toString();
    }
    @Override public String Visit(StringLiteralNode node)
    {
        return node.Value;
    }
    @Override public String Visit(StringDeclNode node)
    {
        symbol_table.addSymbol(Visit(node.getLeft()), new SymbolAttributes("STRING", Visit(node.getRight())));
        return "str " + Visit(node.getLeft()) + " " + Visit(node.getRight()) + "\n";
    }
    @Override public String Visit(VarDeclNode node)
    {
        String final_str = "";
        IdNode current = (IdNode) node.getRight();
        String type = Visit(node.getLeft());
        while(current != null)
        {
            symbol_table.addSymbol(Visit(current), new SymbolAttributes(type, ""));
            final_str += "var " + current.Value + "\n";
            current = (IdNode) current.getRight();
        }
        return final_str;
    }
    @Override public String Visit(TypeNode node)
    {
        return node.Value;
    }
    @Override public String Visit(AssignNode node)
    {
        String reg = "";
        String final_str = "";
        for (int i = 0; i < 4; i++)
        {
            if(reg == "")
            {
                String key = "r" + i;
                reg = !registers.get(key) ? key : "";
                if(reg.equals(key))
                {
                    registers.replace(key, true);
                }
            }
            else
            {
                break;
            }
        }
        if(node.getRight() instanceof AddopNode || node.getRight() instanceof MulopNode)
        {
            final_str += Visit(node.getRight());
            final_str += "move " + reg + " " +  Visit(node.getLeft()) + "\n";
        }
        else
        {
            final_str += "move " + Visit(node.getRight()) + " " + reg + '\n';
            final_str += "move " + reg + " " + Visit(node.getLeft()) + "\n";
        }
        registers.replace(reg, false);
        return final_str;
    }
    @Override public String Visit(ExprListNode node)
    {
        return Visit(node.getLeft()) + Visit(node.getRight());
    }
    @Override public String Visit(CallExprNode node)
    {
        return "";
    }
    @Override public String Visit(DeclNode node)
    {
        String final_str = "";
        String add_on = Visit(node.getLeft());
        final_str += add_on;
        final_str += Visit(node.getRight());
        return final_str;
    }
    @Override public String Visit(ExprNode node)
    {
        return "";
    }
    @Override public String Visit(ParamsNode node)
    {
        return "";
    }
    @Override public String Visit(ReadNode node)
    {
        String final_str = "";
        IdNode current = (IdNode) node.getRight();
        while(current != null)
        {
            SymbolAttributes attr = symbol_table.symbolTable.get(current.Value);
            if (attr.type.equals("INT"))
            {
                final_str += "sys readi " + current.Value + "\n";
            }
            else
            {
                final_str += "sys readr " + current.Value + "\n";
            }
            current = (IdNode) current.getRight();
        }
        return final_str;
    }
    @Override public String Visit(ReturnNode node)
    {
        return "";
    }
    @Override public String Visit(StmtListNode node)
    {
        if(node.getRight() == null)
        {
            if(node.getLeft() == null)
            {
                return "";
            }
            return Visit(node.getLeft());
        }
        return Visit(node.getLeft()) + "\n" + Visit(node.getRight());
    }
    @Override public String Visit(StmtNode node)
    {
        return "";
    }
    @Override public String Visit(WriteNode node)
    {
        String final_str = "";
        IdNode current = (IdNode) node.getRight();
        while(current != null)
        {
            SymbolAttributes attr = symbol_table.symbolTable.get(current.Value);
            if(attr.type.equals("STRING"))
            {
                final_str += "sys writes " + current.Value + "\n";
            }
            else if (attr.type.equals("INT"))
            {
                final_str += "sys writei " + current.Value + "\n";
            }
            else
            {
                final_str += "sys writer " + current.Value + "\n";
            }
            current = (IdNode) current.getRight();
        }
        return final_str;
    }

    class SymbolTable {

        private String scope;
    
        private LinkedHashMap<String, SymbolAttributes> symbolTable;
    
        private ArrayList<String> symbolName;
    
        public SymbolTable(String scope) {
            this.scope = scope;
            this.symbolTable = new LinkedHashMap<>();
            this.symbolName = new ArrayList<>();
    
        }
    
        public String getScope() {
            return this.scope;
        }
    
        
    
        public void addSymbol(String symbolName, SymbolAttributes attributes)
        {
            if(this.symbolTable.containsKey(symbolName))
            {
                System.out.println("DECLARATION ERROR " + symbolName);
                System.exit(0);
            }
    
            this.symbolTable.put(symbolName, attributes);
            this.symbolName.add(symbolName);
            
        }
        public void print()
        {
            // ! Weird error, table is auto sorting by alphabetical order.
            symbolTable.forEach((name, attr) -> {
                if(attr.type.equals("STRING"))
                {
                    System.out.println("name " + name + " type " + attr.type + " value " + attr.value);
                }
                else
                {
                    System.out.println("name " + name + " type " + attr.type);
                }
            });
            
        }
    }
    
    class SymbolAttributes {
    
        String type;
        String value;
    
        public SymbolAttributes(String type, String value) {
            this.type = type;
            this.value = value;
        }
    
        public String getType(){
            return this.type;
        }
    
        public String getValue() {
            return this.value;
        }
    
    }
    
}
