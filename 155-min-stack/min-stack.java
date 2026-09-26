class Node{
    int val;
    int min;
    Node(int val,int min){
        this.val=val;
        this.min=min;
    }
}
class MinStack {
Stack<Node>st;
    public MinStack() {
    st=new Stack<Node>();
    }
    
    public void push(int val) {
        if(st.isEmpty()){
            st.push(new Node(val,val));
            return;
        }
      Node nodeTop=st.peek();
      int minTop=nodeTop.min;
      if(val<minTop){
        st.push(new Node(val,val));
      }else{
        st.push(new Node(val,minTop));
      }
    }
    
    public void pop() {
        if(st.isEmpty()){
            return;
        }
        st.pop();
    }
    
    public int top() {
        if(st.isEmpty())return -1;
       
        return st.peek().val;
    }
    
    public int getMin() {
         if(st.isEmpty())return -1;
         return st.peek().min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */