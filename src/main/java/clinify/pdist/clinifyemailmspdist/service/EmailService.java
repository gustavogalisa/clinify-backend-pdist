package clinify.pdist.clinifyemailmspdist.service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;

@Service
public class EmailService {

    private JavaMailSender javaMailSender;

    public EmailService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public void sendMail(String toEmail, String subject, String message) throws MessagingException {

        var mailMessage = javaMailSender.createMimeMessage();
        var helper = new MimeMessageHelper(mailMessage, "UTF-8");

        String msg = "<h1>" + message + "</h1>";

        helper.setText(msg, true);
        helper.setTo(toEmail);
        helper.setSubject(subject);
        helper.setFrom("sandoellytonj@gmail.com");
        javaMailSender.send(mailMessage);

    }
}
