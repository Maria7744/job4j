package incapsulacia;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
         student.setOwner("Maria Ivanova");
         student.setGroup("Junior");
         student.setCreated(new Date());
        System.out.println(student.getOwner() + "   studying in a group -  " + student.getGroup() + "  went to college  " + student.getCreated());
    }
    }

