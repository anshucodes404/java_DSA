package OOp.properties.inheritance;

public class BoxWeight extends Box {
    double weight;

    BoxWeight(){
        this.weight = -1;
    }

    BoxWeight(BoxWeight other){
        super(other); //other.weight is also passed but since super is of type Box it can't access weight
        weight = other.weight;
    }

    BoxWeight(double l, double h, double w, double weight){
        super(l, h, w); //what is this?  This calls the parent class constructor
        // This is how we initialise variables of parent class
//        System.out.println(super.weight);  access the weight in Box class
//        System.out.println(this.weight);  access the weight in BoxWeight class
        this.weight = weight;
//        super(l, h, w) this is wrong because calling of superclass must be the first thing, this creates a structured and predictable object
    }
}
