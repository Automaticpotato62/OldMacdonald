public class Chick implements Animal{
    private String Sound;
    private String Sound2;
    private String Type;
    public Chick(String Type, String Sound, String Sound2){
        this.Sound = Sound;
        this.Sound2 = Sound2;
        this.Type = Type;
    }
    public String getSound(){
          int choice = (int)(Math.random()*2);//creates statement that makes both sounds a diceroll on what compiller will choose
          if(choice == 0){
            return Sound;
            }
         else if(choice == 1){
            return Sound2;
         }
         return Sound;
    }
    //public String getSound2(){      //commented out this due to unneccesary code
        //return Sound2;
    //}
    public String getType(){
        return Type;
    }
    
}