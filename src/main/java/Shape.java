public class Shape {

    private String shapeName;
    // private boolean male = false;
    private int sides;
    private boolean rightAngle = false;

    //constructor
    public Shape(String name){
        this.shapeName = name;
    }

    public Object getName() {

        return shapeName;
    }

    public void setSides(){

        if (shapeName.equalsIgnoreCase("Square")) {
            sides = 4;
            setAngle();
        }
        else if (shapeName.equalsIgnoreCase("Rectangle")){
            sides =4;
            setAngle();
        }

        else if (shapeName.equalsIgnoreCase("Triangle"))
            sides = 3;
        else if (shapeName.equalsIgnoreCase("Pentagon"))
            sides = 5;
        else
            sides = 0;

    }

    public int getSides() {
        return sides;
    }

    public void circle(){
        if(sides == 0) {
            throw new IllegalStateException("This shape is a circle and has no sides");
        }
    }

    public void setAngle(){
        rightAngle = true;
    }

    public String angleMessage(){
        return "This shape has right angles";
    }
}


