package domain;

import java.util.Date;

/**
 * Created by issam on 06/02/18.
 */
public class RegleNotification {

    public enum Type {
        MES,
        MHS,
        FACTURATION
    }
    private String numeroEquipement;
    private String codeClavier;
    private String periodicite;
    private Date heureDebut;
    private Date heureFin;
    private boolean isActive;
    private String moyenComunication;
    private Type type;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getNumeroEquipement() {
        return numeroEquipement;
    }

    public void setNumeroEquipement(String numeroEquipement) {
        this.numeroEquipement = numeroEquipement;
    }

    public String getCodeClavier() {
        return codeClavier;
    }

    public void setCodeClavier(String codeClavier) {
        this.codeClavier = codeClavier;
    }

    public String getPeriodicite() {
        return periodicite;
    }

    public void setPeriodicite(String periodicite) {
        this.periodicite = periodicite;
    }

    public Date getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(Date heureDebut) {
        this.heureDebut = heureDebut;
    }

    public Date getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(Date heureFin) {
        this.heureFin = heureFin;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getMoyenComunication() {
        return moyenComunication;
    }

    public void setMoyenComunication(String moyenComunication) {
        this.moyenComunication = moyenComunication;
    }
}
