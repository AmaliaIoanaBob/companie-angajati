import java.util.List;

public class Companie {
    private String nume;
    private List<Candidat> angajati;
    private List<Departament> departamente;

    //gettere, settere, constructor


    public Companie(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public List<Candidat> getAngajati() {
        return angajati;
    }

    public void setAngajati(List<Candidat> angajati) {
        this.angajati = angajati;
    }

    public List<Departament> getDepartamente() {
        return departamente;
    }

    public void setDepartamente(List<Departament> departamente) {
        this.departamente = departamente;
    }

    //to be implemented
    public void recruteaza(Candidat candidat) {
        if (candidat.getNumeDepartament().equalsIgnoreCase("Marketing")) {
           Marketing m = new Marketing();
          StatusCandidat status = m.evalueaza(candidat);
          candidat.setStatusCandidat(status);
        } else if (candidat.getNumeDepartament().equalsIgnoreCase("Productie")) {
            Productie p = new Productie();
            StatusCandidat status = p.evalueaza(candidat);
            candidat.setStatusCandidat(status);
        } else {
            //aruncam exceptie(intai trebuie creata)
            throw new IncapacitateEvaluare("Candidatul nu poate fi evaluat.");
        }
    }
}
