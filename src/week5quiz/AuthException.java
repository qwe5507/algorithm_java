package week5quiz;

public class AuthException extends RuntimeException{
    public AuthException(String message){
        super(message);
    }
}

class IdNotRegisteredException extends AuthException{

    public IdNotRegisteredException(String message) {
        super(message);
    }
}
class InvalidPasswordException extends AuthException{

    public InvalidPasswordException(String message) {
        super(message);
    }
}
class EmptyValueException extends AuthException{

    public EmptyValueException(String message) {
        super(message);
    }
}

