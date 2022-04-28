public class Node {
    public String current;
    public String type;
    public String code;
    public Node left;
    public Node right;

    public Node(String rootNode){
        this.current = rootNode;
        this.type = ":=";
        this.code = "STORE";
    } 
}
