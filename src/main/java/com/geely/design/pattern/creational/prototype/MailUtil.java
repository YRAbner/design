package com.geely.design.pattern.creational.prototype;

import java.text.MessageFormat;

public class MailUtil {

    public static void sendMail(Mail mail){
        String outPutContent = "向{0}同学，邮件地址：{1}，{2}发送邮件";
        System.out.println(MessageFormat.format(outPutContent , mail.getName() , mail.getEmailAddress() , mail.getContent()));
    }

    public static void saveMailRecord(Mail mail){
        System.out.println("存储MailRecord记录,MailRecord:" + mail.getContent());
    }
}
