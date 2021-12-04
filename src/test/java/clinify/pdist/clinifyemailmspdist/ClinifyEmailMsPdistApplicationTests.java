package clinify.pdist.clinifyemailmspdist;

import clinify.pdist.clinifyemailmspdist.service.EmailService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.mail.MessagingException;

@SpringBootTest
class ClinifyEmailMsPdistApplicationTests {

    @Autowired
    private EmailService emailService;

    @Test
    public void testEmail () throws MessagingException {
        emailService.sendMail ("sandoellytonj@gmail.com", "Assunto do teste", "Email de teste");
    }

}
