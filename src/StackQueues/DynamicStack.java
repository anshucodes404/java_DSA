package StackQueues;

public class DynamicStack extends CustomStack{
    public DynamicStack(){
        super(); //this will call the constructor of parent class that don't take any arguments
    }

    public DynamicStack(int size){
        super(size);
    }

    @Override
    public boolean push(int item){
        if(this.isFull()){
            //double the size
            int[] temp = new int[data.length * 2];
            //copy all previous items
            System.arraycopy(data, 0, temp, 0, data.length);
            data = temp;
        }

        //insert item
        return super.push(item);

    }
}
