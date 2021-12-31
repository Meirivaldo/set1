package one.dio;

import java.util.LinkedHashSet;
import java.util.Set;

public class set {
    public static void main(String[] args) {

        //Set(Interface), String(Tipo de classe), numInteiros(Variavel), = (recebe uma new), LinkedHashSet(Collections)
        Set<String> numInteiros = new LinkedHashSet<>();

        numInteiros.add("3"); //O que esta entre parenteses é o elemento!
        numInteiros.add("88");
        numInteiros.add("20");
        numInteiros.add("44");
        numInteiros.add("3");

        System.out.println(numInteiros);

        System.out.println(numInteiros.size());
        




    }
}
