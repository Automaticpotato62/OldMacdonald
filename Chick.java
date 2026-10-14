public class Chick implements Animal{
    private String Sound;
    private String Type;
    private String Sound2;
    public Chick(String Type, String Sound, String Sound2){
        this.Sound = Sound;
        this.Type = Type;
        this.Sound2 = Sound2;
    }
    public String getSound(){
          return Sound; 
          String options[] = {"cluck", "chirp" } ;
          Random random = new Random();
          int randomIndex = random.nextInt(options.length);
          String randomChoice = options[randomIndex];
          System.out.println("Random Selection: " + randomChoice);
    }
    public String getSound2(){
         return Sound2;
    }
    public String getType(){
        return Type;
    }
}