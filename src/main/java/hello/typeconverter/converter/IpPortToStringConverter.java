package hello.typeconverter.converter;

import hello.typeconverter.type.IpPort;
import org.springframework.core.convert.converter.Converter;

public class IpPortToStringConverter implements Converter<IpPort, String > {

    @Override
    public String convert(IpPort source) {
        //IpPort 객체 -> "127.0.0.1:8080"
        return source.getId() + ":" + source.getPort();
    }
}
