import java.util.ArrayList;

public class Granja {

    public static void main(String[] args){

        ArrayList<Animal> Listado = new ArrayList<>();

        Animal Benito =new Gato();
        Animal Lassie = new Perro();
        Animal Milka = new vaca();

        comerAnimal(Benito);
        comerAnimal(Lassie);
        comerAnimal(Milka);

    }
    public static void comerAnimal(Animal bicho) {

        if (bicho instanceof Gato){
            Gato gato = (Gato) bicho;
            gato.comerCarne();
        } else if (bicho instanceof Perro) {
            Perro perro = (Perro) bicho;
            perro.comerCarne();
        } else {
            vaca vaca = (vaca) bicho;
            vaca.comerHierba();
        }


    }

}
