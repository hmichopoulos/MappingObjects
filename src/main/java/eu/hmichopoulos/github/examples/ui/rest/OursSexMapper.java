package eu.hmichopoulos.github.examples.ui.rest;

import org.springframework.stereotype.Component;

@Component
public class OursSexMapper {

    public OursSexEnum toSex(int sex) {
        if (sex == TheirsDto.FEMALE) {
            return OursSexEnum.FEMALE;
        } else {
            return OursSexEnum.MALE;
        }
    }
}
