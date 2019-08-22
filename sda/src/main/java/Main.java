import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Companie companie = new Companie("SDA");

        Departament departamentMarketing = new Marketing();
        Departament departamentProductie = new Productie();
        Departament departamentHr = new Departament("HR", 5); //obiectul departament ia 3 forme diferite(polimorfism)

        List<Departament> departamente = new ArrayList<>();
        departamente.add(departamentMarketing);
        departamente.add(departamentProductie);
        departamente.add(departamentHr);

        companie.setDepartamente(departamente); //am adaugat departamentele in companie cu set. ca sa le obtin cu get

        Candidat candidat1 = new Candidat("Pop", "Ionut", 10, "Marketing");
        Candidat candidat2 = new Candidat("Pop", "Andreea", 1, "Productie");
        Candidat candidat3 = new Candidat("Popescu", "Ana", 7, "Productie");
        Candidat candidat4 = new Candidat("Popovici", "Andrei", 3, "HR");

        List<Candidat> candidati = new ArrayList<>();
        candidati.add(candidat1);
        candidati.add(candidat2);
        candidati.add(candidat3);
        candidati.add(candidat4);

        companie.setAngajati(candidati);

        for (Candidat candidat : candidati) {
            try {
                companie.recruteaza(candidat);
            } catch (IncapacitateEvaluare e) {
                System.out.println("Exceptie prinsa!");
            }
                System.out.println(candidat.getStatusCandidat());
            }
        }
    }

