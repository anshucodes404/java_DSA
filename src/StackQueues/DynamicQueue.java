package StackQueues;

public class DynamicQueue extends CircularQueue{
    public DynamicQueue(){
        super();
    }

    public DynamicQueue(int size){
        super(size);
    }

    @Override
    public boolean insert(int item){

        if(this.isFull()){
            int[] temp = new int[data.length * 2];
            int i = front;
            do{
                temp[i] = data[i];
                i++;
                i %= data.length;
            } while(i != end);

            front = 0;
            end = data.length;
            data = temp;
        }

        return super.insert(item);
    }
}
