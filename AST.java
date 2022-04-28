class AST {

    public Node root;
    public Node current;

    public AST(String rootNode){
        Node node = new Node(rootNode);
        this.root = node;
        this.current = root;
    }

    public Node getRoot(){
        return this.root;
    }
    public void set_current(Node node)
    {
        root.right = node;
        current = node;
    }
}
