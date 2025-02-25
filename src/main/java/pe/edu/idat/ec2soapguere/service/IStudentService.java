package pe.edu.idat.ec2soapguere.service;

import pe.edu.idat.ec2soapguere.ws.objects.*;

public interface IStudentService {
    GetListStudentsResponse obtenerEstudiantes();
    GetStudentResponse obtenerEstudiantePorId(GetStudentRequest request);
    PostStudentResponse guardarEstudiante(PostStudentRequest request);
}
