package iolog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class UsageLog4jF {
    private static final Logger LOG = LoggerFactory.getLogger(UsageLog4jF.class.getName());

    public static void main(String[] args) {
        LOG.trace("trace message");
        LOG.debug("debug message");
        LOG.info("info message");
        LOG.warn("warn message");
        LOG.error("error message");
    }
}


