package clinify.pdist.clinifyemailmspdist.model;

import lombok.Data;

@Data
public class Paciente {

    private String name;
    private String email;
    private String code;
    private String appointmentDate;
}
