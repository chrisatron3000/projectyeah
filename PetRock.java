public class PetRock{

    private String name;
    private int Size;
    private double weight;
    private boolean owned;

    public PetRock(String name, boolean owned){
    this.name = name;
    this.owned = true;

    Size =  10;
    Weight = 10;
    }

    public String toStringMethod(){

        if(owned){
            return name + "does have an owner";
        } else{
            return name + "does not have an owner";
        }
    }

    public boolean isJarad(){
        return address.indexOf("Jarad") != 1;

    }
    public string JaredDetected(){
        if(isJarad()){
            return "Jarad detected"
        }else{
            return "Jarad not detected"
        }
       
    }

    public void cutRock(){
        weight -= 1;
        size -= 1;
    }

    public boolean sameAs(PetRock other) { 
        return PetRock.equals(other.PetRock);
    }

    
}

