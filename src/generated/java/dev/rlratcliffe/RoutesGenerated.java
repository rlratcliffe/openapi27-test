package dev.rlratcliffe;

import org.apache.camel.builder.endpoint.EndpointRouteBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Generated routes are based on the OpenAPI document in src/generated/api folder.
 *
 * @author Maven Archetype (camel-oas-archetype)
 */
@Component
public class RoutesGenerated extends EndpointRouteBuilder {
    private final String contextPath;

    public RoutesGenerated(@Value("${camel.rest.context-path}") String contextPath) {
        super();
        this.contextPath = contextPath;
    }

    /**
     * Defines Apache Camel routes using the OpenAPI REST DSL.
     * Routes are built using a get(PATH) rest message processor.
     *
     * Make changes to this file with caution.
     * If the API specification changes and this file is regenerated,
     * previous changes may be overwritten.
     */
    @Override
    public void configure() throws Exception {
        restConfiguration().component("undertow");

        rest()
            .get("/hello")
                .id("get-hello")
                .produces("application/json")
                .to(direct("get-hello").getUri())
            .post("/greeting")
                .id("post-greeting")
                .consumes("application/json")
                .produces("application/json")
                .to(direct("post-greeting").getUri())
        ;
    }
}
