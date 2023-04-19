package racingcar.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.List;
import racingcar.controller.converter.StringToListStringConverter;

public class PracticeDto {


    private int count;

    @JsonDeserialize(converter = StringToListStringConverter.class)
    private List<String> names;

    public List<String> getNames() {
        return names;
    }

    public int getCount() {
        return count;
    }
}
