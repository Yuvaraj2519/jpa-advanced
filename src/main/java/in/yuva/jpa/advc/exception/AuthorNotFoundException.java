package in.yuva.jpa.advc.exception;

import java.io.Serial;

public class AuthorNotFoundException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;

    public AuthorNotFoundException(String message) {
        super(message);
    }
}
