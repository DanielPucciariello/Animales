public class vaca extends Animal implements Herbiboro{

    boolean soycarnivoro = false;

    @Override
    public void haceRuido() {
        System.out.println("Muuuu");
    }

    public void comerHierba (){
        System.out.println("Hola!. Como hierba");
    }
}
