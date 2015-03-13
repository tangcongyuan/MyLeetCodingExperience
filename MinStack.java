class MinStack {
    Node top = null;

    class Node{
        int val;
        int min; // every node contains a min value at its time
        Node next = null;
        Node(int n, int m){
            val = n;
            min = m;
        }
    }
    
    public void push(int x) {
        int last_min = getMin();
        int cur_min = x < last_min ? x : last_min;
        Node temp = new Node(x, cur_min);
        
        if(top==null) top = temp;
        else{
            temp.next = top;
            top = temp;
        }
    }

    public void pop() {
        if(top != null){
            top = top.next;
        }
    }

    public int top() {
        return top.val;
    }

    public int getMin() {
        if(top!=null) return top.min;
    	else return Integer.MAX_VALUE;
    }
}
