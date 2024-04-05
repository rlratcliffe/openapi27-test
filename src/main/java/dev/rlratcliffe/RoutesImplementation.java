package dev.rlratcliffe;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.builder.endpoint.EndpointRouteBuilder;
import org.springframework.stereotype.Component;

/**
 * The RoutesImplementation class holds implementations for the end points configured in RoutesGenerated.
 * These routes are based on operation Ids, that correspond to an API end point:  method+path.
 *
 * @author Maven Archetype (camel-openapi-archetype)
 */
@Component
public class RoutesImplementation extends EndpointRouteBuilder {

    @Override
    public void configure() throws Exception {

        // TODO: Replace stubs for each endpoint with real implementation. Implementation defaults to a simple response with operation Id.
        from(direct("get-hello"))
            .setBody(simple("hola"))
            .log("get")
        ;
        from(direct("post-greeting"))
            .log("post")
        ;

    }
}
