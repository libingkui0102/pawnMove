package site.wentailai.example.pawnMove.simplesample.certificate;

public class InitStatus extends AbstractCertificateStatus{
    public InitStatus(CertificateInfo certificateInfo) {
        super(certificateInfo);
    }

    @Override
    public void submit() {
        System.out.println("由InitStatus代为执行，执行完成变为提交状态");
        certificateInfo.changeStatus(new SubmitStatus(certificateInfo));
    }

    @Override
    public String getCurrentStatus() {
        return "init";
    }
}
