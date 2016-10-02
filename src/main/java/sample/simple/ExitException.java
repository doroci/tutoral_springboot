package sample.simple;

import org.springframework.boot.ExitCodeGenerator;

/**
 * Created by lee on 2016. 9. 29..
 */
public class ExitException extends RuntimeException implements ExitCodeGenerator {

    @Override
    public int getExitCode() {
        return 10;
    }
}
