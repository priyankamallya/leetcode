class MyCircularQueue {
    int front = -1;
    int rear = -1;
    int size = 0;
    int[] arr;
    public MyCircularQueue(int k) {
        arr = new int[k];
    }
    
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        if(isEmpty()){
            front = rear = 0;
        }else if(rear==arr.length-1){
            rear = 0; //wrap around
        } else{
            rear++;
        }
        arr[rear] = value;
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        if(front==rear){
            front = rear = -1;
        }else if(front==arr.length-1){
            front=0;
        }else{
            front++;
        }
        size--;
        return true;
    }
    
    public int Front() {
        if(isEmpty()) return -1;
        else return arr[front];
    }
    
    public int Rear() {
        if(isEmpty()) return -1;
        return arr[rear];
    }
    
    public boolean isEmpty() {
        return size==0;
    }
    
    public boolean isFull() {
        return size==arr.length;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */