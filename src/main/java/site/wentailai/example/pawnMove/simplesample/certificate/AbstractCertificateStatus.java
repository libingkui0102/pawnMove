package site.wentailai.example.pawnMove.simplesample.certificate;

public class AbstractCertificateStatus implements CertificateStatus{
    CertificateInfo certificateInfo;

    public AbstractCertificateStatus(CertificateInfo certificateInfo) {
        this.certificateInfo = certificateInfo;
    }

    @Override
    public void submit() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void hrPass() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void leaderPass() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getCurrentStatus() {
        return "";
    }
}
