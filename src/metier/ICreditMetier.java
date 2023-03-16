package metier;

import modele.Credit;

public interface ICreditMetier {
    Credit calculer_mensualité(Long idCredit) throws CréditException;
}
