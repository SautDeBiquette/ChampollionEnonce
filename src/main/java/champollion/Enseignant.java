package champollion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/**
 * Un enseignant est caractérisé par les informations suivantes : son nom, son adresse email, et son service prévu,
 * et son emploi du temps.
 */
public class Enseignant extends  Personne {

    HashMap<UE,ServicePrevu> services = new  HashMap<>();
    // TODO : rajouter les autres méthodes présentes dans le diagramme UML

    public Enseignant(String nom, String email) {
        super(nom, email);
    }

    /**
     * Calcule le nombre total d'heures prévues pour cet enseignant en "heures équivalent TD" Pour le calcul : 1 heure
     * de cours magistral vaut 1,5 h "équivalent TD" 1 heure de TD vaut 1h "équivalent TD" 1 heure de TP vaut 0,75h
     * "équivalent TD"
     *
     * @return le nombre total d'heures "équivalent TD" prévues pour cet enseignant, arrondi à l'entier le plus proche
     *
     */
    public int heuresPrevues() {
        // TODO: Implémenter cette méthode
        int total = 0;
        if (services == null){
            return total;
        }
        else{
        for (ServicePrevu s : services.values()) {
            total += s.getVolumeCm() + s.getVolumeTd() + s.getVolumeTp();
        }
        return total;
        }
    }

    /**
     * Calcule le nombre total d'heures prévues pour cet enseignant dans l'UE spécifiée en "heures équivalent TD" Pour
     * le calcul : 1 heure de cours magistral vaut 1,5 h "équivalent TD" 1 heure de TD vaut 1h "équivalent TD" 1 heure
     * de TP vaut 0,75h "équivalent TD"
     *
     * @param ue l'UE concernée
     * @return le nombre total d'heures "équivalent TD" prévues pour cet enseignant, arrondi à l'entier le plus proche
     *
     */
    public int heuresPrevuesPourUE(UE ue) {
        // TODO: Implémenter cette méthode
        float total = 0;
        if (services.containsKey(ue)) {
            ServicePrevu s = services.get(ue);
            total += (float) (1.5 * s.getVolumeCm() + s.getVolumeTd() + 0.75 * s.getVolumeTp());
        }
        else{
        }
        return Math.round(total);
    }



    /**
     * Ajoute un enseignement au service prévu pour cet enseignant
     *
     * @param ue l'UE concernée
     * @param volumeCM le volume d'heures de cours magistral
     * @param volumeTD le volume d'heures de TD
     * @param volumeTP le volume d'heures de TP
     */
    public void ajouteEnseignement(UE ue, int volumeCM, int volumeTD, int volumeTP) {
        // TODO: Implémenter cette méthode
        if (services.containsKey(ue)) {
            ServicePrevu s = services.get(ue);
            s.ajoutHeures(volumeCM, volumeTD, volumeTP);
        }
        else {
        services.put(ue,new ServicePrevu(volumeCM,volumeTD,volumeTP,ue,this));
    }
    }

    public void ajouteIntervention(){

    }

}
