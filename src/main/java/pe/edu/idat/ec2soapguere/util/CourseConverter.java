package pe.edu.idat.ec2soapguere.util;

import org.springframework.stereotype.Component;
import pe.edu.idat.ec2soapguere.model.bd.Course;
import pe.edu.idat.ec2soapguere.ws.objects.CourseSoap;

@Component
public class CourseConvert {

    public Course convertirCourseBD(CourseSoap courseSoap) {
        Course course = new Course();
        course.setId(courseSoap.getId());
        course.setName(courseSoap.getName());
        course.setCredit(courseSoap.getCredit());
        course.setDescription(courseSoap.getDescription());
        return course;
    }

    public CourseSoap convertirCourseSoap(Course course) {
        CourseSoap courseSoap = new CourseSoap();
        courseSoap.setId(course.getId());
        courseSoap.setName(course.getName());
        courseSoap.setCredit(course.getCredit());
        courseSoap.setDescription(course.getDescription());
        return courseSoap;
    }
}
