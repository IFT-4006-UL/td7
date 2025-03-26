package td9.api.exceptions.mappers;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;
import td9.api.exceptions.ErrorResponse;
import td9.domain.cruise.exceptions.CruiseNotFoundException;

@Provider
public class CruiseNotFoundExceptionMapper implements ExceptionMapper<CruiseNotFoundException> {

    @Override
    public Response toResponse(CruiseNotFoundException exception) {
        ErrorResponse error = new ErrorResponse("CRUISE_NOT_FOUND", exception.getMessage());
        return Response.status(404).entity(error).build();
    }
}
