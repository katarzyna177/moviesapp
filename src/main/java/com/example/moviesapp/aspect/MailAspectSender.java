package com.example.moviesapp.aspect;

import com.example.moviesapp.service.MailSenderService;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;

@Aspect
@Component
public class MailAspectSender {

    private MailSenderService mailSenderService;

    @Autowired
    public MailAspectSender(MailSenderService mailSenderService) {
        this.mailSenderService = mailSenderService;
    }

    @After("@annotation(MailAspect)")
    public void sendMailAfterAddingMovie() throws MessagingException {
        mailSenderService.sendMail("k.tomaszycka89@gmail.com", "Film","Dodano nowy film ;)",true);
    }
}
