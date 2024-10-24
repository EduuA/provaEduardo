class Node {
    int valor;
    Node prev;
    Node next;

    public Node(int valor){
        this.valor = valor;
        this.prev = null;
        this.next = null;
    }
}

class doubleLinkedList{
    private Node head;
    private Node tail;

    public doubleLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void adicionarElementoNoFinal(int valor) {
        Node newNode = new Node(valor);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
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

    public void trocarCabecaCauda() {
        if (head == null || head == tail) {
            return;
        }

        Node current = head; 
        head = tail;   
        tail = current;   

        
        head.prev = null;
        tail.next = null;

        
        if (tail != null) {
            tail.next = head;
        }
        
        if (head != null) {
            head.prev = tail;
        }
    }



    public static void main(String[] args) {
        doubleLinkedList lista = new doubleLinkedList();

        lista.adicionarElementoNoFinal(5);
        lista.adicionarElementoNoFinal(4);
        lista.adicionarElementoNoFinal(3);
        lista.adicionarElementoNoFinal(2);
        lista.adicionarElementoNoFinal(1);

        System.out.print("Lista original: ");
        lista.imprimirLista();


        lista.trocarCabecaCauda();

        System.out.print("Lista depois da inversão: ");
        lista.imprimirLista();
    }
}
