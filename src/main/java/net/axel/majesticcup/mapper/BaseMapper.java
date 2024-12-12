package net.axel.majesticcup.mapper;

public interface BaseMapper<E, Req, Res>{
    E toEntity(Req dto);

    Res toResponseDto(E entity);
}
