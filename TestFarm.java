public class TestFarm {
    public static void main(String[] args){
        Cow object = new Cow("Cow", "Moo");
         String type = object.getType();
         String sound = object.getSound();
        System.out.println(type + " goes " + sound);
    }
}
