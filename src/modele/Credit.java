package modele;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.*;

@Data @AllArgsConstructor @NoArgsConstructor
public class Credit {
    private long OE_id;
    private Double OE_capitale_emprunte;
    private Integer OE_nombre_mois;
    private Double OE_taux_mensuel;
    private Double OE_mensualite;
    private String OE_nom_demandeur;

    //getters && setters

    @Override
    public String toString(){
        var creditStr = "====================================================================       \n";
            creditStr+= "=> Crédit n°                  : " +getOE_id()+ "                           \n";
            creditStr+= "=> Nom du demandeur de crédit : " + getOE_nom_demandeur() + "              \n";
            creditStr+= "--------------------------------------------------------------------       \n";
            creditStr+= "=> Capitale Emprunté          : " + getOE_capitale_emprunte() + "DH        \n";
            creditStr+= "=> Nombre de mois             : " + getOE_nombre_mois() + "                \n";
            creditStr+= "=> Taux mensuel               : " + getOE_taux_mensuel() + "               \n" ;
            creditStr+= "--------------------------------------------------------------------       \n";
            creditStr+= "=> Mensualité                 : "
                    + (getOE_mensualite() == 0.0 ? "NON-CALCULE":getOE_mensualite()+ " Dh/mois")+"  \n";
            creditStr+= "====================================================================       \n";

        return creditStr;

    }
    public boolean Equals(Object o){
        if (!(o instanceof Credit cr))
            return false;
        if (cr.OE_id==this.getOE_id())
            return true;
        return false;
    }

    public static void main(String[] args) {

    }

}
