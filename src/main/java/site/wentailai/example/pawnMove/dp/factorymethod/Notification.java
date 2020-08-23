package site.wentailai.example.pawnMove.dp.factorymethod;

public abstract class Notification {
    abstract SmsService createSmsService();
    public void sendSms() {
        SmsService smsService = createSmsService();
        smsService.send();
    }
}
