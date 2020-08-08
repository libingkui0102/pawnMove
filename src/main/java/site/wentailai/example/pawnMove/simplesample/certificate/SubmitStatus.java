package site.wentailai.example.pawnMove.simplesample.certificate;

public class SubmitStatus extends AbstractCertificateStatus{
    public SubmitStatus(CertificateInfo certificateInfo) {
        super(certificateInfo);
    }

    @Override
    public void hrPass() {
        System.out.println("由SubmitStatus代为执行，执行完成变为hrPass状态");
        certificateInfo.changeStatus(new HrPassStatus(certificateInfo));
    }
    @Override
    public String getCurrentStatus() {
        return "submit";
    }
}
