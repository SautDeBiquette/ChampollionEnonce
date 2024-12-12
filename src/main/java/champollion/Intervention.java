package champollion;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.Date;

@Getter// Génère les getters pour tous les champs
@Setter// Génère les setters pour tous les champs
@ToString // Génère la méthode toString()
public class Intervention {
    private Date debut;
    private int duree;
    private boolean annulee = false;
    private int heureDebut;

    TypeIntervention type;
    Enseignant enseignant;
    UE ue;
    Salle salle;

    public int heurePrevueUe() {
        if (this.type == TypeIntervention.CM) {
            return this.ue.getHeuresCm();
        } else if (this.type == TypeIntervention.TD) {
            return this.ue.getHeuresTd();
        } else if (this.type == TypeIntervention.TP) {
            return this.ue.getHeuresTp();
        }
        else {
            throw new IllegalArgumentException("Unknow TypeIntervention");
        }
    }
}
