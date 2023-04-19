package racingcar.controller.converter;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;

@Component
public class StringToListStringConverter implements Converter<String, List<String>>,
    org.springframework.core.convert.converter.Converter<String, List<String>> {

    private static final String SPLIT_DELIMITER = ",";

    @Override
    public List<String> convert(final String value) {
        final String[] splitNames = value.split(SPLIT_DELIMITER);
        return Arrays.stream(splitNames).collect(Collectors.toList());
    }

    @Override
    public JavaType getInputType(final TypeFactory typeFactory) {
        return typeFactory.constructType(String.class);
    }

    @Override
    public JavaType getOutputType(final TypeFactory typeFactory) {
        return typeFactory.constructType(List.class);
    }
}
