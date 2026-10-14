public class NamedCow extends Cow {
     private String cowName;
     public NamedCow(String cowName){
        super("Cow", "Moo");
        this.cowName = cowName;
     }
     public String getName(){
        return cowName;
     }
}
