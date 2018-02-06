package utils;

/**
 * Created by issam on 06/02/18.
 */
public class NotSpecification<T> extends DefaultSpecification<T> {

    public boolean isSatisfiedBy(final T candidate) {
        return !specifications.get(0).isSatisfiedBy(candidate);
    }

    public NotSpecification(Specification<T> specification) {
        super(specification);
    }

}
