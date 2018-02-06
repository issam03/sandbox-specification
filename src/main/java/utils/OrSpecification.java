package utils;

/**
 * Created by issam on 06/02/18.
 */
public class OrSpecification<T> extends DefaultSpecification<T> {

    public boolean isSatisfiedBy(final T candidate) {
        boolean result = false;

        for (Specification<T> specification : this.specifications) {
            result |= specification.isSatisfiedBy(candidate);
        }
        return result;
    }

    public OrSpecification(Specification<T>... specifications) {
        super(specifications);
    }
}
