package site.wentailai.example.pawnMove.simplesample.certificate;

public class LeaderPassStatus extends AbstractCertificateStatus {
    public LeaderPassStatus(CertificateInfo certificateInfo) {
        super(certificateInfo);
    }
    @Override
    public String getCurrentStatus() {
        return "leaderPass";
    }
}
