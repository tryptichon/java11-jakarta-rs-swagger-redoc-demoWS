package com.example.demows;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/hello-world")
public class HelloResource {
    @GET
    @Produces("text/plain")
    @Operation(
            summary = "Get simple string result",
            tags = {"Tag 1"},
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Normal response",
                            content = @Content(
                                    mediaType = "text/plain",
                                    schema = @Schema(implementation = String.class),
                                    examples = {
                                            @ExampleObject(
                                                    name = "Default result",
                                                    summary = "Example of default result",
                                                    value = "Hello World!"
                                            )
                                    }
                            )
                    )
            }
    )
    public String hello() {
        return "Hello, World!";
    }
}