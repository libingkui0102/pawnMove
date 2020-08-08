package site.wentailai.example.pawnMove.simplesample.certificate;

public class CertificateApplication {
    public static void main(String[] args) {
        CertificateInfo certificateInfo = new CertificateInfo();
        CertificateStatus start = new InitStatus(certificateInfo);
        certificateInfo.changeStatus(start);

//        certificateInfo.leaderPass(); // 会抛异常
        certificateInfo.submit(); // 执行完本操作后，状态变为SubmitStatus
//        certificateInfo.submit(); // 会抛异常，因为已经是SubmitStats了，只能执行hrPass
        certificateInfo.hrPass();
        certificateInfo.leaderPass();
        //.......
        System.out.println("申请单状态为：" + certificateInfo.getState().getCurrentStatus());
    }
}
