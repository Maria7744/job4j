package iolog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UsageLog4j {
    private static final Logger LOG = LoggerFactory.getLogger(UsageLog4j.class.getName());

    public static void main(String[] args) {
        String name = "Petr Arsentev";
        int age = 33;
        double weight = 75.20;
        char sex = 'm';
        boolean work = true;
        double height = 1.75;
        String social = "married";
        int id = 786543;
        LOG.debug("User info name : {}, age : {},weight : {}, sex :{}, work : {}, height : {}, social :{}, id :{}", name, age,
                weight, sex, work, height,social,id);
    }
}


