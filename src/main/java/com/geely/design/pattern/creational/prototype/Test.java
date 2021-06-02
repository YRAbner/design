package com.geely.design.pattern.creational.prototype;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板Mail");
        System.out.println("初始化Mail：" + mail);
        for (int i = 0 ; i<10 ; i++){
            Mail mailTemp = (Mail) mail.clone();
            mailTemp.setName("姓名" + i);
            mailTemp.setEmailAddress("姓名" + i + "@qq.com");
            mailTemp.setContent("哈哈哈" + i);
            MailUtil.sendMail(mailTemp);
            System.out.println("克隆MailTemp：" + mailTemp);
        }
        MailUtil.saveMailRecord(mail);
    }
}
