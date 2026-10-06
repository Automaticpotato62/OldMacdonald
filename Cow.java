public class Cow implements Animal{
    private String Sound;
    private String Type;
    public Cow(String Type, String Sound){
        this.Sound = Sound;
        this.Type = Type;
    }
    public String getSound(){
          return Sound;   
    }
    public String getType(){
        return Type;
    }
}
