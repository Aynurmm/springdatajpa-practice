package az.academy.turing.springdatajpa.domain.mapper;

public interface EntityMapper<D, E> {
    D toDto(E e);
    E toEntity(D d);
}
