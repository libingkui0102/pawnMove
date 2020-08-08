package site.wentailai.example.pawnMove.simplesample.certificate;

public class CertificateInfo {
    CertificateStatus status ;
    void changeStatus(CertificateStatus status) {
        this.status = status;
    }
    void submit() {
        status.submit();
    }
    void hrPass() {
        status.hrPass();
    }
    void leaderPass() {
        status.leaderPass();
    }
    CertificateStatus getState() {
        return status;
    }
}
