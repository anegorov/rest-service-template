package anlen.service;

import java.util.Optional;

public class AnOptional {
    private String val;

    public AnOptional(String val) {
        this.val = val;
    }

    public Optional<String> getValue(){
        return Optional.ofNullable(val);
    }
}
