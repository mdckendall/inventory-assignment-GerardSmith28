public class Item {
    
    public String name;
    public String sNumber;
    public int value;

    public Item(){

    }

    public Item(String name, String sNumber, int value){
        this.name = name;
        this.sNumber = sNumber;
        this.value = value;
    }

    //Setters
    public void setName(String name){
        this.name = name;
    }

    public void setSNumber(String sNumber){
        this.sNumber = sNumber;
    }

    public void setValue(int value){
        this.value = value;
    }

    //Getters
    public String getName(){
        return name;
    }

    public String getSNumber(){
        return sNumber;
    }

    public int getValue(){
        return value;
    }


}
