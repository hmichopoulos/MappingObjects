package eu.hmichopoulos.github.examples.ui.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/transform")
public class TransformController {

    @Autowired
    TheirsToOursMapper theirsToOursMapper;

    @RequestMapping(value = "/go", method = RequestMethod.POST)
    List<OursDto> convert(@RequestBody List<TheirsDto> theirsDtoList) {
        return theirsToOursMapper.listTheirsToOurs(theirsDtoList);
    }
}
