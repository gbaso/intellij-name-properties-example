package io.github.gbaso.intellijnamepropertiesexample;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.Name;

@ConfigurationProperties("example")
public record ExampleProperties(
    @Name("public") String publicProperty // public is a reserved keyword
) {}
