package td9.api.exceptions.mappers;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;
import td9.api.exceptions.ErrorResponse;
import td9.domain.exceptions.MissingParameterException;

@Provider
public class MissingParameterExceptionMapper implements ExceptionMapper<MissingParameterException> {

    @Override
    public Response toResponse(MissingParameterException exception) {
        ErrorResponse error = new ErrorResponse("MISSING_PARAMETER", exception.getMessage());
        return Response.status(400).entity(error).build();
    }
}
