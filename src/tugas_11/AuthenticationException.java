package tugas_11;

public class AuthenticationException extends Exception {
    public AuthenticationException() {
        super("Autentikasi gagal!");
    }

    public AuthenticationException(String msg) {
        super(msg);
    }
}