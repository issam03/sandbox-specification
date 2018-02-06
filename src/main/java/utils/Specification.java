package utils;

/**
 * Created by issam on 06/02/18.
 */
public interface Specification<T> {

    boolean isSatisfiedBy(T candidate);

    Specification<T> or(Specification<T> specification);
    Specification<T> and(Specification<T> specification);
    Specification<T> not();

}