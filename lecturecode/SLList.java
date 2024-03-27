public class SLList {
    public IntNode first;
    /**record the size of the linked list every time */
    private int size;
    private IntNode sentinel;
    private IntNode last;

    public SLList(){
        sentinel = new IntNode(63, null);
        size = 0;
    }
    
    public SLList(int x){
        sentinel = new IntNode(63, null);
        size = 0;
    }

    public void addFirst(int x){
        first = new IntNode(x, first);
        size += 1;
    } 

    public int getFirst(){
        return sentinel.next.item;
    }

    public void addLast(int x){
        size += 1;
        if(last == null){
            last = new IntNode(x, null);
            return;
        }
        last.next = new IntNode(x, null);
        last = last.next;
        IntNode p = sentinel;
        while(p.next != null){
            p = p.next;
        }
        p.next = new IntNode(x, null);
    }

    public int size(){
        return size;
    }

    public static void main(String[] args){
        SLList L = new SLList();
        L.addLast(20);
        System.out.println(L.size());
    }
}
