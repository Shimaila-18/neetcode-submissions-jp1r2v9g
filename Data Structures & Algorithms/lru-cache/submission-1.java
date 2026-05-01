private class Node{
    int key;
    int value;
    Node prev;
    Node next;
    public Node(int key,int value){
        this.key=key;
        this.value=value;
        this.prev=null;
        this.next=null;
    }
}
class LRUCache {

    private int capacity;
    private Map<Integer,Node> cache;
    private Node left;
    private Node right;

    public LRUCache(int capacity) {
        this.capacity=capacity;
        cache = new HashMap<>();
        left=new Node(-1,-1);
        right=new Node(-1,-1);
        left.next=right;
        right.prev=left;
    }

    private void insert(Node node){
        Node previous= right.prev;
        previous.next=node;
        node.next=right;
        node.prev=previous;
        right.prev=node;
    }

    private void remove(Node node){
        Node prev = node.prev;
        prev.next=node.next;
        node.next.prev=prev;
    }
    
    public int get(int key) {
        if(cache.containsKey(key)){
            Node node = cache.get(key);
            int value = node.value;
            remove(node);
            insert(node);
            return value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)){
            Node node = cache.get(key);
            remove(node);
        }
        Node newNode = new Node(key,value);
        cache.put(key,newNode);
        insert(newNode);
        if(cache.size()>capacity){
            Node lru = this.left.next;
            remove(lru);
            cache.remove(lru.key);
        }
    }
    
}
