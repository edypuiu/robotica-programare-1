import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Animal> animalute = new ArrayList<>();
        Animal caine = new Animal("Are dintii ascutiti",10, "Dingo");
        animalute.add(caine);

        String meniu = "1.Adauga animal \n 2.Arata animalele \n 3.Iesi \n 4.Sterge animal";
        int comanda = 1;
        if (comanda != 3) {
            System.out.println(meniu);
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String optiune = reader.readLine();
            comanda = Integer.parseInt(optiune);

            if(comanda == 2){
                for(Animal animal : animalute){
                    System.out.println(animal);
                }
            }

        }
    }
}
