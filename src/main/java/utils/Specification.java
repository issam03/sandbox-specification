package utils;

/**
 *
 * Contrat de specification. Doit être implementé par toutes les régles metiers.
 * L'implementation définie pour un Object T si la regle de gestion est passante ou bloquante.
 *
 */
public interface Specification<T> {

    /**
     * Determine si la regle metier est passante pour un objet donné ou non.
     *
     * @param candidate l'objet a validé par cette specification.
     * @return {@code True} ou {@False} dependant si la validation est passante ou non.
     */
    boolean isSatisfiedBy(T candidate);

    /**
     * Permet d'associer une Specification à la Spécification courante via l'operation logique "et"
     * @param specification
     * @return
     */
    Specification<T> or(Specification<T> specification);

    /**
     * Permet d'associer une Specification à la Spécification courante via l'operation logique "ou"
     * @param specification
     * @return
     */
    Specification<T> and(Specification<T> specification);

    /**
     * Effecture une operation logique "non" sur la specification
     * @return
     */
    Specification<T> not();

}