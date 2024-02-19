class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        Map<Node, Node> map = new HashMap<>();

        Node original = head;
        while (original != null) {
            Node copy = new Node(original.val);
            map.put(original, copy);
            original = original.next;
        }

        original = head;
        while (original != null) {
            Node copy = map.get(original);
            copy.next = map.get(original.next);
            copy.random = map.get(original.random);
            original = original.next;
        }
            
        return map.get(head);
    }
}
