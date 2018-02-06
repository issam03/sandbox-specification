package utils;

/**
 * Created by issam on 06/02/18.
 */
public class AndSpecification<T> extends DefaultSpecification<T> {

    public boolean isSatisfiedBy(final T candidate) {
        boolean result = true;

        for (Specification<T> specification : this.specifications) {
            result &= specification.isSatisfiedBy(candidate);
        }
        return result;
    }

    public AndSpecification(Specification<T>... specifications) {
        super(specifications);
    }

}
