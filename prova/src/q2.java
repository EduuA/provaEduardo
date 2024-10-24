class Node {
    int valor;
    Node next;

    public Node(int valor) {
        this.valor = valor;
        this.next = null;
    }
}

class linkedList {
    private Node head;

    public linkedList() {
        this.head = null;
    }

    public void adicionarElemento(int valor) {
        Node newNode = new Node(valor);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void imprimirLista() {
        Node current = head;
        StringBuilder resultado = new StringBuilder();
        while (current != null) {
            resultado.append(current.valor).append(" ");
            current = current.next;
        }
        System.out.println(resultado.toString().trim());
    }

    public void dobrarValores() {
        Node current = head;
        while (current != null) {
            current.valor *= 2;
            current = current.next;
        }
    }

    public static void main(String[] args) {
        linkedList lista = new linkedList();

        lista.adicionarElemento(1);
        lista.adicionarElemento(2);
        lista.adicionarElemento(3);
        lista.adicionarElemento(4);
        lista.adicionarElemento(5);

        System.out.print("Lista original: ");
        lista.imprimirLista();

        lista.dobrarValores();

        System.out.print("Lista após dobrar os valores: ");
        lista.imprimirLista();
    }
}
