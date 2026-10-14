public class Farm {
    private Animal[] a = new Animal[3];
    Farm(){
        a[0]= new Cow("cow","moo");
<<<<<<< HEAD
        a[1] = new Chick("chick", "cluck", "Chirp");
=======
        a[1] = new Chick("chick", "cluck", "cheep");
>>>>>>> 433a72f935ef163a81bbf10e5564937f43c06457
        a[2] = new Pig("pig", "oink");
    }
    public void animalSounds () {
         for (int i = 0; i < a . length ; i ++) {
System . out . println ( a [i].getType() + " goes " + a [ i ]. getSound () ) ;
System . out . println ( " The cow is known as " +(( NamedCow ) a [0]).getName() ) ;
}
    }
}

