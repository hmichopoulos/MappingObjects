package eu.hmichopoulos.github.examples.ui.rest;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(uses = { OursSexMapper.class }, componentModel = "spring")
public interface TheirsToOursMapper {

    @Mappings({
            @Mapping(target = "fullName", expression = "java(source.getName() + \" \" + source.getSurname())"),
            @Mapping(target = "heightInFeet", expression = "java(source.getHeightInCm() / 30.48)"),
            @Mapping(target = "weight", source = "weight"),
            @Mapping(target = "sex", source = "sex")
    })
    OursDto theirsToOurs(TheirsDto source);

    List<OursDto> listTheirsToOurs(List<TheirsDto> theirsDtoList);
}
