package site.wentailai.example.pawnMove.simplesample.certificate;

public class HrPassStatus extends AbstractCertificateStatus{
    public HrPassStatus(CertificateInfo certificateInfo) {
        super(certificateInfo);
    }

    @Override
    public void leaderPass() {
        certificateInfo.changeStatus(new LeaderPassStatus(certificateInfo));
        System.out.println("由HrPassStatus代为执行，执行完成变为leaderPass状态, 申请单处理完成。");
    }
    @Override
    public String getCurrentStatus() {
        return "hrPass";
    }
}
