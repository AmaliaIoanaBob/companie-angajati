public class Marketing extends Departament implements Evaluator {
    //static final = constanta
    //nume = "Marketing"
    //nivelComp = 6

    public Marketing() { //constructorul default(fara parametrii, ramane cu numele marketing si nivel 6 oriunde il scriem)
        super("Marketing", 6);
    }

    public StatusCandidat evalueaza(Candidat candidat) {
        //to be implemented

        if (candidat.getNivelDeCompetenta() > super.getNivelMinimDeCompetente()) {
            return StatusCandidat.ACCEPTAT;
        } else if (candidat.getNivelDeCompetenta() < super.getNivelMinimDeCompetente()) {
            return StatusCandidat.RESPINS;
        } else {
            return StatusCandidat.IN_ASTEPTARE;
        }
    }
}
