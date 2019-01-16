package com.eric.design.pattern.creational.prototype;

import java.text.MessageFormat;

public class MailUtil {
    public static void sendMail(Mail mail){
        String outputContent = "向{0}同学,邮件地址:{1},邮件内容{2}发送邮件";
        System.out.println(MessageFormat.format(outputContent,mail.getName(),mail.getEmailAddress(),mail.getContent()));
    }
    public static void saveOriginalMailRecord(Mail mail){
        System.out.println("存储原始邮件记录"+mail.getContent());
    }
}
