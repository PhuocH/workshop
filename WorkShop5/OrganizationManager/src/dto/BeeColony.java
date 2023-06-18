package dto;

public class BeeColony extends Colony implements Role{
    /*Class BeeColony kế thừa class Colony và có thêm những hành vi ở class 
    Interface Role.    
    */
    private String type;

    public BeeColony(String type) {
        super();
    }

    public BeeColony(int size, String place, String type) {
        super(size, place);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return  "The colony's type is: " + type + " size is about " + size + ", and the place is " + place;
    }
    
    @Override
    public void output(){
        super.output();
        System.out.println("Type: " + type);
    }

    @Override
    public void createWorker() {
        System.out.println("Worker bees perform all the work of the bees.");
    }
    
}