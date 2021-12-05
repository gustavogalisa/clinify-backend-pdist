package clinify.pdist.clinifyemailmspdist.controller;

import clinify.pdist.clinifyemailmspdist.model.Paciente;
import clinify.pdist.clinifyemailmspdist.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;

@Controller
@RestController
@RequestMapping("/api")
public class MyController {

    @Autowired
    private EmailService emailService;

    @GetMapping(value = "/sendmail")
    public String sendmail() throws MessagingException {

        emailService.sendMail("sandoellytonj@gmail.com", "Test Subject", "Test mail");

        return "emailsent";
    }

    @PostMapping("/sendPaciente")
    public void sendPaciente(@RequestBody Paciente paciente) throws MessagingException {
        Paciente paciente1 = new Paciente();
        paciente1.setName(paciente.getName());
        paciente1.setEmail(paciente.getEmail());
        paciente1.setCode(paciente.getCode());
        paciente1.setAppointmentDate(paciente.getAppointmentDate());
        System.out.println(paciente1);
        emailService.sendMail(paciente1.getEmail(), "You Got Mail!", "Vem se tratar arrombado!");
    }
}
