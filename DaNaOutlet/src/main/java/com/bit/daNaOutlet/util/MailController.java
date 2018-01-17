package com.bit.daNaOutlet.util;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MailController {
    //private UserService userService;
	@Autowired
    private MailService mailService;
 
/*    public void setUserService(UserService userService) {
        this.userService = userService;
    }*/
 
    public void setMailService(MailService mailService) {
        this.mailService = mailService;
    }
 
    @RequestMapping("/mailtest")
    public String mailTest() {
		return "mailtest";    	
    }
    
    
    // ȸ������ �̸��� ����
    @RequestMapping(value = "/mailCheck", method = RequestMethod.POST)
    @ResponseBody
    public void sendMailAuth(HttpSession session, @RequestParam String email, HttpServletResponse resp) throws IOException {
        int ran = new Random().nextInt(100000) + 10000; // 10000 ~ 99999
        String joinCode = String.valueOf(ran);
        session.setAttribute("joinCode", joinCode);
 
        String subject = "ȸ������ ���� �ڵ� �߱� �ȳ� �Դϴ�.";
        StringBuilder sb = new StringBuilder();
        sb.append("������ ���� �ڵ�� " + joinCode + " �Դϴ�.");
        System.out.println("���� ����"+mailService);
        PrintWriter out=resp.getWriter();
        out.print(mailService.send(subject, sb.toString(), "hbclass6.1@gmail.com", "freeinlife1@gmail.com", null));
    }
 /*
    // ���̵� ã��
    @RequestMapping(value = "/sendMail/id", method = RequestMethod.POST)
    public String sendMailId(HttpSession session, @RequestParam String email, @RequestParam String captcha, RedirectAttributes ra) {
        String captchaValue = (String) session.getAttribute("captcha");
        if (captchaValue == null || !captchaValue.equals(captcha)) {
            ra.addFlashAttribute("resultMsg", "�ڵ� ���� �ڵ尡 ��ġ���� �ʽ��ϴ�.");
            return "redirect:/find/id";
        }
 
        User user = userService.findAccount(email);
        if (user != null) {
            String subject = "���̵� ã�� �ȳ� �Դϴ�.";
            StringBuilder sb = new StringBuilder();
            sb.append("������ ���̵�� " + user.getId() + " �Դϴ�.");
            mailService.send(subject, sb.toString(), "���̵�@gmail.com", email, null);
            ra.addFlashAttribute("resultMsg", "������ �̸��� �ּҷ� �ش� �̸��Ϸ� ���Ե� ���̵� �߼� �Ͽ����ϴ�.");
        } else {
            ra.addFlashAttribute("resultMsg", "������ �̸��Ϸ� ���Ե� ���̵� �������� �ʽ��ϴ�.");
        }
        return "redirect:/find/id";
    }
 
    // ��й�ȣ ã��
    @RequestMapping(value = "/sendMail/password", method = RequestMethod.POST)
    public String sendMailPassword(HttpSession session, @RequestParam String id, @RequestParam String email, @RequestParam String captcha, RedirectAttributes ra) {
        String captchaValue = (String) session.getAttribute("captcha");
        if (captchaValue == null || !captchaValue.equals(captcha)) {
            ra.addFlashAttribute("resultMsg", "�ڵ� ���� �ڵ尡 ��ġ���� �ʽ��ϴ�.");
            return "redirect:/find/password";
        }
 
        User user = userService.findAccount(email);
        if (user != null) {
            if (!user.getId().equals(id)) {
                ra.addFlashAttribute("resultMsg", "�Է��Ͻ� �̸����� ȸ�������� ���Ե� ���̵� ��ġ���� �ʽ��ϴ�.");
                return "redirect:/find/password";
            }
            int ran = new Random().nextInt(100000) + 10000; // 10000 ~ 99999
            String password = String.valueOf(ran);
            userService.updateInfo(user.getNo(), "password", password); // �ش� ������ DB���� ����
 
            String subject = "�ӽ� ��й�ȣ �߱� �ȳ� �Դϴ�.";
            StringBuilder sb = new StringBuilder();
            sb.append("������ �ӽ� ��й�ȣ�� " + password + " �Դϴ�.");
            mailService.send(subject, sb.toString(), "���̵�@gmail.com", email, null);
            ra.addFlashAttribute("resultMsg", "������ �̸��� �ּҷ� ���ο� �ӽ� ��й�ȣ�� �߼� �Ͽ����ϴ�.");
        } else {
            ra.addFlashAttribute("resultMsg", "������ �̸��Ϸ� ���Ե� ���̵� �������� �ʽ��ϴ�.");
        }
        return "redirect:/find/password";
    }*/
}

