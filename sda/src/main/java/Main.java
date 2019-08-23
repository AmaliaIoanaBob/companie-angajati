import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
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

        List<Candidat> candidati = new ArrayList<Candidat>();
        candidati.add(candidat1);
        candidati.add(candidat2);
        candidati.add(candidat3);
        candidati.add(candidat4);

        companie.setAngajati(candidati); //am setat lista de angajati in clasa companie



        try {
            companie.recruteaza();

        } catch (IncapacitateEvaluare e) { //mereu cand am try trebuie sa am si catch


            //scriere in fisier candidati dupa recrutare
        }

        writeCandidatesToTxtFile(companie.getAngajati()); // apelam metoda


    }

    public static void writeCandidatesToTxtFile(List<Candidat> candidates) {
        BufferedWriter writer = null;
        try {

            writer = new BufferedWriter(new FileWriter("candidati.txt"));
            writer.write(candidates.toString());
        } catch (IOException e) {

        } finally {
            try {
                writer.close(); // fisierul vrem sa il inchidem il mai inconjuram inca o data de un try and catch
            } catch (IOException e) {
            }
        }

    }
}




