package net.aimeizi;

public class SampleService {

    private String prefix;
    private String suffix;

    public SampleService() {
    }

    public SampleService(String prefix, String suffix) {
        this.prefix = prefix;
        this.suffix = suffix;
    }

    public String wrap(String word) {
        if (prefix != null && suffix != null) {
            return prefix + word + suffix;
        } else {
            return word;
        }
    }

}
