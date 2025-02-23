package com.springboot.Sprinboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendRegistrationEmail(String to, String name) throws MessagingException {
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);

        helper.setTo(to);
        helper.setSubject("🎉 Registration Successful - See You Soon!");
        helper.setFrom("dextero2025@gmail.com"); // Use your Gmail ID
        helper.setReplyTo("dextero2025@gmail.com");

        String emailContent = "<div style='font-family: Arial, sans-serif; padding: 15px; border: 1px solid #ddd; border-radius: 10px;'>"
                + "<h2 style='color: #4CAF50;'>🎉 Excited to See You at the Event!</h2>"
                + "<p>Dear <strong>" + name + "</strong>,</p>"
                + "<p>Thank you for registering! We can't wait to see you at the event.</p>"
                + "<h3>📅 Date: 17th March</h3>"
                + "<h3>📍 Venue: CSBS BLOCK, RMDEC</h3>"
                + "<h3>🕒 Time: 9.00 A.M</h3>"
                + "<p>Get ready for an exciting experience! If you have any questions, feel free to reach out.</p>"
                + "<p>See you soon! 👋</p>"
                + "<p><strong>Best Regards,</strong><br>Dextero'25</p>"
                + "</div>";

        helper.setText(emailContent, true); // Enable HTML formatting

        mailSender.send(message);
    }
}
