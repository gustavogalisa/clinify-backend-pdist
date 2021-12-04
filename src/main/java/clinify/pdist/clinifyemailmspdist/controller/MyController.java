package clinify.pdist.clinifyemailmspdist.controller;

import clinify.pdist.clinifyemailmspdist.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.mail.MessagingException;

@Controller
public class MyController {

    @Autowired
    private EmailService emailService;

    @GetMapping(value = "/sendmail")
    public String sendmail() throws MessagingException {

        emailService.sendMail("sandoellytonj@gmail.com", "Test Subject", "Test mail");

        return "emailsent";
    }
}
