public class Gato extends Animal implements Carnivoro{

    public boolean soycarnivoro = true;
    @Override
    public void haceRuido() {
        System.out.println("Miau");
    }
    public void comerCarne(){
        System.out.println("Hola!. Como carne");
    }

    public boolean isSoycarnivoro() {
        return soycarnivoro;
    }

    public void setSoycarnivoro(boolean soycarnivoro) {
        this.soycarnivoro = soycarnivoro;
    }
}
