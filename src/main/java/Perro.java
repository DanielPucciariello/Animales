
public class Perro extends Animal implements Carnivoro{

    boolean soycarnivoro = true;

    @Override
    public void haceRuido() {
        System.out.println("Guau");
    }

    public void comerCarne (){
        System.out.println("Hola!. Como carne");
    }
}
