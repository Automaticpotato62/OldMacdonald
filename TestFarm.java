public class TestFarm {
    public static void main(String[] args){
        Cow object = new Cow("Cow", "Moo");
         String type = object.getType();
         String sound = object.getSound();
        System.out.println(type + " goes " + sound);
    
      Pig object2 = new Pig("Pig", "Oink");
        String type2 = object2.getType();
        String sound2 = object2.getSound();
        System.out.println(type2 + " goes " + sound2);
        
     Chick object3 = new Chick("Chick", "Cluck", "Cheep");
      String type3 = object3.getType();
    String sound3 = object3.getSound();
    String sound4 = object3.getSound2();
    System.out.println(type3 + " goes " + sound3 + " or " + sound4);
     
    } 
}
