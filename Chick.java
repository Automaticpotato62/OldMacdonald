public class Chick implements Animal{
    private String Sound;
    private String Sound2;
    private String Type;
<<<<<<< HEAD
=======
    private String Sound2;
>>>>>>> 433a72f935ef163a81bbf10e5564937f43c06457
    public Chick(String Type, String Sound, String Sound2){
        this.Sound = Sound;
        this.Sound2 = Sound2;
        this.Type = Type;
        this.Sound2 = Sound2;
    }
    public String getSound(){
<<<<<<< HEAD
          int choice = (int)(Math.random()*2);//creates statement that makes both sounds a diceroll on what compiller will choose
          if(choice == 0){
            return Sound;
            }
         else if(choice == 1){
            return Sound2;
         }
         return Sound;
=======
          return Sound; 
          String options[] = {"cluck", "chirp" } ;
          Random random = new Random();
          int randomIndex = random.nextInt(options.length);
          String randomChoice = options[randomIndex];
          System.out.println("Random Selection: " + randomChoice);
    }
    public String getSound2(){
         return Sound2;
>>>>>>> 433a72f935ef163a81bbf10e5564937f43c06457
    }
    //public String getSound2(){      //commented out this due to unneccesary code
        //return Sound2;
    //}
    public String getType(){
        return Type;
    }
}